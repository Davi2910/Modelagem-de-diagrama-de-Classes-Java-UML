
package com.mycompany.sistemaacademico;

//Classe CursoOnline Herdando a classe Curso

public class CursoOnline extends Curso {
    private String plataforma;

    public CursoOnline(String nome, int duracaoMeses, Professor professor, Biblioteca biblioteca, String plataforma) {
        super(nome, duracaoMeses, professor, biblioteca); // chama o construtor da superclasse
        this.plataforma = plataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    
    //Sobreescrevendo métodos

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Plataforma do curso online: " + plataforma);
    }
}

