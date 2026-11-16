public class Matricula {

    private final FabricaArtefatosMatricula fabrica;

    private DocumentoFiscal documentoFiscal;
    private Pagamento pagamento;
    private ComprovanteMatricula comprovante;

    public Matricula(FabricaArtefatosMatricula fabrica) {
        this.fabrica = fabrica;
    }

    public void confirmar(String nomeAluno, String identificacao, String curso, double valor) {
        this.documentoFiscal = fabrica.criarDocumentoFiscal(nomeAluno, valor);
        this.pagamento = fabrica.criarPagamento(nomeAluno, valor);
        this.comprovante = fabrica.criarComprovante(nomeAluno, identificacao, curso);
    }

    public void imprimirRelatorio() {
        System.out.println("Relatório da Matrícula: ");
        System.out.println("Documento fiscal: " + documentoFiscal.descrever());
        System.out.println("Pagamento:        " + pagamento.descrever());
        System.out.println("Comprovante:      " + comprovante.descrever());
        System.out.println();
    }
}
