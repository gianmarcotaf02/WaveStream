package D3;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

public class c extends DialogFragment {

    public AlertDialog f2100h;

    public DialogInterface.OnCancelListener f2101i;
    public AlertDialog j;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f2101i;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.f2100h;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.j == null) {
            Activity activity = getActivity();
            H3.q.g(activity);
            this.j = new AlertDialog.Builder(activity).create();
        }
        return this.j;
    }
}
