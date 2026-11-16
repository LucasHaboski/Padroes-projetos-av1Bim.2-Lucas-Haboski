public class PagamentoWebpay implements Pagamento {

    private final String nomeAluno;
    private final double valor;

    public PagamentoWebpay(String nomeAluno, double valor) {
        this.nomeAluno = nomeAluno;
        this.valor = valor;
    }

    @Override
    public String descrever() {
        return String.format("Pagamento via Webpay de CLP %.2f processado para %s", valor, nomeAluno);
    }
}
