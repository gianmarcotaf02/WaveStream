package Y1;

import android.app.Dialog;
import android.content.DialogInterface;

public final class DialogInterfaceOnDismissListenerC1023h implements DialogInterface.OnDismissListener {

    public final DialogInterfaceOnCancelListenerC1025j f11267h;

    public DialogInterfaceOnDismissListenerC1023h(DialogInterfaceOnCancelListenerC1025j dialogInterfaceOnCancelListenerC1025j) {
        this.f11267h = dialogInterfaceOnCancelListenerC1025j;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC1025j dialogInterfaceOnCancelListenerC1025j = this.f11267h;
        Dialog dialog = dialogInterfaceOnCancelListenerC1025j.f11279i0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC1025j.onDismiss(dialog);
        }
    }
}
