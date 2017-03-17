package ShowBits;
import static java.lang.System.out;

public class LocalClassDemo {
    public static void main(String args[]){

        //Inner Class
        class ShowBits{
            int numbits;

            ShowBits(int n){
                numbits = n;
            }

            void show (long val){
                long mask = 1;

                // Move left for 1
                mask <<= numbits - 1;

                int spacer = 0;
                for(; mask != 0; mask >>>= 1){
                    if ((val & mask) != 0) out.print("1");
                    else out.print("0");
                    spacer++;
                    if ((spacer % 8) == 0){
                        out.print(" ");
                        spacer = 0;
                    }
                }

                out.println();
            }
        }

        for (byte b = 0; b < 10; b++){
            ShowBits byteval = new ShowBits(8);

            out.print(b + " in bits ");
            byteval.show(b);
        }
    }
}
