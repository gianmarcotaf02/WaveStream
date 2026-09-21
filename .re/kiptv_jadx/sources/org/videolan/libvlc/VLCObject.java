package org.videolan.libvlc;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
public abstract class VLCObject<T extends org.videolan.libvlc.interfaces.AbstractVLCEvent> implements org.videolan.libvlc.interfaces.IVLCObject<T> {
    private org.videolan.libvlc.interfaces.AbstractVLCEvent.Listener<T> mEventListener;
    private android.os.Handler mHandler;
    final org.videolan.libvlc.interfaces.ILibVLC mILibVLC;
    private long mInstance;
    private int mNativeRefCount;

    public VLCObject(org.videolan.libvlc.interfaces.ILibVLC iLibVLC) {
        this.mEventListener = null;
        this.mHandler = null;
        this.mNativeRefCount = 1;
        this.mInstance = 0L;
        this.mILibVLC = iLibVLC;
    }

    private synchronized void dispatchEventFromNative(int i3, long j, long j9, float f9, java.lang.String str) throws java.lang.Throwable {
        org.videolan.libvlc.interfaces.AbstractVLCEvent.Listener<T> listener;
        android.os.Handler handler;
        try {
            try {
                if (isReleased()) {
                    return;
                }
                org.videolan.libvlc.interfaces.AbstractVLCEvent abstractVLCEventOnEventNative = onEventNative(i3, j, j9, f9, str);
                if (abstractVLCEventOnEventNative != null && (listener = this.mEventListener) != null && (handler = this.mHandler) != null) {
                    handler.post(new java.lang.Runnable(listener, abstractVLCEventOnEventNative) { // from class: org.videolan.libvlc.VLCObject.1EventRunnable
                        private final T event;
                        private final org.videolan.libvlc.interfaces.AbstractVLCEvent.Listener<T> listener;

                        {
                            this.listener = listener;
                            this.event = abstractVLCEventOnEventNative;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            this.listener.onEvent(this.event);
                            this.event.release();
                        }
                    });
                }
            } catch (java.lang.Throwable th) {
                th = th;
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            throw th;
        }
    }

    private native void nativeDetachEvents();

    public synchronized void finalize() {
        if (!isReleased()) {
            throw new java.lang.AssertionError("VLCObject (" + getClass().getName() + ") finalized but not natively released (" + this.mNativeRefCount + " refs)");
        }
    }

    public native long getInstance();

    @Override // org.videolan.libvlc.interfaces.IVLCObject
    public org.videolan.libvlc.interfaces.ILibVLC getLibVLC() {
        return this.mILibVLC;
    }

    @Override // org.videolan.libvlc.interfaces.IVLCObject
    public synchronized boolean isReleased() {
        return this.mNativeRefCount == 0;
    }

    public abstract T onEventNative(int i3, long j, long j9, float f9, java.lang.String str);

    public abstract void onReleaseNative();

    @Override // org.videolan.libvlc.interfaces.IVLCObject
    public void release() {
        int i3;
        synchronized (this) {
            try {
                int i9 = this.mNativeRefCount;
                if (i9 == 0) {
                    return;
                }
                if (i9 > 0) {
                    i3 = i9 - 1;
                    this.mNativeRefCount = i3;
                } else {
                    i3 = -1;
                }
                if (i3 == 0) {
                    setEventListener(null);
                }
                if (i3 == 0) {
                    nativeDetachEvents();
                    synchronized (this) {
                        onReleaseNative();
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.videolan.libvlc.interfaces.IVLCObject
    public final synchronized boolean retain() {
        int i3 = this.mNativeRefCount;
        if (i3 <= 0) {
            return false;
        }
        this.mNativeRefCount = i3 + 1;
        return true;
    }

    public synchronized void setEventListener(org.videolan.libvlc.interfaces.AbstractVLCEvent.Listener<T> listener) {
        setEventListener(listener, null);
    }

    public synchronized void setEventListener(org.videolan.libvlc.interfaces.AbstractVLCEvent.Listener<T> listener, android.os.Handler handler) {
        try {
            android.os.Handler handler2 = this.mHandler;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
            }
            this.mEventListener = listener;
            if (listener == null) {
                this.mHandler = null;
            } else if (this.mHandler == null) {
                if (handler == null) {
                    handler = new android.os.Handler(android.os.Looper.getMainLooper());
                }
                this.mHandler = handler;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public VLCObject(org.videolan.libvlc.interfaces.IVLCObject iVLCObject) {
        this.mEventListener = null;
        this.mHandler = null;
        this.mNativeRefCount = 1;
        this.mInstance = 0L;
        this.mILibVLC = iVLCObject.getLibVLC();
    }

    public VLCObject() {
        this.mEventListener = null;
        this.mHandler = null;
        this.mNativeRefCount = 1;
        this.mInstance = 0L;
        this.mILibVLC = null;
    }
}
