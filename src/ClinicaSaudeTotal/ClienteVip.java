package ClinicaSaudeTotal;

import java.util.Scanner;

public class ClienteVip extends Cliente{
    private double cashback;
    private double bonus;

    public ClienteVip(String nome, String cpf, String rg, String endereco, String telefone,
                      String dataConsulta, double cashback, double bonus) {
        super(nome, cpf, rg, endereco, telefone, dataConsulta);
        this.cashback = cashback;
        this.bonus = bonus;
    }

    public double getCashback() {
        return cashback;
    }

    public void setCashback(double cashback) {
        this.cashback = cashback;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    Scanner cliente = new Scanner(System.in);

    @Override
    public void cadastrarCliente() {
        super.cadastrarCliente();
        System.out.println("Cashback:");
        cashback = cliente.nextDouble();
        cliente.nextLine();
        System.out.println("Bônus:");
        bonus = cliente.nextDouble();
        cliente.nextLine();
    }

    @Override
    public void exibirCliente() {
        super.exibirCliente();
        System.out.println("Cashback:"+cashback);
        System.out.println("Bônus:"+bonus);
    }
}
