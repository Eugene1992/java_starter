package hw5;

/**
 * Created by ppota on 10/18/2015.
 */
public class Task2 {

        public static void main(String[] args)  {
            int mass[] = new int[51];
            for (int i=1; i<11; i++) {
                mass[i] = (i*2)-1;
            }
            System.out.println();
            for (int i=10; i>=1; i--){
                System.out.print(mass[i] + " ");
            }
        }
    }