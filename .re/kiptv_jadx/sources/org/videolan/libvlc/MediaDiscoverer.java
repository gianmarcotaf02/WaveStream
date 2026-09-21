package org.videolan.libvlc;

/* JADX INFO: loaded from: classes4.dex */
public class MediaDiscoverer extends org.videolan.libvlc.VLCObject<org.videolan.libvlc.MediaDiscoverer.Event> {
    private static final java.lang.String TAG = "LibVLC/MediaDiscoverer";
    private org.videolan.libvlc.MediaList mMediaList;

    public static class Description {
        public final int category;
        public final java.lang.String longName;
        public final java.lang.String name;

        public static class Category {
            public static final int Devices = 0;
            public static final int Lan = 1;
            public static final int LocalDirs = 3;
            public static final int Podcasts = 2;
        }

        private Description(java.lang.String str, java.lang.String str2, int i3) {
            this.name = str;
            this.longName = str2;
            this.category = i3;
        }
    }

    public static class Event extends org.videolan.libvlc.interfaces.AbstractVLCEvent {
        public static final int Ended = 1281;
        public static final int Started = 1280;

        public Event(int i3) {
            super(i3);
        }
    }

    public interface EventListener extends org.videolan.libvlc.interfaces.AbstractVLCEvent.Listener<org.videolan.libvlc.MediaDiscoverer.Event> {
    }

    public MediaDiscoverer(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, java.lang.String str) {
        super(iLibVLC);
        this.mMediaList = null;
        nativeNew(iLibVLC, str);
    }

    private static org.videolan.libvlc.MediaDiscoverer.Description createDescriptionFromNative(java.lang.String str, java.lang.String str2, int i3) {
        return new org.videolan.libvlc.MediaDiscoverer.Description(str, str2, i3);
    }

    public static org.videolan.libvlc.MediaDiscoverer.Description[] list(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, int i3) {
        return nativeList(iLibVLC, i3);
    }

    private static native org.videolan.libvlc.MediaDiscoverer.Description[] nativeList(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, int i3);

    private native void nativeNew(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, java.lang.String str);

    private native void nativeRelease();

    private native boolean nativeStart();

    private native void nativeStop();

    @Override // org.videolan.libvlc.VLCObject
    public /* bridge */ /* synthetic */ long getInstance() {
        return super.getInstance();
    }

    @Override // org.videolan.libvlc.VLCObject, org.videolan.libvlc.interfaces.IVLCObject
    public /* bridge */ /* synthetic */ org.videolan.libvlc.interfaces.ILibVLC getLibVLC() {
        return super.getLibVLC();
    }

    public org.videolan.libvlc.MediaList getMediaList() {
        org.videolan.libvlc.MediaList mediaList;
        synchronized (this) {
            try {
                org.videolan.libvlc.MediaList mediaList2 = this.mMediaList;
                if (mediaList2 != null) {
                    mediaList2.retain();
                    return this.mMediaList;
                }
                org.videolan.libvlc.MediaList mediaList3 = new org.videolan.libvlc.MediaList(this);
                synchronized (this) {
                    this.mMediaList = mediaList3;
                    mediaList3.retain();
                    mediaList = this.mMediaList;
                }
                return mediaList;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.videolan.libvlc.VLCObject, org.videolan.libvlc.interfaces.IVLCObject
    public /* bridge */ /* synthetic */ boolean isReleased() {
        return super.isReleased();
    }

    @Override // org.videolan.libvlc.VLCObject
    public void onReleaseNative() {
        org.videolan.libvlc.MediaList mediaList = this.mMediaList;
        if (mediaList != null) {
            mediaList.release();
        }
        nativeRelease();
    }

    public void setEventListener(org.videolan.libvlc.MediaDiscoverer.EventListener eventListener) {
        super.setEventListener((org.videolan.libvlc.interfaces.AbstractVLCEvent.Listener) eventListener);
    }

    public boolean start() {
        if (isReleased()) {
            throw new java.lang.IllegalStateException("MediaDiscoverer is released");
        }
        return nativeStart();
    }

    public void stop() {
        if (isReleased()) {
            throw new java.lang.IllegalStateException("MediaDiscoverer is released");
        }
        nativeStop();
    }

    @Override // org.videolan.libvlc.VLCObject
    public org.videolan.libvlc.MediaDiscoverer.Event onEventNative(int i3, long j, long j9, float f9, java.lang.String str) {
        if (i3 == 1280 || i3 == 1281) {
            return new org.videolan.libvlc.MediaDiscoverer.Event(i3);
        }
        return null;
    }
}
