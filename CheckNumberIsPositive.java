package week1Day2;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
        int version = 10;

        if (version > 0) {
            System.out.println("Number is Positive");
        } else if (version < 0) {
            System.out.println("Number is Negative");
        } else {
            System.out.println("Number is Zero");
        }
    }
}