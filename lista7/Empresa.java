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

// Empresa.java
public class Empresa {
    private List<Funcionario> funcionarios;

    // Construtor
    public Empresa() {
        this.funcionarios = new ArrayList<>();
    }

    // Método para contratar um novo funcionário
    public void contratarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        System.out.println("Funcionário contratado: " + funcionario);
    }

    // Método para demitir um funcionário
    public void demitirFuncionario(String nome) {
        Funcionario funcionarioParaRemover = null;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equalsIgnoreCase(nome)) {
                funcionarioParaRemover = funcionario;
                break;
            }
        }
        if (funcionarioParaRemover != null) {
            funcionarios.remove(funcionarioParaRemover);
            System.out.println("Funcionário demitido: " + funcionarioParaRemover);
        } else {
            System.out.println("Funcionário com nome \"" + nome + "\" não encontrado.");
        }
    }

    // Método para calcular a folha de pagamento total
    public double calcularFolhaDePagamento() {
        double total = 0.0;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.getSalario();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Funcionários: " + funcionarios;
    }
}
