package dsfr;

import static java.lang.System.out;

public class DraRun {
    public static void main(String args[]){
        Dra2 ds = new Dra2();

        Dra2 y = new Dra2(ds);

       out.println(y.WER);

        Dra w = y;

        w.first();
    }
}