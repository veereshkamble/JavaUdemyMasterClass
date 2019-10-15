import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        ArrayList<Integer> intClassArrayLisT = new ArrayList<Integer>();

        //AUtobixing
        for(int i = 0; i<= 10; i++) {
            intClassArrayLisT.add(Integer.valueOf(i));
        }

        //Autounboxing
        for(int i = 0; i <= 10; i++) {
            System.out.println(i + " ---->  " + intClassArrayLisT.get(i).intValue());
        }
    }
}
