package com.BancoDigital.Domain;


import java.util.List;


public abstract class Conta {

    protected int id;
    protected double saldo;

    List<Conta> contatos;


    public abstract double depositar(double valor);
    public abstract double sacar(double valor);
    public abstract double transferir(Conta destino,double valor);
    public abstract void addContatos(Conta conta);




}
