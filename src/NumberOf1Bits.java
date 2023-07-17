import java.util.Scanner;
public class NumberOf1Bits {
    static int findNumberOfBits(int number){
        int count = 0;
        while (number > 0){
            count += ((number & 1) == 0) ? 0 : 1;
            number = number >> 1 ;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int A=scanner.nextInt();
        int numberOfBits=findNumberOfBits(A);
        System.out.println(numberOfBits);
    }
}
