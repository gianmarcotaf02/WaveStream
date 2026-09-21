package org.videolan.libvlc.interfaces;

public abstract class AbstractVLCEvent {
    protected final long arg1;
    protected final long arg2;
    protected final float argf1;
    protected final String args1;
    public final int type;

    public interface Listener<T extends AbstractVLCEvent> {
        void onEvent(T t9);
    }

    public AbstractVLCEvent(int i3) {
        this.type = i3;
        this.arg2 = 0L;
        this.arg1 = 0L;
        this.argf1 = 0.0f;
        this.args1 = null;
    }

    public void release() {
    }

    public AbstractVLCEvent(int i3, long j) {
        this.type = i3;
        this.arg1 = j;
        this.arg2 = 0L;
        this.argf1 = 0.0f;
        this.args1 = null;
    }

    public AbstractVLCEvent(int i3, long j, long j9) {
        this.type = i3;
        this.arg1 = j;
        this.arg2 = j9;
        this.argf1 = 0.0f;
        this.args1 = null;
    }

    public AbstractVLCEvent(int i3, float f9) {
        this.type = i3;
        this.arg2 = 0L;
        this.arg1 = 0L;
        this.argf1 = f9;
        this.args1 = null;
    }

    public AbstractVLCEvent(int i3, long j, String str) {
        this.type = i3;
        this.arg1 = j;
        this.arg2 = 0L;
        this.argf1 = 0.0f;
        this.args1 = str;
    }
}
