package L6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p101l7.c f7085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f7086b;

    public k(java.lang.String str, p101l7.c packageFqName) {
        kotlin.jvm.internal.m.e(packageFqName, "packageFqName");
        this.f7085a = packageFqName;
        this.f7086b = str;
    }

    public final p101l7.e a(int i3) {
        return p101l7.e.e(this.f7086b + i3);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f7085a);
        sb.append('.');
        return Y6.f.l(sb, this.f7086b, 'N');
    }
}
