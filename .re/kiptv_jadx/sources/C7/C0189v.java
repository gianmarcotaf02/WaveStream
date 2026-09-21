package C7;

/* JADX INFO: renamed from: C7.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0189v implements p194x6.j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C7.C0189v f1607i = new C7.C0189v(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1608h;

    public /* synthetic */ C0189v(int i3) {
        this.f1608h = i3;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f1608h) {
            case 0:
                C7.AbstractC0191x it = (C7.AbstractC0191x) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return it.toString();
            default:
                p101l7.c cVar = (p101l7.c) obj;
                if (cVar != null) {
                    return java.lang.Boolean.valueOf(!cVar.equals(K6.o.y));
                }
                throw new java.lang.IllegalArgumentException("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
        }
    }
}
