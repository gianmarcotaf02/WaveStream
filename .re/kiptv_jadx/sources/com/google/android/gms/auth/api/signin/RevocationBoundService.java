package com.google.android.gms.auth.api.signin;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class RevocationBoundService extends android.app.Service {
    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        if (!"com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction()) && !"com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
            android.util.Log.w("RevocationService", "Unknown action sent to RevocationBoundService: ".concat(java.lang.String.valueOf(intent.getAction())));
            return null;
        }
        if (android.util.Log.isLoggable("RevocationService", 2)) {
            android.util.Log.v("RevocationService", "RevocationBoundService handling ".concat(java.lang.String.valueOf(intent.getAction())));
        }
        return new X3.b(this);
    }
}
