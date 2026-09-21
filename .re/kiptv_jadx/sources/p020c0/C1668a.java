package p020c0;

/* JADX INFO: renamed from: c0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1668a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18215a;

    public C1668a(int i3) {
        this.f18215a = i3;
    }

    public final boolean a() {
        return this.f18215a != Integer.MIN_VALUE;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append("{ location = ");
        return Y6.f.k(sb, this.f18215a, " }");
    }
}
