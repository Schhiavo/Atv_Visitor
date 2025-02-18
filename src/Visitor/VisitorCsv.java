package Visitor;

public class VisitorCsv implements Visitor {
    @Override
    public String exibirProntuario(Prontuario prontuario) {
        return prontuario.getNome() + "," + prontuario.getDiagnostico();
    }
}
