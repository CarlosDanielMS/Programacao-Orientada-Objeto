
public class Pessoa{
    private String nome;
    private int idade;
    private String cpf;
    

    
    public Pessoa(String nome, int idade, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        
    }

    public String setnome(){
        return nome;
    }

    public void getnome(String nome){
        this.nome = nome;        
    }

    public int setidade(){
        return idade;
    }

    public void getidade(int idade){
        this.idade = idade;        
    }

    public String setcpf(String cpf){
        return cpf;
    }

    public void getcpf(String cpf){
        this.cpf = cpf;        
    }


    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);

    }
}
