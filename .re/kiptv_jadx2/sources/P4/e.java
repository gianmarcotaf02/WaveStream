package P4;

import Y6.f;
import p121o0.p;

public abstract class e {

    public static final d f8143a = new d(false, false, false);

    public static boolean a() {
        b bVar = c.f8139b;
        if (bVar != null) {
            return bVar.f8137e;
        }
        return false;
    }

    public static String b() {
        if (!a()) {
            return "standard";
        }
        long j = 1024;
        return f.g(((a() ? 12582912L : 50331648L) / j) / j, "MB,playerBuf=reduced)", p.s(a() ? 1 : 3, a() ? 1 : 4, "low(decode=", ",l1=", ",img="));
    }
}
