package ClinicaSaudeTotal;

import java.util.Scanner;

public class ClienteComum extends Cliente{
    private double valorConsulta;

    public ClienteComum(String nome, String cpf, String rg, String endereco,
                        String telefone, String dataConsulta, double valorConsulta) {
        super(nome, cpf, rg, endereco, telefone, dataConsulta);
        this.valorConsulta = valorConsulta;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    @Override
    public void cadastrarCliente() {
        super.cadastrarCliente();
        System.out.println("Valor da Consulta:");
        valorConsulta = cliente.nextDouble();
        cliente.nextLine();
    }

    @Override
    public void exibirCliente() {
        super.exibirCliente();
        System.out.println("Valor da Consulta:"+valorConsulta);
    }
}
