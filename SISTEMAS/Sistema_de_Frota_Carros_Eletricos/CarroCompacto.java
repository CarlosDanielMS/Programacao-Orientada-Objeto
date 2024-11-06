public class CarroCompacto extends CarroEletrico {
    public CarroCompacto(String id, String marca, String modelo, int anoFabricacao, double capacidadeBateria, double autonomiaMaxima) {
        super(id, marca, modelo, anoFabricacao, capacidadeBateria, autonomiaMaxima);
    }
    
    public int getTempoMedioCarga() {
        return 4; // Tempo de carga para Carro Compacto é 4 horas
    }
}
