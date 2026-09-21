package com.revenuecat.purchases.storage;

import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import p070h6.A;
import p194x6.j;

@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"H", "T", "", SentryEvent.JsonKeys.EXCEPTION, "Lh6/A;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class KeyedDeferredValueStore$forgettingFailure$1$1 extends o implements j {
    final H $key;
    final KeyedDeferredValueStore<H, T> this$0;

    public KeyedDeferredValueStore$forgettingFailure$1$1(KeyedDeferredValueStore<H, T> keyedDeferredValueStore, H h9) {
        super(1);
        this.this$0 = keyedDeferredValueStore;
        this.$key = h9;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((Throwable) obj);
        return A.f22523a;
    }

    public final void invoke(Throwable th) {
        if (th != null) {
            KeyedDeferredValueStore<H, T> keyedDeferredValueStore = this.this$0;
            Object obj = this.$key;
            synchronized (((KeyedDeferredValueStore) keyedDeferredValueStore).lock) {
                keyedDeferredValueStore.getDeferred().remove(obj);
            }
        }
    }
}
