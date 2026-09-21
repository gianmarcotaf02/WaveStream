package F4;

/* JADX INFO: loaded from: classes.dex */
public final class c implements D4.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.text.SimpleDateFormat f3653a;

    static {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", java.util.Locale.US);
        f3653a = simpleDateFormat;
        simpleDateFormat.setTimeZone(j$.util.DesugarTimeZone.getTimeZone("UTC"));
    }

    @Override // D4.a
    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        ((D4.g) obj2).c(f3653a.format((java.util.Date) obj));
    }
}
