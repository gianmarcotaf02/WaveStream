package D8;

import com.google.android.gms.internal.play_billing.M0;
import java.io.IOException;

public abstract class p {
    public static int a(int i3, int i9, int i10) throws IOException {
        if ((i9 & 8) != 0) {
            i3--;
        }
        if (i10 <= i3) {
            return i3 - i10;
        }
        throw new IOException(M0.k(i10, i3, "PROTOCOL_ERROR padding ", " > remaining length "));
    }
}
