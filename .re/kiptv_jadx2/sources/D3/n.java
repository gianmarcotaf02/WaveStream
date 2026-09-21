package D3;

import H3.F;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public abstract class n extends X3.g implements F {

    public final int f2123d;

    public n(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 2);
        H3.q.b(bArr.length == 25);
        this.f2123d = Arrays.hashCode(bArr);
    }

    public static byte[] e0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e6) {
            throw new AssertionError(e6);
        }
    }

    @Override
    public final boolean c0(int i3, Parcel parcel, Parcel parcel2) {
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

    public final boolean equals(Object obj) {
        if (obj instanceof F) {
            try {
                F f9 = (F) obj;
                if (((n) f9).f2123d == this.f2123d) {
                    return Arrays.equals(d0(), (byte[]) O3.b.e0(new O3.b(((n) f9).d0())));
                }
            } catch (RemoteException e6) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e6);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2123d;
    }
}
