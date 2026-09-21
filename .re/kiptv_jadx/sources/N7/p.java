package N7;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements N7.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f7463b;

    public /* synthetic */ p(int i3, java.lang.Object obj) {
        this.f7462a = i3;
        this.f7463b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Iterator] */
    private final java.util.Iterator c() {
        return this.f7463b;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [n6.h, x6.m] */
    @Override // N7.m
    public final java.util.Iterator iterator() {
        switch (this.f7462a) {
            case 0:
                return E8.d.T((p117n6.h) this.f7463b);
            case 1:
                return (java.util.Iterator) this.f7463b;
            case 2:
                return new O7.h((java.lang.String) this.f7463b);
            case 3:
                return kotlin.jvm.internal.m.h((java.lang.Object[]) this.f7463b);
            case 4:
                return ((java.lang.Iterable) this.f7463b).iterator();
            case 5:
                return new p160s6.l(this);
            default:
                return c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(p194x6.m mVar) {
        this.f7462a = 0;
        this.f7463b = (p117n6.h) mVar;
    }
}
