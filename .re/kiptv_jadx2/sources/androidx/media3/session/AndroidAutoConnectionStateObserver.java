package androidx.media3.session;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import androidx.media3.common.util.BackgroundExecutor;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

final class AndroidAutoConnectionStateObserver {
    private static final String BROADCAST_INTENT = "androidx.car.app.connection.action.CAR_CONNECTION_UPDATED";
    private static final String QUERY_COLUMN = "CarConnectionState";
    private static final Uri QUERY_URI = Uri.parse("content://androidx.car.app.connection");
    private final Executor backgroundExecutor;
    private final AndroidAutoChangeReceiver changeReceiver;
    private final Context context;
    private final AtomicBoolean isConnected;
    private final AtomicBoolean isReleased;
    private final Runnable listener;

    public final class AndroidAutoChangeReceiver extends BroadcastReceiver {
        private AndroidAutoChangeReceiver() {
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            AndroidAutoConnectionStateObserver.this.backgroundExecutor.execute(new RunnableC1567a(AndroidAutoConnectionStateObserver.this, 2));
        }
    }

    public AndroidAutoConnectionStateObserver(Context context, Runnable runnable) {
        this.context = context.getApplicationContext();
        this.listener = runnable;
        Executor executor = BackgroundExecutor.get();
        this.backgroundExecutor = executor;
        this.changeReceiver = new AndroidAutoChangeReceiver();
        this.isConnected = new AtomicBoolean();
        this.isReleased = new AtomicBoolean();
        executor.execute(new RunnableC1567a(this, 1));
    }

    public static void access$200(AndroidAutoConnectionStateObserver androidAutoConnectionStateObserver) {
        androidAutoConnectionStateObserver.updateConnectionState();
    }

    public void lambda$new$0() {
        IntentFilter intentFilter = new IntentFilter(BROADCAST_INTENT);
        if (Build.VERSION.SDK_INT >= 33) {
            this.context.registerReceiver(this.changeReceiver, intentFilter, 2);
        } else {
            this.context.registerReceiver(this.changeReceiver, intentFilter);
        }
        updateConnectionState();
    }

    public void lambda$release$1() {
        this.context.unregisterReceiver(this.changeReceiver);
    }

    private boolean queryConnectionState() {
        try {
            Cursor cursorQuery = this.context.getContentResolver().query(QUERY_URI, new String[]{QUERY_COLUMN}, null, null, null);
            if (cursorQuery == null) {
                if (cursorQuery != null) {
                }
                return false;
            }
            try {
                int columnIndex = cursorQuery.getColumnIndex(QUERY_COLUMN);
                if (columnIndex != -1 && cursorQuery.moveToNext()) {
                    boolean z6 = cursorQuery.getInt(columnIndex) != 0;
                    cursorQuery.close();
                    return z6;
                }
            } catch (Throwable th) {
                try {
                    cursorQuery.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            return false;
            cursorQuery.close();
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public void updateConnectionState() {
        boolean z6 = this.isConnected.get();
        boolean zQueryConnectionState = queryConnectionState();
        this.isConnected.set(zQueryConnectionState);
        if (z6 == zQueryConnectionState || this.isReleased.get()) {
            return;
        }
        this.listener.run();
    }

    public boolean isConnected() {
        return this.isConnected.get();
    }

    public void release() {
        if (this.isReleased.getAndSet(true)) {
            return;
        }
        this.backgroundExecutor.execute(new RunnableC1567a(this, 0));
    }
}
