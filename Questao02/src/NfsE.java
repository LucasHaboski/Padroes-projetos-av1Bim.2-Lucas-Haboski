public class NfsE implements DocumentoFiscal {

    private static final double ALIQUOTA_ISS = 0.05;

    private final String nomeAluno;
    private final double valor;

    public NfsE(String nomeAluno, double valor) {
        this.nomeAluno = nomeAluno;
        this.valor = valor;
    }

    @Override
    public String descrever() {
        return String.format("NFS-e emitida para %s | valor R$ %.2f | ISS (5%%): R$ %.2f",
                nomeAluno, valor, valor * ALIQUOTA_ISS);
    }
}
