import java.util.Scanner;

public class SistemaAcesso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nivelAcesso = 0;
        int nivelSigilo = 0;

        // Req01
        System.out.println("\nInforme o seu nome: ");
        String nome = sc.next();

        System.out.println("\nInforme o seu cargo: ");
        String cargo = sc.next();

        // Req02
        while (true) {
            System.out.println("\nInforme o seu nível de acesso [1 a 10]: ");
            if (sc.hasNextInt()) {
                nivelAcesso = sc.nextInt();
                if (nivelAcesso > 0 && nivelAcesso < 11) {
                    break;
                } else {
                    System.out.println("\nPor favor informe um número de 1 a 10.");
                }
            } else {
                System.out.println("\nPor favor digite apenas números.");
                sc.next();
            }
        }

        // Req03
        while (true) {
            System.out.println("Informe o nível de sigilo da área [1 a 10]");
            if (sc.hasNextInt()) {
                nivelSigilo = sc.nextInt();
                if (nivelSigilo > 0 && nivelSigilo < 11) {
                    break;
                    // Req04
                } else {
                    System.out.println("\nPor favor informe um número de 1 a 10.");
                }
            } else {
                System.out.println("\nPor favor digite apenas números.");
                sc.next();
            }
        }

        int saldoAutoridade = nivelAcesso - nivelSigilo;

        System.out.println("\n==== RESUMO DE ACESSO ====");

        // Req05
        if (nivelAcesso < 3 && nivelSigilo > 7) {
            System.out.println(nome + " (" + cargo + ")" + " - ACESSO NEGADO.");
            System.out.println("ALERTA: Tentativa de acesso indevida detectada!");
        } else if (nivelAcesso >= nivelSigilo) {
            System.out.println(
                    nome + " (" + cargo + ")" + " - ACESSO PERMITIDO." + " Saldo de Autoridade: " + saldoAutoridade);
        } else {
            System.out.println(nome + " (" + cargo + ")" + " - ACESSO NEGADO.");
        }

        sc.close();
    }
}