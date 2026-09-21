package io.sentry.ndk;

/* JADX INFO: loaded from: classes4.dex */
public final class NativeScope implements io.sentry.ndk.INativeScope {
    public static native void nativeAddBreadcrumb(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6);

    public static native void nativeRemoveExtra(java.lang.String str);

    public static native void nativeRemoveTag(java.lang.String str);

    public static native void nativeRemoveUser();

    public static native void nativeSetExtra(java.lang.String str, java.lang.String str2);

    public static native void nativeSetTag(java.lang.String str, java.lang.String str2);

    public static native void nativeSetTrace(java.lang.String str, java.lang.String str2);

    public static native void nativeSetUser(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    @Override // io.sentry.ndk.INativeScope
    public void addBreadcrumb(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        nativeAddBreadcrumb(str, str2, str3, str4, str5, str6);
    }

    @Override // io.sentry.ndk.INativeScope
    public void removeExtra(java.lang.String str) {
        nativeRemoveExtra(str);
    }

    @Override // io.sentry.ndk.INativeScope
    public void removeTag(java.lang.String str) {
        nativeRemoveTag(str);
    }

    @Override // io.sentry.ndk.INativeScope
    public void removeUser() {
        nativeRemoveUser();
    }

    @Override // io.sentry.ndk.INativeScope
    public void setExtra(java.lang.String str, java.lang.String str2) {
        nativeSetExtra(str, str2);
    }

    @Override // io.sentry.ndk.INativeScope
    public void setTag(java.lang.String str, java.lang.String str2) {
        nativeSetTag(str, str2);
    }

    @Override // io.sentry.ndk.INativeScope
    public void setTrace(java.lang.String str, java.lang.String str2) {
        nativeSetTrace(str, str2);
    }

    @Override // io.sentry.ndk.INativeScope
    public void setUser(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        nativeSetUser(str, str2, str3, str4);
    }
}
