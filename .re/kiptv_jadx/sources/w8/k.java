package w8;

/* JADX INFO: loaded from: classes4.dex */
public final class k {
    public static final java.util.regex.Pattern j = java.util.regex.Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final java.util.regex.Pattern f30560k = java.util.regex.Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final java.util.regex.Pattern f30561l = java.util.regex.Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final java.util.regex.Pattern f30562m = java.util.regex.Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f30563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f30564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f30565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f30566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f30567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f30568f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f30569h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f30570i;

    public k(java.lang.String str, java.lang.String str2, long j9, java.lang.String str3, java.lang.String str4, boolean z6, boolean z9, boolean z10, boolean z11) {
        this.f30563a = str;
        this.f30564b = str2;
        this.f30565c = j9;
        this.f30566d = str3;
        this.f30567e = str4;
        this.f30568f = z6;
        this.g = z9;
        this.f30569h = z10;
        this.f30570i = z11;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof w8.k)) {
            return false;
        }
        w8.k kVar = (w8.k) obj;
        return kotlin.jvm.internal.m.a(kVar.f30563a, this.f30563a) && kotlin.jvm.internal.m.a(kVar.f30564b, this.f30564b) && kVar.f30565c == this.f30565c && kotlin.jvm.internal.m.a(kVar.f30566d, this.f30566d) && kotlin.jvm.internal.m.a(kVar.f30567e, this.f30567e) && kVar.f30568f == this.f30568f && kVar.g == this.g && kVar.f30569h == this.f30569h && kVar.f30570i == this.f30570i;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f30570i) + p121o0.p.f(p121o0.p.f(p121o0.p.f(B2.a.a(B2.a.a(p121o0.p.e(B2.a.a(B2.a.a(527, 31, this.f30563a), 31, this.f30564b), 31, this.f30565c), 31, this.f30566d), 31, this.f30567e), 31, this.f30568f), 31, this.g), 31, this.f30569h);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f30563a);
        sb.append('=');
        sb.append(this.f30564b);
        if (this.f30569h) {
            long j9 = this.f30565c;
            if (j9 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                java.lang.String str = ((java.text.DateFormat) B8.c.f849a.get()).format(new java.util.Date(j9));
                kotlin.jvm.internal.m.d(str, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(str);
            }
        }
        if (!this.f30570i) {
            sb.append("; domain=");
            sb.append(this.f30566d);
        }
        sb.append("; path=");
        sb.append(this.f30567e);
        if (this.f30568f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString()");
        return string;
    }
}
