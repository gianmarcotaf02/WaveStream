package A1;

/* JADX INFO: loaded from: classes.dex */
public final class f implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f140e;

    public /* synthetic */ f(java.lang.String str, android.content.Context context, java.lang.Object obj, int i3, int i9) {
        this.f136a = i9;
        this.f137b = str;
        this.f138c = context;
        this.f140e = obj;
        this.f139d = i3;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        switch (this.f136a) {
            case 0:
                java.lang.Object[] objArr = {(A1.e) this.f140e};
                java.util.ArrayList arrayList = new java.util.ArrayList(1);
                java.lang.Object obj = objArr[0];
                java.util.Objects.requireNonNull(obj);
                arrayList.add(obj);
                return A1.i.b(this.f137b, this.f138c, java.util.Collections.unmodifiableList(arrayList), this.f139d);
            default:
                try {
                    return A1.i.b(this.f137b, this.f138c, (java.util.List) this.f140e, this.f139d);
                } catch (java.lang.Throwable unused) {
                    return new A1.h(-3);
                }
        }
    }
}
