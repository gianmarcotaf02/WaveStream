package F;

/* JADX INFO: renamed from: F.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0344i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F.InterfaceC0353s f3463c;

    public C0344i(int i3, int i9, F.InterfaceC0353s interfaceC0353s) {
        this.f3461a = i3;
        this.f3462b = i9;
        this.f3463c = interfaceC0353s;
        if (i3 < 0) {
            A.b.a("startIndex should be >= 0");
        }
        if (i9 > 0) {
            return;
        }
        A.b.a("size should be > 0");
    }
}
