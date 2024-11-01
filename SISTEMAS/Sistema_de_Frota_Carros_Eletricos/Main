import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Lista de veículos, motoristas, eletropostos, viagens e recargas
        ArrayList<CarroEletrico> frota = new ArrayList<>();
        ArrayList<Motorista> motoristas = new ArrayList<>();
        ArrayList<Eletroposto> eletropostos = new ArrayList<>();
        ArrayList<Viagem> viagens = new ArrayList<>();
        ArrayList<Recarga> recargas = new ArrayList<>();

        // Cadastro de veículos elétricos
        CarroCompacto carro1 = new CarroCompacto("ID001", "Tesla", "Model 3", 2023, 75.0, 300.0);
        CarroSedan carro2 = new CarroSedan("ID002", "Toyota", "Camry", 2023, 80.0, 400.0);
        SUVEletrico carro3 = new SUVEletrico("ID003", "Tesla", "Model X", 2023, 100.0, 500.0);
        
        frota.add(carro1);
        frota.add(carro2);
        frota.add(carro3);

        System.out.println("Carros cadastrados na frota:");
        for (CarroEletrico carro : frota) {
            System.out.println(carro);
        }

        // Cadastro de motoristas
        Motorista motorista1 = new Motorista("Alice", "ID123", "CNH12345", "avançado");
        Motorista motorista2 = new Motorista("Bob", "ID124", "CNH54321", "intermediário");

        motoristas.add(motorista1);
        motoristas.add(motorista2);

        System.out.println("\nMotoristas cadastrados:");
        for (Motorista motorista : motoristas) {
            System.out.println(motorista);
        }

        // Cadastro de eletropostos
        Eletroposto posto1 = new Eletroposto("EP001", "Cidade A", 5, 4);
        Eletroposto posto2 = new Eletroposto("EP002", "Estrada X", 3, 6);
        Eletroposto posto3 = new Eletroposto("EP003", "Cidade B", 4, 8);

        eletropostos.add(posto1);
        eletropostos.add(posto2);
        eletropostos.add(posto3);

        System.out.println("\nEletropostos cadastrados:");
        for (Eletroposto eletroposto : eletropostos) {
            System.out.println(eletroposto);
        }

        // Realização de uma viagem com planejamento de paradas para recarga
        Viagem viagem1 = new Viagem(motorista1, carro2, 350, "Cidade B");
        viagem1.adicionarParadaRecarga(posto1);
        viagem1.adicionarParadaRecarga(posto2);

        viagens.add(viagem1);
        viagem1.realizarViagem();

        System.out.println("\nViagens realizadas:");
        for (Viagem viagem : viagens) {
            System.out.println(viagem);
        }

        // Registrar evento de recarga
        Recarga recarga1 = new Recarga(carro2, posto1, 50); // 50 kWh de recarga
        recargas.add(recarga1);

        System.out.println("\nRecargas realizadas:");
        for (Recarga recarga : recargas) {
            System.out.println(recarga);
        }

        // Gerar relatórios e consultas
        System.out.println("\nRelatório de veículos com autonomia inferior a 20%:");
        Relatorio.listarVeiculosBaixaAutonomia(frota);

        System.out.println("\nHistórico de recargas do carro " + carro2.getModelo() + ":");
        Relatorio.listarHistoricoRecargas(recargas, carro2);

        System.out.println("\nViagens realizadas por " + motorista1.getNome() + ":");
        Relatorio.listarViagensMotorista(viagens, motorista1);
    }
}
