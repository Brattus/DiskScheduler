import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Run {

    static FCFS fcfs;
    static SSTF sstf;
    static SCAN scan;
    static LOOK look;
    static final int initialCylinder = 0; //starting position(?)
    static int[] ref;


    public static void main(String[] args) throws IOException {
        Scanner userInput = new Scanner(System.in);
        boolean ack = false;
        String x;
        while (!ack) {
            System.out.println("Please follow the instructions in the console. \n" +
                    "Text providing instructions will have a percentage symbol prefix. \n");
            System.out.println("% Enter a reference string containing the pages for the simulation. Values are separated by SPACE \n" +
                    "% Example reference): 50 40 30 20 10. \n" +
                    "% The headspace for FCFS, SSTF, SCAN and LOOK will be returned. \n" +
                    "% Along with the sequence of operations for each scheduling algorithm.");
            x = userInput.nextLine();
            if (x.isEmpty()) {
                System.out.println("% The input string cannot be empty.");
            } else if (!x.isEmpty()) {
                int no = 0;
                String[] split = x.split(" ");
                ref = new int[split.length];
                for (String s : split) {
                    int sint = Integer.parseInt(s);
                    ref[no] = sint;
                    no++;
                }
                ack = true;
            }
        }
        //here we pass the array of integers to the various scheduling algorithms..
        sstf = new SSTF(ref, initialCylinder);
        System.out.println("SSTF headspace: " + sstf.serviceRequests());
        System.out.print("SSTF path: ");
        for(int i : sstf.returnPath()){
            System.out.print(i + " ");
        }
        //change line..
        System.out.println("\n");

        fcfs = new FCFS(ref, initialCylinder);
        System.out.println("FCFS headspace: " + fcfs.serviceRequests());
        System.out.print("FCFS path: ");
        for(int i : fcfs.returnPath()) {
            System.out.print(i + " ");
        }
        //change line..
        System.out.println("\n");

        scan = new SCAN(ref, initialCylinder);
        System.out.println("SCAN headspace: " + scan.serviceRequests());
        System.out.print("SCAN path: ");
        for(int i : scan.returnPath()) {
            System.out.print(i + " ");
        }
    }
}