package Visitor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VisitorTest {
	@Test
    public void testVisitorTxt() {
        Prontuario prontuario = new Prontuario("João", "Gripe");
        Visitor visitor = new VisitorTxt();
        assertEquals("Nome: João\nDiagnóstico: Gripe", prontuario.aceitar(visitor));
    }

    @Test
    public void testVisitorJson() {
        Prontuario prontuario = new Prontuario("Maria", "Febre");
        Visitor visitor = new VisitorJson();
        assertEquals("{ \"nome\": \"Maria\", \"diagnostico\": \"Febre\" }", prontuario.aceitar(visitor));
    }

    @Test
    public void testVisitorCsv() {
        Prontuario prontuario = new Prontuario("Carlos", "Dor de cabeça");
        Visitor visitor = new VisitorCsv();
        assertEquals("Carlos,Dor de cabeça", prontuario.aceitar(visitor));
    }
}
