package androidx.startup;

/* JADX INFO: loaded from: classes.dex */
public class InitializationProvider extends android.content.ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        android.content.Context context = getContext();
        if (context == null) {
            throw new I3.b("Context cannot be null");
        }
        if (context.getApplicationContext() == null) {
            return true;
        }
        p190x2.a aVarC = p190x2.a.c(context);
        java.lang.Class<?> cls = getClass();
        android.content.Context context2 = aVarC.f31149c;
        try {
            try {
                com.google.android.gms.internal.play_billing.AbstractC1833d1.h("Startup");
                aVarC.a(context2.getPackageManager().getProviderInfo(new android.content.ComponentName(context2, cls), 128).metaData);
                android.os.Trace.endSection();
                return true;
            } catch (android.content.pm.PackageManager.NameNotFoundException e6) {
                throw new I3.b(e6);
            }
        } catch (java.lang.Throwable th) {
            android.os.Trace.endSection();
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }
}
