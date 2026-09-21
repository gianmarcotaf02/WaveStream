package p196y0;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p136q.w f31760a;

    static {
        p196y0.q qVar = p196y0.d.f31736e;
        int i3 = qVar.f31731c;
        p196y0.e eVar = new p196y0.e(qVar, qVar, 1);
        p196y0.l lVar = p196y0.d.f31753x;
        int i9 = lVar.f31731c << 6;
        int i10 = qVar.f31731c;
        int i11 = i9 | i10;
        p196y0.g gVar = new p196y0.g(qVar, lVar, 0);
        int i12 = (i10 << 6) | lVar.f31731c;
        p196y0.g gVar2 = new p196y0.g(lVar, qVar, 0);
        p136q.w wVar = p136q.AbstractC2669m.f26402a;
        p136q.w wVar2 = new p136q.w();
        wVar2.h(i3 | (i3 << 6), eVar);
        wVar2.h(i11, gVar);
        wVar2.h(i12, gVar2);
        f31760a = wVar2;
    }
}
