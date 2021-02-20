package newpackage;

public class cronometro {

    public void tiempoRestante() {
    }

    public static void delaySegundo() {
        try {
            for (int horas = 4; horas > 0; horas--) {
                for (int minutos = 59; minutos >= 0; minutos--) {
                    System.out.println("Tiempo restante:" + horas + ":" + minutos);

                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
        }
    }

    public static void main(String[] args) {
        delaySegundo();
    }
}
