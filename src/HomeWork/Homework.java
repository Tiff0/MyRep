package HomeWork;

import static java.lang.System.in;
import static java.lang.System.out;

public class Homework {
    public static void main(String[]args)
    throws java.io.IOException {
        char ch, ignore;
        int spaces = 0;

        for(;;){
                out.println("Vvedite symbol ");
                ch = (char) in.read();

                do{
                ignore = (char) in.read();
                } while(ignore != '\n');

                if (ch == ' ') spaces++;

                if (ch == '.') break;
                }
        out.println(spaces);

        char sym;

        for (int i = 0; i < 10; i++){
            sym = (char) ('a' + i);
            out.print(sym);

            sym = (char) ((int) sym & 65503);
            out.print(sym + " ");
        }
    }
}