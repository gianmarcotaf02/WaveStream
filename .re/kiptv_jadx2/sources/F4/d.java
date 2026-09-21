package F4;

import D4.f;
import D4.g;
import java.util.Date;
import java.util.HashMap;

public final class d implements E4.a {

    public static final b f3655f;
    public static final b g;

    public final HashMap f3657a;

    public final HashMap f3658b;

    public final a f3659c;

    public boolean f3660d;

    public static final a f3654e = new a(0);

    public static final c f3656h = new c();

    static {
        final int i3 = 0;
        f3655f = new f() {
            @Override
            public final void a(Object obj, Object obj2) {
                switch (i3) {
                    case 0:
                        ((g) obj2).c((String) obj);
                        break;
                    default:
                        ((g) obj2).d(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i9 = 1;
        g = new f() {
            @Override
            public final void a(Object obj, Object obj2) {
                switch (i9) {
                    case 0:
                        ((g) obj2).c((String) obj);
                        break;
                    default:
                        ((g) obj2).d(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        HashMap map = new HashMap();
        this.f3657a = map;
        HashMap map2 = new HashMap();
        this.f3658b = map2;
        this.f3659c = f3654e;
        this.f3660d = false;
        map2.put(String.class, f3655f);
        map.remove(String.class);
        map2.put(Boolean.class, g);
        map.remove(Boolean.class);
        map2.put(Date.class, f3656h);
        map.remove(Date.class);
    }

    public final E4.a a(Class cls, D4.d dVar) {
        this.f3657a.put(cls, dVar);
        this.f3658b.remove(cls);
        return this;
    }
}
