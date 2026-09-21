package u5;

/* JADX INFO: renamed from: u5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2866b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f28706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f28707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f28708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f28709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f28710e;

    public C2866b(java.lang.String id, java.lang.String providerName, java.lang.String displayName, boolean z6, boolean z9) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(providerName, "providerName");
        kotlin.jvm.internal.m.e(displayName, "displayName");
        this.f28706a = id;
        this.f28707b = providerName;
        this.f28708c = displayName;
        this.f28709d = z6;
        this.f28710e = z9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5.C2866b)) {
            return false;
        }
        u5.C2866b c2866b = (u5.C2866b) obj;
        return kotlin.jvm.internal.m.a(this.f28706a, c2866b.f28706a) && kotlin.jvm.internal.m.a(this.f28707b, c2866b.f28707b) && kotlin.jvm.internal.m.a(this.f28708c, c2866b.f28708c) && this.f28709d == c2866b.f28709d && this.f28710e == c2866b.f28710e;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f28710e) + p121o0.p.f(B2.a.a(B2.a.a(this.f28706a.hashCode() * 31, 31, this.f28707b), 31, this.f28708c), 31, this.f28709d);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TvCmCategoryUi(id=");
        sb.append(this.f28706a);
        sb.append(", providerName=");
        sb.append(this.f28707b);
        sb.append(", displayName=");
        sb.append(this.f28708c);
        sb.append(", isHidden=");
        sb.append(this.f28709d);
        sb.append(", isLocked=");
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.f28710e, ")");
    }
}
