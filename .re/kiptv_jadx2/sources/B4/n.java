package B4;

import androidx.media3.common.util.Log;
import com.google.android.gms.internal.play_billing.M0;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class n implements o4.a {

    public final r f718a;

    public final o4.j f719b;

    public final int f720c;

    public n(r rVar, o4.j jVar, int i3) {
        this.f718a = rVar;
        this.f719b = jVar;
        this.f720c = i3;
    }

    @Override
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        b bVar = (b) this.f718a;
        bVar.getClass();
        int length = bArr.length;
        int i3 = bVar.f681b;
        int i9 = Log.LOG_LEVEL_OFF - i3;
        if (length > i9) {
            throw new GeneralSecurityException(M0.l(i9, "plaintext length can not exceed "));
        }
        byte[] bArr3 = new byte[bArr.length + i3];
        byte[] bArrA = v.a(i3);
        System.arraycopy(bArrA, 0, bArr3, 0, i3);
        bVar.a(bArr, 0, bArr.length, bArr3, bVar.f681b, bArrA, true);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return k.c(bArr3, this.f719b.b(k.c(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    @Override
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i3 = this.f720c;
        if (length < i3) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i3);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i3, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f719b.a(bArrCopyOfRange2, k.c(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        b bVar = (b) this.f718a;
        bVar.getClass();
        int length2 = bArrCopyOfRange.length;
        int i9 = bVar.f681b;
        if (length2 < i9) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr3 = new byte[i9];
        System.arraycopy(bArrCopyOfRange, 0, bArr3, 0, i9);
        int length3 = bArrCopyOfRange.length;
        int i10 = bVar.f681b;
        byte[] bArr4 = new byte[length3 - i10];
        bVar.a(bArrCopyOfRange, i10, bArrCopyOfRange.length - i10, bArr4, 0, bArr3, false);
        return bArr4;
    }
}
