package org.videolan.libvlc.interfaces;

/* JADX INFO: loaded from: classes4.dex */
public interface IVLCObject<T extends org.videolan.libvlc.interfaces.AbstractVLCEvent> {
    org.videolan.libvlc.interfaces.ILibVLC getLibVLC();

    boolean isReleased();

    void release();

    boolean retain();
}
