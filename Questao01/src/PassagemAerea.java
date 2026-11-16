import java.util.List;

public class PassagemAerea extends Passagem {

    public PassagemAerea(String nomePassageiro, double valorTarifa) {
        super(nomePassageiro, valorTarifa);
    }

    @Override
    public String getModal() {
        return "Aéreo";
    }

    @Override
    protected double getPercentualTaxa() {
        return 0.08;
    }

    @Override
    public List<String> getDocumentosExigidos() {
        return List.of("CPF Eletronico ou Fisico", "Bilhete eletrônico (e-ticket)");
    }
}
