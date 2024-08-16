package br.edu.umfg.isp;

import br.edu.umfg.isp.legado.ContaCorrente;
import br.edu.umfg.isp.legado.ContaPoupanca;
import br.edu.umfg.isp.refatorado.ContaCorrenteRefatorado;
import br.edu.umfg.isp.refatorado.ContaInvestimento;
import br.edu.umfg.isp.refatorado.ContaPoupancaRefatorado;

public class PrincipioDeSegregacaoDeInterface {

    public static void executarLegado(){
        ContaCorrente contaCorrente = new ContaCorrente("0001", "TESTE 1");
        ContaPoupanca contaPoupanca = new ContaPoupanca("0002", "TESTE 2");

        contaCorrente.creditar(1000.00);
        contaCorrente.debitar(55.70);

        contaPoupanca.creditar(1000.00);
        contaPoupanca.debitar(465.68);

        System.out.println("CC: " + contaCorrente.getSaldo());
        System.out.println("CP: " + contaPoupanca.getSaldo());

    }
    public static void executarRefatorado(){
        ContaCorrenteRefatorado contaCorrenteRefatorado = new ContaCorrenteRefatorado("0001", "TESTE 1");
        ContaPoupancaRefatorado contaPoupancaRefatorado = new ContaPoupancaRefatorado("0002", "TESTE 2");
        ContaInvestimento contaInvestimento = new ContaInvestimento("0003", "TESTE 3");

        contaCorrenteRefatorado.creditar(1000.00);
        contaCorrenteRefatorado.debitar(55.70);

        contaPoupancaRefatorado.creditar(1000.00);
        contaPoupancaRefatorado.debitar(465.68);

        contaInvestimento.creditar(1000.00);
        contaInvestimento.debitar(798.32);
        contaInvestimento.investir(1238.16);

        System.out.println("CC: " + contaCorrenteRefatorado.getSaldo());
        System.out.println("CP: " + contaPoupancaRefatorado.getSaldo());
        System.out.println("CI: " + contaInvestimento.getSaldo());


    }

}
