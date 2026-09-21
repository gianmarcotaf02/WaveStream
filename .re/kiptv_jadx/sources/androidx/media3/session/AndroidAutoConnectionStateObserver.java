package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
final class AndroidAutoConnectionStateObserver {
    private static final java.lang.String BROADCAST_INTENT = "androidx.car.app.connection.action.CAR_CONNECTION_UPDATED";
    private static final java.lang.String QUERY_COLUMN = "CarConnectionState";
    private static final android.net.Uri QUERY_URI = android.net.Uri.parse("content://androidx.car.app.connection");
    private final java.util.concurrent.Executor backgroundExecutor;
    private final androidx.media3.session.AndroidAutoConnectionStateObserver.AndroidAutoChangeReceiver changeReceiver;
    private final android.content.Context context;
    private final java.util.concurrent.atomic.AtomicBoolean isConnected;
    private final java.util.concurrent.atomic.AtomicBoolean isReleased;
    private final java.lang.Runnable listener;

    public final class AndroidAutoChangeReceiver extends android.content.BroadcastReceiver {
        private AndroidAutoChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            androidx.media3.session.AndroidAutoConnectionStateObserver.this.backgroundExecutor.execute(new androidx.media3.session.RunnableC1567a(androidx.media3.session.AndroidAutoConnectionStateObserver.this, 2));
        }
    }

    public AndroidAutoConnectionStateObserver(android.content.Context context, java.lang.Runnable runnable) {
        this.context = context.getApplicationContext();
        this.listener = runnable;
        java.util.concurrent.Executor executor = androidx.media3.common.util.BackgroundExecutor.get();
        this.backgroundExecutor = executor;
        this.changeReceiver = new androidx.media3.session.AndroidAutoConnectionStateObserver.AndroidAutoChangeReceiver();
        this.isConnected = new java.util.concurrent.atomic.AtomicBoolean();
        this.isReleased = new java.util.concurrent.atomic.AtomicBoolean();
        executor.execute(new androidx.media3.session.RunnableC1567a(this, 1));
    }

    public static /* synthetic */ void access$200(androidx.media3.session.AndroidAutoConnectionStateObserver androidAutoConnectionStateObserver) {
        androidAutoConnectionStateObserver.updateConnectionState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter(BROADCAST_INTENT);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            this.context.registerReceiver(this.changeReceiver, intentFilter, 2);
        } else {
            this.context.registerReceiver(this.changeReceiver, intentFilter);
        }
        updateConnectionState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$1() {
        this.context.unregisterReceiver(this.changeReceiver);
    }

    private boolean queryConnectionState() {
        try {
            android.database.Cursor cursorQuery = this.context.getContentResolver().query(QUERY_URI, new java.lang.String[]{QUERY_COLUMN}, null, null, null);
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
            } catch (java.lang.Throwable th) {
                try {
                    cursorQuery.close();
                    throw th;
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            return false;
            cursorQuery.close();
            return false;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
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
        this.backgroundExecutor.execute(new androidx.media3.session.RunnableC1567a(this, 0));
    }
}
