package U;

import D1.C0223h;
import J.AbstractC0549n;

public final class C0952z implements InterfaceC0934g {

    public static final C0952z f10098b = new C0952z(0);

    public static final C0952z f10099c = new C0952z(1);

    public static final C0223h f10100d = new C0223h(3);

    public static final C0223h f10101e = new C0223h(4);

    public static final C0223h f10102f = new C0223h(5);
    public static final C0223h g = new C0223h(6);

    public final int f10103a;

    public C0952z(int i3) {
        this.f10103a = i3;
    }

    @Override
    public long a(int i3, C0948v c0948v) {
        switch (this.f10103a) {
            case 0:
                String str = ((p011b1.J) c0948v.f10089e).f17772a.f17764a.f17809i;
                return p011b1.D.b(AbstractC0549n.o(str, i3), AbstractC0549n.n(str, i3));
            default:
                return ((p011b1.J) c0948v.f10089e).j(i3);
        }
    }
}
