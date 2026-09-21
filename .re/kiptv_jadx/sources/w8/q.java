package w8;

/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.util.regex.Pattern f30591e = java.util.regex.Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.util.regex.Pattern f30592f = java.util.regex.Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f30593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f30594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f30595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f30596d;

    public q(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        this.f30593a = str;
        this.f30594b = str2;
        this.f30595c = str3;
        this.f30596d = strArr;
    }

    public final java.nio.charset.Charset a(java.nio.charset.Charset charset) {
        java.lang.String str;
        java.lang.String[] strArr = this.f30596d;
        int i3 = 0;
        int iX = com.google.crypto.tink.shaded.protobuf.AbstractC1911f.x(0, strArr.length - 1, 2);
        if (iX < 0) {
            str = null;
            break;
        }
        while (true) {
            if (!O7.x.r0(strArr[i3], io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, true)) {
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
            return java.nio.charset.Charset.forName(str);
        } catch (java.lang.IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof w8.q) && kotlin.jvm.internal.m.a(((w8.q) obj).f30593a, this.f30593a);
    }

    public final int hashCode() {
        return this.f30593a.hashCode();
    }

    public final java.lang.String toString() {
        return this.f30593a;
    }
}
