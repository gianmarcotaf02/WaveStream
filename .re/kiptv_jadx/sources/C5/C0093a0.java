package C5;

/* JADX INFO: renamed from: C5.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0093a0 extends C5.AbstractC0108f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1206c;

    public C0093a0(int i3, long j, long j9) {
        this.f1204a = i3;
        this.f1205b = j;
        this.f1206c = j9;
    }

    @Override // C5.AbstractC0108f0
    public final boolean a() {
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5.C0093a0)) {
            return false;
        }
        C5.C0093a0 c0093a0 = (C5.C0093a0) obj;
        return this.f1204a == c0093a0.f1204a && this.f1205b == c0093a0.f1205b && this.f1206c == c0093a0.f1206c;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f1206c) + p121o0.p.e(java.lang.Integer.hashCode(this.f1204a) * 31, 31, this.f1205b);
    }

    public final java.lang.String toString() {
        return "Catchup(streamId=" + this.f1204a + ", startMillis=" + this.f1205b + ", endMillis=" + this.f1206c + ")";
    }
}
