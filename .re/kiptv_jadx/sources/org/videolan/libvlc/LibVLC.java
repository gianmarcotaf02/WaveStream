package org.videolan.libvlc;

/* JADX INFO: loaded from: classes4.dex */
public class LibVLC extends org.videolan.libvlc.VLCObject<org.videolan.libvlc.interfaces.ILibVLC.Event> implements org.videolan.libvlc.interfaces.ILibVLC {
    private static final java.lang.String TAG = "VLC/LibVLC";
    private static boolean sLoaded = false;
    final android.content.Context mAppContext;

    public static class Event extends org.videolan.libvlc.interfaces.AbstractVLCEvent {
        public Event(int i3) {
            super(i3);
        }
    }

    public LibVLC(android.content.Context context, java.util.List<java.lang.String> list) {
        this.mAppContext = context.getApplicationContext();
        loadLibraries();
        nativeNew(list != null ? (java.lang.String[]) list.toArray(new java.lang.String[list.size()]) : null, context.getDir("vlc", 0).getAbsolutePath());
    }

    public static native java.lang.String changeset();

    public static native java.lang.String compiler();

    public static synchronized void loadLibraries() {
        if (sLoaded) {
            return;
        }
        sLoaded = true;
        try {
            java.lang.System.loadLibrary("c++_shared");
        } catch (java.lang.SecurityException unused) {
            android.util.Log.e(TAG, "Encountered a security issue when loading c++_shared library");
        } catch (java.lang.UnsatisfiedLinkError unused2) {
            android.util.Log.e(TAG, "Can't load c++_shared library");
        }
        try {
            java.lang.System.loadLibrary("vlc");
            java.lang.System.loadLibrary("vlcjni");
        } catch (java.lang.SecurityException e6) {
            android.util.Log.e(TAG, "Encountered a security issue when loading vlcjni library: " + e6);
            java.lang.System.exit(1);
        } catch (java.lang.UnsatisfiedLinkError e9) {
            android.util.Log.e(TAG, "Can't load vlcjni library: " + e9);
            java.lang.System.exit(1);
        }
    }

    public static native int majorVersion();

    private native void nativeNew(java.lang.String[] strArr, java.lang.String str);

    private native void nativeRelease();

    private native void nativeSetUserAgent(java.lang.String str, java.lang.String str2);

    public static native java.lang.String version();

    @Override // org.videolan.libvlc.interfaces.ILibVLC
    public android.content.Context getAppContext() {
        return this.mAppContext;
    }

    @Override // org.videolan.libvlc.VLCObject
    public /* bridge */ /* synthetic */ long getInstance() {
        return super.getInstance();
    }

    @Override // org.videolan.libvlc.VLCObject, org.videolan.libvlc.interfaces.IVLCObject
    public /* bridge */ /* synthetic */ org.videolan.libvlc.interfaces.ILibVLC getLibVLC() {
        return super.getLibVLC();
    }

    @Override // org.videolan.libvlc.VLCObject, org.videolan.libvlc.interfaces.IVLCObject
    public /* bridge */ /* synthetic */ boolean isReleased() {
        return super.isReleased();
    }

    @Override // org.videolan.libvlc.VLCObject
    public org.videolan.libvlc.interfaces.ILibVLC.Event onEventNative(int i3, long j, long j9, float f9, java.lang.String str) {
        return null;
    }

    @Override // org.videolan.libvlc.VLCObject
    public void onReleaseNative() {
        nativeRelease();
    }

    public void setUserAgent(java.lang.String str, java.lang.String str2) {
        nativeSetUserAgent(str, str2);
    }

    public LibVLC(android.content.Context context) {
        this(context, null);
    }
}
