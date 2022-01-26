package com.BancoDigital.Domain;

import java.time.Clock;
import java.util.ArrayList;

public class ContaCorrente  extends  Conta{

    double credito;
    double totalCredito;

    public ContaCorrente(double credito,double saldo){
        this.credito=credito;
        this.saldo=saldo;
        this.contatos=new ArrayList<Conta>();
        this.totalCredito=credito;
    }

    @Override
    public double sacar(double valor){
        if(this.saldo>= valor){
            System.out.println("O Valor: "+ valor+" foi sacado com sucesso" );
            this.saldo=this.saldo-valor;
            System.out.println("O Seu novo saldo é: "+ this.saldo);

        }
        else{
            if((this.saldo+this.credito)>= valor){

                if(this.saldo>0){
                    this.saldo=0.0;
                    this.credito=credito - (valor-saldo);
                    System.out.println("O Valor: "+ valor+" foi sacado com sucesso" );


                }
                else{
                    if(this.credito>=valor){
                        System.out.println("O Valor: "+ valor+" foi sacado com sucesso" );
                        this.credito= this.credito - valor;
                        return this.credito;
                    }

                }
            }
            else{
                System.out.println("Você não possui o valor desejado para saque");
            }
        }
        return this.saldo;
    }
    @Override
    public double transferir(Conta destino, double valor){
        if(this.saldo>= valor){
            destino.depositar(valor);
            this.saldo=this.saldo-valor;

        }
        else{
            if((this.saldo+this.credito)>= valor){

                if(this.saldo>0){
                    this.saldo=0.0;
                    this.credito=credito - (valor-saldo);
                }
               else{
                    if(this.credito>=valor){
                        this.credito=this.credito-valor;
                        destino.depositar(valor);
                    }
                }
            }
            else{
                    System.out.println("Você não possui o valor desejado para transferencia");
            }
        }

        return this.saldo;

    }

    @Override
    public void addContatos(Conta conta) {
        this.contatos.add(conta);
    }

    public double depositar(double valor){

        if(saldo>0)
            this.saldo=this.saldo+valor;
        else{

            if(valor >= ((credito - totalCredito)*-1)){
                   double sobrou = valor - ((credito - totalCredito)*-1);
                   this.credito= totalCredito;
                   this.saldo=this.saldo+sobrou;

            }
            else{
                this.credito=this.credito + valor;
                return this.credito;
            }

        }
        return this.saldo;


    }

}
