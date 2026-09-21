package p114n2;

import android.os.Bundle;
import kotlin.jvm.internal.m;

public abstract class I {

    public static final C2645d f25598b;

    public static final C2644c f25599c;

    public static final C2645d f25600d;

    public static final C2644c f25601e;

    public static final C2645d f25602f;
    public static final C2644c g;

    public static final C2645d f25603h;

    public static final C2644c f25604i;
    public static final C2645d j;

    public static final C2644c f25605k;

    public final boolean f25606a;

    static {
        boolean z6 = false;
        f25598b = new C2645d(z6, 2);
        boolean z9 = true;
        f25599c = new C2644c(z9, 2);
        f25600d = new C2645d(z6, 3);
        f25601e = new C2644c(z9, 3);
        f25602f = new C2645d(z6, 1);
        g = new C2644c(z9, 1);
        f25603h = new C2645d(z6, 0);
        f25604i = new C2644c(z9, 0);
        j = new C2645d(z9, 4);
        f25605k = new C2644c(z9, 4);
    }

    public I(boolean z6) {
        this.f25606a = z6;
    }

    public abstract Object a(String str, Bundle bundle);

    public abstract String b();

    public Object c(Object obj, String str) {
        return d(str);
    }

    public abstract Object d(String str);

    public abstract void e(Bundle bundle, String str, Object obj);

    public boolean f(Object obj, Object obj2) {
        return m.a(obj, obj2);
    }

    public final String toString() {
        return b();
    }
}
