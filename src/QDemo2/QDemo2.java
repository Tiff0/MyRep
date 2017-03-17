package QDemo2;

import static java.lang.System.out;

public class QDemo2 {
    public static void main(String args[]){
        // Create empty queue
        Queue q1 = new Queue(10);

        char name[] = {'T', 'o', 'm'};

        // Create queue of massive
        Queue q2 = new Queue(name);

        char ch;
        int i;


        // Place symbols in queue q1
        for(i = 0; i < 10; i++)
            q1.put((char) ('A' + i));

        // Create q3 based on q2
        Queue q3 = new Queue(q1);

        // Show queue
        out.print("Queue q1: ");
        for (i = 0; i < 10; i++){
            ch = q1.get();
            out.print(ch);
        }

        out.print("\n");

        out.print("Queue q2: ");
        for (i = 0; i < 3; i++){
            ch = q2.get();
            out.print(ch);
        }

        out.print("\n");

        out.print("Queue q3: ");
        for (i = 0; i < 10; i++){
            ch = q3.get();
            out.print(ch);
        }


    }
}
