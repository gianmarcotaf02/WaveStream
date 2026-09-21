package w8;

import java.io.Closeable;

public final class B implements Closeable, AutoCloseable {

    public final v f30486h;

    public final t f30487i;
    public final String j;

    public final int f30488k;

    public final l f30489l;

    public final m f30490m;

    public final D f30491n;

    public final B f30492o;

    public final B f30493p;

    public final B f30494q;

    public final long f30495r;

    public final long f30496s;

    public final A8.e f30497t;

    public B(v request, t protocol, String message, int i3, l lVar, m mVar, D d4, B b9, B b10, B b11, long j, long j9, A8.e eVar) {
        kotlin.jvm.internal.m.e(request, "request");
        kotlin.jvm.internal.m.e(protocol, "protocol");
        kotlin.jvm.internal.m.e(message, "message");
        this.f30486h = request;
        this.f30487i = protocol;
        this.j = message;
        this.f30488k = i3;
        this.f30489l = lVar;
        this.f30490m = mVar;
        this.f30491n = d4;
        this.f30492o = b9;
        this.f30493p = b10;
        this.f30494q = b11;
        this.f30495r = j;
        this.f30496s = j9;
        this.f30497t = eVar;
    }

    public static String b(String str, B b9) {
        b9.getClass();
        String strD = b9.f30490m.d(str);
        if (strD == null) {
            return null;
        }
        return strD;
    }

    @Override
    public final void close() {
        D d4 = this.f30491n;
        if (d4 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        d4.close();
    }

    public final A e() {
        A a2 = new A();
        a2.f30475a = this.f30486h;
        a2.f30476b = this.f30487i;
        a2.f30477c = this.f30488k;
        a2.f30478d = this.j;
        a2.f30479e = this.f30489l;
        a2.f30480f = this.f30490m.n();
        a2.g = this.f30491n;
        a2.f30481h = this.f30492o;
        a2.f30482i = this.f30493p;
        a2.j = this.f30494q;
        a2.f30483k = this.f30495r;
        a2.f30484l = this.f30496s;
        a2.f30485m = this.f30497t;
        return a2;
    }

    public final String toString() {
        return "Response{protocol=" + this.f30487i + ", code=" + this.f30488k + ", message=" + this.j + ", url=" + this.f30486h.f30659a + '}';
    }
}
