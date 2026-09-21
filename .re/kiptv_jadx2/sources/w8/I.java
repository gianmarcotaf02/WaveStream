package w8;

import M8.C0685m;

public abstract class I {
    public abstract void onClosed(H h9, int i3, String str);

    public abstract void onClosing(H h9, int i3, String str);

    public abstract void onFailure(H h9, Throwable th, B b9);

    public abstract void onMessage(H h9, C0685m c0685m);

    public abstract void onMessage(H h9, String str);

    public abstract void onOpen(H h9, B b9);
}
