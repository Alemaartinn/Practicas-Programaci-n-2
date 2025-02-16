public class RecursionExercises {

    public static int sumaN(int n) {
        if (n == 0) return 0;
        return n + sumaN(n - 1);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static int potencia(int base, int exp) {
        if (exp == 0) return 1;
        return base * potencia(base, exp - 1);
    }

    public static int sumaLista(int[] lista, int index) {
        if (index == lista.length) return 0;
        return lista[index] + sumaLista(lista, index + 1);
    }

    public static double mediaAritmetica(int[] lista) {
        if (lista.length == 0) return 0;
        return (double) sumaLista(lista, 0) / lista.length;
    }

    public static double desviacionTipica(int[] lista, double media) {
        if (lista.length == 0) return 0;
        double sum = 0;
        for (int num : lista) {
            sum += Math.pow(num - media, 2);
        }
        return Math.sqrt(sum / lista.length);
    }

    public static int sumaPares(int n) {
        if (n < 2) return 0;
        if (n % 2 == 1) return sumaPares(n - 1);
        return n + sumaPares(n - 2);
    }

    public static int sumaParesLista(int[] lista, int index) {
        if (index == lista.length) return 0;
        return (lista[index] % 2 == 0 ? lista[index] : 0) + sumaParesLista(lista, index + 1);
    }

    public static java.util.List<Integer> obtenerListaPar(int[] lista, int index, java.util.List<Integer> result) {
        if (index == lista.length) return result;
        if (lista[index] % 2 == 0) result.add(lista[index]);
        return obtenerListaPar(lista, index + 1, result);
    }

    public static java.util.List<Integer> listaPar(int n, java.util.List<Integer> result) {
        if (n < 2) return result;
        if (n % 2 == 1) return listaPar(n - 1, result);
        result.add(n);
        return listaPar(n - 2, result);
    }

    public static int productoEscalar(int[] lista1, int[] lista2, int index) {
        if (index == lista1.length) return 0;
        return lista1[index] * lista2[index] + productoEscalar(lista1, lista2, index + 1);
    }

    public static void main(String[] args) {
        System.out.println(sumaN(5));  // 15
        System.out.println(factorial(5));  // 120
        System.out.println(potencia(2, 3));  // 8
        System.out.println(sumaLista(new int[]{1, 2, 3, 4}, 0));  // 10
        System.out.println(mediaAritmetica(new int[]{1, 2, 3, 4}));  // 2.5
        System.out.println(desviacionTipica(new int[]{1, 2, 3, 4}, mediaAritmetica(new int[]{1, 2, 3, 4})));  
        System.out.println(sumaPares(9));  // 20
        System.out.println(sumaParesLista(new int[]{1, 2, 3, 4}, 0));  // 6
        System.out.println(obtenerListaPar(new int[]{1, 2, 6, 11}, 0, new java.util.ArrayList<>()));  // [2, 6]
        System.out.println(listaPar(9, new java.util.ArrayList<>()));  // [8, 6, 4, 2]
        System.out.println(productoEscalar(new int[]{1, 2, 3}, new int[]{2, 4, 6}, 0));  // 28
    }
}
