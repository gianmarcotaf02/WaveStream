package D1;

/* JADX INFO: loaded from: classes.dex */
public final class G extends D1.I {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1968l;

    public G(int i3, java.lang.Class cls, int i9, int i10, int i11) {
        this.f1968l = i11;
        this.f1970h = i3;
        this.f1972k = cls;
        this.j = i9;
        this.f1971i = i10;
    }

    @Override // D1.I
    public final java.lang.Object c(android.view.View view) {
        switch (this.f1968l) {
            case 0:
                return java.lang.Boolean.valueOf(D1.O.c(view));
            case 1:
                return D1.O.a(view);
            default:
                return java.lang.Boolean.valueOf(D1.O.b(view));
        }
    }

    @Override // D1.I
    public final void d(android.view.View view, java.lang.Object obj) {
        switch (this.f1968l) {
            case 0:
                D1.O.f(view, ((java.lang.Boolean) obj).booleanValue());
                break;
            case 1:
                D1.O.e(view, (java.lang.CharSequence) obj);
                break;
            default:
                D1.O.d(view, ((java.lang.Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // D1.I
    public final boolean i(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f1968l) {
            case 0:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                java.lang.Boolean bool2 = (java.lang.Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !android.text.TextUtils.equals((java.lang.CharSequence) obj, (java.lang.CharSequence) obj2);
            default:
                java.lang.Boolean bool3 = (java.lang.Boolean) obj;
                java.lang.Boolean bool4 = (java.lang.Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
