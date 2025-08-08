
package com.mycompany.sistemaacademico;

//Classe Biblioteca
public class Biblioteca {
    
     // Atributo da classe
    private String nome;
    
    public Biblioteca(String nome) {
        this.nome = nome;
    }
    
    public void exibirInformacoes() {
        System.out.println("Biblioteca assosiada" + nome);
    }
    
}
