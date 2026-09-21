package p095l;

/* JADX INFO: renamed from: l.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2545b extends p103m.AbstractViewOnTouchListenerC2586r0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f24593q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ android.view.View f24594r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2545b(androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f24594r = actionMenuItemView;
    }

    @Override // p103m.AbstractViewOnTouchListenerC2586r0
    public final p095l.B b() {
        p103m.C2562f c2562f;
        switch (this.f24593q) {
            case 0:
                p095l.AbstractC2546c abstractC2546c = ((androidx.appcompat.view.menu.ActionMenuItemView) this.f24594r).f15639t;
                if (abstractC2546c == null || (c2562f = ((p103m.C2564g) abstractC2546c).f25040a.f25049A) == null) {
                    return null;
                }
                return c2562f.a();
            default:
                p103m.C2562f c2562f2 = ((p103m.C2568i) this.f24594r).f25046k.f25069z;
                if (c2562f2 == null) {
                    return null;
                }
                return c2562f2.a();
        }
    }

    @Override // p103m.AbstractViewOnTouchListenerC2586r0
    public final boolean c() {
        p095l.B b9;
        switch (this.f24593q) {
            case 0:
                androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView = (androidx.appcompat.view.menu.ActionMenuItemView) this.f24594r;
                p095l.k kVar = actionMenuItemView.f15637r;
                return kVar != null && kVar.a(actionMenuItemView.f15634o) && (b9 = b()) != null && b9.a();
            default:
                ((p103m.C2568i) this.f24594r).f25046k.l();
                return true;
        }
    }

    @Override // p103m.AbstractViewOnTouchListenerC2586r0
    public boolean d() {
        switch (this.f24593q) {
            case 1:
                p103m.C2570j c2570j = ((p103m.C2568i) this.f24594r).f25046k;
                if (c2570j.f25050B != null) {
                    return false;
                }
                c2570j.e();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2545b(p103m.C2568i c2568i, p103m.C2568i c2568i2) {
        super(c2568i2);
        this.f24594r = c2568i;
    }
}
