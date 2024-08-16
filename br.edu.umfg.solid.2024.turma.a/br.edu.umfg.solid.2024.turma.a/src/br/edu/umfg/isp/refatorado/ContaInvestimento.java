package br.edu.umfg.isp.refatorado;

public class ContaInvestimento extends AbstractConta implements IContaInvestimento, IContaRefatorada{

    private Double investido = 0.0;

    public ContaInvestimento(String documento, String nome) {
        super(documento, nome);
    }

    @Override
    public void investir(Double valor) {
        creditar(valor);
        this.investido += valor;

    }

}
