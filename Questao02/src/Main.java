public class Main {

    public static void main(String[] args) {
        Matricula matriculaBrasil = new Matricula(new FabricaArtefatosBrasil());
        matriculaBrasil.confirmar("Kelvi Moacir", "675.343.259-02", "Ciencia da Coomputação", 500.00);
        matriculaBrasil.imprimirRelatorio();

        Matricula matriculaChile = new Matricula(new FabricaArtefatosChile());
        matriculaChile.confirmar("Guilherme Enache", "25.441.933-2", "Ciencia de la computación", 90000.00);
        matriculaChile.imprimirRelatorio();
    }
}


