package p141q6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.Integer f26651a;

    static {
        java.lang.Integer num;
        java.lang.Integer num2 = null;
        try {
            java.lang.Object obj = java.lang.Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
        } catch (java.lang.Throwable unused) {
        }
        if (num != null && num.intValue() > 0) {
            num2 = num;
        }
        f26651a = num2;
    }
}
