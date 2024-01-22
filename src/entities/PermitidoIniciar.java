package entities;

import application.Controlador;

public class PermitidoIniciar {

    public static void permissao() throws InterruptedException {
        if (EntradaDados.rodarSemaforo("Deseja começar a rodar o semáforo [S/N]: "))
            Controlador.ligar(SemaforoTimer.TIMER, SemaforoCores.CORES);
        else {
            System.out.println("Até logo =D");
        }
    }
}
