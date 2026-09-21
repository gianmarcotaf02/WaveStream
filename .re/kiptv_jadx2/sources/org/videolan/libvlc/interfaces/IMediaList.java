package org.videolan.libvlc.interfaces;

import android.os.Handler;

public interface IMediaList extends IVLCObject<Event> {

    public static class Event extends AbstractVLCEvent {
        public static final int EndReached = 516;
        public static final int ItemAdded = 512;
        public static final int ItemDeleted = 514;
        public final int index;
        public final IMedia media;
        private final boolean retain;

        public Event(int i3, IMedia iMedia, boolean z6, int i9) {
            super(i3);
            if (z6 && (iMedia == null || !iMedia.retain())) {
                throw new IllegalStateException("invalid media reference");
            }
            this.media = iMedia;
            this.retain = z6;
            this.index = i9;
        }

        @Override
        public void release() {
            if (this.retain) {
                this.media.release();
            }
        }
    }

    public interface EventListener extends AbstractVLCEvent.Listener<Event> {
    }

    int getCount();

    IMedia getMediaAt(int i3);

    boolean isLocked();

    void setEventListener(EventListener eventListener, Handler handler);
}
