package androidx.media3.datasource;

import com.google.android.gms.internal.play_billing.M0;
import java.io.IOException;
import java.util.Arrays;

public final class DataSourceUtil {
    private DataSourceUtil() {
    }

    public static void closeQuietly(DataSource dataSource) {
        if (dataSource != null) {
            try {
                dataSource.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] readExactly(DataSource dataSource, int i3) {
        byte[] bArr = new byte[i3];
        int i9 = 0;
        while (i9 < i3) {
            int i10 = dataSource.read(bArr, i9, i3 - i9);
            if (i10 == -1) {
                throw new IllegalStateException(M0.k(i9, i3, "Not enough data could be read: ", " < "));
            }
            i9 += i10;
        }
        return bArr;
    }

    public static byte[] readToEnd(DataSource dataSource) {
        byte[] bArrCopyOf = new byte[1024];
        int i3 = 0;
        int i9 = 0;
        while (i3 != -1) {
            if (i9 == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            i3 = dataSource.read(bArrCopyOf, i9, bArrCopyOf.length - i9);
            if (i3 != -1) {
                i9 += i3;
            }
        }
        return Arrays.copyOf(bArrCopyOf, i9);
    }
}
