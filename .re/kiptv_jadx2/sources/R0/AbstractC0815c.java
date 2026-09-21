package R0;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import androidx.datastore.preferences.protobuf.AbstractC1503j;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

public abstract class AbstractC0815c {

    public Object f8882a;

    public Object f8883b;

    public AbstractC0815c(Context context) {
        this.f8882a = context;
    }

    public static byte[] l(ByteBuffer byteBuffer, byte[] bArr) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i3 = iRemaining % 16;
        int i9 = (i3 == 0 ? iRemaining : (iRemaining + 16) - i3) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i9 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i9);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    public void c() {
        p072i.s sVar = (p072i.s) this.f8882a;
        if (sVar != null) {
            try {
                ((p072i.v) this.f8883b).f22714l.unregisterReceiver(sVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f8882a = null;
        }
    }

    public abstract IntentFilter d();

    public byte[] e(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            ((AbstractC1503j) this.f8883b).a(bArr, 0).get(bArr4);
            if (!MessageDigest.isEqual(AbstractC1833d1.m(bArr4, l(byteBuffer, bArr2)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            AbstractC1503j abstractC1503j = (AbstractC1503j) this.f8882a;
            abstractC1503j.getClass();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            abstractC1503j.k(bArr, byteBufferAllocate, byteBuffer);
            return byteBufferAllocate.array();
        } catch (GeneralSecurityException e6) {
            throw new AEADBadTagException(e6.toString());
        }
    }

    public void f(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iPosition = byteBuffer.position();
        AbstractC1503j abstractC1503j = (AbstractC1503j) this.f8882a;
        abstractC1503j.getClass();
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        abstractC1503j.k(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        byte[] bArr4 = new byte[32];
        ((AbstractC1503j) this.f8883b).a(bArr, 0).get(bArr4);
        byte[] bArrM = AbstractC1833d1.m(bArr4, l(byteBuffer, bArr3));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(bArrM);
    }

    public abstract int[] g(int i3);

    public abstract int h();

    public MenuItem i(MenuItem menuItem) {
        if (!(menuItem instanceof p197y1.a)) {
            return menuItem;
        }
        p197y1.a aVar = (p197y1.a) menuItem;
        if (((p136q.S) this.f8883b) == null) {
            this.f8883b = new p136q.S(0);
        }
        MenuItem menuItem2 = (MenuItem) ((p136q.S) this.f8883b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        p095l.s sVar = new p095l.s((Context) this.f8882a, aVar);
        ((p136q.S) this.f8883b).put(aVar, sVar);
        return sVar;
    }

    public int[] j(int i3, int i9) {
        if (i3 < 0 || i9 < 0 || i3 == i9) {
            return null;
        }
        int[] iArr = (int[]) this.f8883b;
        iArr[0] = i3;
        iArr[1] = i9;
        return iArr;
    }

    public String k() {
        String str = (String) this.f8882a;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.m.k("text");
        throw null;
    }

    public abstract AbstractC1503j m(byte[] bArr, int i3);

    public abstract void n();

    public abstract int[] o(int i3);

    public void p() {
        c();
        IntentFilter intentFilterD = d();
        if (intentFilterD.countActions() == 0) {
            return;
        }
        if (((p072i.s) this.f8882a) == null) {
            this.f8882a = new p072i.s(0, this);
        }
        ((p072i.v) this.f8883b).f22714l.registerReceiver((p072i.s) this.f8882a, intentFilterD);
    }

    public AbstractC0815c() {
        this.f8883b = new int[2];
    }

    public AbstractC0815c(p072i.v vVar) {
        this.f8883b = vVar;
    }
}
