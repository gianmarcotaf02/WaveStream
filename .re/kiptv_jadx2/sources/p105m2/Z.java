package p105m2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;

public abstract class Z {
    public static void a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler, int i3) {
        context.registerReceiver(broadcastReceiver, intentFilter, null, handler, i3);
    }
}
