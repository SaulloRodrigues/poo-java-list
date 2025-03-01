package questao8;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Account inter = new Account();
        Client client = null;
        Transaction transaction = new Transaction();
        int option;

        do {
            System.out.println("Digite uma opção:\n0 - Sair do programa\n1 - Registrar nova conta\n2 - Exibir dados da Conta\n3 - Realizar transação");
            option = scan.nextInt();
            scan.nextLine();
            switch(option) {
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                case 1:
                    String name = "";
                    String address = "";
                    System.out.println("Digite seu nome: ");
                    name = scan.nextLine();
                    System.out.println("Digite seu endereço: ");
                    address = scan.nextLine();
                    client = new Client(name, address);
                    client.setAccount(inter);
                    inter.setClient(client);
                    System.out.println("\nUsuário registrado com sucesso.\n");
                    break;
                case 2:
                    if (client == null) break;
                    System.out.println("Dados dos usuário:");
                    System.out.println("ID: " + client.account.getIdAccount());
                    System.out.println("Nome: " + client.name);
                    System.out.println("Endereço: " + client.address + "\n");
                    break;
                case 3:
                    System.out.println("Tipo da transação:\n-Pix\n-Cartão\n-Criptomoeda");
                    transaction.setType(scan.nextLine());
                    System.out.println("Valor da transação");
                    transaction.setValue(Double.parseDouble(scan.nextLine()));
                    transaction.setData(new Date());
                    inter.addTransaction(transaction);
                    System.out.println("\nTransação realizada com sucesso:");
                    System.out.println("-Tipo: " +inter.transaction.getType());
                    System.out.println("-Valor: " +inter.transaction.getValue() + " R$");
                    System.out.println("-Data: " +inter.transaction.getData() + "\n");
                    break;
                default:
                    break;
            }
        } while (option != 0);
    }
}
