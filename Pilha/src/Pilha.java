import java.util.LinkedList;

public class Pilha<T> {
    private LinkedList<T> objetos = new LinkedList<T>();
    private int totalDeElementos = 0;

    public void insere(T t) {
        this.objetos.add(t);
        totalDeElementos++;
    }

    public T remove() {
        if (this.vazia()) {
            throw new IllegalArgumentException("Pilha está vazia!");
        }
        return this.objetos.removeLast();
    }
    
    public T olha() {
        if (this.vazia()) {
            throw new IllegalArgumentException("Pilha está vazia!");
        }
        return this.objetos.getLast();
    }

    public boolean vazia() {
        return this.objetos.size() == 0;
    }
    
    public int verificaElemento(T obj) 
    {
        if (this.vazia()) {
            throw new IllegalArgumentException("Pilha Vazia");
        }
        Pilha<T> nova = new Pilha<T>();
        int ct = -1;
        System.out.println(this);
        int tamanhoInicial = this.tamanho();
        T atual = this.remove();

        //Desempilho e comparo
        for (int i = 0; i < tamanhoInicial; i++) 
        {   
            nova.insere(atual);
            if (!atual.equals(obj)) {
                atual = this.remove();     
            } else {
                ct = i;
                break;
            }    
        }
        
        //Empilho
        System.out.println(nova);
        this.insere(nova.remove());
        while(!nova.vazia()){
            this.insere(nova.remove());
        }
        return ct;
    }

    public int tamanho() {
        return this.totalDeElementos;
    }

    public String toString() {
        return this.objetos.toString();
    }
}
