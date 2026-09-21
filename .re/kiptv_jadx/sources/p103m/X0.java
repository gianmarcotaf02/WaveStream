package p103m;

/* JADX INFO: loaded from: classes.dex */
public final class X0 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p095l.C2544a f24981h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p103m.Y0 f24982i;

    public X0(p103m.Y0 y9) {
        this.f24982i = y9;
        android.content.Context context = y9.f24989a.getContext();
        java.lang.CharSequence charSequence = y9.f24995h;
        p095l.C2544a c2544a = new p095l.C2544a();
        c2544a.f24583e = 4096;
        c2544a.g = 4096;
        c2544a.f24588l = null;
        c2544a.f24589m = null;
        c2544a.f24590n = false;
        c2544a.f24591o = false;
        c2544a.f24592p = 16;
        c2544a.f24586i = context;
        c2544a.f24579a = charSequence;
        this.f24981h = c2544a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        p103m.Y0 y9 = this.f24982i;
        android.view.Window.Callback callback = y9.f24997k;
        if (callback == null || !y9.f24998l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f24981h);
    }
}
