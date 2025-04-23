import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class VeiculoController {
    private List<Veiculo> veiculos;

    public VeiculoController(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        this.veiculos.add(veiculo);
    }

    public void removerVeiculo(Veiculo veiculo) {
        this.veiculos.remove(veiculo);
    }

    public Optional<Veiculo> buscarVeiculo(String modelo){
        return veiculos.stream().filter(v -> v.getModelo().equalsIgnoreCase(modelo)).findFirst();
    }

    public boolean alterarVeiculo(String modelo, Veiculo novoVeiculo) {
        Optional<Veiculo> veiculoEncontrado = buscarVeiculo(modelo);
        if(veiculoEncontrado.isPresent()) {
            veiculos.remove(veiculoEncontrado.get());
            veiculos.add(novoVeiculo);
            return true;
        }
        return false;
    }

    public void ordenarPorAno(){
        veiculos = veiculos.stream()
                .sorted(Comparator.comparingInt(Veiculo::getAno))
                .collect(Collectors.toList());
        Collections.sort(veiculos, Comparator.comparingInt(Veiculo::getAno));
    }


    public boolean excluirVeiculo(String modelo) {
        Optional<Veiculo> veiculoEncontrado = buscarVeiculo(modelo);
        return veiculoEncontrado.map(veiculos::remove).orElse(false);
    }

    public List<Veiculo> listarVeiculos(){
        return veiculos;
    }

    public List<Moto> listarMotos(){
        return veiculos.stream()
                .filter(v -> v instanceof Moto)
                .map(v -> (Moto) v)
                .collect(Collectors.toList());
    }

    /*Implemetar metodo de listar carro*/
}
