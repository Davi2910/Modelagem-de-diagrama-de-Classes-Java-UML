
package com.mycompany.sistemaacademico;

//Arquivo.java executavel

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setNome("Dr. João");
        professor.setEspecialidade("Matemática");
        professor.setAnosExperiencia(15);

        Biblioteca biblioteca = new Biblioteca("Biblioteca do Curso Engenharia de Software");

        Curso curso = new Curso("Engenharia de Software", 24, professor, biblioteca);

        CursoOnline cursoOnline = new CursoOnline("Programação Java", 6, professor, biblioteca, "Plataforma Moodle IFSP");

        Aluno aluno = new Aluno();
        aluno.setNome("Maria");
        aluno.setIdade(20);
        aluno.setCurso(curso);

        aluno.exibirDados();
        curso.exibirInformacoes();
        curso.iniciarAulas();
        cursoOnline.exibirInformacoes();
        professor.exibirPerfil();
    }
}
