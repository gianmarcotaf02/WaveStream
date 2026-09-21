package org.videolan.libvlc.stubs;

/* JADX INFO: loaded from: classes4.dex */
public class StubLibVLC extends org.videolan.libvlc.stubs.StubVLCObject<org.videolan.libvlc.interfaces.ILibVLC.Event> implements org.videolan.libvlc.interfaces.ILibVLC {
    private final android.content.Context mContext;

    public StubLibVLC(android.content.Context context, java.util.List<java.lang.String> list) {
        this.mContext = context;
    }

    @Override // org.videolan.libvlc.interfaces.ILibVLC
    public android.content.Context getAppContext() {
        return this.mContext;
    }

    public StubLibVLC(android.content.Context context) {
        this(context, null);
    }
}
