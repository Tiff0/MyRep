package dsfr;

import static java.lang.System.out;

abstract class Dra {

    static {
        out.println("12312412312312");
}

    Dra(){
        out.println("1");
    }
    final int WER = 1;

    private int weight = 1;

    Dra (Dra q){
          weight = q.weight + 3;
    }

    abstract void first();
   // int x(){
     //   return weight;
   // }
}

