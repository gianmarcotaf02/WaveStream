package org.videolan.libvlc.stubs;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileDescriptor;
import org.videolan.libvlc.interfaces.ILibVLC;
import org.videolan.libvlc.interfaces.IMedia;
import org.videolan.libvlc.interfaces.IMediaList;

public class StubMedia extends StubVLCObject<IMedia.Event> implements IMedia {
    private ILibVLC mILibVLC;
    private int mType;
    private Uri mUri;

    public StubMedia(ILibVLC iLibVLC, String str) {
        this(iLibVLC, Uri.parse(str));
    }

    private String getTitle() {
        return "file".equals(this.mUri.getScheme()) ? this.mUri.getLastPathSegment() : this.mUri.getPath();
    }

    @Override
    public void addOption(String str) {
    }

    @Override
    public void addSlave(IMedia.Slave slave) {
    }

    @Override
    public void clearSlaves() {
    }

    @Override
    public long getDuration() {
        return 0L;
    }

    @Override
    public ILibVLC getLibVLC() {
        return this.mILibVLC;
    }

    @Override
    public String getMeta(int i3) {
        Uri uri = this.mUri;
        if (uri == null) {
            return null;
        }
        if (i3 == 0) {
            return getTitle();
        }
        if (i3 != 10) {
            return null;
        }
        return uri.getPath();
    }

    @Override
    public IMedia.Slave[] getSlaves() {
        return new IMedia.Slave[0];
    }

    @Override
    public IMedia.Stats getStats() {
        return null;
    }

    @Override
    public IMedia.Track[] getTracks() {
        return null;
    }

    @Override
    public int getType() {
        return this.mType;
    }

    @Override
    public Uri getUri() {
        return this.mUri;
    }

    @Override
    public boolean isParsed() {
        return false;
    }

    @Override
    public boolean isReleased() {
        return false;
    }

    @Override
    public boolean parse() {
        return false;
    }

    @Override
    public boolean parseAsync() {
        return false;
    }

    @Override
    public void release() {
    }

    @Override
    public boolean retain() {
        return false;
    }

    @Override
    public void setDefaultMediaPlayerOptions() {
    }

    @Override
    public void setEventListener(IMedia.EventListener eventListener) {
    }

    @Override
    public void setHWDecoderEnabled(boolean z6, boolean z9) {
    }

    public void setType(int i3) {
        this.mType = i3;
    }

    @Override
    public IMediaList subItems() {
        return new StubMediaList();
    }

    public StubMedia(ILibVLC iLibVLC, Uri uri) {
        this.mType = 0;
        this.mUri = uri;
        this.mILibVLC = iLibVLC;
    }

    @Override
    public IMedia.Track[] getTracks(int i3) {
        return null;
    }

    @Override
    public boolean parse(int i3) {
        return false;
    }

    @Override
    public boolean parseAsync(int i3) {
        return false;
    }

    @Override
    public boolean parseAsync(int i3, int i9) {
        return false;
    }

    @Override
    public String getMeta(int i3, boolean z6) {
        return getMeta(i3);
    }

    public StubMedia(ILibVLC iLibVLC, FileDescriptor fileDescriptor) {
        this.mType = 0;
        this.mILibVLC = iLibVLC;
    }

    public StubMedia(ILibVLC iLibVLC, AssetFileDescriptor assetFileDescriptor) {
        this.mType = 0;
        this.mILibVLC = iLibVLC;
    }
}
