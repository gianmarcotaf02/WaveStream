package org.videolan.libvlc;

/* JADX INFO: loaded from: classes4.dex */
public class MediaList extends org.videolan.libvlc.VLCObject<org.videolan.libvlc.interfaces.IMediaList.Event> implements org.videolan.libvlc.interfaces.IMediaList {
    private static final java.lang.String TAG = "LibVLC/MediaList";
    private int mCount;
    private boolean mLocked;
    private final android.util.SparseArray<org.videolan.libvlc.interfaces.IMedia> mMediaArray;

    public MediaList(org.videolan.libvlc.interfaces.ILibVLC iLibVLC) {
        super(iLibVLC);
        this.mCount = 0;
        this.mMediaArray = new android.util.SparseArray<>();
        this.mLocked = false;
        nativeNewFromLibVlc(iLibVLC);
        init();
    }

    private void init() {
        lock();
        this.mCount = nativeGetCount();
        for (int i3 = 0; i3 < this.mCount; i3++) {
            this.mMediaArray.put(i3, new org.videolan.libvlc.Media(this, i3));
        }
        unlock();
    }

    private synchronized org.videolan.libvlc.interfaces.IMedia insertMediaFromEvent(int i3) {
        org.videolan.libvlc.Media media;
        try {
            for (int i9 = this.mCount - 1; i9 >= i3; i9--) {
                android.util.SparseArray<org.videolan.libvlc.interfaces.IMedia> sparseArray = this.mMediaArray;
                sparseArray.put(i9 + 1, sparseArray.valueAt(i9));
            }
            this.mCount++;
            media = new org.videolan.libvlc.Media(this, i3);
            this.mMediaArray.put(i3, media);
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return media;
    }

    private synchronized void lock() {
        if (this.mLocked) {
            throw new java.lang.IllegalStateException("already locked");
        }
        this.mLocked = true;
        nativeLock();
    }

    private native int nativeGetCount();

    private native void nativeLock();

    private native void nativeNewFromLibVlc(org.videolan.libvlc.interfaces.ILibVLC iLibVLC);

    private native void nativeNewFromMedia(org.videolan.libvlc.interfaces.IMedia iMedia);

    private native void nativeNewFromMediaDiscoverer(org.videolan.libvlc.MediaDiscoverer mediaDiscoverer);

    private native void nativeRelease();

    private native void nativeUnlock();

    private synchronized org.videolan.libvlc.interfaces.IMedia removeMediaFromEvent(int i3) {
        org.videolan.libvlc.interfaces.IMedia iMedia;
        try {
            this.mCount--;
            iMedia = this.mMediaArray.get(i3);
            if (iMedia != null) {
                iMedia.release();
            }
            while (i3 < this.mCount) {
                android.util.SparseArray<org.videolan.libvlc.interfaces.IMedia> sparseArray = this.mMediaArray;
                int i9 = i3 + 1;
                sparseArray.put(i3, sparseArray.valueAt(i9));
                i3 = i9;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return iMedia;
    }

    private synchronized void unlock() {
        if (!this.mLocked) {
            throw new java.lang.IllegalStateException("not locked");
        }
        this.mLocked = false;
        nativeUnlock();
    }

    @Override // org.videolan.libvlc.interfaces.IMediaList
    public synchronized int getCount() {
        return this.mCount;
    }

    @Override // org.videolan.libvlc.VLCObject
    public /* bridge */ /* synthetic */ long getInstance() {
        return super.getInstance();
    }

    @Override // org.videolan.libvlc.VLCObject, org.videolan.libvlc.interfaces.IVLCObject
    public /* bridge */ /* synthetic */ org.videolan.libvlc.interfaces.ILibVLC getLibVLC() {
        return super.getLibVLC();
    }

    @Override // org.videolan.libvlc.interfaces.IMediaList
    public synchronized org.videolan.libvlc.interfaces.IMedia getMediaAt(int i3) {
        org.videolan.libvlc.interfaces.IMedia iMedia;
        if (i3 >= 0) {
            if (i3 < getCount()) {
                iMedia = this.mMediaArray.get(i3);
                iMedia.retain();
            }
        }
        throw new java.lang.IndexOutOfBoundsException();
        return iMedia;
    }

    @Override // org.videolan.libvlc.interfaces.IMediaList
    public synchronized boolean isLocked() {
        return this.mLocked;
    }

    @Override // org.videolan.libvlc.VLCObject, org.videolan.libvlc.interfaces.IVLCObject
    public /* bridge */ /* synthetic */ boolean isReleased() {
        return super.isReleased();
    }

    @Override // org.videolan.libvlc.VLCObject
    public void onReleaseNative() {
        for (int i3 = 0; i3 < this.mMediaArray.size(); i3++) {
            org.videolan.libvlc.interfaces.IMedia iMedia = this.mMediaArray.get(i3);
            if (iMedia != null) {
                iMedia.release();
            }
        }
        nativeRelease();
    }

    @Override // org.videolan.libvlc.interfaces.IMediaList
    public void setEventListener(org.videolan.libvlc.interfaces.IMediaList.EventListener eventListener, android.os.Handler handler) {
        super.setEventListener((org.videolan.libvlc.interfaces.AbstractVLCEvent.Listener) eventListener, handler);
    }

    @Override // org.videolan.libvlc.VLCObject
    public synchronized org.videolan.libvlc.interfaces.IMediaList.Event onEventNative(int i3, long j, long j9, float f9, java.lang.String str) {
        org.videolan.libvlc.interfaces.IMediaList.Event event;
        try {
            if (this.mLocked) {
                throw new java.lang.IllegalStateException("already locked from event callback");
            }
            this.mLocked = true;
            event = null;
            if (i3 == 512) {
                int i9 = (int) j;
                if (i9 != -1) {
                    event = new org.videolan.libvlc.interfaces.IMediaList.Event(i3, insertMediaFromEvent(i9), true, i9);
                }
            } else if (i3 == 514) {
                int i10 = (int) j;
                if (i10 != -1) {
                    event = new org.videolan.libvlc.interfaces.IMediaList.Event(i3, removeMediaFromEvent(i10), false, i10);
                }
            } else if (i3 == 516) {
                event = new org.videolan.libvlc.interfaces.IMediaList.Event(i3, null, false, -1);
            }
            this.mLocked = false;
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return event;
    }

    public MediaList(org.videolan.libvlc.MediaDiscoverer mediaDiscoverer) {
        super(mediaDiscoverer);
        this.mCount = 0;
        this.mMediaArray = new android.util.SparseArray<>();
        this.mLocked = false;
        nativeNewFromMediaDiscoverer(mediaDiscoverer);
        init();
    }

    public MediaList(org.videolan.libvlc.interfaces.IMedia iMedia) {
        super(iMedia);
        this.mCount = 0;
        this.mMediaArray = new android.util.SparseArray<>();
        this.mLocked = false;
        nativeNewFromMedia(iMedia);
        init();
    }
}
