package p025c5;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f18511d;

    public a(java.lang.String text, int i3, long j, long j9) {
        kotlin.jvm.internal.m.e(text, "text");
        this.f18508a = i3;
        this.f18509b = j;
        this.f18510c = j9;
        this.f18511d = text;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p025c5.a)) {
            return false;
        }
        p025c5.a aVar = (p025c5.a) obj;
        return this.f18508a == aVar.f18508a && this.f18509b == aVar.f18509b && this.f18510c == aVar.f18510c && kotlin.jvm.internal.m.a(this.f18511d, aVar.f18511d);
    }

    public final int hashCode() {
        return this.f18511d.hashCode() + p121o0.p.e(p121o0.p.e(java.lang.Integer.hashCode(this.f18508a) * 31, 31, this.f18509b), 31, this.f18510c);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SrtCue(index=");
        sb.append(this.f18508a);
        sb.append(", startMs=");
        sb.append(this.f18509b);
        sb.append(", endMs=");
        sb.append(this.f18510c);
        sb.append(", text=");
        return Y6.f.m(sb, this.f18511d, ")");
    }
}
