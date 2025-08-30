
package com.mycompany.sistemaacademico;
/**
 *
 
 * **
 * Classe Professor - Demonstração de Conceitos de Orientação a Objetos
 * 
 * Esta classe representa um professor em um sistema acadêmico e demonstra
 * conceitos fundamentais da programação orientada a objetos:
 * 
 * 1. ENCAPSULAMENTO: Os atributos são privados e acessados através de métodos
 *    getters e setters, protegendo os dados internos da classe.
 * 
 * 2. ABSTRAÇÃO: A classe abstrai as características e comportamentos essenciais
 *    de um professor, focando apenas no que é relevante para o sistema.
 * 
 * 3. ASSOCIAÇÃO: Esta classe participa de relacionamentos de associação com
 *    outras classes como Curso e Aluno através de seus métodos.
 * 
 * @author Davi Paulino Conceição
 *
 * Representa uma biblioteca no sistema acadêmico.
*/

// Classe Professor
public class Professor {
    // Atributos
    private String nome;
    private String Especialidade;
    private int AnosExperiencia;
    
    
    // Métodos da classe
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEspecialidade() {
        return Especialidade;
    }
    
   public void setEspecialidade(String especialidade) {
}

    
    public int getAnosExperiencia() {
        return AnosExperiencia;
    }
    
    public void setAnosExperiencia(int anosExperiencia) {
        this.AnosExperiencia = anosExperiencia;
    }
    
    // Metodos de comportamentos
    
    public void ensinar() {
        System.out.println(nome + " ensinando.");
    }
    public void avaliarAluno(Aluno aluno) {
        System.out.println(nome + "Esta avaliando o aluno " +  aluno.getNome());
    }
    public void exibirPerfil() {
        System.out.println("professor: " + nome + ", Especialidade:" + Especialidade + ", Anos de experiencia" + AnosExperiencia);
        
    }
   
        
}

/*
 * ========== CONCEITOS DEMONSTRADOS NESTA CLASSE ==========
 * 
 * 1. ENCAPSULAMENTO:
 *    - Atributos privados (private)
 *    - Métodos públicos para acesso (getters/setters)
 *    - Controle de acesso aos dados internos
 * 
 * 2. ABSTRAÇÃO:
 *    - Representação simplificada de um professor real
 *    - Foco apenas nos aspectos relevantes para o sistema
 * 
 * 3. ASSOCIAÇÃO:
 *    - Método avaliarAluno() que recebe um objeto Aluno
 *    - Demonstra como classes podem interagir
 * 
 * 4. BOAS PRÁTICAS:
 *    - Documentação completa com JavaDoc
 *    - Nomes descritivos para métodos e atributos
 *    - Organização clara do código em seções
 */
