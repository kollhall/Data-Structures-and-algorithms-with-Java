#include "ArrayList.h"
#include <iostream>

using namespace std;
    
template <typename T>
ArrayList<T>::ArrayList() {
    capacity = 25;
    size = 0;
    data = new T[capacity];
}

template <typename T>
ArrayList<T>::~ArrayList() {
    delete [] data;
}

template <typename T>
bool ArrayList<T>::validPosition(int index) {
    return (index >= 0 && index < size);
}

template <typename T>
void ArrayList<T>::secureSpace(){
    if(size == capacity) {
        T* newData = new T[2 * capacity];
        for (int i = 0; i < size; i++)
        {
            newData[i] = data[i];
        }
        delete[] data;
        data = newData;
        capacity *= 2;
    }
}

template <typename T>
void ArrayList<T>::add(T value) {
    secureSpace();
    data[size++] = value; 
}

template <typename T>
void ArrayList<T>::add(T value, int index) {
    if (!validPosition(index))
    {
        throw std::exception("Objeto inválido");
    }
    for (int i = size - 1; i >= index; i--)
    {
        data[i + 1] = data[i];
    }
    data[index] = value;
    size++;
}

template <typename T>
bool ArrayList<T>::isEmpty() {
    return (size == 0);
}

template <typename T>
int ArrayList<T>::length() {
    return size;
}

template <typename T>
void ArrayList<T>::print() {
    string print = "";
    if (isEmpty())
    {
        print = "[]";
    } else {
        print = "ArrayList: [ ";
        for(int i = 0; i < size; i++) {
            print += data[i] + " ";
        }
        print += "]\n";
    }
    printf("%s", print);
}

template <typename T>
void ArrayList<T>::remove(int index) {
    if (!validPosition(index))
    {
        throw std::exception("Objeto inválido");
    }
    for (int i = index; i < size; i++)
    {
        data[i] = data[i + 1];
    }
    size--;
    printf("Remove with sucess");
}

template <typename T>
T ArrayList<T>::get(int index) {
    if (!validPosition(index))
    {
        throw std::exception("Objeto inválido");
    }
    return data[index];
}

