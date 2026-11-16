public class BoletaElectronica implements DocumentoFiscal {

    private static final double ALIQUOTA_IVA = 0.19;

    private final String nomeAluno;
    private final double valor;

    public BoletaElectronica(String nomeAluno, double valor) {
        this.nomeAluno = nomeAluno;
        this.valor = valor;
    }

    @Override
    public String descrever() {
        return String.format("Boleta electrónica emitida para %s | valor CLP %.2f | IVA (19%%): CLP %.2f",
                nomeAluno, valor, valor * ALIQUOTA_IVA);
    }
}
