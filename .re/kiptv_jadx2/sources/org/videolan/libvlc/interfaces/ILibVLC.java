package org.videolan.libvlc.interfaces;

import android.content.Context;

public interface ILibVLC extends IVLCObject<Event> {

    public static class Event extends AbstractVLCEvent {
        public Event(int i3) {
            super(i3);
        }
    }

    Context getAppContext();
}
