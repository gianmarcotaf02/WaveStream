package org.videolan.libvlc.interfaces;

/* JADX INFO: loaded from: classes4.dex */
public interface ILibVLC extends org.videolan.libvlc.interfaces.IVLCObject<org.videolan.libvlc.interfaces.ILibVLC.Event> {

    public static class Event extends org.videolan.libvlc.interfaces.AbstractVLCEvent {
        public Event(int i3) {
            super(i3);
        }
    }

    android.content.Context getAppContext();
}
