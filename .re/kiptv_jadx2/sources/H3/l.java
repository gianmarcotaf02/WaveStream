package H3;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

public final class l implements DialogInterface.OnClickListener {

    public final int f3984h;

    public final Intent f3985i;
    public final Object j;

    public l(Intent intent, Object obj, int i3) {
        this.f3984h = i3;
        this.f3985i = intent;
        this.j = obj;
    }

    public final void a() {
        switch (this.f3984h) {
            case 0:
                Intent intent = this.f3985i;
                if (intent != null) {
                    ((GoogleApiActivity) this.j).startActivityForResult(intent, 2);
                }
                break;
            default:
                Intent intent2 = this.f3985i;
                if (intent2 != null) {
                    this.j.startActivityForResult(intent2, 2);
                }
                break;
        }
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i3) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e6) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e6);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
