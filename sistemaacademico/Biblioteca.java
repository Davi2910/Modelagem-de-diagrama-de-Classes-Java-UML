
package com.mycompany.sistemaacademico;
/**
 * /**
 * Classe Biblioteca - Demonstração de Composição e Simplicidade
 * 
 * Esta classe representa uma biblioteca em um sistema acadêmico e demonstra
 * conceitos importantes da programação orientada a objetos:
 * 
 * 1. COMPOSIÇÃO: Esta classe é criada e gerenciada pela classe Curso
 * 2. ENCAPSULAMENTO: Atributo privado com acesso controlado
 * 3. SIMPLICIDADE: Classe focada em uma responsabilidade específica
 * 
 * A classe Biblioteca participa de um relacionamento de COMPOSIÇÃO com
 * a classe Curso, onde o curso "possui" uma biblioteca. Quando um curso
 * é criado, uma biblioteca é automaticamente criada para ele.
 * 
 * @author Davi Paulino Conceição
 *
 * // ========== ATRIBUTOS (ENCAPSULAMENTO) ==========
    
    /**
     * Nome da biblioteca
     * 
     * Atributo privado que armazena o nome da biblioteca.
     * Geralmente é formado pelo nome do curso + "Biblioteca do Curso".
     * 
     * Exemplo: "Biblioteca do Curso Engenharia de Software"
     */


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

/*
 * ========== CONCEITOS DEMONSTRADOS NESTA CLASSE ==========
 * 
 * 1. COMPOSIÇÃO:
 *    - Esta classe é criada e gerenciada pela classe Curso
 *    - Relacionamento "parte de" (part-of)
 *    - O ciclo de vida da biblioteca está ligado ao curso
 *    - Quando um curso é destruído, sua biblioteca também é
 * 
 * 2. ENCAPSULAMENTO:
 *    - Atributo nome é privado
 *    - Acesso controlado através do construtor
 *    - Não há setters, demonstrando imutabilidade após criação
 * 
 * 3. RESPONSABILIDADE ÚNICA:
 *    - Classe simples com uma responsabilidade específica
 *    - Foca apenas em representar uma biblioteca
 *    - Método único para exibir informações
 * 
 * 4. EXEMPLO DE COMPOSIÇÃO NO SISTEMA:
 *    - Curso cria Biblioteca no seu construtor:
 *      this.biblioteca = new Biblioteca("Biblioteca do Curso " + nome);
 *    - Curso usa Biblioteca no método exibirInformacoes():
 *      biblioteca.exibirInformacoes();
 *    - Demonstra como objetos compostos trabalham juntos
 * 
 * 5. DIFERENÇA ENTRE ASSOCIAÇÃO E COMPOSIÇÃO:
 *    - Associação: Aluno "tem um" Curso (pode existir independentemente)
 *    - Composição: Curso "possui uma" Biblioteca (criada junto com o curso)
 *    - Na composição, o objeto contido não existe sem o container
 */


