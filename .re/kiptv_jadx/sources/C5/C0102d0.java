package C5;

/* JADX INFO: renamed from: C5.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0102d0 extends C5.AbstractC0108f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1300b;

    public C0102d0(int i3, boolean z6) {
        this.f1299a = i3;
        this.f1300b = z6;
    }

    @Override // C5.AbstractC0108f0
    public final boolean a() {
        return this.f1300b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5.C0102d0)) {
            return false;
        }
        C5.C0102d0 c0102d0 = (C5.C0102d0) obj;
        return this.f1299a == c0102d0.f1299a && this.f1300b == c0102d0.f1300b;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f1300b) + (java.lang.Integer.hashCode(this.f1299a) * 31);
    }

    public final java.lang.String toString() {
        return "Movie(streamId=" + this.f1299a + ", forceRestart=" + this.f1300b + ")";
    }
}
