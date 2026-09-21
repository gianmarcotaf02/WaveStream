package R0;

/* JADX INFO: renamed from: R0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0815c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.Object f8882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Object f8883b;

    public AbstractC0815c(android.content.Context context) {
        this.f8882a = context;
    }

    public static byte[] l(java.nio.ByteBuffer byteBuffer, byte[] bArr) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i3 = iRemaining % 16;
        int i9 = (i3 == 0 ? iRemaining : (iRemaining + 16) - i3) + length;
        java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocate(i9 + 16).order(java.nio.ByteOrder.LITTLE_ENDIAN);
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
            } catch (java.lang.IllegalArgumentException unused) {
            }
            this.f8882a = null;
        }
    }

    public abstract android.content.IntentFilter d();

    public byte[] e(java.nio.ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
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
            ((androidx.datastore.preferences.protobuf.AbstractC1503j) this.f8883b).a(bArr, 0).get(bArr4);
            if (!java.security.MessageDigest.isEqual(com.google.android.gms.internal.play_billing.AbstractC1833d1.m(bArr4, l(byteBuffer, bArr2)), bArr3)) {
                throw new java.security.GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f8882a;
            abstractC1503j.getClass();
            java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(byteBuffer.remaining());
            abstractC1503j.k(bArr, byteBufferAllocate, byteBuffer);
            return byteBufferAllocate.array();
        } catch (java.security.GeneralSecurityException e6) {
            throw new javax.crypto.AEADBadTagException(e6.toString());
        }
    }

    public void f(java.nio.ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws java.security.GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new java.lang.IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iPosition = byteBuffer.position();
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) this.f8882a;
        abstractC1503j.getClass();
        if (byteBuffer.remaining() < bArr2.length) {
            throw new java.lang.IllegalArgumentException("Given ByteBuffer output is too small");
        }
        abstractC1503j.k(bArr, byteBuffer, java.nio.ByteBuffer.wrap(bArr2));
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        byte[] bArr4 = new byte[32];
        ((androidx.datastore.preferences.protobuf.AbstractC1503j) this.f8883b).a(bArr, 0).get(bArr4);
        byte[] bArrM = com.google.android.gms.internal.play_billing.AbstractC1833d1.m(bArr4, l(byteBuffer, bArr3));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(bArrM);
    }

    public abstract int[] g(int i3);

    public abstract int h();

    public android.view.MenuItem i(android.view.MenuItem menuItem) {
        if (!(menuItem instanceof p197y1.a)) {
            return menuItem;
        }
        p197y1.a aVar = (p197y1.a) menuItem;
        if (((p136q.S) this.f8883b) == null) {
            this.f8883b = new p136q.S(0);
        }
        android.view.MenuItem menuItem2 = (android.view.MenuItem) ((p136q.S) this.f8883b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        p095l.s sVar = new p095l.s((android.content.Context) this.f8882a, aVar);
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

    public java.lang.String k() {
        java.lang.String str = (java.lang.String) this.f8882a;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.m.k("text");
        throw null;
    }

    public abstract androidx.datastore.preferences.protobuf.AbstractC1503j m(byte[] bArr, int i3);

    public abstract void n();

    public abstract int[] o(int i3);

    public void p() {
        c();
        android.content.IntentFilter intentFilterD = d();
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
