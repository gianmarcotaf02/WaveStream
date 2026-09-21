package D3;

/* JADX INFO: loaded from: classes.dex */
public class c extends android.app.DialogFragment {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public android.app.AlertDialog f2100h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public android.content.DialogInterface.OnCancelListener f2101i;
    public android.app.AlertDialog j;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        android.content.DialogInterface.OnCancelListener onCancelListener = this.f2101i;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.app.AlertDialog alertDialog = this.f2100h;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.j == null) {
            android.app.Activity activity = getActivity();
            H3.q.g(activity);
            this.j = new android.app.AlertDialog.Builder(activity).create();
        }
        return this.j;
    }
}
