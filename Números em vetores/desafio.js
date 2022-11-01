
/* Faça um Programa que leia cinco números inteiros e 
armazene-os em um vetor chamado VETOR. 
Armazene os números pares no vetor PAR e os números
ímpares no vetor IMPAR.  */

let vetor = [3, 4, 6, 9, 10]
let pares = []
let impares = []

console.log('Vetor: ' + vetor)

for (let i = 0; i < vetor.length; i++) {
    const numero = vetor [i];

    if(numero % 2 == 0) {
        pares.push(numero)
        
    } else {
        impares.push(numero)
    }
    
}
console.log('Par(es): ' + pares)
console.log('Impar(es): ' + impares)





