import java.util.Scanner;

public class conversorDeMoneda {

    public static void convertir(String monedaBase, String monedaDeDestino, ConsultaAPI consulta, Scanner lectura){
        double cantidad;
        double valorConvertido;

        Moneda moneda = consulta.buscaMoneda(monedaBase, monedaDeDestino);
        System.out.println("La tasa de conversion para el día de hoy de: 1 " + monedaBase +" = "+ moneda.conversion_rate() + " "+monedaDeDestino);
        System.out.println("Ingrese la cantidad que desea convertir de " + monedaBase +": ");
        cantidad = Double.parseDouble(lectura.next());
        valorConvertido = cantidad * moneda.conversion_rate();
        System.out.println(cantidad+ " " +monedaBase + " = "+ valorConvertido + " "+ moneda.target_code());
    }

    public static void convertirMonedaRequerida(ConsultaAPI consulta, Scanner lectura){
        System.out.println("Digite la moneda de base: ");
        String monedaBase = lectura.next().toUpperCase();
        System.out.println("Ingrese la moneda a la que se le va a realizar la conversión: ");
        String monedaAConvertir = lectura.next().toUpperCase();
        convertir(monedaBase, monedaAConvertir, consulta, lectura);
    }
}

