package U2;

import H2.j;
import H2.k;
import H2.q;
import J2.i;
import M8.C0685m;
import M8.InterfaceC0684l;
import S2.o;
import androidx.media3.session.legacy.PlaybackStateCompat;
import kotlin.jvm.internal.m;

public final class c implements j {
    @Override
    public final k a(i iVar, o oVar) {
        long jS;
        boolean zA = m.a(iVar.f6010b, "image/svg+xml");
        q qVar = iVar.f6009a;
        if (!zA) {
            InterfaceC0684l interfaceC0684lR = qVar.R();
            if (!interfaceC0684lR.Q(0L, a.f10108b)) {
                return null;
            }
            C0685m c0685m = a.f10107a;
            byte[] bArr = c0685m.f7262h;
            if (bArr.length <= 0) {
                throw new IllegalArgumentException("bytes is empty");
            }
            byte b9 = bArr[0];
            long length = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID - ((long) bArr.length);
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
        return new d(qVar, oVar);
    }
}
