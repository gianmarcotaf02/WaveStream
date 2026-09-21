package P4;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8132c;

    public a(int i3, int i9, int i10) {
        this.f8130a = i3;
        this.f8131b = i9;
        this.f8132c = i10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P4.a)) {
            return false;
        }
        P4.a aVar = (P4.a) obj;
        return this.f8130a == aVar.f8130a && this.f8131b == aVar.f8131b && this.f8132c == aVar.f8132c;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f8132c) + p121o0.p.d(this.f8131b, java.lang.Integer.hashCode(this.f8130a) * 31, 31);
    }

    public final java.lang.String toString() {
        return this.f8130a + "/" + this.f8132c + "MB free=" + this.f8131b + "MB";
    }
}
