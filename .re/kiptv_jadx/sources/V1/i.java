package V1;

/* JADX INFO: loaded from: classes.dex */
public final class i extends T1.h implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.ref.WeakReference f10244h;

    public i(android.widget.EditText editText) {
        this.f10244h = new java.lang.ref.WeakReference(editText);
    }

    @Override // T1.h
    public final void b() {
        android.os.Handler handler;
        android.widget.EditText editText = (android.widget.EditText) this.f10244h.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        V1.j.a((android.widget.EditText) this.f10244h.get(), 1);
    }
}
