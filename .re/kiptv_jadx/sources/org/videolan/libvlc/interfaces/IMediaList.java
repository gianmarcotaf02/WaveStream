package org.videolan.libvlc.interfaces;

/* JADX INFO: loaded from: classes4.dex */
public interface IMediaList extends org.videolan.libvlc.interfaces.IVLCObject<org.videolan.libvlc.interfaces.IMediaList.Event> {

    public static class Event extends org.videolan.libvlc.interfaces.AbstractVLCEvent {
        public static final int EndReached = 516;
        public static final int ItemAdded = 512;
        public static final int ItemDeleted = 514;
        public final int index;
        public final org.videolan.libvlc.interfaces.IMedia media;
        private final boolean retain;

        public Event(int i3, org.videolan.libvlc.interfaces.IMedia iMedia, boolean z6, int i9) {
            super(i3);
            if (z6 && (iMedia == null || !iMedia.retain())) {
                throw new java.lang.IllegalStateException("invalid media reference");
            }
            this.media = iMedia;
            this.retain = z6;
            this.index = i9;
        }

        @Override // org.videolan.libvlc.interfaces.AbstractVLCEvent
        public void release() {
            if (this.retain) {
                this.media.release();
            }
        }
    }

    public interface EventListener extends org.videolan.libvlc.interfaces.AbstractVLCEvent.Listener<org.videolan.libvlc.interfaces.IMediaList.Event> {
    }

    int getCount();

    org.videolan.libvlc.interfaces.IMedia getMediaAt(int i3);

    boolean isLocked();

    void setEventListener(org.videolan.libvlc.interfaces.IMediaList.EventListener eventListener, android.os.Handler handler);
}
