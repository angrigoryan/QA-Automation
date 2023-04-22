public class Test1 {
    private static final int ON = 1;
    private static final int OFF = 2;

    public static void main(String[] args){
        int state =1;
        switch (state){
            case ON:
                System.out.println("On");
                break;
            case OFF:
                System.out.println("Off");
                break;
            default:
                System.out.println("Unknown");


        }
    }
}
