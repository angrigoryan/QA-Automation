public class forTesting {
    public static void main(String[] args) {
        int[] marks = {80, 20, 10, 5};
        int[] newmarks = new int[4];

        newmarks[0] = marks[0];
        newmarks[1] = marks[1];
        newmarks[2] = marks[2];
        newmarks[3] = marks[3];

        /*for (int i =0; i<4; i++){
            System.out.println(" Initial value" +newmarks[i]);
            new-marks[i] = marks[i];
            System.out.println(" after assignment value" +newmarks[i]);*/

        for (int i = 0; i < marks.length; i++) {
            System.out.println(" Initial value" + newmarks[i]);
            newmarks[i] = marks[i];


            for (i = 0; i < marks.length; i++) {
                System.out.println("Values are " + newmarks[i]);

            }
            int[] lessThenValues = new int[3];
            //for each
            for (int mark : marks) {
                if (mark < 1) {
                    lessThenValues[0] = mark;
                    i++;
                } else {
                    System.out.println("Values " + mark + "is >=10");
                }

            }
        }
    }
}
