public class Principal {
    // Método principal (main)
    public static void main(String[] args) {
        
        Carro carro1 = new Carro("strongets", "sonninstrall", 2024, 35.000);
        ContaBancaria conta1 = new ContaBancaria("Diogenes", 161651651, 333.000);
        Pessoa pessoa1 = new Pessoa("Hadebaior", 33, "02951015046");

        //carro1.exibir();
        //conta1.exibir();
        pessoa1.exibir();
    }    
}

