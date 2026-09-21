package H3;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final android.net.Uri f4004a = new android.net.Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    public static android.content.Intent a(android.content.Context context, H3.z zVar) throws H3.r {
        android.os.Bundle bundleCall;
        java.lang.String str = zVar.f4014a;
        android.content.Intent intent = null;
        if (str == null) {
            return new android.content.Intent().setComponent(null);
        }
        if (zVar.f4016c) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("serviceActionBundleKey", str);
            try {
                android.content.ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f4004a);
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new android.os.RemoteException("Failed to acquire ContentProviderClient");
                }
                try {
                    bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                } catch (java.lang.Throwable th) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th;
                }
            } catch (android.os.RemoteException e6) {
                e = e6;
                android.util.Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundleCall = null;
            } catch (java.lang.IllegalArgumentException e9) {
                e = e9;
                android.util.Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundleCall = null;
            }
            if (bundleCall != null) {
                android.content.Intent intent2 = (android.content.Intent) bundleCall.getParcelable("serviceResponseIntentKey");
                if (intent2 != null) {
                    intent = intent2;
                } else {
                    android.app.PendingIntent pendingIntent = (android.app.PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
                    if (pendingIntent != null) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 72);
                        sb.append("Dynamic lookup for intent failed for action ");
                        sb.append(str);
                        sb.append(" but has possible resolution");
                        android.util.Log.w("ServiceBindIntentUtils", sb.toString());
                        throw new H3.r(new D3.b(25, pendingIntent, null));
                    }
                }
            }
            if (intent == null) {
                android.util.Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(str));
            }
        }
        return intent == null ? new android.content.Intent(str).setPackage(zVar.f4015b) : intent;
    }
}
