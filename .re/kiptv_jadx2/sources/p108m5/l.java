package p108m5;

import B2.a;
import androidx.media3.ui.CaptionStyleCompat;
import kotlin.jvm.internal.m;
import p121o0.p;
import p188x0.C3098s;

public final class l {
    public static final k Companion = new k();

    public static final l f25418k = new l(C3098s.f31124c, 16, C3098s.c(C3098s.f31123b, 0.5f), true);

    public final int f25419a;

    public final long f25420b;

    public final long f25421c;

    public final long f25422d;

    public final boolean f25423e;

    public final boolean f25424f;
    public final String g;

    public final String f25425h;

    public final boolean f25426i;
    public final CaptionStyleCompat j;

    public l(int i3, long j, long j9, long j10, boolean z6, boolean z9, String str, String str2, boolean z10, CaptionStyleCompat captionStyleCompat) {
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

    public static l a(l lVar, int i3, long j, long j9, long j10, boolean z6, String str, String str2, CaptionStyleCompat captionStyleCompat, int i9) {
        int i10 = (i9 & 1) != 0 ? lVar.f25419a : i3;
        long j11 = (i9 & 2) != 0 ? lVar.f25420b : j;
        long j12 = (i9 & 4) != 0 ? lVar.f25421c : j9;
        long j13 = (i9 & 8) != 0 ? lVar.f25422d : j10;
        boolean z9 = lVar.f25423e;
        boolean z10 = (i9 & 32) != 0 ? lVar.f25424f : z6;
        String fontDesign = (i9 & 64) != 0 ? lVar.g : str;
        String edgeStyle = (i9 & 128) != 0 ? lVar.f25425h : str2;
        boolean z11 = (i9 & 256) != 0 ? lVar.f25426i : true;
        CaptionStyleCompat captionStyleCompat2 = (i9 & 512) != 0 ? lVar.j : captionStyleCompat;
        lVar.getClass();
        m.e(fontDesign, "fontDesign");
        m.e(edgeStyle, "edgeStyle");
        return new l(i10, j11, j12, j13, z9, z10, fontDesign, edgeStyle, z11, captionStyleCompat2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f25419a == lVar.f25419a && C3098s.d(this.f25420b, lVar.f25420b) && C3098s.d(this.f25421c, lVar.f25421c) && C3098s.d(this.f25422d, lVar.f25422d) && this.f25423e == lVar.f25423e && this.f25424f == lVar.f25424f && m.a(this.g, lVar.g) && m.a(this.f25425h, lVar.f25425h) && this.f25426i == lVar.f25426i && m.a(this.j, lVar.j);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f25419a) * 31;
        int i3 = C3098s.f31128h;
        int iF = p.f(a.a(a.a(p.f(p.f(p.e(p.e(p.e(iHashCode, 31, this.f25420b), 31, this.f25421c), 31, this.f25422d), 31, this.f25423e), 31, this.f25424f), 31, this.g), 31, this.f25425h), 31, this.f25426i);
        CaptionStyleCompat captionStyleCompat = this.j;
        return iF + (captionStyleCompat == null ? 0 : captionStyleCompat.hashCode());
    }

    public final String toString() {
        String strJ = C3098s.j(this.f25420b);
        String strJ2 = C3098s.j(this.f25421c);
        String strJ3 = C3098s.j(this.f25422d);
        StringBuilder sb = new StringBuilder("SubtitleStyle(fontSizeSp=");
        sb.append(this.f25419a);
        sb.append(", textColor=");
        sb.append(strJ);
        sb.append(", backgroundColor=");
        a.x(sb, strJ2, ", windowColor=", strJ3, ", alignBottom=");
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
        this(i3, j, j9, C3098s.f31127f, z6, false, "default", "none", false, null);
    }
}
