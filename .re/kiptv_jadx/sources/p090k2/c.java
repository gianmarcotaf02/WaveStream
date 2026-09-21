package p090k2;

/* JADX INFO: loaded from: classes.dex */
public final class c extends androidx.core.app.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f24436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.support.v4.media.session.MediaSessionCompat$Token f24437b;

    @Override // androidx.core.app.C
    public final void apply(androidx.core.app.InterfaceC1487g interfaceC1487g) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            p090k2.a.d(((androidx.core.app.E) interfaceC1487g).f15975b, p090k2.a.b(p090k2.b.a(p090k2.a.a(), null, 0, null, java.lang.Boolean.FALSE), this.f24436a, this.f24437b));
        } else {
            p090k2.a.d(((androidx.core.app.E) interfaceC1487g).f15975b, p090k2.a.b(p090k2.a.a(), this.f24436a, this.f24437b));
        }
    }

    @Override // androidx.core.app.C
    public final android.widget.RemoteViews makeBigContentView(androidx.core.app.InterfaceC1487g interfaceC1487g) {
        return null;
    }

    @Override // androidx.core.app.C
    public final android.widget.RemoteViews makeContentView(androidx.core.app.InterfaceC1487g interfaceC1487g) {
        return null;
    }
}
