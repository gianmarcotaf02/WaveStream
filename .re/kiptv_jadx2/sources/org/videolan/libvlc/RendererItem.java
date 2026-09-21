package org.videolan.libvlc;

import org.videolan.libvlc.interfaces.AbstractVLCEvent;
import org.videolan.libvlc.interfaces.ILibVLC;

public class RendererItem extends VLCObject<Event> {
    public static final int LIBVLC_RENDERER_CAN_AUDIO = 1;
    public static final int LIBVLC_RENDERER_CAN_VIDEO = 2;
    public final String displayName;
    final int flags;
    final String iconUrl;
    public final String name;
    private final long ref;
    public final String type;

    public static class Event extends AbstractVLCEvent {
        public Event(int i3) {
            super(i3);
        }
    }

    public RendererItem(String str, String str2, String str3, int i3, long j) {
        int iLastIndexOf = str.lastIndexOf(45);
        this.name = str;
        this.displayName = iLastIndexOf != -1 ? str.replace('-', ' ') : str;
        this.type = str2;
        this.iconUrl = str3;
        this.flags = i3;
        this.ref = j;
    }

    private native void nativeReleaseItem();

    public boolean equals(Object obj) {
        return (obj instanceof RendererItem) && this.ref == ((RendererItem) obj).ref;
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
    public boolean isReleased() {
        return super.isReleased();
    }

    @Override
    public void onReleaseNative() {
        nativeReleaseItem();
    }

    @Override
    public Event onEventNative(int i3, long j, long j9, float f9, String str) {
        return new Event(i3);
    }
}
