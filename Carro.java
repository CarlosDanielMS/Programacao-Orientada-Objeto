// Classe Funcionario
public class Carro{
    private String marca;
    private String modelo;
    private int ano;
    private double preco;
    
    public Carro(String marca, String modelo, int ano, double preco){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;        
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;        
    }

    public int getano(int ano){
        return ano;
    }

    public void setano(int ano){
        this.ano = ano;        
    }


    public double getPreco(double preco){
        return preco;
    }

    public void setPreco(double preco){
        if (preco > 0){
            this.preco = preco;
        }
        
    }
    public void exibir(){
        System.out.println("Lançamento da Marca: " + marca);
        System.out.println("Lançamento do Modelo: " + modelo);
        System.out.println("Ano de Lançamento: " + ano);
        System.out.println("Preço de Lançamento: " + preco);
    }
}
