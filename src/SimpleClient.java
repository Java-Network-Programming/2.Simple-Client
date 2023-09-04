import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class SimpleClient {
    public static void main(String[] args) {
        try {
            Socket socC1ient = new Socket("localhost",50001);
            InputStream is = socC1ient.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String receivedData = br.readLine();
            System.out.println("Received Data " + receivedData);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}