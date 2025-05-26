package ClinicaSaudeTotal;

import java.util.Scanner;

public class ClienteConvenio extends Cliente{
    private String nomeConvenio;
    private double desconto;

    public ClienteConvenio(String nome, String cpf, String rg, String endereco,
                           String telefone, String dataConsulta, String nomeConvenio, double desconto) {
        super(nome, cpf, rg, endereco, telefone, dataConsulta);
        this.nomeConvenio = nomeConvenio;
        this.desconto = desconto;
    }

    public String getNomeConvenio() {
        return nomeConvenio;
    }

    public void setNomeConvenio(String nomeConvenio) {
        this.nomeConvenio = nomeConvenio;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    Scanner cliente = new Scanner(System.in);
    @Override
    public void cadastrarCliente() {
        super.cadastrarCliente();
        System.out.println("Nome do convênio:");
        nomeConvenio = cliente.nextLine();
        System.out.println("Desconto:");
        desconto = cliente.nextDouble();
        cliente.nextLine();
    }

    @Override
    public void exibirCliente() {
        super.exibirCliente();
        System.out.println("Nome do convênio:"+nomeConvenio);
        System.out.println("Desconto:"+desconto);
    }
}
