package F;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.A f3434i;

    public /* synthetic */ e0(kotlin.jvm.internal.A a2, int i3) {
        this.f3433h = i3;
        this.f3434i = a2;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f3433h) {
            case 0:
                Q0.C0 c9 = (Q0.C0) obj;
                kotlin.jvm.internal.m.c(c9, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                F.N n3 = ((F.p0) c9).f3485v;
                kotlin.jvm.internal.A a2 = this.f3434i;
                java.util.List listD0 = (java.util.List) a2.f24539h;
                if (listD0 != null) {
                    listD0.add(n3);
                } else {
                    listD0 = p078i6.p.D0(n3);
                }
                a2.f24539h = listD0;
                return Q0.B0.f8208i;
            case 1:
                java.lang.String key = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(key, "key");
                java.lang.Object obj2 = this.f3434i.f24539h;
                return java.lang.Boolean.valueOf(obj2 == null || !((android.os.Bundle) obj2).containsKey(key));
            default:
                kotlinx.serialization.json.b it = (kotlinx.serialization.json.b) obj;
                kotlin.jvm.internal.m.e(it, "it");
                this.f3434i.f24539h = it;
                return p070h6.A.f22523a;
        }
    }
}
