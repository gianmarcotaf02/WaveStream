package org.videolan.libvlc.interfaces;

/* JADX INFO: loaded from: classes4.dex */
public interface ILibVLCFactory extends org.videolan.libvlc.interfaces.IComponentFactory {
    public static final java.lang.String factoryId = "org.videolan.libvlc.interfaces.ILibVLCFactory";

    org.videolan.libvlc.interfaces.ILibVLC getFromContext(android.content.Context context);

    org.videolan.libvlc.interfaces.ILibVLC getFromOptions(android.content.Context context, java.util.List<java.lang.String> list);
}
