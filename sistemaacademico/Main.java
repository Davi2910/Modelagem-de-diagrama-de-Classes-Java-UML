
package com.mycompany.sistemaacademico;

/**
 * 
 * /**
 * Classe Main - Demonstração Prática de Orientação a Objetos
 * 
 * Esta classe principal demonstra como todos os conceitos de orientação
 * a objetos trabalham juntos em um sistema real:
 * 
 * 1. INSTANCIAÇÃO: Criação de objetos das diferentes classes
 * 2. ASSOCIAÇÃO: Como objetos se relacionam entre si
 * 3. COMPOSIÇÃO: Como objetos são criados internamente
 * 4. HERANÇA: Como classes filhas estendem funcionalidades
 * 5. POLIMORFISMO: Como métodos sobrescritos funcionam na prática
 * 
 * O programa simula um sistema acadêmico básico onde professores ministram
 * cursos, alunos se matriculam e bibliotecas são associadas aos cursos.
 * 
 * Author Davi Paulino Conceição
 * 

 */

public class Main {
 
     
     
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setNome("Dr. Joao");
        professor.setEspecialidade("Matemática");
        professor.setAnosExperiencia(15);

        Biblioteca biblioteca = new Biblioteca("Biblioteca do Curso Engenharia de Software");

        Curso curso = new Curso("Engenharia de Software", 24, professor, biblioteca);
        /**
         * INSTANCIAÇÃO DA CLASSE ALUNO
         * 
         * DEMONSTRAÇÃO DE ASSOCIAÇÃO:
         * - O aluno é associado a um curso específico
         * - Aluno "tem um" curso (relacionamento has-a)
         * - O curso existe independentemente do aluno
         */

        CursoOnline cursoOnline = new CursoOnline("Programacao Java", 6, professor, biblioteca, "Plataforma Moodle IFSP");

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

/*
 * ========== CONCEITOS DEMONSTRADOS NESTE PROGRAMA ==========
 * 
 * 1. FLUXO DE EXECUÇÃO E RELACIONAMENTOS:
 *    
 *    Criação dos objetos:
 *    Professor → Curso → CursoOnline → Aluno
 *         ↓        ↓         ↓
 *    (reutilizado) (cria Biblioteca) (herda de Curso)
 * 
 * 2. TIPOS DE RELACIONAMENTOS DEMONSTRADOS:
 *    
 *    ASSOCIAÇÃO:
 *    - Professor ← Curso (professor passado no construtor)
 *    - Professor ← CursoOnline (mesmo professor reutilizado)
 *    - Curso ← Aluno (curso passado no construtor)
 *    
 *    COMPOSIÇÃO:
 *    - Curso → Biblioteca (criada internamente)
 *    - CursoOnline → Biblioteca (herdada do pai)
 *    
 *    HERANÇA:
 *    - Curso ← CursoOnline (extends)
 * 
 * 3. NAVEGAÇÃO ENTRE OBJETOS:
 *    
 *    aluno.exibirDados():
 *    Aluno → getCurso() → getNome() → "Engenharia de Software"
 *    
 *    curso.exibirInformacoes():
 *    Curso → getProfessor() → getNome() → "Dr. João"
 *    Curso → biblioteca → exibirInformacoes() → "Biblioteca do Curso..."
 * 
 * 4. POLIMORFISMO EM AÇÃO:
 *    
 *    Curso curso1 = new Curso(...);
 *    Curso curso2 = new CursoOnline(...);  // Polimorfismo!
 *    
 *    curso1.exibirInformacoes();  // Chama versão de Curso
 *    curso2.exibirInformacoes();  // Chama versão de CursoOnline
 * 
 * 5. REUTILIZAÇÃO DE CÓDIGO:
 *    
 *    - Mesmo professor usado em dois cursos diferentes
 *    - CursoOnline reutiliza toda funcionalidade de Curso
 *    - Métodos herdados funcionam automaticamente
 *    - Composição com Biblioteca funciona em ambos os tipos de curso
 * 
 * 6. SAÍDA ESPERADA DO PROGRAMA:
 *    
 *    Nome: Maria, Idade: 20, Curso: Engenharia de Software
 *    Curso: Engenharia de Software, Duracao: 24 meses, Professor: Dr. João
 *    Biblioteca associada: Biblioteca do Curso Engenharia de Software
 *    Curso Programação Java iniciado com duracao de 6 meses.
 *    Curso: Programação Java, Duracao: 6 meses, Professor: Dr. João
 *    Biblioteca associada: Biblioteca do Curso Programação Java
 *    Plataforma do curso online: Plataforma Moodle IFSP
 *    Professor: Dr. João, Especialidade: Matemática, Anos de experiência: 15
 * 
 * 7. ANÁLISE DA SAÍDA:
 *    
 *    - Linha 1: Demonstra associação Aluno-Curso
 *    - Linhas 2-3: Demonstram associação Curso-Professor e composição Curso-Biblioteca
 *    - Linha 4: Demonstra método herdado (iniciarAulas)
 *    - Linhas 5-7: Demonstram polimorfismo (método sobrescrito + plataforma)
 *    - Linha 8: Demonstra método da classe Professor
 * 
 * 8. EXTENSIBILIDADE DO SISTEMA:
 *    
 *    Este design permite facilmente:
 *    - Adicionar novos tipos de curso (CursoPresencial, CursoHibrido)
 *    - Adicionar novos tipos de usuário (Coordenador, Funcionario)
 *    - Modificar comportamentos através de herança
 *    - Adicionar novos relacionamentos sem quebrar código existente
 * 
 * 9. BOAS PRÁTICAS DEMONSTRADAS:
 *    
 *    - Separação de responsabilidades (cada classe tem um propósito)
 *    - Encapsulamento (atributos privados, métodos públicos)
 *    - Reutilização (mesmo professor em múltiplos cursos)
 *    - Extensibilidade (herança permite novos tipos)
 *    - Documentação (código autodocumentado e comentários explicativos)
 */

