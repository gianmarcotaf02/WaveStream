package D;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p020c0.C1675d0 f1779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p020c0.C1675d0 f1780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.Object f1782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final F.H f1783f;

    public w(int i3, int i9, int i10) {
        this.f1778a = i10;
        switch (i10) {
            case 1:
                this.f1779b = new p020c0.C1675d0(i3);
                this.f1780c = new p020c0.C1675d0(i9);
                this.f1783f = new F.H(i3, 90, 200);
                break;
            default:
                this.f1779b = new p020c0.C1675d0(i3);
                this.f1780c = new p020c0.C1675d0(i9);
                this.f1783f = new F.H(i3, 30, 100);
                break;
        }
    }

    public final void a(int i3, int i9) {
        switch (this.f1778a) {
            case 0:
                if (i3 < 0.0f) {
                    A.b.a("Index should be non-negative (" + i3 + ')');
                }
                this.f1779b.h(i3);
                this.f1783f.c(i3);
                this.f1780c.h(i9);
                break;
            default:
                if (i3 < 0.0f) {
                    A.b.a("Index should be non-negative");
                }
                this.f1779b.h(i3);
                this.f1783f.c(i3);
                this.f1780c.h(i9);
                break;
        }
    }
}
