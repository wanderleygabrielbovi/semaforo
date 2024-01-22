package application;

import entities.SemaforoCores;
import entities.SemaforoTimer;

public class Controlador {

    public static void ligar(int[] timer, String[] cores) throws InterruptedException {
        do {
            int times = SemaforoTimer.semaforoCiclos;
            do {
                System.out.println("\n--SEMAFORO--");
                for (int i = 0; i < cores.length; i++) {
                    int time = timer[i] / 1000;
                    System.out.printf("\n%s: %d seg [", cores[i], time);
                    passaSegundos(time);
                }
                times--;
            } while (times > 0);

            times = SemaforoTimer.alertaCiclos;
            System.out.println("\n--ALERTA--");
            do {
                int seg = SemaforoTimer.TIMER[SemaforoCores.corAlerta] / 1000;
                System.out.printf("\n%s: %d seg [", SemaforoCores.CORES[SemaforoCores.corAlerta], seg);
                passaSegundos(seg);
                times--;
            } while (times > 0);

        } while (true);
    }

    public static void passaSegundos(int timer) throws InterruptedException {
        for (int i = timer; i > 0; i--) {
            System.out.printf(" %d ", i);
            Thread.sleep(1000);
        }
        System.out.println(" 0 ]");
    }
}
