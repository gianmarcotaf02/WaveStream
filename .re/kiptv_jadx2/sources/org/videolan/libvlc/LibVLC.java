package org.videolan.libvlc;

import android.content.Context;
import android.util.Log;
import java.util.List;
import org.videolan.libvlc.interfaces.AbstractVLCEvent;
import org.videolan.libvlc.interfaces.ILibVLC;

public class LibVLC extends VLCObject<ILibVLC.Event> implements ILibVLC {
    private static final String TAG = "VLC/LibVLC";
    private static boolean sLoaded = false;
    final Context mAppContext;

    public static class Event extends AbstractVLCEvent {
        public Event(int i3) {
            super(i3);
        }
    }

    public LibVLC(Context context, List<String> list) {
        this.mAppContext = context.getApplicationContext();
        loadLibraries();
        nativeNew(list != null ? (String[]) list.toArray(new String[list.size()]) : null, context.getDir("vlc", 0).getAbsolutePath());
    }

    public static native String changeset();

    public static native String compiler();

    public static synchronized void loadLibraries() {
        if (sLoaded) {
            return;
        }
        sLoaded = true;
        try {
            System.loadLibrary("c++_shared");
        } catch (SecurityException unused) {
            Log.e(TAG, "Encountered a security issue when loading c++_shared library");
        } catch (UnsatisfiedLinkError unused2) {
            Log.e(TAG, "Can't load c++_shared library");
        }
        try {
            System.loadLibrary("vlc");
            System.loadLibrary("vlcjni");
        } catch (SecurityException e6) {
            Log.e(TAG, "Encountered a security issue when loading vlcjni library: " + e6);
            System.exit(1);
        } catch (UnsatisfiedLinkError e9) {
            Log.e(TAG, "Can't load vlcjni library: " + e9);
            System.exit(1);
        }
    }

    public static native int majorVersion();

    private native void nativeNew(String[] strArr, String str);

    private native void nativeRelease();

    private native void nativeSetUserAgent(String str, String str2);

    public static native String version();

    @Override
    public Context getAppContext() {
        return this.mAppContext;
    }

    @Override
    public long getInstance() {
        return super.getInstance();
    }

    @Override
    public ILibVLC getLibVLC() {
        return super.getLibVLC();
    }

    @Override
    public boolean isReleased() {
        return super.isReleased();
    }

    @Override
    public ILibVLC.Event onEventNative(int i3, long j, long j9, float f9, String str) {
        return null;
    }

    @Override
    public void onReleaseNative() {
        nativeRelease();
    }

    public void setUserAgent(String str, String str2) {
        nativeSetUserAgent(str, str2);
    }

    public LibVLC(Context context) {
        this(context, null);
    }
}
