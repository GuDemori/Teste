package br.edu.umfg.isp.refatorado;

public interface IContaRefatorada {

    void debitar(Double valor);
    void creditar(Double valor);
    Double getSaldo();


}
