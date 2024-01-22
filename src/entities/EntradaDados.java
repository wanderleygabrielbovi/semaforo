package entities;

import java.util.Scanner;

public class EntradaDados {

    private static final Scanner SC = new Scanner(System.in);

    static String lerCor(String label) { // metodo responsável por ler a cor e determina se o que foi digitado é, ou não, válido
        String cor;
        boolean valorErrado;
        do {
            System.out.print(label);
            cor = SC.nextLine().trim();
            valorErrado = cor.isBlank() || cor.length() < 3;
            if (valorErrado) System.out.println("Digite um valor válido!\n");
        } while (valorErrado || SemaforoCores.corExiste(cor));
        return cor;
    }

    static int lerTimer(String label) {
        int timer = 0;
        boolean invalido;
        do {
            System.out.print(label);
            try {
                timer = Integer.parseInt(SC.nextLine());
                timer *= 1000;
                invalido = !(timer > 0);
                if (invalido) System.out.println("Digite um valor válido!\n");
            } catch (NumberFormatException ex) {
                invalido = true;
                System.out.println("Digite um valor válido!\n");
            }
        } while (invalido);
        return timer;
    }

    static boolean rodarSemaforo(String label) {
        char pergunta;
        boolean rodar;
        do {
            System.out.print(label);
            pergunta = EntradaDados.SC.nextLine().toLowerCase().charAt(0);
            rodar = pergunta == 's';
        } while (pergunta != 's' && pergunta != 'n');

        return rodar;
    }

    static int escolhaAlerta(String label) {
        int escolha = 0;
        boolean invalido;
        do {
            System.out.println(label);
            SemaforoCores.imprimirCores();
            try {
                escolha = Integer.parseInt(SC.nextLine());
                invalido = !(escolha > 0 && escolha <= SemaforoCores.CORES.length);
                if (invalido) System.out.println("Digite um valor válido!\n");
            } catch (NumberFormatException ex) {
                System.out.println("Digite um valor válido!\n");
                invalido = true;
            }
        } while (invalido);
        return escolha - 1;
    }

    static int escolhaCiclos(String label) {
        int escolha = 0;
        boolean invalido;
        do {
            System.out.print(label);
            try {
                escolha = Integer.parseInt(SC.nextLine());
                invalido = !(escolha > 0);
                if (invalido) System.out.println("Digite um valor válido!\n");
            } catch (NumberFormatException ex) {
                System.out.println("Digite um valor válido!\n");
                invalido = true;
            }
        } while (invalido);
        return escolha;
    }
}
