public class DiskScheduler {

    // Prints the reference string passed in
    public static void printRefStr(int[] ref) {
        System.out.print("Reference String: ");
        for (int i = 0; i < ref.length; i++) {
            System.out.print(ref[i] + " ");
        }
        System.out.print("\n");
    }

    // MAIN
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java lab8 <number of cylinder requests> <cylinder to start at>");
            return;
        }

        // Generate a random cylinder requests
        Generator ref = new Generator(Integer.parseInt(args[0]));
        int[] referenceString = ref.getCylinders();
        int start = Integer.parseInt(args[1]);
        printRefStr(referenceString);
        System.out.println("Starting head location: " + args[1]);

        // FCFS
        Scheduler fcfs = new FCFS(referenceString, start);
        int numFCFS = fcfs.serviceRequests();
        System.out.println("FCFS = " + numFCFS);

        // SSTF
        Scheduler sstf = new SSTF(referenceString, start);
        int numSSTF = sstf.serviceRequests();
        System.out.println("SSTF = " + numSSTF);

        // SCAN
        Scheduler SCAN = new SCAN(referenceString, start, ref.getLastCylinder());
        int numSCAN = SCAN.serviceRequests();
        System.out.println("SCAN = " + numSCAN);


        // LOOK
        Scheduler LOOK= new LOOK(referenceString, start);
        int numLOOK = LOOK.serviceRequests();
        System.out.println("LOOK = " + numLOOK);


    }

}