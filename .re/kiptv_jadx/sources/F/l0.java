package F;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F.k0 f3473a;

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    static {
        F.k0 k0Var;
        java.lang.String str = android.os.Build.FINGERPRINT;
        if (str != null) {
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
            if (lowerCase.equals("robolectric")) {
                k0Var = new F.k0();
            } else {
                k0Var = null;
            }
        } else {
            k0Var = null;
        }
        f3473a = k0Var;
    }
}
