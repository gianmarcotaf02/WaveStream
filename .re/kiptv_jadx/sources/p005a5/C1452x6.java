package p005a5;

/* JADX INFO: renamed from: a5.x6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1452x6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f15303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15304b;

    public C1452x6(java.util.List list, boolean z6) {
        this.f15303a = list;
        this.f15304b = z6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.C1452x6)) {
            return false;
        }
        p005a5.C1452x6 c1452x6 = (p005a5.C1452x6) obj;
        return this.f15303a.equals(c1452x6.f15303a) && this.f15304b == c1452x6.f15304b;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f15304b) + (this.f15303a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Page(items=");
        sb.append(this.f15303a);
        sb.append(", hasMore=");
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.f15304b, ")");
    }
}
