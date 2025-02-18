package Visitor;

public class VisitorJson implements Visitor {
    @Override
    public String exibirProntuario(Prontuario prontuario) {
        return "{ \"nome\": \"" + prontuario.getNome() + "\", \"diagnostico\": \"" + prontuario.getDiagnostico() + "\" }";
    }
}