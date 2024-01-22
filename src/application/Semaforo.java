package application;

import entities.PermitidoIniciar;
import entities.SemaforoCores;
import entities.SemaforoTimer;

public class Semaforo {

    public static void iniciar() throws InterruptedException {
        System.out.println("Olá, bem-vind@ ao Semaforo!\n");

        System.out.println("--Inserção das 3 cores do Semaforo--");
        SemaforoCores.inserirTresCores();

        System.out.println("\n--Inserção dos Timers de cada cor--");
        SemaforoTimer.inserirTresTimers();

        System.out.println("\n--Seleção da quantidade de ciclos do Semaforo--");
        SemaforoTimer.lerSemaforoCiclos("Selecione quantos ciclos o SEMAFORO executará: ");

        System.out.println("\n--Seleção do Alerta--");
        SemaforoCores.lerCorAlerta("Qual cor do SEMAFORO deseja ser seu ALERTA?");

        System.out.println("\n--Seleção da quantidade de ciclos do Semaforo--");
        SemaforoTimer.lerAlertaCiclos("Selecione quantos ciclos o ALERTA executará: ");

        System.out.println("\n--Iniciar Semaforo--");
        PermitidoIniciar.permissao();
    }
}
