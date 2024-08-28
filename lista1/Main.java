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
        Cliente cliente1 = new Cliente("João da Silva", "123.456.789-00", "Rua A, 123");
        Cliente cliente2 = new Cliente("Maria Oliveira", "987.654.321-00", "Rua B, 456");

        ContaBancaria conta1 = new ContaBancaria("001", 1000.00, cliente1);
        ContaBancaria conta2 = new ContaBancaria("002", 500.00, cliente2);

        System.out.println(conta1);
        System.out.println(conta2);

        conta1.depositar(200.00);
        conta1.sacar(100.00);
        conta1.transferir(150.00, conta2);

        System.out.println(conta1);
        System.out.println(conta2);
    }
}
