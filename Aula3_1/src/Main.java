public class Main {
    public static void main(String[] args) {
        int [] v = new int[100];
        for (int i = 0; i< 100; ++i)
            System.out.println(i+"->"+v[i]);

        A a = new A();
        a.imprime();

        f(10, v);
        System.out.println("FIM");

    }

    public static void f(int n, int[] v){
        if(n>0){
            int[] v2 = new int[v.length*2];
            for(int i = 0; i< 2 * n; ++i)
                v2[i] = v[i/2];
            System.out.println(v2.length);
            f(n-1, v2);
        }
    }
}

class A  {
    private int m =123;
    public void imprime(){
        System.out.println(m);
    }
}
