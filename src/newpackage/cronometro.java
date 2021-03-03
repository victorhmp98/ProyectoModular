package newpackage;

import java.time.LocalDateTime;

public class cronometro {

    public boolean delaySegundo() {
        boolean listo = false;

        LocalDateTime tiempo = LocalDateTime.now();
        int hora = tiempo.getHour();
        int minutos = tiempo.getMinute();
        int segundos = tiempo.getSecond();
        
        int minComparar = minutos;
        
        
        System.out.println("la hora es: " + hora + ":" + minutos + ":" + segundos);
        System.out.println(minComparar);
        if (minutos == minComparar + 1) {
            System.out.println("entro");
            return listo = true;
        }
        return listo;
    }

    public static void main(String[] args) {
        cronometro cro = new cronometro();
        cro.delaySegundo();
    }
}
