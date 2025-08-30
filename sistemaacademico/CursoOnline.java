
package com.mycompany.sistemaacademico;

/**
 * 
 * Classe CursoOnline - Demonstração de Herança e Polimorfismo
 * 
 * Esta classe demonstra conceitos avançados da programação orientada a objetos:
 * 
 * 1. HERANÇA: Estende a classe Curso, herdando todos seus atributos e métodos
 * 2. ESPECIALIZAÇÃO: Adiciona funcionalidades específicas para cursos online
 * 3. POLIMORFISMO: Sobrescreve métodos da classe pai para comportamento específico
 * 4. REUTILIZAÇÃO: Aproveita código existente da classe Curso
 * 
 * A herança permite criar uma versão especializada de Curso sem duplicar código,
 * demonstrando um dos pilares fundamentais da orientação a objetos.
 * 
 * @author Davi Paulino Conceição
 *
*/

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
    
     // ========== MÉTODOS SOBRESCRITOS (POLIMORFISMO) ==========
    
    /**
     * Método sobrescrito que exibe informações completas do curso online
     * 
     * Este método demonstra POLIMORFISMO através da sobrescrita (override).
     * 
     * COMO FUNCIONA A SOBRESCRITA:
     * 1. A classe pai (Curso) tem um método exibirInformacoes()
     * 2. A classe filha (CursoOnline) sobrescreve este método
     * 3. Quando chamado em um objeto CursoOnline, executa esta versão
     * 4. Esta versão chama a versão da classe pai E adiciona funcionalidade
     * 
     * REUTILIZAÇÃO DE CÓDIGO:
     * - super.exibirInformacoes() chama o método da classe pai
     * - Evita duplicação de código
     * - Adiciona apenas a funcionalidade específica (plataforma)
     * 
     * POLIMORFISMO EM AÇÃO:
     * - Curso curso = new CursoOnline(...);
     * - curso.exibirInformacoes(); // Chama a versão sobrescrita!
     */

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Plataforma do curso online: " + plataforma);
    }
}

/*
 * ========== CONCEITOS DEMONSTRADOS NESTA CLASSE ==========
 * 
 * 1. HERANÇA (extends Curso):
 *    - CursoOnline "é um" Curso (is-a relationship)
 *    - Herda todos os atributos: nome, duracaoMeses, professor, biblioteca
 *    - Herda todos os métodos: getNome(), setNome(), iniciarAulas(), etc.
 *    - Pode usar todos os métodos da classe pai sem reimplementar
 * 
 * 2. ESPECIALIZAÇÃO:
 *    - Adiciona atributo específico: plataforma
 *    - Adiciona métodos específicos: getPlataforma(), setPlataforma()
 *    - Mantém toda funcionalidade da classe pai
 *    - Estende funcionalidade sem modificar a classe pai
 * 
 * 3. POLIMORFISMO (Method Overriding):
 *    - @Override indica sobrescrita intencional
 *    - Mesmo nome de método, comportamento diferente
 *    - super.exibirInformacoes() reutiliza código da classe pai
 *    - Adiciona comportamento específico (exibir plataforma)
 * 
 * 4. REUTILIZAÇÃO DE CÓDIGO:
 *    - Não precisa reimplementar getters/setters básicos
 *    - Não precisa reimplementar iniciarAulas()
 *    - Construtor reutiliza lógica da classe pai com super()
 *    - Método sobrescrito reutiliza implementação pai com super.método()
 * 
 * 5. EXEMPLO PRÁTICO DE USO:
 *    
 *    // Criando objetos
 *    Professor prof = new Professor("Dr. João", "Matemática", 15);
 *    Curso cursoPresencial = new Curso("Matemática", 12, prof);
 *    CursoOnline cursoOnline = new CursoOnline("Java", 6, prof, "Moodle");
 *    
 *    // Polimorfismo em ação
 *    Curso[] cursos = {cursoPresencial, cursoOnline};
 *    for (Curso curso : cursos) {
 *        curso.exibirInformacoes(); // Chama versão apropriada para cada tipo
 *    }
 *    
 *    // Resultado:
 *    // Para cursoPresencial: exibe info básica
 *    // Para cursoOnline: exibe info básica + plataforma
 * 
 * 6. VANTAGENS DA HERANÇA:
 *    - Reutilização de código (DRY - Don't Repeat Yourself)
 *    - Facilita manutenção (mudanças na classe pai afetam todas as filhas)
 *    - Permite polimorfismo (tratar objetos diferentes de forma uniforme)
 *    - Organização hierárquica do código (especialização gradual)
 *    - Extensibilidade (fácil adicionar novos tipos de curso)
 * 
 * 7. HIERARQUIA DE CLASSES NESTE EXEMPLO:
 *    
 *    Object (classe raiz do Java)
 *      ↓
 *    Curso (classe pai)
 *      ↓
 *    CursoOnline (classe filha)
 *    
 *    Possíveis extensões futuras:
 *    - CursoPresencial extends Curso
 *    - CursoHibrido extends Curso
 *    - CursoEAD extends CursoOnline
 */


