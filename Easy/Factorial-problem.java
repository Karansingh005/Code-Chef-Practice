mport java.util.Scanner;

class Pro1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            long count = 0;
            long pro = 5;
            while (pro <= n) {
                count = count + (n / pro);
                pro = pro * 5;
            }
            System.out.println(count);
        }
    }
}
