package org.videolan.libvlc;

import org.videolan.libvlc.interfaces.AbstractVLCEvent;
import org.videolan.libvlc.interfaces.ILibVLC;

public class MediaDiscoverer extends VLCObject<Event> {
    private static final String TAG = "LibVLC/MediaDiscoverer";
    private MediaList mMediaList;

    public static class Description {
        public final int category;
        public final String longName;
        public final String name;

        public static class Category {
            public static final int Devices = 0;
            public static final int Lan = 1;
            public static final int LocalDirs = 3;
            public static final int Podcasts = 2;
        }

        private Description(String str, String str2, int i3) {
            this.name = str;
            this.longName = str2;
            this.category = i3;
        }
    }

    public static class Event extends AbstractVLCEvent {
        public static final int Ended = 1281;
        public static final int Started = 1280;

        public Event(int i3) {
            super(i3);
        }
    }

    public interface EventListener extends AbstractVLCEvent.Listener<Event> {
    }

    public MediaDiscoverer(ILibVLC iLibVLC, String str) {
        super(iLibVLC);
        this.mMediaList = null;
        nativeNew(iLibVLC, str);
    }

    private static Description createDescriptionFromNative(String str, String str2, int i3) {
        return new Description(str, str2, i3);
    }

    public static Description[] list(ILibVLC iLibVLC, int i3) {
        return nativeList(iLibVLC, i3);
    }

    private static native Description[] nativeList(ILibVLC iLibVLC, int i3);

    private native void nativeNew(ILibVLC iLibVLC, String str);

    private native void nativeRelease();

    private native boolean nativeStart();

    private native void nativeStop();

    @Override
    public long getInstance() {
        return super.getInstance();
    }

    @Override
    public ILibVLC getLibVLC() {
        return super.getLibVLC();
    }

    public MediaList getMediaList() {
        MediaList mediaList;
        synchronized (this) {
            try {
                MediaList mediaList2 = this.mMediaList;
                if (mediaList2 != null) {
                    mediaList2.retain();
                    return this.mMediaList;
                }
                MediaList mediaList3 = new MediaList(this);
                synchronized (this) {
                    this.mMediaList = mediaList3;
                    mediaList3.retain();
                    mediaList = this.mMediaList;
                }
                return mediaList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public boolean isReleased() {
        return super.isReleased();
    }

    @Override
    public void onReleaseNative() {
        MediaList mediaList = this.mMediaList;
        if (mediaList != null) {
            mediaList.release();
        }
        nativeRelease();
    }

    public void setEventListener(EventListener eventListener) {
        super.setEventListener((AbstractVLCEvent.Listener) eventListener);
    }

    public boolean start() {
        if (isReleased()) {
            throw new IllegalStateException("MediaDiscoverer is released");
        }
        return nativeStart();
    }

    public void stop() {
        if (isReleased()) {
            throw new IllegalStateException("MediaDiscoverer is released");
        }
        nativeStop();
    }

    @Override
    public Event onEventNative(int i3, long j, long j9, float f9, String str) {
        if (i3 == 1280 || i3 == 1281) {
            return new Event(i3);
        }
        return null;
    }
}
