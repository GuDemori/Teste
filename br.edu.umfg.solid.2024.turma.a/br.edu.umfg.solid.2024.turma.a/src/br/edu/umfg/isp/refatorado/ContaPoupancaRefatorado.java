package br.edu.umfg.isp.refatorado;

public class ContaPoupancaRefatorado extends AbstractConta implements IContaRefatorada{

    public ContaPoupancaRefatorado(String documento, String nome) {
        super(documento, nome);
    }
}
