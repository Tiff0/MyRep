package dsfr;

import static java.lang.System.out;
class Dra2 extends Dra {
    Dra2() {
        out.println("1234");
    }

    Dra2(Dra2 q) {
        super(q);
        int style = 2;
    }

    @Override
    void first() {

    }
}