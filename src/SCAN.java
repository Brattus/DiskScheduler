public class SCAN implements Scheduler {

        int[] queue;
        int initialCylinder;
        boolean init = false;

        public SCAN(int[] queue, int initialCylinder){
        this.queue = queue;
        this.initialCylinder = initialCylinder;
    }

        public int serviceRequest(){
        int headMovement = 0;
        int prev = initialCylinder;

        for(int i = 1; i<queue.length; i++){
            if(init)
        }

        return headMovement;

    }

       /* int head_movement = 0, flag = 0;

        for (int i = 1; i <= number_of_request; i++)
            if (sorted_request[i] > sorted_request[0] && flag == 0)
                flag = i;

        if (direction == 1) {
            if (flag == 1)
                head_movement += sorted_request[number_of_request] - sorted_request[0];

            else {
                head_movement += max - sorted_request[0];
                head_movement += max - sorted_request[1];
            }
        } else {
            if (flag == 0)
                head_movement += abs(sorted_request[number_of_request] - sorted_request[0]);

            else {
                head_movement += sorted_request[0];
                head_movement += sorted_request[number_of_request];
            }
        }
        return head_movement;
    }*/

    public int[] returnPath() { return queue;}
}