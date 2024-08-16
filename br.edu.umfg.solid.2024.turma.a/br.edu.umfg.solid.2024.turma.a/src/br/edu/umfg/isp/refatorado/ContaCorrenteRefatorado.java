package br.edu.umfg.isp.refatorado;

public class ContaCorrenteRefatorado extends AbstractConta implements IContaRefatorada{

    public ContaCorrenteRefatorado(String documento, String nome) {
        super(documento, nome);
    }
}
