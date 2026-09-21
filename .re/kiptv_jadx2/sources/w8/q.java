package w8;

import com.google.crypto.tink.shaded.protobuf.AbstractC1911f;
import io.ktor.http.auth.HttpAuthHeader;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

public final class q {

    public static final Pattern f30591e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    public static final Pattern f30592f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public final String f30593a;

    public final String f30594b;

    public final String f30595c;

    public final String[] f30596d;

    public q(String str, String str2, String str3, String[] strArr) {
        this.f30593a = str;
        this.f30594b = str2;
        this.f30595c = str3;
        this.f30596d = strArr;
    }

    public final Charset a(Charset charset) {
        String str;
        String[] strArr = this.f30596d;
        int i3 = 0;
        int iX = AbstractC1911f.x(0, strArr.length - 1, 2);
        if (iX < 0) {
            str = null;
            break;
        }
        while (true) {
            if (!O7.x.r0(strArr[i3], HttpAuthHeader.Parameters.Charset, true)) {
                if (i3 == iX) {
                    str = null;
                    break;
                }
                i3 += 2;
            } else {
                str = strArr[i3 + 1];
                break;
            }
        }
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q) && kotlin.jvm.internal.m.a(((q) obj).f30593a, this.f30593a);
    }

    public final int hashCode() {
        return this.f30593a.hashCode();
    }

    public final String toString() {
        return this.f30593a;
    }
}
