package org.videolan.libvlc;

import android.os.Handler;
import android.os.Looper;
import org.videolan.libvlc.interfaces.AbstractVLCEvent;
import org.videolan.libvlc.interfaces.ILibVLC;
import org.videolan.libvlc.interfaces.IVLCObject;

public abstract class VLCObject<T extends AbstractVLCEvent> implements IVLCObject<T> {
    private AbstractVLCEvent.Listener<T> mEventListener;
    private Handler mHandler;
    final ILibVLC mILibVLC;
    private long mInstance;
    private int mNativeRefCount;

    public VLCObject(ILibVLC iLibVLC) {
        this.mEventListener = null;
        this.mHandler = null;
        this.mNativeRefCount = 1;
        this.mInstance = 0L;
        this.mILibVLC = iLibVLC;
    }

    private synchronized void dispatchEventFromNative(int i3, long j, long j9, float f9, String str) throws Throwable {
        AbstractVLCEvent.Listener<T> listener;
        Handler handler;
        try {
            try {
                if (isReleased()) {
                    return;
                }
                AbstractVLCEvent abstractVLCEventOnEventNative = onEventNative(i3, j, j9, f9, str);
                if (abstractVLCEventOnEventNative != null && (listener = this.mEventListener) != null && (handler = this.mHandler) != null) {
                    handler.post(new Runnable(listener, abstractVLCEventOnEventNative) {
                        private final T event;
                        private final AbstractVLCEvent.Listener<T> listener;

                        {
                            this.listener = listener;
                            this.event = abstractVLCEventOnEventNative;
                        }

                        @Override
                        public void run() {
                            this.listener.onEvent(this.event);
                            this.event.release();
                        }
                    });
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    private native void nativeDetachEvents();

    public synchronized void finalize() {
        if (!isReleased()) {
            throw new AssertionError("VLCObject (" + getClass().getName() + ") finalized but not natively released (" + this.mNativeRefCount + " refs)");
        }
    }

    public native long getInstance();

    @Override
    public ILibVLC getLibVLC() {
        return this.mILibVLC;
    }

    @Override
    public synchronized boolean isReleased() {
        return this.mNativeRefCount == 0;
    }

    public abstract T onEventNative(int i3, long j, long j9, float f9, String str);

    public abstract void onReleaseNative();

    @Override
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
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final synchronized boolean retain() {
        int i3 = this.mNativeRefCount;
        if (i3 <= 0) {
            return false;
        }
        this.mNativeRefCount = i3 + 1;
        return true;
    }

    public synchronized void setEventListener(AbstractVLCEvent.Listener<T> listener) {
        setEventListener(listener, null);
    }

    public synchronized void setEventListener(AbstractVLCEvent.Listener<T> listener, Handler handler) {
        try {
            Handler handler2 = this.mHandler;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
            }
            this.mEventListener = listener;
            if (listener == null) {
                this.mHandler = null;
            } else if (this.mHandler == null) {
                if (handler == null) {
                    handler = new Handler(Looper.getMainLooper());
                }
                this.mHandler = handler;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public VLCObject(IVLCObject iVLCObject) {
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
