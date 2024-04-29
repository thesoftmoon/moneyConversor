package com.tomaspacheco.moneyConversor.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public record ConvertedCurrency(Double conversion_result, String base_code, String target_code,
                                double conversion_rate) {

    @Override
    public String toString() {

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
        String formattedDate = dateTime.format(formatter);

        return "{" + "Moneda base: " + base_code + ", \n" + "Moneda destino: " + target_code + ", \n" + "Resultado de la conversion: " + target_code + " " + conversion_result + ", \n" + "Total convertido de " + base_code + ": " + conversion_result / conversion_rate + ", \n" + "Hora movimiento: " + formattedDate + "}";
    }
}