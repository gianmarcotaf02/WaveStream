package p080i8;

/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f23275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f23276b;

    public p(java.util.List operations, java.util.List followedBy) {
        kotlin.jvm.internal.m.e(operations, "operations");
        kotlin.jvm.internal.m.e(followedBy, "followedBy");
        this.f23275a = operations;
        this.f23276b = followedBy;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(p078i6.o.o1(this.f23275a, ", ", null, null, null, 62));
        sb.append('(');
        return Y6.f.l(sb, p078i6.o.o1(this.f23276b, ";", null, null, null, 62), ')');
    }
}
