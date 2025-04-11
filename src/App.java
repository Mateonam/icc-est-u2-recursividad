public class App {
    public static void main(String[] args) throws Exception {
        //int n = 8;
        //int resultadoFinal = factorial(n);
        //System.out.println("Resultado: " + resultadoFinal);

        EjerciciosRecursivos e = new EjerciciosRecursivos();
        //int fibo = e.fibonacci(n);
        //System.out.println(fibo);

        //int result = e.sumaConsecutivos(3);
        //System.out.println(result);

        int resp = e.getPotencia(2, 3);
        System.out.println("Resultado final: " + resp);

        int result = e.sumaDeDigitos(125);
        System.out.println("Resultado final: " + result);
        
    }

    public static int factorial(int n) {
        if(n == 0) {
            System.out.println("Alcanze el caso base");
            return 1;
        }

        int resultado = n * factorial(n - 1);
        System.out.println("Calculando factorial de " + n + " * facxtorial (" + (n -1) + "- 1)");
        return resultado;
    }
}
