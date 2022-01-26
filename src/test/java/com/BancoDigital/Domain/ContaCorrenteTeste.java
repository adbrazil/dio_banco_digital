package com.BancoDigital.Domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaCorrenteTeste {

    @Test
    public void shouldReturnSubstractValueInSaldoInWithdraw(){
        Conta conta = new ContaCorrente(2000,2500);
        double withdraw = conta.sacar(500);
        Assertions.assertEquals(2000,withdraw);

    }

    @Test
    public void shouldReturnSameValueInSaldoAndCreditInWithdraw(){
        Conta conta = new ContaCorrente(2000,2500);
        double withdraw = conta.sacar(4000);
        Assertions.assertEquals(0,withdraw);
    }

    @Test
    public void shouldReturnSameValueInCreditInWithdraw(){
        Conta conta = new ContaCorrente(2000,0.0);
        double withdraw = conta.sacar(2000);
        Assertions.assertEquals(0,withdraw);
    }

    @Test
    public void shouldReturnSameValueInSaldoInWithdraw(){
        Conta conta = new ContaCorrente(2000,2500);
        double withdraw = conta.sacar(5000);
        Assertions.assertEquals(2500,withdraw);
    }


    ////

    @Test
    public void shouldReturnSubstractValueInSaldoInTransfer(){
        Conta conta = new ContaCorrente(2000,2500);
        Conta contaNova = new ContaCorrente(2000,2500);
        double transfer = conta.transferir(contaNova,500);
        Assertions.assertEquals(2000,transfer);

    }

    @Test
    public void shouldReturnSameValueInSaldoAndCreditInTransfer(){
        Conta conta = new ContaCorrente(2000,2500);
        Conta contaNova = new ContaCorrente(2000,2500);
        double transfer = conta.transferir(contaNova,4000);
        Assertions.assertEquals(0,transfer);
    }

    @Test
    public void shouldReturnSameValueInCreditInTransfer(){
        Conta conta = new ContaCorrente(2000,0.0);
        Conta contaNova = new ContaCorrente(2000,2500);
        double transfer = conta.transferir(contaNova,2000);
        Assertions.assertEquals(0,transfer);
    }

    @Test
    public void shouldReturnSameValueInSaldoInTransfer(){
        Conta conta = new ContaCorrente(2000,2500);
        Conta contaNova = new ContaCorrente(2000,2500);
        double transfer = conta.transferir(contaNova,5000);
        Assertions.assertEquals(2500,transfer);
    }


    @Test
    public void shouldReturnSumValueInSaldoInDeposit(){
        Conta conta = new ContaCorrente(2000,2000);
        double deposit = conta.depositar(2000);
        Assertions.assertEquals(4000,deposit);
    }

    @Test
    public void shouldReturnSumValueInSaldoAndCreditInDeposit(){
        Conta conta = new ContaCorrente(2000,0.0);
        double deposit = conta.depositar(2000);
        Assertions.assertEquals(2000,deposit);
    }

    @Test
    public void shouldReturnSameValueInCreditInDeposit(){
        Conta conta = new ContaCorrente(1000,0.0);
        double transfer = conta.depositar(500);
        Assertions.assertEquals(1500,transfer);
    }


}
