package androidx.media3.session.legacy;

import D1.AbstractC0229n;
import android.app.ForegroundServiceStartNotAllowedException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.view.KeyEvent;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.audio.q;
import com.google.android.gms.internal.play_billing.M0;
import java.util.List;

public class MediaButtonReceiver extends BroadcastReceiver {
    private static final String TAG = "MediaButtonReceiver";

    public static final class Api31 {
        private Api31() {
        }

        public static ForegroundServiceStartNotAllowedException castToForegroundServiceStartNotAllowedException(IllegalStateException illegalStateException) {
            return q.a(illegalStateException);
        }

        public static boolean instanceOfForegroundServiceStartNotAllowedException(IllegalStateException illegalStateException) {
            return q.A(illegalStateException);
        }
    }

    public static class MediaButtonConnectionCallback extends MediaBrowserCompat.ConnectionCallback {
        private final Context context;
        private final Intent intent;
        private MediaBrowserCompat mediaBrowser;
        private final BroadcastReceiver.PendingResult pendingResult;

        public MediaButtonConnectionCallback(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.context = context;
            this.intent = intent;
            this.pendingResult = pendingResult;
        }

        private void finish() {
            MediaBrowserCompat mediaBrowserCompat = this.mediaBrowser;
            mediaBrowserCompat.getClass();
            mediaBrowserCompat.disconnect();
            this.pendingResult.finish();
        }

        @Override
        public void onConnected() {
            Context context = this.context;
            MediaBrowserCompat mediaBrowserCompat = this.mediaBrowser;
            mediaBrowserCompat.getClass();
            new MediaControllerCompat(context, mediaBrowserCompat.getSessionToken()).dispatchMediaButtonEvent((KeyEvent) this.intent.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            finish();
        }

        @Override
        public void onConnectionFailed() {
            finish();
        }

        @Override
        public void onConnectionSuspended() {
            finish();
        }

        public void setMediaBrowser(MediaBrowserCompat mediaBrowserCompat) {
            this.mediaBrowser = mediaBrowserCompat;
        }
    }

    public static ComponentName getMediaButtonReceiverComponent(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        if (listQueryBroadcastReceivers.size() <= 1) {
            return null;
        }
        Log.w(TAG, "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
        return null;
    }

    private static ComponentName getServiceComponentByAction(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        StringBuilder sbQ = M0.q("Expected 1 service that handles ", str, ", found ");
        sbQ.append(listQueryIntentServices.size());
        throw new IllegalStateException(sbQ.toString());
    }

    public void onForegroundServiceStartNotAllowedException(ForegroundServiceStartNotAllowedException foregroundServiceStartNotAllowedException) {
        Log.e(TAG, "caught exception when trying to start a foreground service from the background: " + foregroundServiceStartNotAllowedException.getMessage());
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d(TAG, "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName serviceComponentByAction = getServiceComponentByAction(context, "android.intent.action.MEDIA_BUTTON");
        if (serviceComponentByAction == null) {
            ComponentName serviceComponentByAction2 = getServiceComponentByAction(context, MediaBrowserServiceCompat.SERVICE_INTERFACE);
            if (serviceComponentByAction2 == null) {
                throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
            }
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            Context applicationContext = context.getApplicationContext();
            MediaButtonConnectionCallback mediaButtonConnectionCallback = new MediaButtonConnectionCallback(applicationContext, intent, pendingResultGoAsync);
            MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, serviceComponentByAction2, mediaButtonConnectionCallback, null);
            mediaButtonConnectionCallback.setMediaBrowser(mediaBrowserCompat);
            mediaBrowserCompat.connect();
            return;
        }
        intent.setComponent(serviceComponentByAction);
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0229n.v(context, intent);
            } else {
                context.startService(intent);
            }
        } catch (IllegalStateException e6) {
            if (Build.VERSION.SDK_INT < 31 || !Api31.instanceOfForegroundServiceStartNotAllowedException(e6)) {
                throw e6;
            }
            onForegroundServiceStartNotAllowedException(Api31.castToForegroundServiceStartNotAllowedException(e6));
        }
    }
}
