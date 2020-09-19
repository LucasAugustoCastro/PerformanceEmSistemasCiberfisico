public class Main {
    public static void main(String[] args) {
        int k = 64;
        int TCACHE = 8*1024;
        int TRAM = 16*1024*1024; //2^24

//        double nbits_x = Math.log(TRAM)/Math.log(2.0);
        int nbits_x = nbits(TRAM);
        int nbits_w = nbits(k); // = 6



    }
    public static int nbits (int v ) {

        int cont = 0;
        while(v > 0) {
            v = v >> 1;
            ++cont;
        }
//            int y = 1; //001
//            int z = y << 2;//100
        return cont-1;

        //(int) Math.log(TRAM)/Math.log(2.0);
    }

    public static int w (int x, int nbits_w) {
         // x = ...101010001 0101110
        //      ...000000000 1111111 (& lógico)
        //      --------------------------------
        //         000000000 0101110
        return x & (/*(Math.pow(2, nbits_w)-1)*/ (1<<nbits_w)-1);
    }

    //0110 = 6
    //1100 = 12

}
