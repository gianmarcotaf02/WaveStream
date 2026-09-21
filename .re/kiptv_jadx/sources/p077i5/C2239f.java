package p077i5;

/* JADX INFO: renamed from: i5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2239f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f23108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f23109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f23110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f23111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Double f23112f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f23113h;

    public C2239f(int i3, java.lang.String language, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Double d4, int i9, boolean z6) {
        kotlin.jvm.internal.m.e(language, "language");
        this.f23107a = i3;
        this.f23108b = language;
        this.f23109c = str;
        this.f23110d = str2;
        this.f23111e = str3;
        this.f23112f = d4;
        this.g = i9;
        this.f23113h = z6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p077i5.C2239f)) {
            return false;
        }
        p077i5.C2239f c2239f = (p077i5.C2239f) obj;
        return this.f23107a == c2239f.f23107a && kotlin.jvm.internal.m.a(this.f23108b, c2239f.f23108b) && kotlin.jvm.internal.m.a(this.f23109c, c2239f.f23109c) && kotlin.jvm.internal.m.a(this.f23110d, c2239f.f23110d) && kotlin.jvm.internal.m.a(this.f23111e, c2239f.f23111e) && kotlin.jvm.internal.m.a(this.f23112f, c2239f.f23112f) && this.g == c2239f.g && this.f23113h == c2239f.f23113h;
    }

    public final int hashCode() {
        int iA = B2.a.a(B2.a.a(java.lang.Integer.hashCode(this.f23107a) * 31, 31, this.f23108b), 31, this.f23109c);
        java.lang.String str = this.f23110d;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f23111e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Double d4 = this.f23112f;
        return java.lang.Boolean.hashCode(this.f23113h) + p121o0.p.d(this.g, (iHashCode2 + (d4 != null ? d4.hashCode() : 0)) * 31, 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExternalSubtitleResult(fileId=");
        sb.append(this.f23107a);
        sb.append(", language=");
        sb.append(this.f23108b);
        sb.append(", languageName=");
        sb.append(this.f23109c);
        sb.append(", release=");
        sb.append(this.f23110d);
        sb.append(", uploader=");
        sb.append(this.f23111e);
        sb.append(", rating=");
        sb.append(this.f23112f);
        sb.append(", downloadCount=");
        sb.append(this.g);
        sb.append(", hearingImpaired=");
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.f23113h, ")");
    }
}
