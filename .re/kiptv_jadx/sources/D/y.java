package D;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1787h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1788i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ y(int i3, java.lang.Object obj, int i9) {
        this.f1787h = i9;
        this.f1788i = i3;
        this.j = obj;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f1787h) {
            case 0:
                F.L l2 = (F.L) obj;
                D.C0194a c0194a = ((D.D) this.j).f1642a;
                p121o0.f fVarE = p121o0.o.e();
                p121o0.o.k(fVarE, p121o0.o.h(fVarE), fVarE != null ? fVarE.e() : null);
                int i3 = l2.f3355a;
                if (i3 == -1) {
                    i3 = 2;
                }
                for (int i9 = 0; i9 < i3; i9++) {
                    l2.a(this.f1788i + i9);
                }
                return p070h6.A.f22523a;
            case 1:
                F.L l9 = (F.L) obj;
                D.C0194a c0194a2 = ((E.w) this.j).f2714a;
                p121o0.f fVarE2 = p121o0.o.e();
                p121o0.o.k(fVarE2, p121o0.o.h(fVarE2), fVarE2 != null ? fVarE2.e() : null);
                c0194a2.getClass();
                int i10 = l9.f3355a;
                if (i10 == -1) {
                    i10 = 2;
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    l9.a(this.f1788i + i11);
                }
                return p070h6.A.f22523a;
            case 2:
                com.kiptv.core.model.ContentTypeSettings settings = (com.kiptv.core.model.ContentTypeSettings) obj;
                kotlin.jvm.internal.m.e(settings, "settings");
                java.util.LinkedHashMap linkedHashMapZ0 = p078i6.C.Z0(settings.f19699m);
                int i12 = this.f1788i;
                java.lang.String str = (java.lang.String) this.j;
                if (i12 == 0) {
                    linkedHashMapZ0.remove(str);
                } else {
                    linkedHashMapZ0.put(str, java.lang.Integer.valueOf(i12));
                }
                return com.kiptv.core.model.ContentTypeSettings.a(settings, null, null, null, null, null, null, null, null, null, null, null, null, linkedHashMapZ0, null, 12287);
            case 3:
                return java.lang.Boolean.valueOf(io.ktor.http.cio.HttpHeadersMap.getAll$lambda$2((io.ktor.http.cio.HttpHeadersMap) this.j, this.f1788i, ((java.lang.Integer) obj).intValue()));
            case 4:
                return io.ktor.websocket.RawWebSocketCommonKt.mask$lambda$2(this.f1788i, (p094k8.n) this.j, (byte[]) obj);
            default:
                return java.lang.Boolean.valueOf(((java.util.List) obj).addAll(this.f1788i, (java.util.Collection) this.j));
        }
    }

    public /* synthetic */ y(java.lang.Object obj, int i3, int i9) {
        this.f1787h = i9;
        this.j = obj;
        this.f1788i = i3;
    }
}
