package androidx.media3.session.legacy;

/* JADX INFO: loaded from: classes.dex */
public class MediaButtonReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String TAG = "MediaButtonReceiver";

    public static final class Api31 {
        private Api31() {
        }

        public static android.app.ForegroundServiceStartNotAllowedException castToForegroundServiceStartNotAllowedException(java.lang.IllegalStateException illegalStateException) {
            return androidx.media3.exoplayer.audio.q.a(illegalStateException);
        }

        public static boolean instanceOfForegroundServiceStartNotAllowedException(java.lang.IllegalStateException illegalStateException) {
            return androidx.media3.exoplayer.audio.q.A(illegalStateException);
        }
    }

    public static class MediaButtonConnectionCallback extends androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback {
        private final android.content.Context context;
        private final android.content.Intent intent;
        private androidx.media3.session.legacy.MediaBrowserCompat mediaBrowser;
        private final android.content.BroadcastReceiver.PendingResult pendingResult;

        public MediaButtonConnectionCallback(android.content.Context context, android.content.Intent intent, android.content.BroadcastReceiver.PendingResult pendingResult) {
            this.context = context;
            this.intent = intent;
            this.pendingResult = pendingResult;
        }

        private void finish() {
            androidx.media3.session.legacy.MediaBrowserCompat mediaBrowserCompat = this.mediaBrowser;
            mediaBrowserCompat.getClass();
            mediaBrowserCompat.disconnect();
            this.pendingResult.finish();
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback
        public void onConnected() {
            android.content.Context context = this.context;
            androidx.media3.session.legacy.MediaBrowserCompat mediaBrowserCompat = this.mediaBrowser;
            mediaBrowserCompat.getClass();
            new androidx.media3.session.legacy.MediaControllerCompat(context, mediaBrowserCompat.getSessionToken()).dispatchMediaButtonEvent((android.view.KeyEvent) this.intent.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            finish();
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback
        public void onConnectionFailed() {
            finish();
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback
        public void onConnectionSuspended() {
            finish();
        }

        public void setMediaBrowser(androidx.media3.session.legacy.MediaBrowserCompat mediaBrowserCompat) {
            this.mediaBrowser = mediaBrowserCompat;
        }
    }

    public static android.content.ComponentName getMediaButtonReceiverComponent(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        java.util.List<android.content.pm.ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers.size() == 1) {
            android.content.pm.ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            return new android.content.ComponentName(activityInfo.packageName, activityInfo.name);
        }
        if (listQueryBroadcastReceivers.size() <= 1) {
            return null;
        }
        androidx.media3.common.util.Log.w(TAG, "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
        return null;
    }

    private static android.content.ComponentName getServiceComponentByAction(android.content.Context context, java.lang.String str) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        android.content.Intent intent = new android.content.Intent(str);
        intent.setPackage(context.getPackageName());
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            android.content.pm.ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            return new android.content.ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        java.lang.StringBuilder sbQ = com.google.android.gms.internal.play_billing.M0.q("Expected 1 service that handles ", str, ", found ");
        sbQ.append(listQueryIntentServices.size());
        throw new java.lang.IllegalStateException(sbQ.toString());
    }

    public void onForegroundServiceStartNotAllowedException(android.app.ForegroundServiceStartNotAllowedException foregroundServiceStartNotAllowedException) {
        androidx.media3.common.util.Log.e(TAG, "caught exception when trying to start a foreground service from the background: " + foregroundServiceStartNotAllowedException.getMessage());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            androidx.media3.common.util.Log.d(TAG, "Ignore unsupported intent: " + intent);
            return;
        }
        android.content.ComponentName serviceComponentByAction = getServiceComponentByAction(context, "android.intent.action.MEDIA_BUTTON");
        if (serviceComponentByAction == null) {
            android.content.ComponentName serviceComponentByAction2 = getServiceComponentByAction(context, androidx.media3.session.legacy.MediaBrowserServiceCompat.SERVICE_INTERFACE);
            if (serviceComponentByAction2 == null) {
                throw new java.lang.IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
            }
            android.content.BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            android.content.Context applicationContext = context.getApplicationContext();
            androidx.media3.session.legacy.MediaButtonReceiver.MediaButtonConnectionCallback mediaButtonConnectionCallback = new androidx.media3.session.legacy.MediaButtonReceiver.MediaButtonConnectionCallback(applicationContext, intent, pendingResultGoAsync);
            androidx.media3.session.legacy.MediaBrowserCompat mediaBrowserCompat = new androidx.media3.session.legacy.MediaBrowserCompat(applicationContext, serviceComponentByAction2, mediaButtonConnectionCallback, null);
            mediaButtonConnectionCallback.setMediaBrowser(mediaBrowserCompat);
            mediaBrowserCompat.connect();
            return;
        }
        intent.setComponent(serviceComponentByAction);
        try {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                D1.AbstractC0229n.v(context, intent);
            } else {
                context.startService(intent);
            }
        } catch (java.lang.IllegalStateException e6) {
            if (android.os.Build.VERSION.SDK_INT < 31 || !androidx.media3.session.legacy.MediaButtonReceiver.Api31.instanceOfForegroundServiceStartNotAllowedException(e6)) {
                throw e6;
            }
            onForegroundServiceStartNotAllowedException(androidx.media3.session.legacy.MediaButtonReceiver.Api31.castToForegroundServiceStartNotAllowedException(e6));
        }
    }
}
