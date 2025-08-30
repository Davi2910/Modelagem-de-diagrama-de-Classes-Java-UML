
package com.mycompany.sistemaacademico;

/**
 *  /**
 * Classe Aluno - Demonstração de Associação e Encapsulamento
 * 
 * Esta classe representa um aluno em um sistema acadêmico e demonstra
 * importantes conceitos da programação orientada a objetos:
 * 
 * 1. ENCAPSULAMENTO: Atributos privados com acesso controlado
 * 2. ASSOCIAÇÃO: Relacionamento com a classe Curso
 * 3. ABSTRAÇÃO: Representação simplificada de um aluno real
 * 
 * A associação com Curso é um exemplo de como objetos podem se relacionar
 * em um sistema orientado a objetos, onde um aluno "tem um" curso.
 * 
 * @author Davi Paulino Conceição
 *
 */


// Classe Aluno
class Aluno {
    
     // ========== ATRIBUTOS (ENCAPSULAMENTO) ==========
    
    /**
     * Nome do aluno
     * Atributo privado que armazena o nome completo do aluno.
     * Demonstra o princípio do encapsulamento.
     */
    
    //Atributos
    private String nome;
    private int idade;
    private Curso curso;
    
    //Métodos da classe
    
    public String getNome() {
        return nome;
  }
    
   public void setNome(String nome) {
       this.nome = nome;
   } 
   
   public int getIdade() {
       return idade;
   }
   
   public void setIdade(int idade) {
       this.idade = idade;
   }
   
   public Curso getCurso() {
       return curso;
   }
   
   public void setCurso(Curso curso) {
       this.curso = curso;  
   }
   
   public void exibirDados(){
       System.out.println("Nome:" + nome + ", Idade" + idade + ", Curso" + curso.getNome());
   }
   
   public void estudar() {
       System.out.println(nome + "Esta estudando..");
       
   }
    
}


/*
 * ========== CONCEITOS DEMONSTRADOS NESTA CLASSE ==========
 * 
 * 1. ASSOCIAÇÃO:
 *    - Atributo 'curso' do tipo Curso
 *    - Relacionamento "tem um" (has-a)
 *    - Navegação entre objetos (curso.getNome())
 *    - Permite que um aluno acesse informações do seu curso
 * 
 * 2. ENCAPSULAMENTO:
 *    - Atributos privados protegidos
 *    - Acesso controlado através de getters/setters
 *    - Possibilidade de adicionar validações nos setters
 * 
 * 3. ABSTRAÇÃO:
 *    - Representação simplificada de um aluno real
 *    - Foco nos aspectos relevantes para o sistema acadêmico
 *    - Métodos que representam comportamentos essenciais
 * 
 * 4. EXEMPLO DE USO DA ASSOCIAÇÃO:
 *    - No método exibirDados(), acessamos curso.getNome()
 *    - Isso mostra como objetos associados podem ser utilizados
 *    - Demonstra a navegação entre objetos relacionados
 */

