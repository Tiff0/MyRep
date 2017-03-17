package com.company;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args)
    throws java.io.IOException {
        char choice, ignore;

        for (;;){
            do{
                out.println("\t***Справка!***");
                out.println("1. if");
                out.println("2. switch");
                out.println("3. for");
                out.println("4. while");
                out.println("5. do-while");
                out.println("6. break");
                out.println("7. continue \n");
                out.println("Выберите (q to quit): ");

                choice = (char) in.read();

                do {
                    ignore = (char) in.read();
                } while (ignore != '\n');
            } while (choice < '1' | choice > '7' & choice != 'q');

            if (choice == 'q') break;

            out.println("\n");

            switch (choice){
                case '1':
                    out.println("Оператор if: \n");
                    out.println("if (условие) оператор");
                    out.println("else оператор;");
                    break;
                case '2':
                    out.println("Оператор Switch:\n");
                    out.println("switch(выражение) {");
                    out.println(" case константа:");
                    out.println(" последовательность операторов");
                    out.println(" break;");
                    out.println("\\ ...");
                    out.println("}");
                    break;
                case '3':
                    out.println("Опратор for: \n");
                    out.println("for (init; условие; итерация)");
                    out.println(" оператор;");
                    break;
                case '4':
                    out.println("Оператор while:\n");
                    out.println("while (условие) оператор;");
                case '5':
                    out.println("Оператор do-while: \n");
                    out.println("do {");
                    out.println(" оператор;");
                    out.println("} while (условие);");
                    break;
                case '6':
                    out.println("Оператор break:\n");
                    out.println("break; или break метка;");
                    break;
                case '7':
                    out.println("Опертаор continue:\n");
                    out.println("continue; или continue метка;");
                    break;
            }
            out.println();
        }

    }
}
