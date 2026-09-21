package P4;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P4.d f8143a = new P4.d(false, false, false);

    public static boolean a() {
        P4.b bVar = P4.c.f8139b;
        if (bVar != null) {
            return bVar.f8137e;
        }
        return false;
    }

    public static java.lang.String b() {
        if (!a()) {
            return "standard";
        }
        long j = 1024;
        return Y6.f.g(((a() ? 12582912L : 50331648L) / j) / j, "MB,playerBuf=reduced)", p121o0.p.s(a() ? 1 : 3, a() ? 1 : 4, "low(decode=", ",l1=", ",img="));
    }
}
