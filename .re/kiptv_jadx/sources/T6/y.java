package T6;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends T6.s implements p027c7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p101l7.c f9874a;

    public y(p101l7.c fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        this.f9874a = fqName;
    }

    @Override // p027c7.b
    public final T6.C0927e a(p101l7.c fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof T6.y) {
            return kotlin.jvm.internal.m.a(this.f9874a, ((T6.y) obj).f9874a);
        }
        return false;
    }

    @Override // p027c7.b
    public final /* bridge */ /* synthetic */ java.util.Collection getAnnotations() {
        return p078i6.w.f23205h;
    }

    public final int hashCode() {
        return this.f9874a.hashCode();
    }

    public final java.lang.String toString() {
        return T6.y.class.getName() + ": " + this.f9874a;
    }
}
