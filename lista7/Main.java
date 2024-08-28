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
        // Criando funcionários
        Funcionario funcionario1 = new Funcionario("Alice Costa", 5000.00);
        Funcionario funcionario2 = new Funcionario("Bob Silva", 6000.00);
        Funcionario funcionario3 = new Funcionario("Carlos Oliveira", 5500.00);

        // Criando empresa
        Empresa empresa = new Empresa();

        // Contratando funcionários
        empresa.contratarFuncionario(funcionario1);
        empresa.contratarFuncionario(funcionario2);
        empresa.contratarFuncionario(funcionario3);

        // Exibindo a folha de pagamento total
        System.out.println("Folha de Pagamento Total: R$" + String.format("%.2f", empresa.calcularFolhaDePagamento()));

        // Demitindo um funcionário
        empresa.demitirFuncionario("Bob Silva");

        // Exibindo a folha de pagamento total após demissão
        System.out.println("Folha de Pagamento Total após demissão: R$" + String.format("%.2f", empresa.calcularFolhaDePagamento()));
        
        // Exibindo todos os funcionários restantes
        System.out.println(empresa);
    }
}
