class Viagem {
    private Veiculo veiculo;
    private Motorista motorista;
    private String origem;
    private String destino;
    private double distancia;

    public Viagem(Veiculo veiculo, Motorista motorista, String origem, String destino, double distancia) {

    }

    public Veiculo getVeiculo(){ 
        return veiculo; 
    }
    public Motorista getMotorista(){ 
        return motorista;
    }
    public double getDistancia(){ 
        return distancia;
    }
}