package C5;

/* JADX INFO: renamed from: C5.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0105e0 extends C5.AbstractC0108f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1309d;

    public C0105e0(boolean z6, int i3, int i9, int i10) {
        this.f1306a = i3;
        this.f1307b = i9;
        this.f1308c = i10;
        this.f1309d = z6;
    }

    @Override // C5.AbstractC0108f0
    public final boolean a() {
        return this.f1309d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5.C0105e0)) {
            return false;
        }
        C5.C0105e0 c0105e0 = (C5.C0105e0) obj;
        return this.f1306a == c0105e0.f1306a && this.f1307b == c0105e0.f1307b && this.f1308c == c0105e0.f1308c && this.f1309d == c0105e0.f1309d;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f1309d) + p121o0.p.d(this.f1308c, p121o0.p.d(this.f1307b, java.lang.Integer.hashCode(this.f1306a) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Series(seriesId=");
        sb.append(this.f1306a);
        sb.append(", season=");
        sb.append(this.f1307b);
        sb.append(", episode=");
        sb.append(this.f1308c);
        sb.append(", forceRestart=");
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.f1309d, ")");
    }
}
