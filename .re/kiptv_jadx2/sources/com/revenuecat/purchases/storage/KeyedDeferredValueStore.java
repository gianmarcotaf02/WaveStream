package com.revenuecat.purchases.storage;

import S7.F;
import S7.p0;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.sentry.protocol.SentryStackFrame;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010\u0007\u001a\u00028\u00002\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010\u0007\u001a\u00028\u00002\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\b¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR)\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/storage/KeyedDeferredValueStore;", "H", "T", "", SentryStackFrame.JsonKeys.LOCK, "<init>", "(Ljava/lang/Object;)V", SubscriberAttributeKt.JSON_NAME_KEY, "Lkotlin/Function0;", "LS7/F;", "task", "forgettingFailure", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)LS7/F;", "getOrPut", "Ljava/lang/Object;", "", "deferred", "Ljava/util/Map;", "getDeferred", "()Ljava/util/Map;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class KeyedDeferredValueStore<H, T> {
    private final Map<H, F> deferred;
    private final Object lock;

    public KeyedDeferredValueStore() {
        AbstractC2541f abstractC2541f = null;
        this(abstractC2541f, 1, abstractC2541f);
    }

    private final F forgettingFailure(H key, Function0 task) {
        F f9 = (F) task.invoke();
        ((p0) f9).j(new KeyedDeferredValueStore$forgettingFailure$1$1(this, key));
        return f9;
    }

    public final Map<H, F> getDeferred() {
        return this.deferred;
    }

    public final F getOrPut(H key, Function0 task) {
        F fForgettingFailure;
        m.e(task, "task");
        synchronized (this.lock) {
            fForgettingFailure = this.deferred.get(key);
            if (fForgettingFailure == null) {
                fForgettingFailure = forgettingFailure(key, task);
                this.deferred.put(key, fForgettingFailure);
            }
        }
        return fForgettingFailure;
    }

    public KeyedDeferredValueStore(Object lock) {
        m.e(lock, "lock");
        this.lock = lock;
        this.deferred = new LinkedHashMap();
    }

    public KeyedDeferredValueStore(Object obj, int i3, AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? new Object() {
        } : obj);
    }
}
