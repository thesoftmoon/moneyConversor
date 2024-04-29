import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Selecciona tu opción:");
        System.out.println("""
                *****************************************
                1- Dolar -> Peso Argentino
                2- Peso Argentino -> Dolar
                3- Dolar -> Real Brasileño
                4- Real Brasileño -> Dolar
                5- Dolar -> Peso Colombiano
                6- Peso Colombiano -> Dolar
                7- Dolar -> Peso Chileno
                8- Peso Chileno -> Dolar
                9- Salir
                *****************************************
                """);
        var userSelection = keyboard.nextInt();

        System.out.println("Seleccionaste la opcion: " + userSelection);
    }
}