#include "ArrayList.h"
#include <iostream>


using namespace std;


int main(){
    ArrayList<int> lista1;

    lista1.add(5);
    lista1.print();
    /*
    cout << "Gerador de lista\n";
    do
    {   
        cout << "Digite 0 para parar o programa!\n";
        cout << "Digite 1 para inserir um elemento!\n";
        cout << "Digite 2 para remover um elemento!\n";
        cout << "Digite 3 para imprimir a pilha!\n";
        cin >> opcao;
        if (opcao == 1){
            cout << "Digite o elemento a ser inserido:\n";
            cin >> item;
            lista1.add(item);
        } else if (opcao == 2){
            int posicao;
            cout << "Digite a posição que o elemento que deseja remover está: \n";
            cin >> posicao;
            lista1.remove(posicao);
        } else if (opcao == 3){
            lista1.print();
        }
    } while (opcao != 0);
    */
    return 0;
}