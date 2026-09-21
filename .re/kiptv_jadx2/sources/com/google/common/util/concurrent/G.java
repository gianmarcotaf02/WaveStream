package com.google.common.util.concurrent;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

public final class G extends AbstractOwnableSynchronizer implements Runnable {

    public final H f19409h;

    public G(H h9) {
        this.f19409h = h9;
    }

    public static void a(G g, Thread thread) {
        g.setExclusiveOwnerThread(thread);
    }

    @Override
    public final void run() {
    }

    public final String toString() {
        return this.f19409h.toString();
    }
}
