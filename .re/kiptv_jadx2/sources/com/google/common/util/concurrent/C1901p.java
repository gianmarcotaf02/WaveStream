package com.google.common.util.concurrent;

public final class C1901p {

    public static final C1901p f19448c = new C1901p();

    public volatile Thread f19449a;

    public volatile C1901p f19450b;

    public C1901p() {
        AbstractC1902q.ATOMIC_HELPER.g(this, Thread.currentThread());
    }
}
