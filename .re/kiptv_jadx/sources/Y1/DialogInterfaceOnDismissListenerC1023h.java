package Y1;

/* JADX INFO: renamed from: Y1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC1023h implements android.content.DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y1.DialogInterfaceOnCancelListenerC1025j f11267h;

    public DialogInterfaceOnDismissListenerC1023h(Y1.DialogInterfaceOnCancelListenerC1025j dialogInterfaceOnCancelListenerC1025j) {
        this.f11267h = dialogInterfaceOnCancelListenerC1025j;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        Y1.DialogInterfaceOnCancelListenerC1025j dialogInterfaceOnCancelListenerC1025j = this.f11267h;
        android.app.Dialog dialog = dialogInterfaceOnCancelListenerC1025j.f11279i0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC1025j.onDismiss(dialog);
        }
    }
}
