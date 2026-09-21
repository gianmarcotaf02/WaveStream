package N6;

/* JADX INFO: loaded from: classes4.dex */
public final class H implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p101l7.c f7370i;

    public /* synthetic */ H(p101l7.c cVar, int i3) {
        this.f7369h = i3;
        this.f7370i = cVar;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f7369h) {
            case 0:
                p101l7.c it = (p101l7.c) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return java.lang.Boolean.valueOf(!it.f24829a.c() && it.b().equals(this.f7370i));
            default:
                O6.h it2 = (O6.h) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                return it2.k(this.f7370i);
        }
    }
}
