package D3;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends X3.g implements H3.F {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2123d;

    public n(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 2);
        H3.q.b(bArr.length == 25);
        this.f2123d = java.util.Arrays.hashCode(bArr);
    }

    public static byte[] e0(java.lang.String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (java.io.UnsupportedEncodingException e6) {
            throw new java.lang.AssertionError(e6);
        }
    }

    @Override // X3.g
    public final boolean c0(int i3, android.os.Parcel parcel, android.os.Parcel parcel2) {
        if (i3 == 1) {
            O3.b bVar = new O3.b(d0());
            parcel2.writeNoException();
            p004a4.h.b(parcel2, bVar);
            return true;
        }
        if (i3 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f2123d);
        return true;
    }

    public abstract byte[] d0();

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof H3.F) {
            try {
                H3.F f9 = (H3.F) obj;
                if (((D3.n) f9).f2123d == this.f2123d) {
                    return java.util.Arrays.equals(d0(), (byte[]) O3.b.e0(new O3.b(((D3.n) f9).d0())));
                }
            } catch (android.os.RemoteException e6) {
                android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e6);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2123d;
    }
}
