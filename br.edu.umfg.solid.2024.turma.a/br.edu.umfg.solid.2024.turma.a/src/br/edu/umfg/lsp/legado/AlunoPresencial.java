package br.edu.umfg.lsp.legado;

public class AlunoPresencial {
    private String ra;
    private String nome;
    private double notaFinal;

    public AlunoPresencial(String ra, String nome, double notaFinal) {
        this.ra = ra;
        this.nome = nome;
        this.notaFinal = notaFinal;
    }

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public double getNotaFinal() {
        return notaFinal;
    }
}
