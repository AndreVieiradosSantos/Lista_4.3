import ClinicaSaudeTotal.ClienteComum;
import ClinicaSaudeTotal.ClienteConvenio;
import ClinicaSaudeTotal.ClienteVip;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int escolha;
        Scanner opcao = new Scanner(System.in);
        do {
            System.out.println("===============Menu===============");
            System.out.println(" 1 - para agendamento comum");
            System.out.println(" 2 - para agendamento convênio");
            System.out.println(" 3 - para agendamento vip");
            System.out.println(" 4 - Sair do programa");

            escolha = opcao.nextInt();

            switch (escolha) {
                case 1:
                  ClienteComum clienteComum = new ClienteComum("","","","",
                          "","",0);
                  clienteComum.cadastrarCliente();
                  clienteComum.exibirCliente();
                    break;
                case 2:
                    ClienteConvenio clienteConvenio = new ClienteConvenio("","","",
                            "","","","",0);
                    clienteConvenio.cadastrarCliente();
                    clienteConvenio.exibirCliente();
                    break;
                case 3:
                    ClienteVip clienteVip = new ClienteVip("","","","",
                            "","",0,0);
                    clienteVip.cadastrarCliente();
                    clienteVip.exibirCliente();

                    break;
                default:
                    System.out.println("Saindo do programa...");
                    opcao.close();
                    break;
            }

        }while (escolha>0 && escolha<4);
    }
}