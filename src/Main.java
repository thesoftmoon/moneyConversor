import com.tomaspacheco.moneyConversor.models.ConvertedCurrency;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        CurrencyQuerie currencyQuerie = new CurrencyQuerie();
        boolean exit = false;
        String options = """
                *****************************************
                1- Dolar -> Peso Argentino
                2- Peso Argentino -> Dolar
                3- Dolar -> Real Brasileño
                4- Real Brasileño -> Dolar
                5- Dolar -> Peso Colombiano
                6- Peso Colombiano -> Dolar
                7- Dolar -> Peso Chileno
                8- Peso Chileno -> Dolar
                9- Lista de conversiones
                10- Salir
                *****************************************
                """;
        ArrayList<ConvertedCurrency> localArray = new ArrayList<>();
        while (!exit) {
            System.out.println("Selecciona tu opción:");
            System.out.println(options);
            var userSelection = keyboard.nextInt();
            String currencyToConvert = "";

            switch (userSelection) {
                case 1:
                    System.out.println("seleccionaste 1");
                    currencyToConvert = "USD/ARS";
                    break;
                case 2:
                    System.out.println("seleccionaste 2");
                    currencyToConvert = "ARS/USD";
                    break;
                case 3:
                    System.out.println("seleccionaste 3");
                    currencyToConvert = "USD/BRL";
                    break;
                case 4:
                    System.out.println("seleccionaste 4");
                    currencyToConvert = "BRL/USD";
                    break;
                case 5:
                    System.out.println("seleccionaste 5");
                    currencyToConvert = "USD/COP";
                    break;
                case 6:
                    System.out.println("seleccionaste 6");
                    currencyToConvert = "COP/USD";
                    break;
                case 7:
                    System.out.println("seleccionaste 7");
                    currencyToConvert = "USD/CLP";
                    break;
                case 8:
                    System.out.println("seleccionaste 8");
                    currencyToConvert = "CLP/USD";
                    break;
                case 9:
                    System.out.println("Lista de conversiones");
                    localArray.forEach(item -> System.out.println("-----------\n" + item));
                    break;
                case 10:
                    System.out.println("seleccionaste salir, terminando el programa...");
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    continue;
            }
            if (!exit && userSelection != 9) {
                System.out.println("Ingresa el Valor a convertir");
                double valueToConvertSelected = keyboard.nextDouble();
                try {
                    ConvertedCurrency actualCurrency = currencyQuerie.currencyValue(currencyToConvert, valueToConvertSelected);
                    localArray.add(actualCurrency);
                    System.out.println(actualCurrency);
                } catch (NumberFormatException error) {
                    System.out.println("Número no encontrado " + error.getMessage());
                } catch (RuntimeException error) {
                    System.out.println("Error: " + error.getMessage());
                }
            }


        }
    }
}