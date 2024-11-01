import java.util.ArrayList;
import java.util.Date;

public class Viagem {
    private Motorista motorista;
    private CarroEletrico carro;
    private double quilometragem;
    private String destino;
    private ArrayList<Eletroposto> paradasRecarga;

    public Viagem(Motorista motorista, CarroEletrico carro, double quilometragem, String destino) {
        this.motorista = motorista;
        this.carro = carro;
        this.quilometragem = quilometragem;
        this.destino = destino;
        this.paradasRecarga = new ArrayList<>();
    }

    public void adicionarParadaRecarga(Eletroposto eletroposto) {
        if (eletroposto.getVagasDisponiveis() > 0) {
            paradasRecarga.add(eletroposto);
            eletroposto.reduzirVaga();
            System.out.println("Parada " + eletroposto.getLocalizacao() + " adicionada com sucesso.");
        } else {
            System.out.println("Eletroposto " + eletroposto.getLocalizacao() + " está cheio.");
        }
    }

    public void realizarViagem() {
        double autonomiaAtual = carro.getAutonomiaAtual();
        if (autonomiaAtual < quilometragem) {
            System.out.println("Autonomia insuficiente. Paradas para recarga são necessárias.");
            // Lógica para verificar eletropostos ao longo do caminho
        } else {
            System.out.println("Viagem iniciada sem necessidade de recarga.");
        }
    }

    public Motorista getMotorista() {
        return motorista;
    }
    
    public void exibirViagem() {
        System.out.println("Viagem {" +
            " Motorista: " + motorista +
            ", Carro: " + carro +
            ", Quilometragem: " + quilometragem +
            ", Destino: " + destino +
            ", Paradas de Recarga: " + paradasRecarga +
            " }");
}

}
