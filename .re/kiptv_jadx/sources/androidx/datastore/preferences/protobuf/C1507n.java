package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1507n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile androidx.datastore.preferences.protobuf.C1507n f16236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.C1507n f16237b;

    static {
        androidx.datastore.preferences.protobuf.C1507n c1507n = new androidx.datastore.preferences.protobuf.C1507n();
        java.util.Map map = java.util.Collections.EMPTY_MAP;
        f16237b = c1507n;
    }

    public static androidx.datastore.preferences.protobuf.C1507n a() {
        androidx.datastore.preferences.protobuf.C1507n c1507n;
        androidx.datastore.preferences.protobuf.U u6 = androidx.datastore.preferences.protobuf.U.f16162c;
        androidx.datastore.preferences.protobuf.C1507n c1507n2 = f16236a;
        if (c1507n2 != null) {
            return c1507n2;
        }
        synchronized (androidx.datastore.preferences.protobuf.C1507n.class) {
            try {
                c1507n = f16236a;
                if (c1507n == null) {
                    java.lang.Class cls = androidx.datastore.preferences.protobuf.AbstractC1506m.f16235a;
                    androidx.datastore.preferences.protobuf.C1507n c1507n3 = null;
                    if (cls != null) {
                        try {
                            c1507n3 = (androidx.datastore.preferences.protobuf.C1507n) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (java.lang.Exception unused) {
                        }
                    }
                    c1507n = c1507n3 != null ? c1507n3 : f16237b;
                    f16236a = c1507n;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return c1507n;
    }
}
