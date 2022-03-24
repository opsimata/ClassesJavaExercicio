package Exercicio;

public class Pen {
    String name;
    String model;
    String colour;
    String answer;
    float tip;
    int charge;
    boolean closed;

    void status () {
        if (this.closed == false) {
            answer = "Não";
        } else {
            answer = "Sim";
        }
        System.out.println("Nome: " + name + ".");
        System.out.println("Cor: " + this.colour + ".");
        System.out.println("Modelo: " + this.model + ".");
        if (this.tip <= 0) {
            System.out.println("Ponta: Não se aplica.");
        } else{
            System.out.println("Ponta: " + this.tip + ".");
        }
        System.out.println("Carga: " + this.charge + "%.");
        System.out.println("Está fechada?: " + this.answer + ".");
    }

    void scribble () {
        if (this.closed == true) {
            System.out.println("\nTampa da caneta fechada, impossível usá-la.\n");
            System.out.println("-----------------------------------------------------\n");
        } else {
            System.out.println("\nTampa da caneta aberta, rabiscando.\n");
            System.out.println("-----------------------------------------------------\n");
        }
    }

    void capOff () {
        this.closed = false;
    }

    void capOn () {
        this.closed = true;
    }

}
