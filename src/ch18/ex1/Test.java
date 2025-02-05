package ch18.ex1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("");

            byte a = 10;
            byte b = 20;
            byte c = 30;

            os.write(a);
            os.write(b);
            os.write(c);

            os.flush();
            os.close();

        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
