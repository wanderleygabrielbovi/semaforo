package entities;

public class SemaforoCores {

    public static final String[] CORES = new String[3]; // todas as 3 cores do semaforo
    public static int corAlerta;

    public static void inserirTresCores() {

        CORES[0] = EntradaDados.lerCor("Digite a primeira cor: ");
        CORES[1] = EntradaDados.lerCor("Digite a segunda cor: ");
        CORES[2] = EntradaDados.lerCor("Digite a terceira cor: ");

    }

    public static void imprimirCores() {
        for (int i = 0; i < CORES.length-1; i++) {
            System.out.printf("[%d] %s\n", i + 1, CORES[i]);
        }
        System.out.printf("[%d] %s: ",CORES.length, CORES[CORES.length-1]);
    }

    public static boolean corExiste(String cor) { // compara o valor digitado com todos os valroes armazenados no vetor CORES
        boolean existe = false;
        for (int n = 1; n < 3; n++) {
            if (CORES[n - 1] != null && CORES[n - 1].equalsIgnoreCase(cor)) {
                System.out.println("Cor já inserida!\n");
                existe = true;
                break;
            }
        }
        return existe;
    }

    public static void lerCorAlerta(String label) {
        corAlerta = EntradaDados.escolhaAlerta(label);
    }

}
