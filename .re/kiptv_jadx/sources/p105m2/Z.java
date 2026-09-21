package p105m2;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z {
    public static void a(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, android.os.Handler handler, int i3) {
        context.registerReceiver(broadcastReceiver, intentFilter, null, handler, i3);
    }
}
