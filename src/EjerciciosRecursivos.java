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

    public int getPotencia (int num, int exp) {
        if (exp == 0) {
            return 1;
        } else if (exp == 1) {
            return num;
        }

        int resultadoMomentaneo = getPotencia(num, exp - 1);
        int resultadofinal = num * resultadoMomentaneo;
        System.out.println(num + " * " + resultadoMomentaneo + " = " + resultadofinal );
        return resultadofinal;        
    }

    public int sumaDeDigitos (int numero) {
        if (numero < 10) {
            return numero;
        }
        int ultDigito = numero %10;
        int resupuesta = sumaDeDigitos(numero/10);
        System.out.println(ultDigito + " + " + resupuesta);
        return ultDigito + resupuesta;

    }

    public int cuentaRegresiva(int n) {
        if (n == 1) {
           return n;
        }
        System.out.print(n-- + " ");
        int result = cuentaRegresiva(n);
        return result ;
    }

    public int reverso(int n) {
        if (n < 10) {
            return n;
        }
        int ult = n%10;
        System.out.print(ult);
        int resultado = reverso(n/10);
        return resultado;
    }
}
