
package com.mycompany.sistemaacademico;


// Classe Aluno
class Aluno {
    
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
       System.out.println(nome + "Está estudando..");
       
   }
    

 
    
}
