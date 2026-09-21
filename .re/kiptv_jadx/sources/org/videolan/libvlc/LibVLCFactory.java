package org.videolan.libvlc;

/* JADX INFO: loaded from: classes4.dex */
public class LibVLCFactory implements org.videolan.libvlc.interfaces.ILibVLCFactory {
    static {
        org.videolan.libvlc.FactoryManager.registerFactory(org.videolan.libvlc.interfaces.ILibVLCFactory.factoryId, new org.videolan.libvlc.LibVLCFactory());
    }

    @Override // org.videolan.libvlc.interfaces.ILibVLCFactory
    public org.videolan.libvlc.interfaces.ILibVLC getFromContext(android.content.Context context) {
        return new org.videolan.libvlc.LibVLC(context, null);
    }

    @Override // org.videolan.libvlc.interfaces.ILibVLCFactory
    public org.videolan.libvlc.interfaces.ILibVLC getFromOptions(android.content.Context context, java.util.List<java.lang.String> list) {
        return new org.videolan.libvlc.LibVLC(context, list);
    }
}
