public class Eletroposto {
    private String id;
    private String localizacao;
    private int vagasDisponiveis;
    private int tempoMedioCarregamento; 
    
    public Eletroposto(String id, String localizacao, int vagasDisponiveis, int tempoMedioCarregamento) {
        this.id = id;
        this.localizacao = localizacao;
        this.vagasDisponiveis = vagasDisponiveis;
        this.tempoMedioCarregamento = tempoMedioCarregamento;
    }

    public String getId(){ 
        return id; 
    }
    public String getLocalizacao(){ 
        return localizacao; 
    }
    public int getVagasDisponiveis(){ 
        return vagasDisponiveis; 
    }
    public int getTempoMedioCarregamento(){ 
        return tempoMedioCarregamento; 
    }

    public void reduzirVaga() {
        if (vagasDisponiveis > 0) vagasDisponiveis--;
    }

    public void aumentarVaga() {
        vagasDisponiveis++;
    }

    public void exibirInformacoes() {
        System.out.println("Eletroposto{" + 
                           "id='" + id + '\'' + 
                           ", localizacao='" + localizacao + '\'' + 
                           ", vagasDisponiveis=" + vagasDisponiveis + 
                           ", tempoMedioCarregamento=" + tempoMedioCarregamento + 
                           '}');
    }
}
