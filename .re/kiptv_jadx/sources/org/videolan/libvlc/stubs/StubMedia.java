package org.videolan.libvlc.stubs;

/* JADX INFO: loaded from: classes4.dex */
public class StubMedia extends org.videolan.libvlc.stubs.StubVLCObject<org.videolan.libvlc.interfaces.IMedia.Event> implements org.videolan.libvlc.interfaces.IMedia {
    private org.videolan.libvlc.interfaces.ILibVLC mILibVLC;
    private int mType;
    private android.net.Uri mUri;

    public StubMedia(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, java.lang.String str) {
        this(iLibVLC, android.net.Uri.parse(str));
    }

    private java.lang.String getTitle() {
        return "file".equals(this.mUri.getScheme()) ? this.mUri.getLastPathSegment() : this.mUri.getPath();
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public void addOption(java.lang.String str) {
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public void addSlave(org.videolan.libvlc.interfaces.IMedia.Slave slave) {
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public void clearSlaves() {
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public long getDuration() {
        return 0L;
    }

    @Override // org.videolan.libvlc.stubs.StubVLCObject, org.videolan.libvlc.interfaces.IVLCObject
    public org.videolan.libvlc.interfaces.ILibVLC getLibVLC() {
        return this.mILibVLC;
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public java.lang.String getMeta(int i3) {
        android.net.Uri uri = this.mUri;
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

    @Override // org.videolan.libvlc.interfaces.IMedia
    public org.videolan.libvlc.interfaces.IMedia.Slave[] getSlaves() {
        return new org.videolan.libvlc.interfaces.IMedia.Slave[0];
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public org.videolan.libvlc.interfaces.IMedia.Stats getStats() {
        return null;
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public org.videolan.libvlc.interfaces.IMedia.Track[] getTracks() {
        return null;
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public int getType() {
        return this.mType;
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public android.net.Uri getUri() {
        return this.mUri;
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public boolean isParsed() {
        return false;
    }

    @Override // org.videolan.libvlc.stubs.StubVLCObject, org.videolan.libvlc.interfaces.IVLCObject
    public boolean isReleased() {
        return false;
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public boolean parse() {
        return false;
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public boolean parseAsync() {
        return false;
    }

    @Override // org.videolan.libvlc.stubs.StubVLCObject, org.videolan.libvlc.interfaces.IVLCObject
    public void release() {
    }

    @Override // org.videolan.libvlc.stubs.StubVLCObject, org.videolan.libvlc.interfaces.IVLCObject
    public boolean retain() {
        return false;
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public void setDefaultMediaPlayerOptions() {
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public void setEventListener(org.videolan.libvlc.interfaces.IMedia.EventListener eventListener) {
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public void setHWDecoderEnabled(boolean z6, boolean z9) {
    }

    public void setType(int i3) {
        this.mType = i3;
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public org.videolan.libvlc.interfaces.IMediaList subItems() {
        return new org.videolan.libvlc.stubs.StubMediaList();
    }

    public StubMedia(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, android.net.Uri uri) {
        this.mType = 0;
        this.mUri = uri;
        this.mILibVLC = iLibVLC;
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public org.videolan.libvlc.interfaces.IMedia.Track[] getTracks(int i3) {
        return null;
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public boolean parse(int i3) {
        return false;
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public boolean parseAsync(int i3) {
        return false;
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public boolean parseAsync(int i3, int i9) {
        return false;
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public java.lang.String getMeta(int i3, boolean z6) {
        return getMeta(i3);
    }

    public StubMedia(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, java.io.FileDescriptor fileDescriptor) {
        this.mType = 0;
        this.mILibVLC = iLibVLC;
    }

    public StubMedia(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, android.content.res.AssetFileDescriptor assetFileDescriptor) {
        this.mType = 0;
        this.mILibVLC = iLibVLC;
    }
}
