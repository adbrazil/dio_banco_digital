package com.BancoDigital.Domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;

//@Data
//@Builder
//@AllArgsConstructor
public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldo){

        this.saldo=saldo;
        this.contatos= new ArrayList<Conta>();
    }

    @Override
    public double depositar(double valor) {
        this.saldo=saldo+valor;
        System.out.println("O  seu novo saldo é: "+ this.saldo );
        return  this.saldo;
    }

    @Override
    public double sacar(double valor) {
        if(valor>this.saldo)
            System.out.println("O saldo insuficiente para o valor do saque");

        else{
            System.out.println("O Valor: "+ valor+" foi sacado com sucesso" );
            this.saldo= this.saldo - valor;
        }
        return  this.saldo;
    }

    @Override
    public double transferir(Conta destino, double valor) {
        if(this.saldo>=valor){
            destino.depositar(valor);
            this.saldo= saldo - valor;

        }
        //System.out.println("O saldo insuficiente para o valor da transferência");
        return this.saldo;
    }

    @Override
    public void addContatos(Conta conta) {
        this.contatos.add(conta);
    }


}
