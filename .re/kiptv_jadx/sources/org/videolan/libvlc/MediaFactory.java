package org.videolan.libvlc;

/* JADX INFO: loaded from: classes4.dex */
public class MediaFactory implements org.videolan.libvlc.interfaces.IMediaFactory {
    @Override // org.videolan.libvlc.interfaces.IMediaFactory
    public org.videolan.libvlc.interfaces.IMedia getFromAssetFileDescriptor(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, android.content.res.AssetFileDescriptor assetFileDescriptor) {
        return new org.videolan.libvlc.Media(iLibVLC, assetFileDescriptor);
    }

    @Override // org.videolan.libvlc.interfaces.IMediaFactory
    public org.videolan.libvlc.interfaces.IMedia getFromFileDescriptor(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, java.io.FileDescriptor fileDescriptor) {
        return new org.videolan.libvlc.Media(iLibVLC, fileDescriptor);
    }

    @Override // org.videolan.libvlc.interfaces.IMediaFactory
    public org.videolan.libvlc.interfaces.IMedia getFromLocalPath(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, java.lang.String str) {
        return new org.videolan.libvlc.Media(iLibVLC, str);
    }

    @Override // org.videolan.libvlc.interfaces.IMediaFactory
    public org.videolan.libvlc.interfaces.IMedia getFromUri(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, android.net.Uri uri) {
        return new org.videolan.libvlc.Media(iLibVLC, uri);
    }
}
