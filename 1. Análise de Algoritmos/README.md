# Análise de Algoritmos

<p style="text-align: justify">Algoritmos não podem ser simplesmente analisados e avaliados pelo sua velocidade em relação a outros algoritmos que realizam a mesma tarefa. Visto que, os compiladores possuem construções diversas, alguns podem ter construçoes de instrução mais elaboradas, os computadores podem ter diferentes processadores, diferentes arquiteturas etc. Portanto, o ato de analisar algoritmos precisa ser mais justo. Dessa forma, cada instrução simples realizada no algoritmo possuí tempo T, somando todos os T, encontraremos uma função que representa a qualidade do algoritmo em relação ao tamanho da entrada.</p>

```Java
BuscaLinear(Lista, Valor)
1 i = 1
2 Enquanto i <= Lista.tamanho Faça
3    Se Lista[i] == Valor
4        Retorna i
5    i = i + 1   
6 Retorna -1
```
<p style="text-align: justify">
    Analisando o caso em que o valor(target) não esteja no vetor teremos:
    <br>
    Na 1º linha uma execução T. A 2º linha o laço terá no máximo T * (n + 1) execuções, visto que, caso o elemento não esteja no vetor a comparação ocorrerá mais uma vez dando falso e retornando -1. A 3º linha terá 2Tn, visto que estou acessando o elemento da lista e comparando com o valor passado. A 4º linha nunca será executada. A 5º linha terá 2Tn execuções. E a linha 6º será executada uma única vez T. Portanto, somando o tempo de execução de todas as linhas teremos:

    T(n) = T + T (n + 1) + 2Tn + 2Tn + T
    T(n) = 5Tn + 3T
</p>


<p style="text-align: justify">
    Com essa função podemos substituir n pelo tamanho da entrada, então teremos uma função que representa a execução do algoritmo. Também podemos encontrar o melhor e pior caso do mesmo.
    <br>
    Quando consideramos T(n) sendo a medida de tempo de execução de um algoritmo, dizemos que T é uma função de complexidade de tempo. Quando T(n) é considerada a medida de memória necessária para executar um algoritmo, dizemos que T é uma função de complexidade de espaço.
</p>

## Notação Assintótica 
<p style="text-align: justify"> 
    É o estudo da taxa de crescimento de funções, ela nós permite comparar o tempo de execução de algoritmos independente da plataforma utilizada, da linguagem, etc.
    <br>
    Existem várias notações assintóticas, porém a mais utilizada e importante para nós programadores é a notação Big O.
    <br>
    A notação O serve para dar um limite assintótico superior sobre uma função, dentro de um fator constante. Ou seja, a taxa máxima que um algoritmo pode alcançar.
    <br>
    Segue abaixo alguns exemplos comuns de tempo de execução Big O:
    - O(log n), também conhecido como *tempo logarítmo*. Exemplo: pesquisa binária.
    <br>
    - O(n), conhecido como tempo linear. Exemplo: pesquisa simples.
    <br>  
    - O(n * log n). Exemplo: um algoritmo rápido de ordenação, como a ordenação quicksort.
    <br>
    - O(n²). Exemplo: um algoritmo lento de ordenação, como a ordenação por seleção.
    <br>
    - O(n!). Exemplo: um algoritmo bastante lento, como o do caixeiro-viajante.
</p>
  

