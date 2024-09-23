class Tarefa {
    private String nome;
    private String descricao;
    private int duracaoEstimada;
    private String estado; 

    public Tarefa(String nome, String descricao, int duracaoEstimada) {

    }

    public String getNome(){ 
        return nome; 
    }
    public String getDescricao(){ 
        return descricao; 
    }
    public int getDuracaoEstimada(){ 
        return duracaoEstimada; 
    }
    public String getEstado(){ 
        return estado; 
    }
}