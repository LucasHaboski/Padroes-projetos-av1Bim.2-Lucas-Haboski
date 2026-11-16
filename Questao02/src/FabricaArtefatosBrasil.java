public class FabricaArtefatosBrasil implements FabricaArtefatosMatricula {

    @Override
    public DocumentoFiscal criarDocumentoFiscal(String nomeAluno, double valor) {
        return new NfsE(nomeAluno, valor);
    }

    @Override
    public Pagamento criarPagamento(String nomeAluno, double valor) {
        return new PagamentoPix(nomeAluno, valor);
    }

    @Override
    public ComprovanteMatricula criarComprovante(String nomeAluno, String identificacao, String curso) {
        return new ComprovanteCpf(nomeAluno, identificacao, curso);
    }
}
