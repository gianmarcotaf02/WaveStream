package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
class SessionUtil {
    public static final int PACKAGE_CANT_CHECK = 2;
    public static final int PACKAGE_INVALID = 1;
    public static final int PACKAGE_VALID = 0;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface PackageValidationResult {
    }

    private SessionUtil() {
    }

    public static int checkPackageValidity(android.content.Context context, java.lang.String str, int i3) {
        if (str == null) {
            return 1;
        }
        java.lang.String[] packagesForUid = context.getPackageManager().getPackagesForUid(i3);
        if (packagesForUid == null || packagesForUid.length == 0) {
            return 2;
        }
        for (java.lang.String str2 : packagesForUid) {
            if (str2.equals(str)) {
                return 0;
            }
        }
        return 1;
    }

    public static void disconnectIMediaController(androidx.media3.session.IMediaController iMediaController) {
        if (iMediaController != null) {
            try {
                iMediaController.onDisconnected(0);
            } catch (android.os.RemoteException unused) {
            }
        }
    }
}
