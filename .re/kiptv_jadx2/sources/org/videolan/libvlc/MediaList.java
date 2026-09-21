package org.videolan.libvlc;

import android.os.Handler;
import android.util.SparseArray;
import org.videolan.libvlc.interfaces.AbstractVLCEvent;
import org.videolan.libvlc.interfaces.ILibVLC;
import org.videolan.libvlc.interfaces.IMedia;
import org.videolan.libvlc.interfaces.IMediaList;

public class MediaList extends VLCObject<IMediaList.Event> implements IMediaList {
    private static final String TAG = "LibVLC/MediaList";
    private int mCount;
    private boolean mLocked;
    private final SparseArray<IMedia> mMediaArray;

    public MediaList(ILibVLC iLibVLC) {
        super(iLibVLC);
        this.mCount = 0;
        this.mMediaArray = new SparseArray<>();
        this.mLocked = false;
        nativeNewFromLibVlc(iLibVLC);
        init();
    }

    private void init() {
        lock();
        this.mCount = nativeGetCount();
        for (int i3 = 0; i3 < this.mCount; i3++) {
            this.mMediaArray.put(i3, new Media(this, i3));
        }
        unlock();
    }

    private synchronized IMedia insertMediaFromEvent(int i3) {
        Media media;
        try {
            for (int i9 = this.mCount - 1; i9 >= i3; i9--) {
                SparseArray<IMedia> sparseArray = this.mMediaArray;
                sparseArray.put(i9 + 1, sparseArray.valueAt(i9));
            }
            this.mCount++;
            media = new Media(this, i3);
            this.mMediaArray.put(i3, media);
        } catch (Throwable th) {
            throw th;
        }
        return media;
    }

    private synchronized void lock() {
        if (this.mLocked) {
            throw new IllegalStateException("already locked");
        }
        this.mLocked = true;
        nativeLock();
    }

    private native int nativeGetCount();

    private native void nativeLock();

    private native void nativeNewFromLibVlc(ILibVLC iLibVLC);

    private native void nativeNewFromMedia(IMedia iMedia);

    private native void nativeNewFromMediaDiscoverer(MediaDiscoverer mediaDiscoverer);

    private native void nativeRelease();

    private native void nativeUnlock();

    private synchronized IMedia removeMediaFromEvent(int i3) {
        IMedia iMedia;
        try {
            this.mCount--;
            iMedia = this.mMediaArray.get(i3);
            if (iMedia != null) {
                iMedia.release();
            }
            while (i3 < this.mCount) {
                SparseArray<IMedia> sparseArray = this.mMediaArray;
                int i9 = i3 + 1;
                sparseArray.put(i3, sparseArray.valueAt(i9));
                i3 = i9;
            }
        } catch (Throwable th) {
            throw th;
        }
        return iMedia;
    }

    private synchronized void unlock() {
        if (!this.mLocked) {
            throw new IllegalStateException("not locked");
        }
        this.mLocked = false;
        nativeUnlock();
    }

    @Override
    public synchronized int getCount() {
        return this.mCount;
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
    public synchronized IMedia getMediaAt(int i3) {
        IMedia iMedia;
        if (i3 >= 0) {
            if (i3 < getCount()) {
                iMedia = this.mMediaArray.get(i3);
                iMedia.retain();
            }
        }
        throw new IndexOutOfBoundsException();
        return iMedia;
    }

    @Override
    public synchronized boolean isLocked() {
        return this.mLocked;
    }

    @Override
    public boolean isReleased() {
        return super.isReleased();
    }

    @Override
    public void onReleaseNative() {
        for (int i3 = 0; i3 < this.mMediaArray.size(); i3++) {
            IMedia iMedia = this.mMediaArray.get(i3);
            if (iMedia != null) {
                iMedia.release();
            }
        }
        nativeRelease();
    }

    @Override
    public void setEventListener(IMediaList.EventListener eventListener, Handler handler) {
        super.setEventListener((AbstractVLCEvent.Listener) eventListener, handler);
    }

    @Override
    public synchronized IMediaList.Event onEventNative(int i3, long j, long j9, float f9, String str) {
        IMediaList.Event event;
        try {
            if (this.mLocked) {
                throw new IllegalStateException("already locked from event callback");
            }
            this.mLocked = true;
            event = null;
            if (i3 == 512) {
                int i9 = (int) j;
                if (i9 != -1) {
                    event = new IMediaList.Event(i3, insertMediaFromEvent(i9), true, i9);
                }
            } else if (i3 == 514) {
                int i10 = (int) j;
                if (i10 != -1) {
                    event = new IMediaList.Event(i3, removeMediaFromEvent(i10), false, i10);
                }
            } else if (i3 == 516) {
                event = new IMediaList.Event(i3, null, false, -1);
            }
            this.mLocked = false;
        } catch (Throwable th) {
            throw th;
        }
        return event;
    }

    public MediaList(MediaDiscoverer mediaDiscoverer) {
        super(mediaDiscoverer);
        this.mCount = 0;
        this.mMediaArray = new SparseArray<>();
        this.mLocked = false;
        nativeNewFromMediaDiscoverer(mediaDiscoverer);
        init();
    }

    public MediaList(IMedia iMedia) {
        super(iMedia);
        this.mCount = 0;
        this.mMediaArray = new SparseArray<>();
        this.mLocked = false;
        nativeNewFromMedia(iMedia);
        init();
    }
}
