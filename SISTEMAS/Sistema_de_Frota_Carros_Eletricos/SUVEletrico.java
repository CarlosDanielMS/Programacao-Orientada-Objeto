public class SUVEletrico extends CarroEletrico {
    public SUVEletrico(String id, String marca, String modelo, int anoFabricacao, double capacidadeBateria, double autonomiaMaxima) {
        super(id, marca, modelo, anoFabricacao, capacidadeBateria, autonomiaMaxima);
    }

    @Override
    public int getTempoMedioCarga() {
        return 8; // Tempo de carga para SUV Elétrico é 8 horas
    }
}
