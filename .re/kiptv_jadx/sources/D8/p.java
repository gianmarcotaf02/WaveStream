package D8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p {
    public static int a(int i3, int i9, int i10) throws java.io.IOException {
        if ((i9 & 8) != 0) {
            i3--;
        }
        if (i10 <= i3) {
            return i3 - i10;
        }
        throw new java.io.IOException(com.google.android.gms.internal.play_billing.M0.k(i10, i3, "PROTOCOL_ERROR padding ", " > remaining length "));
    }
}
