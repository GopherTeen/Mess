package Algorithm;

public class AlgoMath {
    public static final int MOD = 1_000_000_007;
    public static final int MX = 100_000;
    
    public static final long[] fac = new long[MX]; // fac[i] = i!
    public static final long[] invF = new long[MX]; // invF[i] = i!^-1
    
    static {
        fac[0] = 1;
        for (int i = 1; i < MX; i++) {
            fac[i] = fac[i - 1] * i % MOD;
        }
        invF[MX - 1] = pow(fac[MX - 1], MOD - 2);
        for (int i = MX - 1; i > 0; i--) {
            invF[i - 1] = invF[i] * i % MOD;
        }
    }
    
    public static long pow(long x, int n) {
        long res = 1;
        for (; n > 0; n /= 2) {
            if (n % 2 > 0) {
                res = res * x % MOD;
            }
            x = x * x % MOD;
        }
        return res;
    }
    
    public long comb(int n, int m) {
        return fac[n] * invF[m] % MOD * invF[n - m] % MOD;
    }
}