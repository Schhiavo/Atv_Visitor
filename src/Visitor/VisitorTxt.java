package Visitor;

public class VisitorTxt implements Visitor {
	 @Override
	    public String exibirProntuario(Prontuario prontuario) {
	        return "Nome: " + prontuario.getNome() + "\nDiagnóstico: " + prontuario.getDiagnostico();
	    }
}
