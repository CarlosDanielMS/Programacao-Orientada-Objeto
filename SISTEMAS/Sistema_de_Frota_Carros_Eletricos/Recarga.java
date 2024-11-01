import java.util.Date;

public class Recarga {
    private CarroEletrico carro;
    private Eletroposto eletroposto;
    private Date data;
    private double energiaCarregada;

    public Recarga(CarroEletrico carro, Eletroposto eletroposto, double energiaCarregada) {
        this.carro = carro;
        this.eletroposto = eletroposto;
        this.data = new Date();
        this.energiaCarregada = energiaCarregada;
        atualizarAutonomiaCarro();
    }

    private void atualizarAutonomiaCarro() {
        double novaAutonomia = carro.getAutonomiaAtual() + energiaCarregada;
        if (novaAutonomia > carro.getCapacidadeBateria()) {
            novaAutonomia = carro.getCapacidadeBateria();
        }
        carro.setAutonomiaAtual(novaAutonomia);
    }

    public CarroEletrico getCarro() {
        return carro;
    }
    public void exibirRecarga() {
    System.out.println("Recarga {" +
        " Carro: " + carro +
        ", Eletroposto: " + eletroposto +
        ", Data: " + data +
        ", Energia Carregada: " + energiaCarregada +
        " }");
}

}
