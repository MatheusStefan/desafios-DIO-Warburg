
/* Faça um programa que conte a quantidade de espaços
em branco e vogais */

let frase = "Esse desafio foi facil".toLowerCase()
let espacoBranco = 0;
let vogais = ['a', 'e', 'i', 'o', 'u']
totalVogal = 0;

for (let i = 0; i < frase.length; i++) {
    const element = frase[i];
    if(element == ' ') espacoBranco ++
    if(vogais.indexOf(frase[i]) != -1) {
        totalVogal++
    }
}
console.log('Espacos em branco: ' + espacoBranco + ' Vogais: ' + totalVogal)






