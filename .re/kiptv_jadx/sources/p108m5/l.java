package p108m5;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public static final p108m5.k Companion = new p108m5.k();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p108m5.l f25418k = new p108m5.l(p188x0.C3098s.f31124c, 16, p188x0.C3098s.c(p188x0.C3098s.f31123b, 0.5f), true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f25421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f25422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f25423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f25424f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f25425h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f25426i;
    public final androidx.media3.ui.CaptionStyleCompat j;

    public l(int i3, long j, long j9, long j10, boolean z6, boolean z9, java.lang.String str, java.lang.String str2, boolean z10, androidx.media3.ui.CaptionStyleCompat captionStyleCompat) {
        this.f25419a = i3;
        this.f25420b = j;
        this.f25421c = j9;
        this.f25422d = j10;
        this.f25423e = z6;
        this.f25424f = z9;
        this.g = str;
        this.f25425h = str2;
        this.f25426i = z10;
        this.j = captionStyleCompat;
    }

    public static p108m5.l a(p108m5.l lVar, int i3, long j, long j9, long j10, boolean z6, java.lang.String str, java.lang.String str2, androidx.media3.ui.CaptionStyleCompat captionStyleCompat, int i9) {
        int i10 = (i9 & 1) != 0 ? lVar.f25419a : i3;
        long j11 = (i9 & 2) != 0 ? lVar.f25420b : j;
        long j12 = (i9 & 4) != 0 ? lVar.f25421c : j9;
        long j13 = (i9 & 8) != 0 ? lVar.f25422d : j10;
        boolean z9 = lVar.f25423e;
        boolean z10 = (i9 & 32) != 0 ? lVar.f25424f : z6;
        java.lang.String fontDesign = (i9 & 64) != 0 ? lVar.g : str;
        java.lang.String edgeStyle = (i9 & 128) != 0 ? lVar.f25425h : str2;
        boolean z11 = (i9 & 256) != 0 ? lVar.f25426i : true;
        androidx.media3.ui.CaptionStyleCompat captionStyleCompat2 = (i9 & 512) != 0 ? lVar.j : captionStyleCompat;
        lVar.getClass();
        kotlin.jvm.internal.m.e(fontDesign, "fontDesign");
        kotlin.jvm.internal.m.e(edgeStyle, "edgeStyle");
        return new p108m5.l(i10, j11, j12, j13, z9, z10, fontDesign, edgeStyle, z11, captionStyleCompat2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p108m5.l)) {
            return false;
        }
        p108m5.l lVar = (p108m5.l) obj;
        return this.f25419a == lVar.f25419a && p188x0.C3098s.d(this.f25420b, lVar.f25420b) && p188x0.C3098s.d(this.f25421c, lVar.f25421c) && p188x0.C3098s.d(this.f25422d, lVar.f25422d) && this.f25423e == lVar.f25423e && this.f25424f == lVar.f25424f && kotlin.jvm.internal.m.a(this.g, lVar.g) && kotlin.jvm.internal.m.a(this.f25425h, lVar.f25425h) && this.f25426i == lVar.f25426i && kotlin.jvm.internal.m.a(this.j, lVar.j);
    }

    public final int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.f25419a) * 31;
        int i3 = p188x0.C3098s.f31128h;
        int iF = p121o0.p.f(B2.a.a(B2.a.a(p121o0.p.f(p121o0.p.f(p121o0.p.e(p121o0.p.e(p121o0.p.e(iHashCode, 31, this.f25420b), 31, this.f25421c), 31, this.f25422d), 31, this.f25423e), 31, this.f25424f), 31, this.g), 31, this.f25425h), 31, this.f25426i);
        androidx.media3.ui.CaptionStyleCompat captionStyleCompat = this.j;
        return iF + (captionStyleCompat == null ? 0 : captionStyleCompat.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.String strJ = p188x0.C3098s.j(this.f25420b);
        java.lang.String strJ2 = p188x0.C3098s.j(this.f25421c);
        java.lang.String strJ3 = p188x0.C3098s.j(this.f25422d);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SubtitleStyle(fontSizeSp=");
        sb.append(this.f25419a);
        sb.append(", textColor=");
        sb.append(strJ);
        sb.append(", backgroundColor=");
        B2.a.x(sb, strJ2, ", windowColor=", strJ3, ", alignBottom=");
        sb.append(this.f25423e);
        sb.append(", bold=");
        sb.append(this.f25424f);
        sb.append(", fontDesign=");
        sb.append(this.g);
        sb.append(", edgeStyle=");
        sb.append(this.f25425h);
        sb.append(", usesSystemStyle=");
        sb.append(this.f25426i);
        sb.append(", captionStyleCompat=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }

    public l(long j, int i3, long j9, boolean z6) {
        this(i3, j, j9, p188x0.C3098s.f31127f, z6, false, "default", "none", false, null);
    }
}
