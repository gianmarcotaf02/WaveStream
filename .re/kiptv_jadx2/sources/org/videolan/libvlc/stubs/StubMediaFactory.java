package org.videolan.libvlc.stubs;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileDescriptor;
import org.videolan.libvlc.interfaces.ILibVLC;
import org.videolan.libvlc.interfaces.IMedia;
import org.videolan.libvlc.interfaces.IMediaFactory;

public class StubMediaFactory implements IMediaFactory {
    @Override
    public IMedia getFromAssetFileDescriptor(ILibVLC iLibVLC, AssetFileDescriptor assetFileDescriptor) {
        return new StubMedia(iLibVLC, assetFileDescriptor);
    }

    @Override
    public IMedia getFromFileDescriptor(ILibVLC iLibVLC, FileDescriptor fileDescriptor) {
        return new StubMedia(iLibVLC, fileDescriptor);
    }

    @Override
    public IMedia getFromLocalPath(ILibVLC iLibVLC, String str) {
        return new StubMedia(iLibVLC, str);
    }

    @Override
    public IMedia getFromUri(ILibVLC iLibVLC, Uri uri) {
        return new StubMedia(iLibVLC, uri);
    }
}
