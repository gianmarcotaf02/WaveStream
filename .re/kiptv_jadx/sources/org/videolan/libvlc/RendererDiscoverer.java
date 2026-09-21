package org.videolan.libvlc;

/* JADX INFO: loaded from: classes4.dex */
public class RendererDiscoverer extends org.videolan.libvlc.VLCObject<org.videolan.libvlc.RendererDiscoverer.Event> {
    private static final java.lang.String TAG = "LibVLC/RendererDiscoverer";
    private final p136q.r index;
    final java.util.List<org.videolan.libvlc.RendererItem> mRenderers;

    public static class Description {
        final java.lang.String longName;
        public final java.lang.String name;

        private Description(java.lang.String str, java.lang.String str2) {
            this.name = str;
            this.longName = str2;
        }
    }

    public static class Event extends org.videolan.libvlc.interfaces.AbstractVLCEvent {
        public static final int ItemAdded = 1282;
        public static final int ItemDeleted = 1283;
        private final org.videolan.libvlc.RendererItem item;

        public Event(int i3, long j, org.videolan.libvlc.RendererItem rendererItem) {
            super(i3, j);
            this.item = rendererItem;
            rendererItem.retain();
        }

        public org.videolan.libvlc.RendererItem getItem() {
            return this.item;
        }

        @Override // org.videolan.libvlc.interfaces.AbstractVLCEvent
        public void release() {
            this.item.release();
            super.release();
        }
    }

    public interface EventListener extends org.videolan.libvlc.interfaces.AbstractVLCEvent.Listener<org.videolan.libvlc.RendererDiscoverer.Event> {
    }

    public RendererDiscoverer(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, java.lang.String str) {
        super(iLibVLC);
        this.mRenderers = new java.util.ArrayList();
        this.index = new p136q.r((java.lang.Object) null);
        nativeNew(iLibVLC, str);
    }

    private static org.videolan.libvlc.RendererDiscoverer.Description createDescriptionFromNative(java.lang.String str, java.lang.String str2) {
        return new org.videolan.libvlc.RendererDiscoverer.Description(str, str2);
    }

    private static org.videolan.libvlc.RendererItem createItemFromNative(java.lang.String str, java.lang.String str2, java.lang.String str3, int i3, long j) {
        return new org.videolan.libvlc.RendererItem(str, str2, str3, i3, j);
    }

    private synchronized org.videolan.libvlc.RendererItem insertItemFromEvent(long j) {
        org.videolan.libvlc.RendererItem rendererItemNativeNewItem;
        rendererItemNativeNewItem = nativeNewItem(j);
        this.index.d(j, rendererItemNativeNewItem);
        this.mRenderers.add(rendererItemNativeNewItem);
        return rendererItemNativeNewItem;
    }

    public static org.videolan.libvlc.RendererDiscoverer.Description[] list(org.videolan.libvlc.interfaces.ILibVLC iLibVLC) {
        return nativeList(iLibVLC);
    }

    private static native org.videolan.libvlc.RendererDiscoverer.Description[] nativeList(org.videolan.libvlc.interfaces.ILibVLC iLibVLC);

    private native void nativeNew(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, java.lang.String str);

    private native org.videolan.libvlc.RendererItem nativeNewItem(long j);

    private native void nativeRelease();

    private native boolean nativeStart();

    private native void nativeStop();

    private synchronized org.videolan.libvlc.RendererItem removeItemFromEvent(long j) {
        org.videolan.libvlc.RendererItem rendererItem;
        rendererItem = (org.videolan.libvlc.RendererItem) this.index.b(j);
        if (rendererItem != null) {
            this.index.e(j);
            this.mRenderers.remove(rendererItem);
            rendererItem.release();
        }
        return rendererItem;
    }

    @Override // org.videolan.libvlc.VLCObject
    public /* bridge */ /* synthetic */ long getInstance() {
        return super.getInstance();
    }

    @Override // org.videolan.libvlc.VLCObject, org.videolan.libvlc.interfaces.IVLCObject
    public /* bridge */ /* synthetic */ org.videolan.libvlc.interfaces.ILibVLC getLibVLC() {
        return super.getLibVLC();
    }

    @Override // org.videolan.libvlc.VLCObject, org.videolan.libvlc.interfaces.IVLCObject
    public /* bridge */ /* synthetic */ boolean isReleased() {
        return super.isReleased();
    }

    @Override // org.videolan.libvlc.VLCObject
    public void onReleaseNative() {
        java.util.Iterator<org.videolan.libvlc.RendererItem> it = this.mRenderers.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        this.mRenderers.clear();
        nativeRelease();
    }

    public void setEventListener(org.videolan.libvlc.RendererDiscoverer.EventListener eventListener) {
        super.setEventListener((org.videolan.libvlc.interfaces.AbstractVLCEvent.Listener) eventListener);
    }

    public boolean start() {
        if (isReleased()) {
            throw new java.lang.IllegalStateException("MediaDiscoverer is released");
        }
        return nativeStart();
    }

    public void stop() {
        if (isReleased()) {
            throw new java.lang.IllegalStateException("MediaDiscoverer is released");
        }
        setEventListener((org.videolan.libvlc.RendererDiscoverer.EventListener) null);
        nativeStop();
        release();
    }

    @Override // org.videolan.libvlc.VLCObject
    public org.videolan.libvlc.RendererDiscoverer.Event onEventNative(int i3, long j, long j9, float f9, java.lang.String str) {
        if (i3 == 1282) {
            return new org.videolan.libvlc.RendererDiscoverer.Event(i3, j, insertItemFromEvent(j));
        }
        if (i3 != 1283) {
            return null;
        }
        return new org.videolan.libvlc.RendererDiscoverer.Event(i3, j, removeItemFromEvent(j));
    }
}
