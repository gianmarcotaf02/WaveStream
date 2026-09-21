package R8;

import B3.o;
import java.util.concurrent.ConcurrentHashMap;

public final class d {

    public final int f9081a;

    public final P8.a f9082b;

    public final S8.a f9083c;

    public d(int i3) {
        this.f9081a = i3;
        switch (i3) {
            case 1:
                this.f9082b = new g();
                new ConcurrentHashMap();
                this.f9083c = new A.a(18);
                break;
            default:
                this.f9082b = new c();
                new ConcurrentHashMap();
                this.f9083c = new o(23);
                break;
        }
    }

    public final P8.a a() {
        switch (this.f9081a) {
            case 0:
                return (c) this.f9082b;
            default:
                return (g) this.f9082b;
        }
    }
}
