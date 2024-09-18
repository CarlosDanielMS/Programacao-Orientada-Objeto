public class Pessoa {

    private String nome;
    private int idade;
    private final String cpf;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        setIdade(idade);
        this.cpf = cpf; 
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade <= 0) {
            throw new IllegalArgumentException("A idade deve ser maior que zero.");
        }
        this.idade = idade;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
    }
}
