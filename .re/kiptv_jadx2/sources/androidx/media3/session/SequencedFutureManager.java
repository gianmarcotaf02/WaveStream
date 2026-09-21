package androidx.media3.session;

import android.os.Handler;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.google.common.util.concurrent.AbstractC1902q;
import java.util.ArrayList;
import java.util.Iterator;
import p136q.C2661e;

final class SequencedFutureManager {
    private static final String TAG = "SequencedFutureManager";
    private boolean isReleased;
    private int nextSequenceNumber;
    private Runnable pendingLazyReleaseCallback;
    private Handler releaseCallbackHandler;
    private final Object lock = new Object();
    private final C2661e seqToFutureMap = new C2661e(0);

    public static final class SequencedFuture<T> extends AbstractC1902q {
        private final T resultWhenClosed;
        private final int sequenceNumber;

        private SequencedFuture(int i3, T t9) {
            this.sequenceNumber = i3;
            this.resultWhenClosed = t9;
        }

        public static <T> SequencedFuture<T> create(int i3, T t9) {
            return new SequencedFuture<>(i3, t9);
        }

        public T getResultWhenClosed() {
            return this.resultWhenClosed;
        }

        public int getSequenceNumber() {
            return this.sequenceNumber;
        }

        @Override
        public boolean set(T t9) {
            return super.set(t9);
        }

        public void setWithTheValueOfResultWhenClosed() {
            set(this.resultWhenClosed);
        }
    }

    public <T> SequencedFuture<T> createSequencedFuture(T t9) {
        SequencedFuture<T> sequencedFutureCreate;
        synchronized (this.lock) {
            try {
                int iObtainNextSequenceNumber = obtainNextSequenceNumber();
                sequencedFutureCreate = SequencedFuture.create(iObtainNextSequenceNumber, t9);
                if (this.isReleased) {
                    sequencedFutureCreate.setWithTheValueOfResultWhenClosed();
                } else {
                    this.seqToFutureMap.put(Integer.valueOf(iObtainNextSequenceNumber), sequencedFutureCreate);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sequencedFutureCreate;
    }

    public void lazyRelease(long j, Runnable runnable) {
        synchronized (this.lock) {
            try {
                Handler handlerCreateHandlerForCurrentLooper = Util.createHandlerForCurrentLooper();
                this.releaseCallbackHandler = handlerCreateHandlerForCurrentLooper;
                this.pendingLazyReleaseCallback = runnable;
                if (this.seqToFutureMap.isEmpty()) {
                    release();
                } else {
                    handlerCreateHandlerForCurrentLooper.postDelayed(new k1(0, this), j);
                }
            } catch (Throwable th) {
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
        ArrayList arrayList;
        synchronized (this.lock) {
            try {
                this.isReleased = true;
                arrayList = new ArrayList(this.seqToFutureMap.values());
                this.seqToFutureMap.clear();
                if (this.pendingLazyReleaseCallback != null) {
                    Handler handler = this.releaseCallbackHandler;
                    handler.getClass();
                    handler.post(this.pendingLazyReleaseCallback);
                    this.pendingLazyReleaseCallback = null;
                    this.releaseCallbackHandler = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((SequencedFuture) it.next()).setWithTheValueOfResultWhenClosed();
        }
    }

    public <T> void setFutureResult(int i3, T t9) {
        synchronized (this.lock) {
            try {
                SequencedFuture sequencedFuture = (SequencedFuture) this.seqToFutureMap.remove(Integer.valueOf(i3));
                if (sequencedFuture != null) {
                    if (sequencedFuture.getResultWhenClosed().getClass() == t9.getClass()) {
                        sequencedFuture.set(t9);
                    } else {
                        Log.w(TAG, "Type mismatch, expected " + sequencedFuture.getResultWhenClosed().getClass() + ", but was " + t9.getClass());
                    }
                }
                if (this.pendingLazyReleaseCallback != null && this.seqToFutureMap.isEmpty()) {
                    release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
