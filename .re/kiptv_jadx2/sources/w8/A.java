package w8;

import Z2.C1202m;

public final class A {

    public v f30475a;

    public t f30476b;

    public String f30478d;

    public l f30479e;
    public D g;

    public B f30481h;

    public B f30482i;
    public B j;

    public long f30483k;

    public long f30484l;

    public A8.e f30485m;

    public int f30477c = -1;

    public C1202m f30480f = new C1202m(2);

    public static void b(String str, B b9) {
        if (b9 != null) {
            if (b9.f30491n != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (b9.f30492o != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (b9.f30493p != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (b9.f30494q != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final B a() {
        int i3 = this.f30477c;
        if (i3 < 0) {
            throw new IllegalStateException(("code < 0: " + this.f30477c).toString());
        }
        v vVar = this.f30475a;
        if (vVar == null) {
            throw new IllegalStateException("request == null");
        }
        t tVar = this.f30476b;
        if (tVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f30478d;
        if (str != null) {
            return new B(vVar, tVar, str, i3, this.f30479e, this.f30480f.e(), this.g, this.f30481h, this.f30482i, this.j, this.f30483k, this.f30484l, this.f30485m);
        }
        throw new IllegalStateException("message == null");
    }
}
