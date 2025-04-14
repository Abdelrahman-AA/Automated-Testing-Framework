package pages;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public abstract class A_2_CleanDB {

    protected int cleanDB() {
        try {
            URI uri = new URI("https://parabank.parasoft.com/parabank/services/bank/cleanDB");
            URL url = uri.toURL();

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setRequestProperty("Authorization", "Bearer your_token_here");

            int responseCode = conn.getResponseCode();

            conn.disconnect();
            return responseCode;

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
