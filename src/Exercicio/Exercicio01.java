package Exercicio;

public class Exercicio01 {

    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.name = "Caneta 01";
        pen1.colour = "Azul";
        pen1.tip = 0.5f;
        pen1.model = "Esferográfica";
        pen1.charge = 80;
        pen1.capOff();
        pen1.status();
        pen1.scribble();

        Pen pen2 = new Pen();
        pen2.name = "Caneta 02";
        pen2.model = "Bico de Pena";
        pen2.colour = "Preta";
        pen2.charge = 44;
        pen2.capOn();
        pen2.status();
        pen2.scribble();
    }
}