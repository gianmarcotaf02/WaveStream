package p182w1;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.ThreadLocal f29758a = new java.lang.ThreadLocal();

    public static int a(double d4, double d6, double d9) {
        double d10 = (((-0.4986d) * d9) + (((-1.5372d) * d6) + (3.2406d * d4))) / 100.0d;
        double d11 = ((0.0415d * d9) + ((1.8758d * d6) + ((-0.9689d) * d4))) / 100.0d;
        double d12 = ((1.057d * d9) + (((-0.204d) * d6) + (0.0557d * d4))) / 100.0d;
        double dPow = d10 > 0.0031308d ? (java.lang.Math.pow(d10, 0.4166666666666667d) * 1.055d) - 0.055d : d10 * 12.92d;
        double dPow2 = d11 > 0.0031308d ? (java.lang.Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d : d11 * 12.92d;
        double dPow3 = d12 > 0.0031308d ? (java.lang.Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d : d12 * 12.92d;
        int iRound = (int) java.lang.Math.round(dPow * 255.0d);
        int iMin = iRound < 0 ? 0 : java.lang.Math.min(iRound, 255);
        int iRound2 = (int) java.lang.Math.round(dPow2 * 255.0d);
        int iMin2 = iRound2 < 0 ? 0 : java.lang.Math.min(iRound2, 255);
        int iRound3 = (int) java.lang.Math.round(dPow3 * 255.0d);
        return android.graphics.Color.rgb(iMin, iMin2, iRound3 >= 0 ? java.lang.Math.min(iRound3, 255) : 0);
    }

    public static double b(int i3) {
        java.lang.ThreadLocal threadLocal = f29758a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = android.graphics.Color.red(i3);
        int iGreen = android.graphics.Color.green(i3);
        int iBlue = android.graphics.Color.blue(i3);
        if (dArr.length != 3) {
            throw new java.lang.IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d4 = ((double) iRed) / 255.0d;
        double dPow = d4 < 0.04045d ? d4 / 12.92d : java.lang.Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
        double d6 = ((double) iGreen) / 255.0d;
        double dPow2 = d6 < 0.04045d ? d6 / 12.92d : java.lang.Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
        double d9 = ((double) iBlue) / 255.0d;
        double dPow3 = d9 < 0.04045d ? d9 / 12.92d : java.lang.Math.pow((d9 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d10 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d10;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d10 / 100.0d;
    }

    public static int c(int i3, int i9) {
        int iAlpha = android.graphics.Color.alpha(i9);
        int iAlpha2 = android.graphics.Color.alpha(i3);
        int i10 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return android.graphics.Color.argb(i10, d(android.graphics.Color.red(i3), iAlpha2, android.graphics.Color.red(i9), iAlpha, i10), d(android.graphics.Color.green(i3), iAlpha2, android.graphics.Color.green(i9), iAlpha, i10), d(android.graphics.Color.blue(i3), iAlpha2, android.graphics.Color.blue(i9), iAlpha, i10));
    }

    public static int d(int i3, int i9, int i10, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        return (((255 - i9) * (i10 * i11)) + ((i3 * 255) * i9)) / (i12 * 255);
    }
}
