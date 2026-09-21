package p015b5;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18009d;

    public z(int i3, int i9, boolean z6, boolean z9) {
        this.f18006a = i3;
        this.f18007b = i9;
        this.f18008c = z6;
        this.f18009d = z9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p015b5.z)) {
            return false;
        }
        p015b5.z zVar = (p015b5.z) obj;
        return this.f18006a == zVar.f18006a && this.f18007b == zVar.f18007b && this.f18008c == zVar.f18008c && this.f18009d == zVar.f18009d;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f18009d) + p121o0.p.f(p121o0.p.d(this.f18007b, java.lang.Integer.hashCode(this.f18006a) * 31, 31), 31, this.f18008c);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Merged(progressSeconds=");
        sb.append(this.f18006a);
        sb.append(", totalDuration=");
        sb.append(this.f18007b);
        sb.append(", completed=");
        sb.append(this.f18008c);
        sb.append(", conflicted=");
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.f18009d, ")");
    }
}
