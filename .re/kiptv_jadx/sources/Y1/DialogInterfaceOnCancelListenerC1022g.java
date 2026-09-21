package Y1;

/* JADX INFO: renamed from: Y1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC1022g implements android.content.DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y1.DialogInterfaceOnCancelListenerC1025j f11266h;

    public DialogInterfaceOnCancelListenerC1022g(Y1.DialogInterfaceOnCancelListenerC1025j dialogInterfaceOnCancelListenerC1025j) {
        this.f11266h = dialogInterfaceOnCancelListenerC1025j;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        Y1.DialogInterfaceOnCancelListenerC1025j dialogInterfaceOnCancelListenerC1025j = this.f11266h;
        android.app.Dialog dialog = dialogInterfaceOnCancelListenerC1025j.f11279i0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC1025j.onCancel(dialog);
        }
    }
}
