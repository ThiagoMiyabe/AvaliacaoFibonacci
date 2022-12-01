public class Fibonacci {
    public static int recursivo(int num) {
        if (num <= 1) {
            return num;
        } else
            return recursivo(num - 1) + recursivo(num - 2);
    }

    public static int iterativo(int num) {
        int secondNum = 1;
        int firstNum = 1;


        if (num <= 1) {
            return num;
        }

        for (int i = 2; i < num; i++) {
            int tempNum = secondNum;
            secondNum += firstNum;
            firstNum = tempNum;
        }
        return secondNum;

    }

    public static void main(String[] args) {

        long TempoInicial = System.nanoTime();
        long TempoFinal = System.nanoTime();
        double total = 0;

        System.out.println("Recursivo: ");

        for(int i = 0; i < 20; i++) {
            TempoInicial = System.nanoTime();
            int result = Fibonacci.recursivo(i);
            TempoFinal = System.nanoTime();
            total = total + (TempoFinal - TempoInicial);
            System.out.println(result + " demorou " + (TempoFinal - TempoInicial ) + " NanoSegundos");


        }
        System.out.println( "Resultado do recursivo: " +  total + " nanosegundos");

        System.out.println();
        System.out.println("Iterativo: ");

        double total1 = 0;

        for(int i = 0; i < 20; i++) {
            TempoInicial = System.nanoTime();
            int result = Fibonacci.iterativo(i);
            TempoFinal = System.nanoTime();
            total1 = total1 + (TempoFinal - TempoInicial);
            System.out.println(result + " demorou " + (TempoFinal - TempoInicial)  + " NanoSegundos");

        }
        System.out.println("Resultado do iterativo: " + total1 + " nanosegundos");
    }
}
