package io.sentry.ndk;

public final class NativeScope implements INativeScope {
    public static native void nativeAddBreadcrumb(String str, String str2, String str3, String str4, String str5, String str6);

    public static native void nativeRemoveExtra(String str);

    public static native void nativeRemoveTag(String str);

    public static native void nativeRemoveUser();

    public static native void nativeSetExtra(String str, String str2);

    public static native void nativeSetTag(String str, String str2);

    public static native void nativeSetTrace(String str, String str2);

    public static native void nativeSetUser(String str, String str2, String str3, String str4);

    @Override
    public void addBreadcrumb(String str, String str2, String str3, String str4, String str5, String str6) {
        nativeAddBreadcrumb(str, str2, str3, str4, str5, str6);
    }

    @Override
    public void removeExtra(String str) {
        nativeRemoveExtra(str);
    }

    @Override
    public void removeTag(String str) {
        nativeRemoveTag(str);
    }

    @Override
    public void removeUser() {
        nativeRemoveUser();
    }

    @Override
    public void setExtra(String str, String str2) {
        nativeSetExtra(str, str2);
    }

    @Override
    public void setTag(String str, String str2) {
        nativeSetTag(str, str2);
    }

    @Override
    public void setTrace(String str, String str2) {
        nativeSetTrace(str, str2);
    }

    @Override
    public void setUser(String str, String str2, String str3, String str4) {
        nativeSetUser(str, str2, str3, str4);
    }
}
