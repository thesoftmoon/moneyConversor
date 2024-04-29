import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Selecciona tu opción");
        System.out.println("""
                *****************************************
                1-
                2-
                3-
                4-
                5-
                6-
                *****************************************
                """);
        var userSelection = keyboard.nextInt();

        System.out.println("Seleccionaste la opcion: " + userSelection);
    }
}