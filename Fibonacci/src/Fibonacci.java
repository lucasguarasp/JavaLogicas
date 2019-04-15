



// FIBO > 0 1 1 2 3 5 8 13
// POSI > 0 1 2 3 4 5 6 7
//entrada : 6
//saida: 8
public class Fibonacci {

    public static int fibo(int n) {

        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;

        //System.out.println("Posição: " + n + " = " + fibo(n) );
        
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            b = b + a;
            a = b - a;
        }
        
        System.out.println(a + " ");
        
    }

}
