/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
// Main.java
public class Main {
    public static void main(String[] args) {
        // Criando disciplinas
        Disciplina disciplina1 = new Disciplina("Matemática", 8.5);
        Disciplina disciplina2 = new Disciplina("História", 7.0);
        Disciplina disciplina3 = new Disciplina("Biologia", 9.0);

        // Criando aluno
        Aluno aluno = new Aluno("Carlos Silva", "2023001");

        // Matriculando o aluno nas disciplinas
        aluno.matricularDisciplina(disciplina1);
        aluno.matricularDisciplina(disciplina2);
        aluno.matricularDisciplina(disciplina3);

        // Calculando e mostrando a média das notas
        double media = aluno.calcularMediaNotas();
        System.out.println(aluno);
        System.out.println("Média das notas: " + String.format("%.2f", media));
    }
}
