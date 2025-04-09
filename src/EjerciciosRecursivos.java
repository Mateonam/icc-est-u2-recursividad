public class EjerciciosRecursivos {
    
    public int fibonacci(int n) {
        if(n <= 0) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int sumaConsecutivos(int n) {
        if(n == 1) {
            System.out.println("Alcanze el caso base");
            return 1;
        }
        int resultadoParcial = sumaConsecutivos(n - 1);
        int resultado = n + resultadoParcial;
        return resultado;
    }
}
