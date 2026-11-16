public class ComprovanteCpf implements ComprovanteMatricula {

    private final String nomeAluno;
    private final String cpf;
    private final String curso;

    public ComprovanteCpf(String nomeAluno, String cpf, String curso) {
        this.nomeAluno = nomeAluno;
        this.cpf = cpf;
        this.curso = curso;
    }

    @Override
    public String descrever() {
        return String.format("Comprovante de matrícula: %s (CPF %s) matriculado(a) em \"%s\"",
                nomeAluno, cpf, curso);
    }
}
