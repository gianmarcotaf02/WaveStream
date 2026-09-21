package p019c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f18030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p019c.k f18031i;

    public /* synthetic */ c(p019c.k kVar, int i3) {
        this.f18030h = i3;
        this.f18031i = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18030h) {
            case 0:
                this.f18031i.invalidateOptionsMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (java.lang.IllegalStateException e6) {
                    if (!kotlin.jvm.internal.m.a(e6.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e6;
                    }
                    return;
                } catch (java.lang.NullPointerException e9) {
                    if (!kotlin.jvm.internal.m.a(e9.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e9;
                    }
                    return;
                }
        }
    }
}
