public class Motorista {
    private String nome;
    private String numeroIdentificacao;
    private String numeroHabilitacao;
    private String nivelExperiencia; // Pode ser "iniciante", "intermediário" ou "avançado"

    public Motorista(String nome, String numeroIdentificacao, String numeroHabilitacao, String nivelExperiencia) {
        this.nome = nome;
        this.numeroIdentificacao = numeroIdentificacao;
        this.numeroHabilitacao = numeroHabilitacao;
        this.nivelExperiencia = nivelExperiencia;
    }

    public String getNome() { return nome; }
    public String getNumeroIdentificacao() { return numeroIdentificacao; }
    public String getNumeroHabilitacao() { return numeroHabilitacao; }
    public String getNivelExperiencia() { return nivelExperiencia; }

    public void exibirMotorista() {
        System.out.println("Motorista{" +
                "nome='" + nome + '\'' +
                ", numeroIdentificacao='" + numeroIdentificacao + '\'' +
                ", numeroHabilitacao='" + numeroHabilitacao + '\'' +
                ", nivelExperiencia='" + nivelExperiencia + '\'' +
                '}');
    }
}
