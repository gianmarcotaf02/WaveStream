package p077i5;

/* JADX INFO: renamed from: i5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2234a implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p077i5.P f23083i;

    public /* synthetic */ C2234a(p077i5.P p2, int i3) {
        this.f23082h = i3;
        this.f23083i = p2;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        java.lang.ref.WeakReference it = (java.lang.ref.WeakReference) obj;
        switch (this.f23082h) {
            case 0:
                kotlin.jvm.internal.m.e(it, "it");
                return java.lang.Boolean.valueOf(it.get() == null || it.get() == this.f23083i);
            default:
                kotlin.jvm.internal.m.e(it, "it");
                return java.lang.Boolean.valueOf(it.get() == null || it.get() == this.f23083i);
        }
    }
}
