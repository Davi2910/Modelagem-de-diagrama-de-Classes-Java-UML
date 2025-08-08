
package com.mycompany.sistemaacademico;

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
        System.out.println("Curso" + nome + "Iniciado com duração de " + duracaoMeses + "Meses.");
    }
    
    public void exibirInformacoes() {
        System.out.println("Curso: " + nome + ", Duração: " + duracaoMeses + " meses, Professor:" + professor.getNome());
        biblioteca.exibirInformacoes();
    } 

    void exibirInfoemacoes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
