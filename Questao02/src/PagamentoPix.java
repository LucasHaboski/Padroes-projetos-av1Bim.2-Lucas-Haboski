public class PagamentoPix implements Pagamento {

    private final String nomeAluno;
    private final double valor;

    public PagamentoPix(String nomeAluno, double valor) {
        this.nomeAluno = nomeAluno;
        this.valor = valor;
    }

    @Override
    public String descrever() {
        return String.format("Pagamento via Pix de R$ %.2f processado para %s", valor, nomeAluno);
    }
}
