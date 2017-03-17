package QDemo2;

import static java.lang.System.out;

public class Queue {
    private char q[];
    private int putloc, getloc;

    Queue (int size) {
        q = new char [size + 1];
        putloc = getloc = 0;
    }

    Queue (Queue ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        //Copy elements into queue
        for (int i = getloc + 1; i <= putloc; i++) {
            q[i] = ob.q[i];
        }
    }

    Queue (char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char [a.length + 1];

        for (int i = 0; i < a.length; i++) put(a[i]);
    }

    // Place symbol into the queue
    void put(char ch){
        if (putloc == q.length - 1){
            out.println("Queue is full");
            return;
        }
        putloc ++;
        q[putloc] = ch;
    }

    char get () {
        if (getloc == putloc){
            out.println(" - Queue is empty");
            return (char) 0;
        }
        getloc ++;
        return q[getloc];
    }
}