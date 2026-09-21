package W0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.res.Resources.Theme f10537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10538b;

    public b(android.content.res.Resources.Theme theme, int i3) {
        this.f10537a = theme;
        this.f10538b = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W0.b)) {
            return false;
        }
        W0.b bVar = (W0.b) obj;
        return kotlin.jvm.internal.m.a(this.f10537a, bVar.f10537a) && this.f10538b == bVar.f10538b;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f10538b) + (this.f10537a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Key(theme=");
        sb.append(this.f10537a);
        sb.append(", id=");
        return Y6.f.j(sb, this.f10538b, ')');
    }
}
