package p196y0;

import p136q.AbstractC2669m;
import p136q.w;

public abstract class h {

    public static final w f31760a;

    static {
        q qVar = d.f31736e;
        int i3 = qVar.f31731c;
        e eVar = new e(qVar, qVar, 1);
        l lVar = d.f31753x;
        int i9 = lVar.f31731c << 6;
        int i10 = qVar.f31731c;
        int i11 = i9 | i10;
        g gVar = new g(qVar, lVar, 0);
        int i12 = (i10 << 6) | lVar.f31731c;
        g gVar2 = new g(lVar, qVar, 0);
        w wVar = AbstractC2669m.f26402a;
        w wVar2 = new w();
        wVar2.h(i3 | (i3 << 6), eVar);
        wVar2.h(i11, gVar);
        wVar2.h(i12, gVar2);
        f31760a = wVar2;
    }
}
