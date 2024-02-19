package md.tekoway.operationsandcyclicfunctions;

public class AssignmentAndLogicOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        a = a + 1;
        System.out.println(a);

        b = b % a;
        System.out.println(b);

        a %= b;
        System.out.println(a);

        a += 4;
        System.out.println(a);

        int x = 150;
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum = sum + i; // sum += i;
        }
        System.out.println(sum);

        int c = 45;
        int d = 5;

        d /= c;
        System.out.println(d);
    }
}

