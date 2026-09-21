package K8;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends z8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6983e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ K8.g f6984f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String str, K8.g gVar) {
        super(str, true);
        this.f6984f = gVar;
    }

    @Override // z8.a
    public final long a() {
        switch (this.f6983e) {
            case 0:
                K8.g gVar = this.f6984f;
                try {
                    return gVar.h() ? 0L : -1L;
                } catch (java.io.IOException e6) {
                    gVar.c(e6, null);
                }
                break;
            default:
                A8.j jVar = this.f6984f.g;
                kotlin.jvm.internal.m.b(jVar);
                jVar.d();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(K8.g gVar) {
        super(Y6.f.m(new java.lang.StringBuilder(), gVar.f6997l, " writer"), true);
        this.f6984f = gVar;
    }
}
