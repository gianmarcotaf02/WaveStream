package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class Z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f14173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f14174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14177e;

    public Z6(java.lang.String str, java.lang.String str2, boolean z6, boolean z9, boolean z10) {
        this.f14173a = str;
        this.f14174b = str2;
        this.f14175c = z6;
        this.f14176d = z9;
        this.f14177e = z10;
    }

    public final boolean a() {
        return this.f14176d;
    }

    public final boolean b() {
        return this.f14177e;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.Z6)) {
            return false;
        }
        p005a5.Z6 z6 = (p005a5.Z6) obj;
        return kotlin.jvm.internal.m.a(this.f14173a, z6.f14173a) && kotlin.jvm.internal.m.a(this.f14174b, z6.f14174b) && this.f14175c == z6.f14175c && this.f14176d == z6.f14176d && this.f14177e == z6.f14177e;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f14177e) + p121o0.p.f(p121o0.p.f(B2.a.a(this.f14173a.hashCode() * 31, 31, this.f14174b), 31, this.f14175c), 31, this.f14176d);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Context(userId=");
        sb.append(this.f14173a);
        sb.append(", playlistId=");
        sb.append(this.f14174b);
        sb.append(", pullWatched=");
        sb.append(this.f14175c);
        sb.append(", pullPlayback=");
        sb.append(this.f14176d);
        sb.append(", syncWatchlist=");
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.f14177e, ")");
    }
}
