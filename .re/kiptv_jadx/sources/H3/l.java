package H3;

/* JADX INFO: loaded from: classes.dex */
public final class l implements android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3984h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f3985i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ l(android.content.Intent intent, java.lang.Object obj, int i3) {
        this.f3984h = i3;
        this.f3985i = intent;
        this.j = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [F3.g, java.lang.Object] */
    public final void a() {
        switch (this.f3984h) {
            case 0:
                android.content.Intent intent = this.f3985i;
                if (intent != null) {
                    ((com.google.android.gms.common.api.GoogleApiActivity) this.j).startActivityForResult(intent, 2);
                }
                break;
            default:
                android.content.Intent intent2 = this.f3985i;
                if (intent2 != null) {
                    this.j.startActivityForResult(intent2, 2);
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i3) {
        try {
            try {
                a();
            } catch (android.content.ActivityNotFoundException e6) {
                android.util.Log.e("DialogRedirect", true == android.os.Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e6);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
