package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class ListenerSet<T> {
    private static final int MSG_ITERATION_FINISHED = 1;
    private final androidx.media3.common.util.Clock clock;
    private final java.util.ArrayDeque<java.lang.Runnable> flushingEvents;
    private final androidx.media3.common.util.ListenerSet.IterationFinishedEvent<T> iterationFinishedEvent;
    private final androidx.media3.common.util.HandlerWrapper iterationFinishedHandler;
    private final java.util.concurrent.CopyOnWriteArraySet<androidx.media3.common.util.ListenerSet.ListenerHolder<T>> listeners;
    private final java.util.ArrayDeque<java.lang.Runnable> queuedEvents;
    private boolean released;
    private final java.lang.Object releasedLock;
    private final java.lang.Thread thread;
    private boolean throwsWhenUsingWrongThread;

    public interface Event<T> {
        void invoke(T t9);
    }

    public interface IterationFinishedEvent<T> {
        void invoke(T t9, androidx.media3.common.FlagSet flagSet);
    }

    public static final class ListenerHolder<T> {
        private androidx.media3.common.FlagSet.Builder flagsBuilder = new androidx.media3.common.FlagSet.Builder();
        public final T listener;
        private boolean needsIterationFinishedEvent;
        private boolean released;

        public ListenerHolder(T t9) {
            this.listener = t9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void release(androidx.media3.common.util.ListenerSet.IterationFinishedEvent<T> iterationFinishedEvent) {
            this.released = true;
            if (iterationFinishedEvent == null || !this.needsIterationFinishedEvent) {
                return;
            }
            this.needsIterationFinishedEvent = false;
            iterationFinishedEvent.invoke(this.listener, this.flagsBuilder.build());
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || androidx.media3.common.util.ListenerSet.ListenerHolder.class != obj.getClass()) {
                return false;
            }
            return this.listener.equals(((androidx.media3.common.util.ListenerSet.ListenerHolder) obj).listener);
        }

        public int hashCode() {
            return this.listener.hashCode();
        }

        public void invoke(int i3, androidx.media3.common.util.ListenerSet.Event<T> event) {
            if (this.released) {
                return;
            }
            if (i3 != -1) {
                this.flagsBuilder.add(i3);
            }
            this.needsIterationFinishedEvent = true;
            event.invoke(this.listener);
        }

        public void iterationFinished(androidx.media3.common.util.ListenerSet.IterationFinishedEvent<T> iterationFinishedEvent) {
            if (this.released || !this.needsIterationFinishedEvent) {
                return;
            }
            androidx.media3.common.FlagSet flagSetBuild = this.flagsBuilder.build();
            this.flagsBuilder = new androidx.media3.common.FlagSet.Builder();
            this.needsIterationFinishedEvent = false;
            iterationFinishedEvent.invoke(this.listener, flagSetBuild);
        }
    }

    public ListenerSet(android.os.Looper looper) {
        this(looper.getThread());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(android.os.Message message) {
        androidx.media3.common.util.ListenerSet.IterationFinishedEvent<T> iterationFinishedEvent = this.iterationFinishedEvent;
        iterationFinishedEvent.getClass();
        java.util.Iterator<androidx.media3.common.util.ListenerSet.ListenerHolder<T>> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().iterationFinished(iterationFinishedEvent);
            androidx.media3.common.util.HandlerWrapper handlerWrapper = this.iterationFinishedHandler;
            handlerWrapper.getClass();
            if (handlerWrapper.hasMessages(1)) {
                break;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$queueEvent$0(java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet, int i3, androidx.media3.common.util.ListenerSet.Event event) {
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((androidx.media3.common.util.ListenerSet.ListenerHolder) it.next()).invoke(i3, event);
        }
    }

    private void verifyCurrentThread() {
        if (this.throwsWhenUsingWrongThread) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(isRunningOnCorrectThread());
        }
    }

    public void add(T t9) {
        t9.getClass();
        synchronized (this.releasedLock) {
            try {
                if (this.released) {
                    return;
                }
                this.listeners.add(new androidx.media3.common.util.ListenerSet.ListenerHolder<>(t9));
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void clear() {
        verifyCurrentThread();
        java.util.Iterator<androidx.media3.common.util.ListenerSet.ListenerHolder<T>> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().release(this.iterationFinishedEvent);
        }
        this.listeners.clear();
    }

    public androidx.media3.common.util.ListenerSet<T> copy(android.os.Looper looper, androidx.media3.common.util.ListenerSet.IterationFinishedEvent<T> iterationFinishedEvent) {
        return copy(looper, this.clock, iterationFinishedEvent);
    }

    public void flushEvents() {
        verifyCurrentThread();
        if (this.queuedEvents.isEmpty()) {
            return;
        }
        if (this.iterationFinishedEvent != null) {
            androidx.media3.common.util.HandlerWrapper handlerWrapper = this.iterationFinishedHandler;
            handlerWrapper.getClass();
            if (!handlerWrapper.hasMessages(1)) {
                androidx.media3.common.util.HandlerWrapper handlerWrapper2 = this.iterationFinishedHandler;
                handlerWrapper2.sendMessageAtFrontOfQueue(handlerWrapper2.obtainMessage(1));
            }
        }
        boolean zIsEmpty = this.flushingEvents.isEmpty();
        this.flushingEvents.addAll(this.queuedEvents);
        this.queuedEvents.clear();
        if (zIsEmpty) {
            while (!this.flushingEvents.isEmpty()) {
                this.flushingEvents.peekFirst().run();
                this.flushingEvents.removeFirst();
            }
        }
    }

    public boolean isRunningOnCorrectThread() {
        return java.lang.Thread.currentThread() == this.thread;
    }

    public void queueEvent(androidx.media3.common.util.ListenerSet.Event<T> event) {
        queueEvent(-1, event);
    }

    public void release() {
        verifyCurrentThread();
        synchronized (this.releasedLock) {
            this.released = true;
        }
        java.util.Iterator<androidx.media3.common.util.ListenerSet.ListenerHolder<T>> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().release(this.iterationFinishedEvent);
        }
        this.listeners.clear();
    }

    public void remove(T t9) {
        verifyCurrentThread();
        for (androidx.media3.common.util.ListenerSet.ListenerHolder<T> listenerHolder : this.listeners) {
            if (listenerHolder.listener.equals(t9)) {
                listenerHolder.release(this.iterationFinishedEvent);
                this.listeners.remove(listenerHolder);
            }
        }
    }

    public void sendEvent(androidx.media3.common.util.ListenerSet.Event<T> event) {
        sendEvent(-1, event);
    }

    @java.lang.Deprecated
    public void setThrowsWhenUsingWrongThread(boolean z6) {
        this.throwsWhenUsingWrongThread = z6;
    }

    public int size() {
        verifyCurrentThread();
        return this.listeners.size();
    }

    public ListenerSet(java.lang.Thread thread) {
        this(new java.util.concurrent.CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public androidx.media3.common.util.ListenerSet<T> copy(android.os.Looper looper) {
        return copy(looper, this.clock, this.iterationFinishedEvent);
    }

    public void queueEvent(int i3, androidx.media3.common.util.ListenerSet.Event<T> event) {
        verifyCurrentThread();
        this.queuedEvents.add(new androidx.media3.common.util.c(new java.util.concurrent.CopyOnWriteArraySet(this.listeners), i3, event, 0));
    }

    public void sendEvent(int i3, androidx.media3.common.util.ListenerSet.Event<T> event) {
        queueEvent(i3, event);
        flushEvents();
    }

    public ListenerSet(android.os.Looper looper, androidx.media3.common.util.Clock clock, androidx.media3.common.util.ListenerSet.IterationFinishedEvent<T> iterationFinishedEvent) {
        this(new java.util.concurrent.CopyOnWriteArraySet(), looper, looper.getThread(), clock, iterationFinishedEvent, true);
    }

    public androidx.media3.common.util.ListenerSet<T> copy(androidx.media3.common.util.Clock clock) {
        androidx.media3.common.util.HandlerWrapper handlerWrapper = this.iterationFinishedHandler;
        if (handlerWrapper != null) {
            return copy(handlerWrapper.getLooper(), clock, this.iterationFinishedEvent);
        }
        return new androidx.media3.common.util.ListenerSet<>(this.listeners, null, this.thread, clock, null, this.throwsWhenUsingWrongThread);
    }

    private ListenerSet(java.util.concurrent.CopyOnWriteArraySet<androidx.media3.common.util.ListenerSet.ListenerHolder<T>> copyOnWriteArraySet, android.os.Looper looper, java.lang.Thread thread, androidx.media3.common.util.Clock clock, androidx.media3.common.util.ListenerSet.IterationFinishedEvent<T> iterationFinishedEvent, boolean z6) {
        this.clock = clock;
        this.thread = thread;
        this.listeners = copyOnWriteArraySet;
        this.iterationFinishedEvent = iterationFinishedEvent;
        this.releasedLock = new java.lang.Object();
        this.flushingEvents = new java.util.ArrayDeque<>();
        this.queuedEvents = new java.util.ArrayDeque<>();
        if (looper != null && clock != null && iterationFinishedEvent != null) {
            this.iterationFinishedHandler = clock.createHandler(looper, new androidx.media3.common.util.b(0, this));
        } else {
            this.iterationFinishedHandler = null;
        }
        this.throwsWhenUsingWrongThread = z6;
    }

    public androidx.media3.common.util.ListenerSet<T> copy(android.os.Looper looper, androidx.media3.common.util.Clock clock, androidx.media3.common.util.ListenerSet.IterationFinishedEvent<T> iterationFinishedEvent) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(clock != null || iterationFinishedEvent == null);
        return new androidx.media3.common.util.ListenerSet<>(this.listeners, looper, looper.getThread(), clock, iterationFinishedEvent, this.throwsWhenUsingWrongThread);
    }
}
