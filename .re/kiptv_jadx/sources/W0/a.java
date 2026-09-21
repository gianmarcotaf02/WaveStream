package W0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D0.C0205f f10535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10536b;

    public a(D0.C0205f c0205f, int i3) {
        this.f10535a = c0205f;
        this.f10536b = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W0.a)) {
            return false;
        }
        W0.a aVar = (W0.a) obj;
        return kotlin.jvm.internal.m.a(this.f10535a, aVar.f10535a) && this.f10536b == aVar.f10536b;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f10536b) + (this.f10535a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.f10535a);
        sb.append(", configFlags=");
        return Y6.f.j(sb, this.f10536b, ')');
    }
}
