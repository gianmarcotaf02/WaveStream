package com.revenuecat.purchases.common.remoteconfig;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import io.sentry.protocol.SentryStackFrame;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0013\u0010\u001b\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/revenuecat/purchases/common/remoteconfig/GenerationGuardedCache;", "", "T", "<init>", "()V", "", "isWarm", "()Z", "", "generation", "isAtOrAbove", "(I)Z", "isWarmAtOrAbove", "isCurrent", "newValue", "Lh6/A;", ProductResponseJsonKeys.STORE, "(ILjava/lang/Object;)V", "invalidate", "(I)V", SentryStackFrame.JsonKeys.LOCK, "Ljava/lang/Object;", "value", "lastGeneration", "I", "getCached", "()Ljava/lang/Object;", "cached", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class GenerationGuardedCache<T> {
    private volatile T value;
    private final Object lock = new Object();
    private int lastGeneration = -1;

    public final T getCached() {
        return this.value;
    }

    public final void invalidate(int generation) {
        synchronized (this.lock) {
            if (generation >= this.lastGeneration) {
                this.lastGeneration = generation;
                this.value = null;
            }
        }
    }

    public final boolean isAtOrAbove(int generation) {
        boolean z6;
        synchronized (this.lock) {
            z6 = this.lastGeneration >= generation;
        }
        return z6;
    }

    public final boolean isCurrent(int generation) {
        boolean z6;
        synchronized (this.lock) {
            z6 = generation >= this.lastGeneration;
        }
        return z6;
    }

    public final boolean isWarm() {
        return this.value != null;
    }

    public final boolean isWarmAtOrAbove(int generation) {
        boolean z6;
        synchronized (this.lock) {
            z6 = this.lastGeneration >= generation && this.value != null;
        }
        return z6;
    }

    public final void store(int generation, T newValue) {
        m.e(newValue, "newValue");
        synchronized (this.lock) {
            if (generation >= this.lastGeneration) {
                this.lastGeneration = generation;
                this.value = newValue;
            }
        }
    }
}
