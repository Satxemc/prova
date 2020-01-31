import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IniciBasicRefact {
    public static void main(String[] args) throws IOException {
    	BufferedReader teclat = new BufferedReader(new InputStreamReader(System.in)).readline();
        int i = 0;
        System.out.println("Comenca el test!!!\n"
        		+ "Per superar els test has de contestar la pregunta correctament.\n"
        		+ "La pregunta és 2 + 6 = ?");
        if (buit.equals("8")) {
            i = 10;
            System.out.println("\nPunts totals: " + i);
            System.out.println("Ho sento no has superat el test!!!");
        } else if (i<10){
            System.out.println("\nPunts totals: " + i);
            System.out.println("Felcitats, resposta correcta!!!");
        }
    }
}
