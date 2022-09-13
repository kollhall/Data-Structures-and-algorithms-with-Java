

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DISCENTE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno a = new Aluno("A");
        Aluno b = new Aluno("B");
        Aluno c = new Aluno("C");
        Aluno d = new Aluno("D");
        Aluno e = new Aluno("E");
        
        Aluno f = new Aluno("f");
        Aluno g = new Aluno("g");
        Aluno h = new Aluno("h");

        
        
        ListaCircular lista = new ListaCircular();
        lista.adiciona(a);
        lista.adiciona(b);
        lista.adiciona(c);
        lista.adiciona(d);
        lista.adiciona(e);
        
        
        System.out.println(lista.tamanho());
        
        ListaCircular lista2 = new ListaCircular();
        lista2.adiciona(f);
        lista2.adiciona(g);
        lista2.adiciona(h);
        
    
        ListaCircular l1 = new ListaCircular();
        l1 = lista.intercalar(lista2);
        
        System.out.println(l1);
        System.out.println(lista);
    } 
}
