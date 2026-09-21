package v;

/* JADX INFO: loaded from: classes.dex */
public final class A0 implements v.y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v.A0 f28797b = new v.A0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v.A0 f28798c = new v.A0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28799a;

    public /* synthetic */ A0(int i3) {
        this.f28799a = i3;
    }

    @Override // v.y0
    public final boolean a() {
        switch (this.f28799a) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // v.y0
    public final v.x0 b(android.view.View view, p113n1.c cVar) {
        switch (this.f28799a) {
            case 0:
                return new v.z0(new android.widget.Magnifier(view));
            default:
                return new v.B0(new android.widget.Magnifier(view));
        }
    }
}
