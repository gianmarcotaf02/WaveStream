package D1;

/* JADX INFO: renamed from: D1.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0238x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D1.InterfaceC0237w f2073a;

    public C0238x(androidx.core.widget.NestedScrollView nestedScrollView) {
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            this.f2073a = new D1.C0236v(nestedScrollView);
        } else {
            this.f2073a = new B3.o(9);
        }
    }
}
