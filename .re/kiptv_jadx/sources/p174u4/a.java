package p174u4;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f28677b = new java.lang.Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o4.f f28678a;

    public a(p103m.c1 c1Var) {
        android.content.Context context = (android.content.Context) c1Var.f25018h;
        java.lang.String str = (java.lang.String) c1Var.f25019i;
        java.lang.String str2 = (java.lang.String) c1Var.j;
        if (str == null) {
            throw new java.lang.IllegalArgumentException("keysetName cannot be null");
        }
        android.content.Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            android.preference.PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            applicationContext.getSharedPreferences(str2, 0).edit();
        }
        this.f28678a = (o4.f) c1Var.f25023n;
    }
}
