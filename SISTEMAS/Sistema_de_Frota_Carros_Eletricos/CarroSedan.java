public class CarroSedan extends CarroEletrico {
    public CarroSedan(String id, String marca, String modelo, int anoFabricacao, double capacidadeBateria, double autonomiaMaxima) {
        super(id, marca, modelo, anoFabricacao, capacidadeBateria, autonomiaMaxima);
    }

    public int getTempoMedioCarga() {
        return 6; // Tempo de carga para Carro Sedan é 6 horas
    }
}
