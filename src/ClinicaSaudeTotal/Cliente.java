package ClinicaSaudeTotal;

import java.util.Scanner;

public abstract class Cliente {
    private String nome;
    private String cpf;
    private String rg;
    private String endereco;
    private String telefone;
    private String dataConsulta;

    public Cliente(String nome, String cpf, String rg,
                   String endereco, String telefone, String dataConsulta) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataConsulta = dataConsulta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    Scanner cliente = new Scanner(System.in);
    public void cadastrarCliente(){
        System.out.println("Nome:");
        nome = cliente.nextLine();
        System.out.println("Cpf:");
        cpf = cliente.nextLine();
        System.out.println("Rg:");
        rg = cliente.nextLine();
        System.out.println("Endereço:");
        endereco = cliente.nextLine();
        System.out.println("Telefone:");
        telefone = cliente.nextLine();
        System.out.println("Data da consulta:");
        dataConsulta = cliente.nextLine();
    }
    public void exibirCliente(){
        System.out.println("Nome:"+nome);
        System.out.println("Cpf:"+cpf);
        System.out.println("Rg:"+rg);
        System.out.println("Endereço:"+endereco);
        System.out.println("Telefone:"+telefone);
        System.out.println("Data da consulta:"+dataConsulta);
    }
}
