package org.videolan.libvlc;

/* JADX INFO: loaded from: classes4.dex */
public class RendererItem extends org.videolan.libvlc.VLCObject<org.videolan.libvlc.RendererItem.Event> {
    public static final int LIBVLC_RENDERER_CAN_AUDIO = 1;
    public static final int LIBVLC_RENDERER_CAN_VIDEO = 2;
    public final java.lang.String displayName;
    final int flags;
    final java.lang.String iconUrl;
    public final java.lang.String name;
    private final long ref;
    public final java.lang.String type;

    public static class Event extends org.videolan.libvlc.interfaces.AbstractVLCEvent {
        public Event(int i3) {
            super(i3);
        }
    }

    public RendererItem(java.lang.String str, java.lang.String str2, java.lang.String str3, int i3, long j) {
        int iLastIndexOf = str.lastIndexOf(45);
        this.name = str;
        this.displayName = iLastIndexOf != -1 ? str.replace('-', ' ') : str;
        this.type = str2;
        this.iconUrl = str3;
        this.flags = i3;
        this.ref = j;
    }

    private native void nativeReleaseItem();

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof org.videolan.libvlc.RendererItem) && this.ref == ((org.videolan.libvlc.RendererItem) obj).ref;
    }

    @Override // org.videolan.libvlc.VLCObject
    public /* bridge */ /* synthetic */ long getInstance() {
        return super.getInstance();
    }

    @Override // org.videolan.libvlc.VLCObject, org.videolan.libvlc.interfaces.IVLCObject
    public /* bridge */ /* synthetic */ org.videolan.libvlc.interfaces.ILibVLC getLibVLC() {
        return super.getLibVLC();
    }

    @Override // org.videolan.libvlc.VLCObject, org.videolan.libvlc.interfaces.IVLCObject
    public /* bridge */ /* synthetic */ boolean isReleased() {
        return super.isReleased();
    }

    @Override // org.videolan.libvlc.VLCObject
    public void onReleaseNative() {
        nativeReleaseItem();
    }

    @Override // org.videolan.libvlc.VLCObject
    public org.videolan.libvlc.RendererItem.Event onEventNative(int i3, long j, long j9, float f9, java.lang.String str) {
        return new org.videolan.libvlc.RendererItem.Event(i3);
    }
}
