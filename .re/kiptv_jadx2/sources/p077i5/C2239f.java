package p077i5;

import B2.a;
import com.google.android.gms.internal.play_billing.M0;
import kotlin.jvm.internal.m;
import p121o0.p;

public final class C2239f {

    public final int f23107a;

    public final String f23108b;

    public final String f23109c;

    public final String f23110d;

    public final String f23111e;

    public final Double f23112f;
    public final int g;

    public final boolean f23113h;

    public C2239f(int i3, String language, String str, String str2, String str3, Double d4, int i9, boolean z6) {
        m.e(language, "language");
        this.f23107a = i3;
        this.f23108b = language;
        this.f23109c = str;
        this.f23110d = str2;
        this.f23111e = str3;
        this.f23112f = d4;
        this.g = i9;
        this.f23113h = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2239f)) {
            return false;
        }
        C2239f c2239f = (C2239f) obj;
        return this.f23107a == c2239f.f23107a && m.a(this.f23108b, c2239f.f23108b) && m.a(this.f23109c, c2239f.f23109c) && m.a(this.f23110d, c2239f.f23110d) && m.a(this.f23111e, c2239f.f23111e) && m.a(this.f23112f, c2239f.f23112f) && this.g == c2239f.g && this.f23113h == c2239f.f23113h;
    }

    public final int hashCode() {
        int iA = a.a(a.a(Integer.hashCode(this.f23107a) * 31, 31, this.f23108b), 31, this.f23109c);
        String str = this.f23110d;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f23111e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d4 = this.f23112f;
        return Boolean.hashCode(this.f23113h) + p.d(this.g, (iHashCode2 + (d4 != null ? d4.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExternalSubtitleResult(fileId=");
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
        return M0.o(sb, this.f23113h, ")");
    }
}
