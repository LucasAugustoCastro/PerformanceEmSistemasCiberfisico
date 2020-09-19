public class Exercicio1 {
    public static void main(String[] args) {

        long t0 = System.nanoTime();

        double soma = 0.0;
        double num = 1.0;
        double i2 = 0.0;
        for(long i=0; i<1000000000; ++i){
            i2 = 2*i;
            soma += num/((i2+2)*(i2+3)*(i2+4));
            num= -num;
        }
        soma *= 4.0;
        soma += 3.0;
        long d = System.nanoTime() - t0;

        System.out.println("\nTempo para printar os numeros: " + d/1e9 );
        System.out.println("Valor PI: "+ soma);


        long sec_t0 = System.nanoTime();

        double sec_soma = 3.0;
        double sec_num = 1.0;
        for(long i=0; i<1000000000; ++i){
            sec_soma += 4.0 * sec_num/((2*i+2)*(2*i+3)*(2*i+4));
            sec_num= -sec_num;
        }

        long sec_d = System.nanoTime() - sec_t0;

        System.out.println("\nTempo para printar os numeros: " + sec_d/1e9 );
        System.out.println("Valor PI: "+ sec_soma);



    }

    private static Runnable t1 = new Runnable() {
        public void run() {
            try{
                long t0 = System.nanoTime();

                double soma = 3.0;
                double num = 1.0;
                for(long i=0; i<1000000000; ++i){
                    soma += 4.0 * num/((2*i+2)*(2*i+3)*(2*i+4));
                    num= -num;
                }

                long d = System.nanoTime() - t0;

                System.out.println("\nTempo para printar os numeros: " + d/1e9 );
                System.out.println("Valor PI: "+ soma);
            } catch (Exception e){}

        }
    };

}