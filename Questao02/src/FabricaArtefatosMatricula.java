public interface FabricaArtefatosMatricula {

    DocumentoFiscal criarDocumentoFiscal(String nomeAluno, double valor);

    Pagamento criarPagamento(String nomeAluno, double valor);

    ComprovanteMatricula criarComprovante(String nomeAluno, String identificacao, String curso);
}
