/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
import java.util.ArrayList;
import java.util.List;

// Aluno.java
public class Aluno {
    private String nome;
    private String matricula;
    private List<Disciplina> disciplinas;

    // Construtor
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinas = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    // Método para matricular-se em uma disciplina
    public void matricularDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
        System.out.println("Matricula na disciplina " + disciplina.getNome() + " realizada com sucesso.");
    }

    // Método para calcular a média das notas
    public double calcularMediaNotas() {
        if (disciplinas.isEmpty()) {
            return 0.0;
        }
        double somaNotas = 0.0;
        for (Disciplina disciplina : disciplinas) {
            somaNotas += disciplina.getNota();
        }
        return somaNotas / disciplinas.size();
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + ", Matrícula: " + matricula + ", Disciplinas: " + disciplinas;
    }
}
