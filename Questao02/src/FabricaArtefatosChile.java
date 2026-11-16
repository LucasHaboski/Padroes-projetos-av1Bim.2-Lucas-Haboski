public class FabricaArtefatosChile implements FabricaArtefatosMatricula {

    @Override
    public DocumentoFiscal criarDocumentoFiscal(String nomeAluno, double valor) {
        return new BoletaElectronica(nomeAluno, valor);
    }

    @Override
    public Pagamento criarPagamento(String nomeAluno, double valor) {
        return new PagamentoWebpay(nomeAluno, valor);
    }

    @Override
    public ComprovanteMatricula criarComprovante(String nomeAluno, String identificacao, String curso) {
        return new ComprovanteRut(nomeAluno, identificacao, curso);
    }
}
