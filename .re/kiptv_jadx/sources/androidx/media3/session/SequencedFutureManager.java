package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
final class SequencedFutureManager {
    private static final java.lang.String TAG = "SequencedFutureManager";
    private boolean isReleased;
    private int nextSequenceNumber;
    private java.lang.Runnable pendingLazyReleaseCallback;
    private android.os.Handler releaseCallbackHandler;
    private final java.lang.Object lock = new java.lang.Object();
    private final p136q.C2661e seqToFutureMap = new p136q.C2661e(0);

    public static final class SequencedFuture<T> extends com.google.common.util.concurrent.AbstractC1902q {
        private final T resultWhenClosed;
        private final int sequenceNumber;

        private SequencedFuture(int i3, T t9) {
            this.sequenceNumber = i3;
            this.resultWhenClosed = t9;
        }

        public static <T> androidx.media3.session.SequencedFutureManager.SequencedFuture<T> create(int i3, T t9) {
            return new androidx.media3.session.SequencedFutureManager.SequencedFuture<>(i3, t9);
        }

        public T getResultWhenClosed() {
            return this.resultWhenClosed;
        }

        public int getSequenceNumber() {
            return this.sequenceNumber;
        }

        @Override // com.google.common.util.concurrent.AbstractC1902q
        public boolean set(T t9) {
            return super.set(t9);
        }

        public void setWithTheValueOfResultWhenClosed() {
            set(this.resultWhenClosed);
        }
    }

    public <T> androidx.media3.session.SequencedFutureManager.SequencedFuture<T> createSequencedFuture(T t9) {
        androidx.media3.session.SequencedFutureManager.SequencedFuture<T> sequencedFutureCreate;
        synchronized (this.lock) {
            try {
                int iObtainNextSequenceNumber = obtainNextSequenceNumber();
                sequencedFutureCreate = androidx.media3.session.SequencedFutureManager.SequencedFuture.create(iObtainNextSequenceNumber, t9);
                if (this.isReleased) {
                    sequencedFutureCreate.setWithTheValueOfResultWhenClosed();
                } else {
                    this.seqToFutureMap.put(java.lang.Integer.valueOf(iObtainNextSequenceNumber), sequencedFutureCreate);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return sequencedFutureCreate;
    }

    public void lazyRelease(long j, java.lang.Runnable runnable) {
        synchronized (this.lock) {
            try {
                android.os.Handler handlerCreateHandlerForCurrentLooper = androidx.media3.common.util.Util.createHandlerForCurrentLooper();
                this.releaseCallbackHandler = handlerCreateHandlerForCurrentLooper;
                this.pendingLazyReleaseCallback = runnable;
                if (this.seqToFutureMap.isEmpty()) {
                    release();
                } else {
                    handlerCreateHandlerForCurrentLooper.postDelayed(new androidx.media3.session.k1(0, this), j);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public int obtainNextSequenceNumber() {
        int i3;
        synchronized (this.lock) {
            i3 = this.nextSequenceNumber;
            this.nextSequenceNumber = i3 + 1;
        }
        return i3;
    }

    public void release() {
        java.util.ArrayList arrayList;
        synchronized (this.lock) {
            try {
                this.isReleased = true;
                arrayList = new java.util.ArrayList(this.seqToFutureMap.values());
                this.seqToFutureMap.clear();
                if (this.pendingLazyReleaseCallback != null) {
                    android.os.Handler handler = this.releaseCallbackHandler;
                    handler.getClass();
                    handler.post(this.pendingLazyReleaseCallback);
                    this.pendingLazyReleaseCallback = null;
                    this.releaseCallbackHandler = null;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((androidx.media3.session.SequencedFutureManager.SequencedFuture) it.next()).setWithTheValueOfResultWhenClosed();
        }
    }

    public <T> void setFutureResult(int i3, T t9) {
        synchronized (this.lock) {
            try {
                androidx.media3.session.SequencedFutureManager.SequencedFuture sequencedFuture = (androidx.media3.session.SequencedFutureManager.SequencedFuture) this.seqToFutureMap.remove(java.lang.Integer.valueOf(i3));
                if (sequencedFuture != null) {
                    if (sequencedFuture.getResultWhenClosed().getClass() == t9.getClass()) {
                        sequencedFuture.set(t9);
                    } else {
                        androidx.media3.common.util.Log.w(TAG, "Type mismatch, expected " + sequencedFuture.getResultWhenClosed().getClass() + ", but was " + t9.getClass());
                    }
                }
                if (this.pendingLazyReleaseCallback != null && this.seqToFutureMap.isEmpty()) {
                    release();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
