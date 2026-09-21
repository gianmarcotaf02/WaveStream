package org.videolan.libvlc.interfaces;

/* JADX INFO: loaded from: classes4.dex */
public interface IMediaFactory extends org.videolan.libvlc.interfaces.IComponentFactory {
    public static final java.lang.String factoryId = "org.videolan.libvlc.interfaces.IMediaFactory";

    org.videolan.libvlc.interfaces.IMedia getFromAssetFileDescriptor(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, android.content.res.AssetFileDescriptor assetFileDescriptor);

    org.videolan.libvlc.interfaces.IMedia getFromFileDescriptor(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, java.io.FileDescriptor fileDescriptor);

    org.videolan.libvlc.interfaces.IMedia getFromLocalPath(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, java.lang.String str);

    org.videolan.libvlc.interfaces.IMedia getFromUri(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, android.net.Uri uri);
}
