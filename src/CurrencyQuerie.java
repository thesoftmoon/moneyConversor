import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyQuerie {
    Currency currencyValue(String currencyToConvert, double valueToConvert) {

        HttpClient client = HttpClient.newHttpClient();

        URI apiUrl = URI.create("https://v6.exchangerate-api.com/v6/418b8ac2b248fb3041877b9c/pair/" + currencyToConvert + "/" + valueToConvert);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(apiUrl)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Currency.class);
        } catch (InterruptedException | IOException error) {
            throw new RuntimeException(error);
        }
    }
}
