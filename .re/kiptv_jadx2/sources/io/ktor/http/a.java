package io.ktor.http;

import C5.AbstractC0113h;
import C5.EnumC0107f;
import C5.S;
import C5.T;
import S.p;
import V7.n0;
import Y2.L;
import androidx.lifecycle.a0;
import com.kiptv.tv.KIPTVTvApplication;
import dev.jdtech.mpv.MPVLib;
import io.ktor.util.CryptoKt;
import io.ktor.util.date.DateJvmKt;
import io.ktor.util.debug.IntellijIdeaDebugDetector;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.B;
import p020c0.f1;
import p070h6.A;
import p078i6.o;
import p112n0.i;
import p116n5.j;
import p129p0.g;
import p162s8.u;
import p162s8.x;
import p162s8.y;
import w8.r;
import w8.s;

public final class a implements Function0 {

    public final int f23379h;

    public a(int i3) {
        this.f23379h = i3;
    }

    @Override
    public final Object invoke() {
        boolean z6 = false;
        switch (this.f23379h) {
            case 0:
                return FileContentTypeKt.extensionsByContentType_delegate$lambda$3();
            case 1:
                return HttpHeaderValueParserKt.parseHeaderValue$lambda$4();
            case 2:
                return HttpHeaderValueParserKt.parseHeaderValueItem$lambda$6();
            case 3:
                return MimesKt.loadMimes();
            case 4:
                return Long.valueOf(DateJvmKt.getTimeMillis());
            case 5:
                return CryptoKt.generateNonce();
            case 6:
                return CryptoKt.generateNonce();
            case 7:
                return Boolean.valueOf(IntellijIdeaDebugDetector.isDebuggerConnected_delegate$lambda$0());
            case 8:
                MPVLib.setPropertyBoolean("pause", Boolean.FALSE);
                return A.f22523a;
            case 9:
                MPVLib.command(new String[]{"stop"});
                return A.f22523a;
            case 10:
                MPVLib.setPropertyString("sid", "no");
                return A.f22523a;
            case 11:
                MPVLib.setPropertyBoolean("pause", Boolean.TRUE);
                return A.f22523a;
            case 12:
                return Boolean.FALSE;
            case 13:
                f1 f1Var = p096l0.b.f24708a;
                return p096l0.a.f24707h;
            case 14:
                return new p112n0.e(new LinkedHashMap());
            case 15:
                f1 f1Var2 = i.f25543a;
                return null;
            case 16:
                int i3 = KIPTVTvApplication.f20990t;
                r rVar = new r();
                rVar.f30600c.add(new j());
                return new s(rVar);
            case 17:
                int i9 = KIPTVTvApplication.f20990t;
                P4.b bVar = P4.c.f8139b;
                long j = bVar != null ? bVar.f8137e : false ? 12582912L : 50331648L;
                L l2 = new L(6, (byte) 0);
                return new N2.c(j > 0 ? new p(j, l2) : new A.a(15, l2), l2);
            case 18:
                f1 f1Var3 = p129p0.e.f26175a;
                return null;
            case 19:
                f1 f1Var4 = g.f26177a;
                return null;
            case 20:
                return new a0();
            case 21:
                p040e2.c cVar = new p040e2.c(0);
                cVar.a(B.f24540a.b(q2.b.class), new p108m5.c(23));
                return cVar.b();
            case 22:
                n0 n0Var = AbstractC0113h.f1338a;
                S s9 = (S) n0Var.getValue();
                if (s9 != null) {
                    int iOrdinal = s9.f1115a.ordinal();
                    List list = s9.f1116b;
                    if (iOrdinal == 0) {
                        z6 = true;
                        AbstractC0113h.f((T) o.j1(list));
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            throw new I3.b();
                        }
                    } else if (list.size() <= 1) {
                        AbstractC0113h.f((T) o.j1(list));
                        z6 = true;
                    } else {
                        z6 = true;
                        n0Var.i(null, S.a(s9, EnumC0107f.j, null, null, null, null, false, AbstractC0113h.e(), 0, 0, 414));
                    }
                }
                return Boolean.valueOf(z6);
            case 23:
                return y.f27433b;
            case 24:
                return u.f27425b;
            case 25:
                return p162s8.s.f27423b;
            case 26:
                return x.f27431b;
            case 27:
                return p162s8.g.f27396b;
            case 28:
                p121o0.r rVar2 = new p121o0.r(new q5.i(16));
                rVar2.e();
                return rVar2;
            default:
                return A.f22523a;
        }
    }
}
