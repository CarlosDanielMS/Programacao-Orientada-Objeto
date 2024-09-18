public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        Carro carro = new Carro("Fusca", "1200", 1985, 15000);
        System.out.println("Carro:");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Preço: R$ " + carro.getPreco());
        System.out.println();

        // Criando um objeto da classe ContaBancaria
        ContaBancaria conta = new ContaBancaria("João Silva", "12345-6", 1000);
        System.out.println("Conta Bancária:");
        conta.depositar(500);
        System.out.println("Saldo após depósito: R$ " + conta.getSaldo());
        conta.sacar(300);
        System.out.println("Saldo após saque: R$ " + conta.getSaldo());
        System.out.println();

        // Criando um objeto da classe Pessoa
        Pessoa pessoa = new Pessoa("Maria Oliveira", 30, "123.456.789-00");
        System.out.println("Pessoa:");
        pessoa.mostrarDados();
        System.out.println();

        // Criando um objeto da classe Produto
        Produto produto = new Produto("Notebook", 10, 2500);
        System.out.println("Produto:");
        produto.mostrarDados();
        produto.adicionarEstoque(5);
        System.out.println("Quantidade em estoque após adicionar: " + produto.getQuantidadeEstoque());
        produto.vender(3);
        System.out.println("Quantidade em estoque após venda: " + produto.getQuantidadeEstoque());
        System.out.println();

        // Criando um objeto da classe Funcionario
        Funcionario funcionario = new Funcionario("Carlos Souza", 3000, "assistente");
        System.out.println("Funcionário:");
        funcionario.mostrarDados();
        funcionario.aumentarSalario(10);
        System.out.println("Salário após aumento: R$ " + funcionario.getSalario());
        funcionario.promover("analista");
        System.out.println("Cargo após promoção: " + funcionario.getCargo());
        System.out.println();
    }
}
