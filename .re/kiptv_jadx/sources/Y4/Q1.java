package Y4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Q1 implements java.util.function.Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11717a;

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        switch (this.f11717a) {
            case 0:
                return new java.text.SimpleDateFormat("yyyyMMddHHmmss Z", java.util.Locale.US);
            default:
                java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyyMMddHHmmss", java.util.Locale.US);
                simpleDateFormat.setTimeZone(j$.util.DesugarTimeZone.getTimeZone("UTC"));
                return simpleDateFormat;
        }
    }
}
