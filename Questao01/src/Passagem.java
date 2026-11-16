import java.util.List;

public abstract class Passagem {

    private final String nomePassageiro;
    private final double valorTarifa;
    private double taxaEmbarque;

    protected Passagem(String nomePassageiro, double valorTarifa) {
        this.nomePassageiro = nomePassageiro;
        this.valorTarifa = valorTarifa;
    }

    public abstract String getModal();

    protected abstract double getPercentualTaxa();

    public abstract List<String> getDocumentosExigidos();

    public double calcularTaxaEmbarque() {
        taxaEmbarque = valorTarifa * getPercentualTaxa();
        return taxaEmbarque;
    }

    public void imprimirResumo() {
        System.out.println("Resumo da Emissão: ");
        System.out.println("Modal: " + getModal());
        System.out.println("Passageiro: " + nomePassageiro);
        System.out.printf("Valor da tarifa: R$ %.2f%n", valorTarifa);
        System.out.printf("Taxa de embarque (%.0f%%): R$ %.2f%n", getPercentualTaxa() * 100, taxaEmbarque);
        System.out.println("Documentos exigidos:");
        for (String documento : getDocumentosExigidos()) {
            System.out.println("  - " + documento);
        }
        System.out.println();
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public double getValorTarifa() {
        return valorTarifa;
    }
}
