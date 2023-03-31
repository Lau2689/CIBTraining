Se da una matriz no vacía A que consiste en N enteros.

Un triplete (X, Y, Z), tal que 0 ≤ X < Y < Z < N, se llama doble rebanada.

La suma de la doble rebanada (X, Y, Z) es el total de A[X + 1] + A[X + 2] + ... + A[Y − 1] + A[Y + 1] + A[Y + 2] + ... + A[Z − 1].

Por ejemplo, la matriz A tal que:

    A[0] = 3
    A[1] = 2
    A[2] = 6
    A[3] = -1
    A[4] = 4
    A[5] = 5
    A[6] = -1
    A[7] = 2
contiene los siguientes sectores dobles de ejemplo:

doble rebanada (0, 3, 6), la suma es 2 + 6 + 4 + 5 = 17,
doble rebanada (0, 3, 7), la suma es 2 + 6 + 4 + 5 − 1 = 16,
doble rebanada (3, 4, 5), la suma es 0.
El objetivo es encontrar la suma máxima de cualquier doble rebanada.

Escribe una función:

class Solution { public int solution(int[] A); }

que, dada una matriz no vacía A que consiste en N enteros, devuelve la suma máxima de cualquier corte doble.

Por ejemplo, dado:

    A[0] = 3
    A[1] = 2
    A[2] = 6
    A[3] = -1
    A[4] = 4
    A[5] = 5
    A[6] = -1
    A[7] = 2
la función debe devolver 17, porque ningún segmento doble de la matriz A tiene una suma mayor que 17.

Escriba un algoritmo eficiente para las siguientes suposiciones:

N es un entero dentro del rango [3.. 100.000];
cada elemento de la matriz A es un número entero dentro del rango [−10.000.. 10.000].
