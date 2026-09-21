package N7;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements java.lang.Iterable, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f7465i;

    public /* synthetic */ r(int i3, java.lang.Object obj) {
        this.f7464h = i3;
        this.f7465i = obj;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        switch (this.f7464h) {
            case 0:
                return ((N7.m) this.f7465i).iterator();
            case 1:
                return kotlin.jvm.internal.m.h((java.lang.Object[]) this.f7465i);
            case 2:
                return new N7.d((java.util.Iterator) ((kotlin.jvm.functions.Function0) this.f7465i).invoke());
            default:
                return new D1.X((p153r8.C2713y) this.f7465i);
        }
    }
}
