package androidx.media3.session.legacy;

/* JADX INFO: loaded from: classes.dex */
public final class MediaSessionManager {
    static final java.lang.String TAG = "MediaSessionManager";
    private static final java.lang.Object lock = new java.lang.Object();
    private static volatile androidx.media3.session.legacy.MediaSessionManager sessionManager;
    androidx.media3.session.legacy.MediaSessionManager.MediaSessionManagerImpl impl;

    public static class MediaSessionManagerImpl {
        private static final java.lang.String ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
        private static final java.lang.String PERMISSION_MEDIA_CONTENT_CONTROL = "android.permission.MEDIA_CONTENT_CONTROL";
        private static final java.lang.String PERMISSION_STATUS_BAR_SERVICE = "android.permission.STATUS_BAR_SERVICE";
        private static final java.lang.String TAG = "MediaSessionManager";
        android.content.ContentResolver contentResolver;
        android.content.Context context;

        public MediaSessionManagerImpl(android.content.Context context) {
            this.context = context;
            this.contentResolver = context.getContentResolver();
        }

        private boolean hasMediaControlPermission(androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl) {
            return this.context.checkPermission(PERMISSION_MEDIA_CONTENT_CONTROL, remoteUserInfoImpl.getPid(), remoteUserInfoImpl.getUid()) == 0;
        }

        private boolean isPermissionGranted(androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl, java.lang.String str) {
            if (remoteUserInfoImpl.getPid() < 0) {
                return this.context.getPackageManager().checkPermission(str, remoteUserInfoImpl.getPackageName()) == 0;
            }
            return this.context.checkPermission(str, remoteUserInfoImpl.getPid(), remoteUserInfoImpl.getUid()) == 0;
        }

        public boolean isEnabledNotificationListener(androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl) {
            java.lang.String string = android.provider.Settings.Secure.getString(this.contentResolver, ENABLED_NOTIFICATION_LISTENERS);
            if (string != null) {
                for (java.lang.String str : string.split(":")) {
                    android.content.ComponentName componentNameUnflattenFromString = android.content.ComponentName.unflattenFromString(str);
                    if (componentNameUnflattenFromString != null && componentNameUnflattenFromString.getPackageName().equals(remoteUserInfoImpl.getPackageName())) {
                        return true;
                    }
                }
            }
            return false;
        }

        public boolean isTrustedForMediaControl(androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl) {
            int uid = remoteUserInfoImpl.getUid();
            try {
                int i3 = android.os.Build.VERSION.SDK_INT;
                android.content.pm.ApplicationInfo applicationInfo = this.context.getPackageManager().getApplicationInfo(remoteUserInfoImpl.getPackageName(), 0);
                if (applicationInfo == null) {
                    return false;
                }
                if (i3 < 28) {
                    uid = applicationInfo.uid;
                }
                return uid == 1000 || uid == android.os.Process.myUid() || hasMediaControlPermission(remoteUserInfoImpl) || isPermissionGranted(remoteUserInfoImpl, PERMISSION_STATUS_BAR_SERVICE) || isPermissionGranted(remoteUserInfoImpl, PERMISSION_MEDIA_CONTENT_CONTROL) || isEnabledNotificationListener(remoteUserInfoImpl);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                androidx.media3.common.util.Log.d(TAG, "Package " + remoteUserInfoImpl.getPackageName() + " doesn't exist");
                return false;
            }
        }
    }

    public interface RemoteUserInfoImpl {
        java.lang.String getPackageName();

        int getPid();

        int getUid();
    }

    public static final class RemoteUserInfoImplApi28 extends androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImplBase {
        public RemoteUserInfoImplApi28(java.lang.String str, int i3, int i9) {
            super(str, i3, i9);
        }

        public static java.lang.String getPackageName(android.media.session.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            return remoteUserInfo.getPackageName();
        }

        public RemoteUserInfoImplApi28(android.media.session.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
        }
    }

    public static class RemoteUserInfoImplBase implements androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImpl {
        private final java.lang.String packageName;
        private final int pid;
        private final int uid;

        public RemoteUserInfoImplBase(java.lang.String str, int i3, int i9) {
            this.packageName = str;
            this.pid = i3;
            this.uid = i9;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImplBase)) {
                return false;
            }
            androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImplBase remoteUserInfoImplBase = (androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImplBase) obj;
            if (this.pid < 0 || remoteUserInfoImplBase.pid < 0) {
                return android.text.TextUtils.equals(this.packageName, remoteUserInfoImplBase.packageName) && this.uid == remoteUserInfoImplBase.uid;
            }
            return android.text.TextUtils.equals(this.packageName, remoteUserInfoImplBase.packageName) && this.pid == remoteUserInfoImplBase.pid && this.uid == remoteUserInfoImplBase.uid;
        }

        @Override // androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImpl
        public java.lang.String getPackageName() {
            return this.packageName;
        }

        @Override // androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImpl
        public int getPid() {
            return this.pid;
        }

        @Override // androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImpl
        public int getUid() {
            return this.uid;
        }

        public int hashCode() {
            return java.util.Objects.hash(this.packageName, java.lang.Integer.valueOf(this.uid));
        }
    }

    private MediaSessionManager(android.content.Context context) {
        this.impl = new androidx.media3.session.legacy.MediaSessionManager.MediaSessionManagerImpl(context);
    }

    public static androidx.media3.session.legacy.MediaSessionManager getSessionManager(android.content.Context context) {
        androidx.media3.session.legacy.MediaSessionManager mediaSessionManager;
        synchronized (lock) {
            try {
                if (sessionManager == null) {
                    sessionManager = new androidx.media3.session.legacy.MediaSessionManager(context.getApplicationContext());
                }
                mediaSessionManager = sessionManager;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return mediaSessionManager;
    }

    public boolean isTrustedForMediaControl(androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        return this.impl.isTrustedForMediaControl(remoteUserInfo.impl);
    }

    public static final class RemoteUserInfo {
        public static final java.lang.String LEGACY_CONTROLLER = "android.media.session.MediaController";
        public static final int UNKNOWN_PID = -1;
        public static final int UNKNOWN_UID = -1;
        androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImpl impl;

        public RemoteUserInfo(java.lang.String str, int i3, int i9) {
            if (str == null) {
                throw new java.lang.NullPointerException("package shouldn't be null");
            }
            if (android.text.TextUtils.isEmpty(str)) {
                throw new java.lang.IllegalArgumentException("packageName should be nonempty");
            }
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                this.impl = new androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImplApi28(str, i3, i9);
            } else {
                this.impl = new androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImplBase(str, i3, i9);
            }
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo) {
                return this.impl.equals(((androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo) obj).impl);
            }
            return false;
        }

        public java.lang.String getPackageName() {
            return this.impl.getPackageName();
        }

        public int getPid() {
            return this.impl.getPid();
        }

        public int getUid() {
            return this.impl.getUid();
        }

        public int hashCode() {
            return this.impl.hashCode();
        }

        public RemoteUserInfo(android.media.session.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            java.lang.String packageName = androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImplApi28.getPackageName(remoteUserInfo);
            if (packageName != null) {
                if (!android.text.TextUtils.isEmpty(packageName)) {
                    this.impl = new androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImplApi28(remoteUserInfo);
                    return;
                }
                throw new java.lang.IllegalArgumentException("packageName should be nonempty");
            }
            throw new java.lang.NullPointerException("package shouldn't be null");
        }
    }
}
