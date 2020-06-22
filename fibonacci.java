
// Matías Gastellú Marquez
// fibonacci (O(N))
import java.util.HashMap;

class fibonacci {

    public static int fib(int n, HashMap<Integer, Integer> list) {

        if (n <= 1) {
            return n;
        } else {

            if ((Integer) list.get(n - 1) != -1 && (Integer) list.get(n - 2) != -1) {
                int a = (Integer) list.get(n - 1);
                int b = (Integer) list.get(n - 2);
                return a + b;
            }

            list.put(n - 1, fib(n - 1, list));
            list.put(n - 2, fib(n - 2, list));
            return fib(n, list);

        }
    }

    public static void main(String[] args) {

        int n = 45; // Solution works with 0 <= n <= 45 accurately, after that Java cant handle
                      // accurately "int type" results higher than Integer.MAX_VALUE
        HashMap<Integer, Integer> results = new HashMap<>();
        for (int i = 0; i < n; i++) {
            results.put(i, -1);
        }

        System.out.println(fib(n, results));

    }
}
