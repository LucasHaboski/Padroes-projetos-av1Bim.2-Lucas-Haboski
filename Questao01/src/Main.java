public class Main {

    public static void main(String[] args) {
        EmissorPassagem emissorAereo = new EmissorPassagemAerea();
        EmissorPassagem emissorRodoviario = new EmissorPassagemRodoviaria();
        EmissorPassagem emissorFerroviario = new EmissorPassagemFerroviaria();

        emissorAereo.emitir("Kelvi Moacir", 1200.50);
        emissorRodoviario.emitir("Guilherme Enache", 275.00);
        emissorFerroviario.emitir("Ryann Valim", 480.00);
    }
}
