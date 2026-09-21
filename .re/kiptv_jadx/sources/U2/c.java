package U2;

/* JADX INFO: loaded from: classes.dex */
public final class c implements H2.j {
    @Override // H2.j
    public final H2.k a(J2.i iVar, S2.o oVar) {
        long jS;
        boolean zA = kotlin.jvm.internal.m.a(iVar.f6010b, "image/svg+xml");
        H2.q qVar = iVar.f6009a;
        if (!zA) {
            M8.InterfaceC0684l interfaceC0684lR = qVar.R();
            if (!interfaceC0684lR.Q(0L, U2.a.f10108b)) {
                return null;
            }
            M8.C0685m c0685m = U2.a.f10107a;
            byte[] bArr = c0685m.f7262h;
            if (bArr.length <= 0) {
                throw new java.lang.IllegalArgumentException("bytes is empty");
            }
            byte b9 = bArr[0];
            long length = androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID - ((long) bArr.length);
            long j = 0;
            while (true) {
                if (j >= length) {
                    jS = -1;
                    break;
                }
                byte b10 = b9;
                long j9 = length;
                jS = interfaceC0684lR.s(b10, j, j9);
                if (jS == -1 || interfaceC0684lR.Q(jS, c0685m)) {
                    break;
                }
                j = jS + 1;
                length = j9;
                b9 = b10;
            }
            if (jS == -1) {
                return null;
            }
        }
        return new U2.d(qVar, oVar);
    }
}
