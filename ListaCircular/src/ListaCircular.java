/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DISCENTE
 */
public class ListaCircular {
    private No primeira;
    private No ultimo;
    private int totalDeElementos = 0;
    
    //Questao 2
    public int tamanho() {
        return this.totalDeElementos;
    }
    
    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao < this.totalDeElementos;
    }
    
    //Questao 3
    public void adiciona(Object elemento) {
        No novo = new No(elemento);
        if (this.totalDeElementos == 0) {
            this.primeira = novo;
            this.ultimo = this.primeira;
            this.primeira.setProxima(novo);
            this.ultimo.setAnterior(novo);
        } else {
            
            this.primeira.setAnterior(novo);
            novo.setAnterior(this.ultimo);
            novo.setProxima(this.primeira);
            this.ultimo.setProxima(novo);
            this.ultimo = novo;

            
        }
        this.totalDeElementos++;
    }
    //Questao 4
    public void remove() {
        if (!posicaoValida(0)) {
            throw new IllegalArgumentException("Posicao invalida");
        } 
        No penultimo = this.ultimo.getAnterior();
        penultimo.setProxima(this.primeira);
        this.primeira.setAnterior(penultimo);
        this.ultimo.setAnterior(null);
        this.ultimo.setProxima(null);
        this.ultimo = penultimo;
        this.totalDeElementos--;
    }
    //Questao 5
    public void concatena(ListaCircular lis) {
        this.ultimo.setProxima(lis.primeira);
        lis.ultimo.setProxima(this.primeira);
        this.primeira.setAnterior(lis.ultimo);
        lis.primeira.setAnterior(this.ultimo);
        
        this.ultimo = lis.ultimo;
        this.totalDeElementos += lis.totalDeElementos;
    }
    //Questao 6
    public ListaCircular intercalar(ListaCircular l) {
        if (!posicaoValida(0) && !l.posicaoValida(0)) {
            throw new IllegalArgumentException("Listas vazias");
        } else if(!posicaoValida(0)) {
            return l;
        } else if(!l.posicaoValida(0)){
            return this;
        }
        ListaCircular listaN = new ListaCircular();
        No l1 = this.primeira;
        No l2 = l.primeira;
 
        do{
            listaN.adiciona(l1.getElemento());
            listaN.adiciona(l2.getElemento());
            l1 = l1.getProxima();
            l2 = l2.getProxima();
        }while(l1 != this.primeira && l2 != l.primeira);
        
        while (l1 != this.primeira) {
            listaN.adiciona(l1.getElemento());
            l1 = l1.getProxima();
        }
        
        while (l2 != l.primeira){ 
            listaN.adiciona(l2.getElemento());
            l2 = l2.getProxima();
        }
            
        return listaN;
    }
        
    //Questao 7
    @Override
    public String toString() {
        if (this.totalDeElementos == 0) {
            return "[]";
        }
        No atual = this.primeira;
        String retorno = "[ ";
        
        for (int i = 0; i < this.totalDeElementos - 1; i++) {
            retorno += atual.getElemento();
            atual = atual.getProxima();
            
            if (atual != null) {
                retorno += ", ";
            }
        }
        retorno += atual.getElemento() + " ]";
        return retorno;
    }
}
