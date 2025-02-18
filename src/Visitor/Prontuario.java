package Visitor;

public class Prontuario {
	private String nome;
    private String diagnostico;

    public Prontuario(String nome, String diagnostico) {
        this.nome = nome;
        this.diagnostico = diagnostico;
    }

    public String getNome() {
        return nome;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirProntuario(this);
    }
}
