package C5;

/* JADX INFO: renamed from: C5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0092a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f1198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f1201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f1202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1203f;

    public C0092a(java.lang.String str, int i3, boolean z6, java.lang.String channelName, java.lang.String str2, boolean z9) {
        kotlin.jvm.internal.m.e(channelName, "channelName");
        this.f1198a = str;
        this.f1199b = i3;
        this.f1200c = z6;
        this.f1201d = channelName;
        this.f1202e = str2;
        this.f1203f = z9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5.C0092a)) {
            return false;
        }
        C5.C0092a c0092a = (C5.C0092a) obj;
        return kotlin.jvm.internal.m.a(this.f1198a, c0092a.f1198a) && this.f1199b == c0092a.f1199b && this.f1200c == c0092a.f1200c && kotlin.jvm.internal.m.a(this.f1201d, c0092a.f1201d) && kotlin.jvm.internal.m.a(this.f1202e, c0092a.f1202e) && this.f1203f == c0092a.f1203f;
    }

    public final int hashCode() {
        int iA = B2.a.a(p121o0.p.f(p121o0.p.d(this.f1199b, this.f1198a.hashCode() * 31, 31), 31, this.f1200c), 31, this.f1201d);
        java.lang.String str = this.f1202e;
        return java.lang.Boolean.hashCode(this.f1203f) + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("QualityVariantUi(label=");
        sb.append(this.f1198a);
        sb.append(", streamId=");
        sb.append(this.f1199b);
        sb.append(", isCurrent=");
        sb.append(this.f1200c);
        sb.append(", channelName=");
        sb.append(this.f1201d);
        sb.append(", categoryName=");
        sb.append(this.f1202e);
        sb.append(", hasCatchup=");
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.f1203f, ")");
    }
}
