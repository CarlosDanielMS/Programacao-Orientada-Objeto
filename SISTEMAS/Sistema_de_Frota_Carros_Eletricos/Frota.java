import java.util.ArrayList;
import java.util.List;

public class Frota {
    private List<CarroEletrico> carros;

    public Frota() {
        this.carros = new ArrayList<>();
    }

    // Método para adicionar carro
    public void adicionarCarro(CarroEletrico carro) {
        carros.add(carro);
    }

    // Método para remover carro por ID
    public void removerCarro(String id) {
        carros.removeIf(carro -> carro.getId().equals(id));
    }

    // Método para listar todos os carros
    public void listarCarros() {
        for (CarroEletrico carro : carros) {
            System.out.println(carro);
        }
    }
}
