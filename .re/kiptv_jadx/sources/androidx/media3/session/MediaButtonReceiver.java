package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public class MediaButtonReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String[] ACTIONS = {"android.intent.action.MEDIA_BUTTON", androidx.media3.session.MediaLibraryService.SERVICE_INTERFACE, androidx.media3.session.MediaSessionService.SERVICE_INTERFACE};
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

    public final void handleIntentAndMaybeStartTheService(android.content.Context context, android.content.Intent intent) {
        if (intent == null || !java.util.Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            androidx.media3.common.util.Log.d(TAG, "Ignore unsupported intent: " + intent);
            return;
        }
        android.os.Bundle extras = intent.getExtras();
        extras.getClass();
        android.view.KeyEvent keyEvent = (android.view.KeyEvent) extras.getParcelable("android.intent.extra.KEY_EVENT");
        if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            if (android.os.Build.VERSION.SDK_INT >= 26 && keyEvent.getKeyCode() != 126 && keyEvent.getKeyCode() != 85 && keyEvent.getKeyCode() != 79) {
                androidx.media3.common.util.Log.w(TAG, "Ignore key event that is not a `play` command on API 26 or above to avoid an 'ForegroundServiceDidNotStartInTimeException'");
                return;
            }
            for (java.lang.String str : ACTIONS) {
                android.content.ComponentName serviceComponentByAction = getServiceComponentByAction(context, str);
                if (serviceComponentByAction != null) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.setComponent(serviceComponentByAction);
                    intent2.fillIn(intent, 0);
                    if (!shouldStartForegroundService(context, intent2)) {
                        androidx.media3.common.util.Log.i(TAG, "onReceive(Intent) does not start the media button event target service into the foreground on app request: " + serviceComponentByAction.getClassName());
                        return;
                    }
                    try {
                        if (android.os.Build.VERSION.SDK_INT >= 26) {
                            D1.AbstractC0229n.v(context, intent2);
                            return;
                        } else {
                            context.startService(intent2);
                            return;
                        }
                    } catch (java.lang.IllegalStateException e6) {
                        if (android.os.Build.VERSION.SDK_INT < 31 || !androidx.media3.session.MediaButtonReceiver.Api31.instanceOfForegroundServiceStartNotAllowedException(e6)) {
                            throw e6;
                        }
                        onForegroundServiceStartNotAllowedException(context, intent2, androidx.media3.session.MediaButtonReceiver.Api31.castToForegroundServiceStartNotAllowedException(e6));
                        return;
                    }
                }
            }
            throw new java.lang.IllegalStateException("Could not find any Service that handles any of the actions " + java.util.Arrays.toString(ACTIONS));
        }
    }

    @java.lang.Deprecated
    public void onForegroundServiceStartNotAllowedException(android.content.Intent intent, android.app.ForegroundServiceStartNotAllowedException foregroundServiceStartNotAllowedException) {
        androidx.media3.common.util.Log.e(TAG, "caught exception when trying to start a foreground service from the background: " + foregroundServiceStartNotAllowedException.getMessage());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        handleIntentAndMaybeStartTheService(context, intent);
    }

    public boolean shouldStartForegroundService(android.content.Context context, android.content.Intent intent) {
        return true;
    }

    public void onForegroundServiceStartNotAllowedException(android.content.Context context, android.content.Intent intent, android.app.ForegroundServiceStartNotAllowedException foregroundServiceStartNotAllowedException) {
        onForegroundServiceStartNotAllowedException(intent, foregroundServiceStartNotAllowedException);
    }
}
