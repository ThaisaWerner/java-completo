package control;

public class ForChallenge {
    // Make a star of #, but cannot use number to control the loop for
    public static void main(String[] args) {

        for(String v = "#"; !v.equals("######"); v += "#") {
            System.out.println(v);
        }
    }
}
