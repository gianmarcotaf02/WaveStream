package org.videolan.libvlc.stubs;

/* JADX INFO: loaded from: classes4.dex */
public class StubMediaList extends org.videolan.libvlc.stubs.StubVLCObject<org.videolan.libvlc.interfaces.IMediaList.Event> implements org.videolan.libvlc.interfaces.IMediaList {
    @Override // org.videolan.libvlc.interfaces.IMediaList
    public int getCount() {
        return 0;
    }

    @Override // org.videolan.libvlc.interfaces.IMediaList
    public org.videolan.libvlc.interfaces.IMedia getMediaAt(int i3) {
        return null;
    }

    @Override // org.videolan.libvlc.interfaces.IMediaList
    public boolean isLocked() {
        return false;
    }

    @Override // org.videolan.libvlc.interfaces.IMediaList
    public void setEventListener(org.videolan.libvlc.interfaces.IMediaList.EventListener eventListener, android.os.Handler handler) {
    }
}
