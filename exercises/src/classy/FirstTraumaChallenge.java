package classy;

public class FirstTraumaChallenge {

    //if a was static, it could be accessed normally because static member can access other static member
    int a = 3; //can't change here
    static int b = 5;

    public static void main(String[] args) {

        FirstTraumaChallenge firstTraumaChallenge = new FirstTraumaChallenge();
        System.out.println(firstTraumaChallenge.a);
        //because a is an attribute of instance, it only can be accessed by an instance of the class

        System.out.println(b);
    }
}
