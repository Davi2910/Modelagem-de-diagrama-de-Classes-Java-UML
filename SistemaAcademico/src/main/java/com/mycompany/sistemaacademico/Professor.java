
package com.mycompany.sistemaacademico;

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
