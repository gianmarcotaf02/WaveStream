package com.revenuecat.purchases.storage;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010\u0007\u001a\u00028\u00002\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010\u0007\u001a\u00028\u00002\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\b¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR)\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/storage/KeyedDeferredValueStore;", "H", "T", "", io.sentry.protocol.SentryStackFrame.JsonKeys.LOCK, "<init>", "(Ljava/lang/Object;)V", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "Lkotlin/Function0;", "LS7/F;", "task", "forgettingFailure", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)LS7/F;", "getOrPut", "Ljava/lang/Object;", "", "deferred", "Ljava/util/Map;", "getDeferred", "()Ljava/util/Map;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class KeyedDeferredValueStore<H, T> {
    private final java.util.Map<H, S7.F> deferred;
    private final java.lang.Object lock;

    /* JADX WARN: Illegal instructions before constructor call */
    public KeyedDeferredValueStore() {
        kotlin.jvm.internal.AbstractC2541f abstractC2541f = null;
        this(abstractC2541f, 1, abstractC2541f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final S7.F forgettingFailure(H key, kotlin.jvm.functions.Function0 task) {
        S7.F f9 = (S7.F) task.invoke();
        ((S7.p0) f9).j(new com.revenuecat.purchases.storage.KeyedDeferredValueStore$forgettingFailure$1$1(this, key));
        return f9;
    }

    public final java.util.Map<H, S7.F> getDeferred() {
        return this.deferred;
    }

    public final S7.F getOrPut(H key, kotlin.jvm.functions.Function0 task) {
        S7.F fForgettingFailure;
        kotlin.jvm.internal.m.e(task, "task");
        synchronized (this.lock) {
            fForgettingFailure = this.deferred.get(key);
            if (fForgettingFailure == null) {
                fForgettingFailure = forgettingFailure(key, task);
                this.deferred.put(key, fForgettingFailure);
            }
        }
        return fForgettingFailure;
    }

    public KeyedDeferredValueStore(java.lang.Object lock) {
        kotlin.jvm.internal.m.e(lock, "lock");
        this.lock = lock;
        this.deferred = new java.util.LinkedHashMap();
    }

    public /* synthetic */ KeyedDeferredValueStore(java.lang.Object obj, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? new java.lang.Object() { // from class: com.revenuecat.purchases.storage.KeyedDeferredValueStore.1
        } : obj);
    }
}
