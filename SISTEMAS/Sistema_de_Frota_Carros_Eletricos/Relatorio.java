import java.util.ArrayList;

public class Relatorio{
    public static void listarVeiculosBaixaAutonomia(ArrayList<CarroEletrico> frota){
        System.out.println("Veículos com autonomia inferior a 20%:");
        for (CarroEletrico carro : frota){
            if (carro.getAutonomiaAtual() < carro.getCapacidadeBateria() * 0.2){
                System.out.println(carro);
            }
        }
    }

    public static void listarViagensMotorista(ArrayList<Viagem> viagens, Motorista motorista){
        System.out.println("Viagens realizadas por " + motorista.getNome() + ":");
        for (Viagem viagem : viagens){
            if (viagem.getMotorista().equals(motorista)){
                System.out.println(viagem);
            }
        }
    }
    
    // Método para listar histórico de recargas de um carro específico
    public static void listarHistoricoRecargas(ArrayList<Recarga> recargas, CarroEletrico carro){
        System.out.println("Histórico de recargas: " + carro.getModelo());
        for (Recarga recarga : recargas){
            if (recarga.getCarro().equals(carro)){
                System.out.println(recarga);
            }
        }
    }
}

#O método equals() é usado para comparar se dois objetos são iguais. Ele é utilizado para comparar, por exemplo, 
#o motorista de uma viagem com o motorista fornecido ou o carro de uma recarga com o carro especificado.
    
