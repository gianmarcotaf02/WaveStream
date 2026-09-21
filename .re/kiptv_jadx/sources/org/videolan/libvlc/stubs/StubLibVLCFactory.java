package org.videolan.libvlc.stubs;

/* JADX INFO: loaded from: classes4.dex */
public class StubLibVLCFactory implements org.videolan.libvlc.interfaces.ILibVLCFactory {
    @Override // org.videolan.libvlc.interfaces.ILibVLCFactory
    public org.videolan.libvlc.interfaces.ILibVLC getFromContext(android.content.Context context) {
        return new org.videolan.libvlc.stubs.StubLibVLC(context);
    }

    @Override // org.videolan.libvlc.interfaces.ILibVLCFactory
    public org.videolan.libvlc.interfaces.ILibVLC getFromOptions(android.content.Context context, java.util.List<java.lang.String> list) {
        return new org.videolan.libvlc.stubs.StubLibVLC(context, list);
    }
}
