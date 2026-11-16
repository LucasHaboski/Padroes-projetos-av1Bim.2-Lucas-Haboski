public class ComprovanteRut implements ComprovanteMatricula {

    private final String nomeAluno;
    private final String rut;
    private final String curso;

    public ComprovanteRut(String nomeAluno, String rut, String curso) {
        this.nomeAluno = nomeAluno;
        this.rut = rut;
        this.curso = curso;
    }

    @Override
    public String descrever() {
        return String.format("Comprovante de matrícula: %s (RUT %s) matriculado(a) em \"%s\"",
                nomeAluno, rut, curso);
    }
}
