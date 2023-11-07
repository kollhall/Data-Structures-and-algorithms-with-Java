#include <iostream>
#include <cstdlib>
#include <ctime>

/*Rand nós fornece números pseudo-randômicos, sendo necessário modificar a semente para que haja a 
sensação de mais aleatoriedade. Assim usamos o relógio interno do computador, fazendo com que a semente 
seja diferente a cada "momento". Por isso a biblioteca ctime.

*/
using namespace std;

int main() {
    std::srand(std::time(0));
    int vector[5], aux;

    for (int i = 0; i < 5; i++)
    {
        vector[i] = rand() % 20;
    }

    cout << "Vetor Desordenado: ";
    for (int i = 0; i < 5; i++)
    {
        cout << vector[i] << " ";
    }

    for (int i = 0; i < 5; i++)
    {
        for (int j = i + 1; j < 5; j++)
        {
            if (vector[i] > vector[j])
            {
                aux = vector[i];
                vector[i] = vector[j];
                vector[j] = aux;
            }
        }
    }
    cout << "\nVetor Ordenado: ";
    for (int i = 0; i < 5; i++)
    {
        cout << vector[i] << " ";
    }
    cout << "\n";
    return 0;
}