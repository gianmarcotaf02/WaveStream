package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class DataSourceUtil {
    private DataSourceUtil() {
    }

    public static void closeQuietly(androidx.media3.datasource.DataSource dataSource) {
        if (dataSource != null) {
            try {
                dataSource.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static byte[] readExactly(androidx.media3.datasource.DataSource dataSource, int i3) {
        byte[] bArr = new byte[i3];
        int i9 = 0;
        while (i9 < i3) {
            int i10 = dataSource.read(bArr, i9, i3 - i9);
            if (i10 == -1) {
                throw new java.lang.IllegalStateException(com.google.android.gms.internal.play_billing.M0.k(i9, i3, "Not enough data could be read: ", " < "));
            }
            i9 += i10;
        }
        return bArr;
    }

    public static byte[] readToEnd(androidx.media3.datasource.DataSource dataSource) {
        byte[] bArrCopyOf = new byte[1024];
        int i3 = 0;
        int i9 = 0;
        while (i3 != -1) {
            if (i9 == bArrCopyOf.length) {
                bArrCopyOf = java.util.Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            i3 = dataSource.read(bArrCopyOf, i9, bArrCopyOf.length - i9);
            if (i3 != -1) {
                i9 += i3;
            }
        }
        return java.util.Arrays.copyOf(bArrCopyOf, i9);
    }
}
