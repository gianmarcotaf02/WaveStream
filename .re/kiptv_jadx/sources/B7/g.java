package B7;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p101l7.c f829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.functions.Function0 f830b;

    public g(p101l7.c cVar, kotlin.jvm.functions.Function0 function0) {
        this.f829a = cVar;
        this.f830b = function0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && B7.g.class == obj.getClass() && this.f829a.equals(((B7.g) obj).f829a);
    }

    public final int hashCode() {
        return this.f829a.hashCode();
    }
}
