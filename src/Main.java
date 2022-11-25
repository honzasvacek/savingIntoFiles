import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\2021-e-svacek\\Documents\\text.txt");
        FileReader reader = new FileReader(file);
        Scanner sc = new Scanner(file);

        for (int i = 0; i < 5; i++) {
            System.out.println(sc.next());
        }

        /*
        int r = 0;
        int pocetSlov = 1;
        while(r >= 0 && pocetSlov <= 5){
            r = reader.read();
            char ch = (char)r;

            System.out.print(ch);
            if (r == 32 || r == 13){
                pocetSlov ++;
            }
        }*/

    }
}