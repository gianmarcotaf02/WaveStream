package w8;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public final class k {
    public static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");

    public static final Pattern f30560k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    public static final Pattern f30561l = Pattern.compile("(\\d{1,2})[^\\d]*");

    public static final Pattern f30562m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public final String f30563a;

    public final String f30564b;

    public final long f30565c;

    public final String f30566d;

    public final String f30567e;

    public final boolean f30568f;
    public final boolean g;

    public final boolean f30569h;

    public final boolean f30570i;

    public k(String str, String str2, long j9, String str3, String str4, boolean z6, boolean z9, boolean z10, boolean z11) {
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

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.m.a(kVar.f30563a, this.f30563a) && kotlin.jvm.internal.m.a(kVar.f30564b, this.f30564b) && kVar.f30565c == this.f30565c && kotlin.jvm.internal.m.a(kVar.f30566d, this.f30566d) && kotlin.jvm.internal.m.a(kVar.f30567e, this.f30567e) && kVar.f30568f == this.f30568f && kVar.g == this.g && kVar.f30569h == this.f30569h && kVar.f30570i == this.f30570i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30570i) + p121o0.p.f(p121o0.p.f(p121o0.p.f(B2.a.a(B2.a.a(p121o0.p.e(B2.a.a(B2.a.a(527, 31, this.f30563a), 31, this.f30564b), 31, this.f30565c), 31, this.f30566d), 31, this.f30567e), 31, this.f30568f), 31, this.g), 31, this.f30569h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f30563a);
        sb.append('=');
        sb.append(this.f30564b);
        if (this.f30569h) {
            long j9 = this.f30565c;
            if (j9 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = ((DateFormat) B8.c.f849a.get()).format(new Date(j9));
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
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString()");
        return string;
    }
}
