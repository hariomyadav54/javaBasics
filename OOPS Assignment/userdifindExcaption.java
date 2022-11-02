package p1;
class InvalidException extends Exception{
    InvalidException ( String msg){
        System.out.println(msg);
    }
}

public class userdifindExcaption {
    public static void main(String[] args) {
        try {
        vote(39);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void vote(int age) throws InvalidException {
        if (age < 18) {
            throw new InvalidException("not eligible for vote");
        } else {
            System.out.println("Eligible for vote");
        }
    }
}
