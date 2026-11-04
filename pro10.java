import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            int total = (p + q) / 2;

            if(total % 2 == 0)
                System.out.println("Alice");
            else
                System.out.println("Bob");
        }
    }
}