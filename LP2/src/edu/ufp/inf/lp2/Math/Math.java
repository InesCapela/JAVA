package edu.ufp.inf.lp2.Math;

public class Math {


    public static double fact_i(long n) {
        double p=1.0;
        for (;n>1;n--) {
            p*=n;
        }
        return n;
    }

    public static double fact_r(long n) {
        if (n == 1 || n==0) return 1;
        return n*fact_r(n-1);
    }
}
//potencia base levantado a uma potencia funcoes estaticas