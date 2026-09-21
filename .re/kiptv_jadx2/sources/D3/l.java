package D3;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

public final class l extends Z3.d {

    public final Context f2119b;

    public final e f2120c;

    public l(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.f2120c = eVar;
        this.f2119b = context.getApplicationContext();
    }

    @Override
    public final void handleMessage(Message message) {
        int i3 = message.what;
        if (i3 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i3);
            return;
        }
        int i9 = f.f2107a;
        e eVar = this.f2120c;
        Context context = this.f2119b;
        int iB = eVar.b(context, i9);
        AtomicBoolean atomicBoolean = i.f2109a;
        if (iB == 1 || iB == 2 || iB == 3 || iB == 9) {
            Intent intentA = eVar.a(context, iB, "n");
            eVar.f(context, iB, intentA == null ? null : PendingIntent.getActivity(context, 0, intentA, 201326592));
        }
    }
}
