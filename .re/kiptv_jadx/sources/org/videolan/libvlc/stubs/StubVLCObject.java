package org.videolan.libvlc.stubs;

/* JADX INFO: loaded from: classes4.dex */
public class StubVLCObject<T extends org.videolan.libvlc.interfaces.AbstractVLCEvent> implements org.videolan.libvlc.interfaces.IVLCObject<T> {
    @Override // org.videolan.libvlc.interfaces.IVLCObject
    public org.videolan.libvlc.interfaces.ILibVLC getLibVLC() {
        return null;
    }

    @Override // org.videolan.libvlc.interfaces.IVLCObject
    public boolean isReleased() {
        return false;
    }

    @Override // org.videolan.libvlc.interfaces.IVLCObject
    public void release() {
    }

    @Override // org.videolan.libvlc.interfaces.IVLCObject
    public boolean retain() {
        return false;
    }
}
