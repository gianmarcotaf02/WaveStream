package p103m;

/* JADX INFO: loaded from: classes.dex */
public final class G0 extends p103m.B0 implements p103m.C0 {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final java.lang.reflect.Method f24913J;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public p008a8.c f24914I;

    static {
        try {
            if (android.os.Build.VERSION.SDK_INT <= 28) {
                f24913J = android.widget.PopupWindow.class.getDeclaredMethod("setTouchModal", java.lang.Boolean.TYPE);
            }
        } catch (java.lang.NoSuchMethodException unused) {
            android.util.Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // p103m.C0
    public final void E(p095l.l lVar, p095l.n nVar) {
        p008a8.c cVar = this.f24914I;
        if (cVar != null) {
            cVar.E(lVar, nVar);
        }
    }

    @Override // p103m.C0
    public final void g(p095l.l lVar, p095l.n nVar) {
        p008a8.c cVar = this.f24914I;
        if (cVar != null) {
            cVar.g(lVar, nVar);
        }
    }

    @Override // p103m.B0
    public final p103m.C2581o0 p(android.content.Context context, boolean z6) {
        p103m.F0 f9 = new p103m.F0(context, z6);
        f9.setHoverListener(this);
        return f9;
    }
}
