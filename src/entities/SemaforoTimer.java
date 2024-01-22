package entities;

public class SemaforoTimer {

    public static final int[] TIMER = new int[3]; // os três timers das cores

    public static int semaforoCiclos, alertaCiclos;

    public static void inserirTresTimers() {
        for (int i = 0; i < SemaforoCores.CORES.length; i++) {
            TIMER[i] = EntradaDados.lerTimer(String.format("Coloque um tempo para a cor \"%s\" em segundos: ", SemaforoCores.CORES[i]));
        }
    }

    public static void lerSemaforoCiclos(String label) {
        semaforoCiclos = EntradaDados.escolhaCiclos(label);
    }

    public static void lerAlertaCiclos(String label) {
        alertaCiclos = EntradaDados.escolhaCiclos(label);
    }
}
