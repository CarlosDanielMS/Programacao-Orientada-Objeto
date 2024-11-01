public abstract class CarroEletrico {
    private String id; // Número de identificação único
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double capacidadeBateria; // Capacidade total em kWh
    private double autonomiaMaxima; // Autonomia máxima em km
    private double autonomiaAtual; // Autonomia atual em km

    // Construtor
    public CarroEletrico(String id, String marca, String modelo, int anoFabricacao, double capacidadeBateria, double autonomiaMaxima) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.capacidadeBateria = capacidadeBateria;
        this.autonomiaMaxima = autonomiaMaxima;
        this.autonomiaAtual = autonomiaMaxima; // Inicializa a autonomia como máxima
    }

    // Métodos getters e setters
    public String getId() { return id; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAnoFabricacao() { return anoFabricacao; }
    public double getCapacidadeBateria() { return capacidadeBateria; }
    public double getAutonomiaMaxima() { return autonomiaMaxima; }
    public double getAutonomiaAtual() { return autonomiaAtual; }

    public void setAutonomiaAtual(double autonomiaAtual) {
        this.autonomiaAtual = Math.min(autonomiaAtual, autonomiaMaxima); // Garante que não excede o máximo
    }

    // Método abstrato que as subclasses implementarão para retornar o tempo médio de carga
    public abstract int getTempoMedioCarga();

    // Método para recarregar a bateria
    public void recarregarBateria() {
        setAutonomiaAtual(autonomiaMaxima); // Restaura a autonomia total
    }

    public void exibirInformacoes() {
    System.out.println("ID: " + id + 
                       ", Marca: " + marca + 
                       ", Modelo: " + modelo + 
                       ", Ano: " + anoFabricacao + 
                       ", Capacidade Bateria: " + capacidadeBateria + " kWh" + 
                       ", Autonomia: " + autonomiaMaxima + " km");
}

}
