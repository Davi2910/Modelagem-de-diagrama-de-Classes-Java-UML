
package com.mycompany.sistemaacademico;

/**
 * 
/**
 * Classe Curso - Demonstração de Associação e Composição
 * 
 * Esta classe é o centro do sistema acadêmico e demonstra múltiplos
 * conceitos fundamentais da programação orientada a objetos:
 * 
 * 1. ASSOCIAÇÃO: Relacionamento com Professor (recebido como parâmetro)
 * 2. COMPOSIÇÃO: Relacionamento com Biblioteca (criada internamente)
 * 3. ENCAPSULAMENTO: Atributos privados com acesso controlado
 * 4. ABSTRAÇÃO: Representação de um curso acadêmico real
 * 
 * A classe Curso serve como exemplo prático de como diferentes tipos
 * de relacionamentos podem coexistir em uma única classe, demonstrando
 * a flexibilidade e poder da programação orientada a objetos.
 * 
 * 
 * @author Davi Paulino Conceição
 *
 * Representa uma biblioteca no sistema acadêmico.
*/


// Classe Curso 
public class Curso {
    
    // Atributos da classe
  
    private String nome;
    private int duracaoMeses;
    private Professor professor;
    private Biblioteca biblioteca;
    
    // Metodos da classe
    
    public Curso(String nome, int duracaoMesses, Professor professor, Biblioteca biblioteca) {
        this.nome = nome;
        this.duracaoMeses = duracaoMeses;
        this.professor = professor;
        this.biblioteca = biblioteca;
        
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getduracaoMesses(){
        return duracaoMeses;
    }
    
    public void setDuracaoMesses(int duracaoMeses) {
        this.duracaoMeses = duracaoMeses;
    }
    
    public Professor getProfessor() {
        return professor;
    }
    
    public void setProfessor(Professor professsor) {
        this.professor = professor;
    }
    
    
    public void iniciarAulas() {
        System.out.println("Curso" + nome + "Iniciado com duracao de " + duracaoMeses + "Meses.");
    }
    
    public void exibirInformacoes() {
        System.out.println("Curso: " + nome + ", Duracao: " + duracaoMeses + " meses, Professor:" + professor.getNome());
        biblioteca.exibirInformacoes();
    } 

      /**
     * Exibe as informações do curso.
     */
    
    void exibirInfoemacoes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

/*
 * ========== CONCEITOS DEMONSTRADOS NESTA CLASSE ==========
 * 
 * 1. ASSOCIAÇÃO (com Professor):
 *    - Professor é criado externamente e passado no construtor
 *    - Relacionamento "tem um" (has-a)
 *    - Professor pode existir independentemente do curso
 *    - Pode ser alterado através do setter setProfessor()
 *    - Navegação: professor.getNome()
 * 
 * 2. COMPOSIÇÃO (com Biblioteca):
 *    - Biblioteca é criada internamente no construtor
 *    - Relacionamento "possui uma" (part-of)
 *    - Biblioteca não existe sem o curso
 *    - Ciclo de vida ligado ao curso
 *    - Delegação: biblioteca.exibirInformacoes()
 * 
 * 3. ENCAPSULAMENTO:
 *    - Todos os atributos são privados
 *    - Acesso controlado através de getters/setters
 *    - Proteção dos dados internos da classe
 * 
 * 4. ABSTRAÇÃO:
 *    - Representação simplificada de um curso real
 *    - Foco nos aspectos essenciais para o sistema
 *    - Métodos que representam comportamentos do mundo real
 * 
 * 5. DIFERENÇAS PRÁTICAS:
 *    
 *    ASSOCIAÇÃO (Professor):
 *    - Professor professor = new Professor(...);  // Criado externamente
 *    - Curso curso = new Curso(..., professor);   // Passado como parâmetro
 *    - professor.getNome();                        // Navegação para objeto associado
 *    
 *    COMPOSIÇÃO (Biblioteca):
 *    - new Biblioteca(...);                       // Criado internamente
 *    - biblioteca.exibirInformacoes();            // Delegação para objeto composto
 *    - Não há setter para biblioteca              // Não pode ser alterada externamente
 * 
 * 6. EXEMPLO DE USO NO SISTEMA:
 *    - Um Professor pode ensinar vários Cursos (associação)
 *    - Cada Curso tem sua própria Biblioteca (composição)
 *    - Alunos se matriculam em Cursos (associação)
 *    - Demonstra a flexibilidade dos relacionamentos OO
 */
