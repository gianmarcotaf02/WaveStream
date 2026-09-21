package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23379h;

    public /* synthetic */ a(int i3) {
        this.f23379h = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        boolean z6 = false;
        switch (this.f23379h) {
            case 0:
                return io.ktor.http.FileContentTypeKt.extensionsByContentType_delegate$lambda$3();
            case 1:
                return io.ktor.http.HttpHeaderValueParserKt.parseHeaderValue$lambda$4();
            case 2:
                return io.ktor.http.HttpHeaderValueParserKt.parseHeaderValueItem$lambda$6();
            case 3:
                return io.ktor.http.MimesKt.loadMimes();
            case 4:
                return java.lang.Long.valueOf(io.ktor.util.date.DateJvmKt.getTimeMillis());
            case 5:
                return io.ktor.util.CryptoKt.generateNonce();
            case 6:
                return io.ktor.util.CryptoKt.generateNonce();
            case 7:
                return java.lang.Boolean.valueOf(io.ktor.util.debug.IntellijIdeaDebugDetector.isDebuggerConnected_delegate$lambda$0());
            case 8:
                dev.jdtech.mpv.MPVLib.setPropertyBoolean("pause", java.lang.Boolean.FALSE);
                return p070h6.A.f22523a;
            case 9:
                dev.jdtech.mpv.MPVLib.command(new java.lang.String[]{"stop"});
                return p070h6.A.f22523a;
            case 10:
                dev.jdtech.mpv.MPVLib.setPropertyString("sid", "no");
                return p070h6.A.f22523a;
            case 11:
                dev.jdtech.mpv.MPVLib.setPropertyBoolean("pause", java.lang.Boolean.TRUE);
                return p070h6.A.f22523a;
            case 12:
                return java.lang.Boolean.FALSE;
            case 13:
                p020c0.f1 f1Var = p096l0.b.f24708a;
                return p096l0.a.f24707h;
            case 14:
                return new p112n0.e(new java.util.LinkedHashMap());
            case 15:
                p020c0.f1 f1Var2 = p112n0.i.f25543a;
                return null;
            case 16:
                int i3 = com.kiptv.tv.KIPTVTvApplication.f20990t;
                w8.r rVar = new w8.r();
                rVar.f30600c.add(new p116n5.j());
                return new w8.s(rVar);
            case 17:
                int i9 = com.kiptv.tv.KIPTVTvApplication.f20990t;
                P4.b bVar = P4.c.f8139b;
                long j = bVar != null ? bVar.f8137e : false ? 12582912L : 50331648L;
                Y2.L l2 = new Y2.L(6, (byte) 0);
                return new N2.c(j > 0 ? new S.p(j, l2) : new A.a(15, l2), l2);
            case 18:
                p020c0.f1 f1Var3 = p129p0.e.f26175a;
                return null;
            case 19:
                p020c0.f1 f1Var4 = p129p0.g.f26177a;
                return null;
            case 20:
                return new androidx.lifecycle.a0();
            case 21:
                p040e2.c cVar = new p040e2.c(0);
                cVar.a(kotlin.jvm.internal.B.f24540a.b(q2.b.class), new p108m5.c(23));
                return cVar.b();
            case 22:
                V7.n0 n0Var = C5.AbstractC0113h.f1338a;
                C5.S s9 = (C5.S) n0Var.getValue();
                if (s9 != null) {
                    int iOrdinal = s9.f1115a.ordinal();
                    java.util.List list = s9.f1116b;
                    if (iOrdinal == 0) {
                        z6 = true;
                        C5.AbstractC0113h.f((C5.T) p078i6.o.j1(list));
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            throw new I3.b();
                        }
                    } else if (list.size() <= 1) {
                        C5.AbstractC0113h.f((C5.T) p078i6.o.j1(list));
                        z6 = true;
                    } else {
                        z6 = true;
                        n0Var.i(null, C5.S.a(s9, C5.EnumC0107f.j, null, null, null, null, false, C5.AbstractC0113h.e(), 0, 0, 414));
                    }
                }
                return java.lang.Boolean.valueOf(z6);
            case 23:
                return p162s8.y.f27433b;
            case 24:
                return p162s8.u.f27425b;
            case 25:
                return p162s8.s.f27423b;
            case 26:
                return p162s8.x.f27431b;
            case 27:
                return p162s8.g.f27396b;
            case 28:
                p121o0.r rVar2 = new p121o0.r(new q5.i(16));
                rVar2.e();
                return rVar2;
            default:
                return p070h6.A.f22523a;
        }
    }
}
