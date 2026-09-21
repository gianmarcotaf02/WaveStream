package p007a7;

/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p101l7.e f15502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T6.o f15503b;

    public r(p101l7.e name, T6.o oVar) {
        kotlin.jvm.internal.m.e(name, "name");
        this.f15502a = name;
        this.f15503b = oVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p007a7.r) {
            return kotlin.jvm.internal.m.a(this.f15502a, ((p007a7.r) obj).f15502a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15502a.hashCode();
    }
}
