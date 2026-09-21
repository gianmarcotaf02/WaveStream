package Y1;

import android.app.Dialog;
import android.content.DialogInterface;

public final class DialogInterfaceOnCancelListenerC1022g implements DialogInterface.OnCancelListener {

    public final DialogInterfaceOnCancelListenerC1025j f11266h;

    public DialogInterfaceOnCancelListenerC1022g(DialogInterfaceOnCancelListenerC1025j dialogInterfaceOnCancelListenerC1025j) {
        this.f11266h = dialogInterfaceOnCancelListenerC1025j;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC1025j dialogInterfaceOnCancelListenerC1025j = this.f11266h;
        Dialog dialog = dialogInterfaceOnCancelListenerC1025j.f11279i0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC1025j.onCancel(dialog);
        }
    }
}
