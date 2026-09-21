package T1;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.lang.ThreadLocal f9720d = new java.lang.ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A7.m f9722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f9723c = 0;

    public w(A7.m mVar, int i3) {
        this.f9722b = mVar;
        this.f9721a = i3;
    }

    public final int a(int i3) {
        U1.a aVarB = b();
        int iA = aVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) aVarB.f1972k;
        int i9 = iA + aVarB.f1970h;
        return byteBuffer.getInt((i3 * 4) + byteBuffer.getInt(i9) + i9 + 4);
    }

    public final U1.a b() {
        java.lang.ThreadLocal threadLocal = f9720d;
        U1.a aVar = (U1.a) threadLocal.get();
        if (aVar == null) {
            aVar = new U1.a();
            threadLocal.set(aVar);
        }
        U1.b bVar = (U1.b) this.f9722b.f321i;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i3 = iA + bVar.f1970h;
            int i9 = (this.f9721a * 4) + ((java.nio.ByteBuffer) bVar.f1972k).getInt(i3) + i3 + 4;
            int i10 = ((java.nio.ByteBuffer) bVar.f1972k).getInt(i9) + i9;
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) bVar.f1972k;
            aVar.f1972k = byteBuffer;
            if (byteBuffer != null) {
                aVar.f1970h = i10;
                int i11 = i10 - byteBuffer.getInt(i10);
                aVar.f1971i = i11;
                aVar.j = ((java.nio.ByteBuffer) aVar.f1972k).getShort(i11);
                return aVar;
            }
            aVar.f1970h = 0;
            aVar.f1971i = 0;
            aVar.j = 0;
        }
        return aVar;
    }

    public final java.lang.String toString() {
        int i3;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        U1.a aVarB = b();
        int iA = aVarB.a(4);
        sb.append(java.lang.Integer.toHexString(iA != 0 ? ((java.nio.ByteBuffer) aVarB.f1972k).getInt(iA + aVarB.f1970h) : 0));
        sb.append(", codepoints:");
        U1.a aVarB2 = b();
        int iA2 = aVarB2.a(16);
        if (iA2 != 0) {
            int i9 = iA2 + aVarB2.f1970h;
            i3 = ((java.nio.ByteBuffer) aVarB2.f1972k).getInt(((java.nio.ByteBuffer) aVarB2.f1972k).getInt(i9) + i9);
        } else {
            i3 = 0;
        }
        for (int i10 = 0; i10 < i3; i10++) {
            sb.append(java.lang.Integer.toHexString(a(i10)));
            sb.append(io.ktor.sse.ServerSentEventKt.SPACE);
        }
        return sb.toString();
    }
}
