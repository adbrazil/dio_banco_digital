package com.BancoDigital.Domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaPoupancaTeste {

    @Test
    public void shouldReturnSumValueInSaldoInDeposity(){
        Conta conta = new ContaPoupanca(2500);
        double deposito = conta.depositar(2500);
        Assertions.assertEquals(5000,deposito);


    }

    @Test
    public void shouldReturnSameValueInSaldoInDeposity(){
        Conta conta = new ContaPoupanca(2500);
        double deposito = conta.depositar(2500);
        Assertions.assertEquals(2500,deposito);

    }

    @Test
    public void shouldReturnSubstractValueInSaldoInWithdraw(){
        Conta conta = new ContaPoupanca(2500);
        double withdraw = conta.sacar(500);
        Assertions.assertEquals(2000,withdraw);

    }

    @Test
    public void shouldReturnSameValueInSaldoInWithdraw(){
        Conta conta = new ContaPoupanca(2500);
        double withdraw = conta.sacar(3000);
        Assertions.assertEquals(2500,withdraw);

    }

    @Test
    public void shouldReturnSubstractValueInSaldoInTransfer(){
        Conta conta = new ContaPoupanca(2500);
        double transfer = conta.sacar(500);
        Assertions.assertEquals(2000,transfer);

    }

    @Test
    public void shouldReturnSameValueInSaldoInTransfer(){
        Conta conta = new ContaPoupanca(2500);
        double transfer = conta.sacar(3000);
        Assertions.assertEquals(2500,transfer);

    }
}
