package p070h6;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;

public final class o implements h, Serializable {
    public static final AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, CmcdData.OBJECT_TYPE_INIT_SEGMENT);

    public volatile Function0 f22543h;

    public volatile Object f22544i;

    @Override
    public final Object getValue() {
        Object obj = this.f22544i;
        x xVar = x.f22555a;
        if (obj != xVar) {
            return obj;
        }
        Function0 function0 = this.f22543h;
        if (function0 != null) {
            Object objInvoke = function0.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, xVar, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != xVar) {
                }
            }
            this.f22543h = null;
            return objInvoke;
        }
        return this.f22544i;
    }

    @Override
    public final boolean isInitialized() {
        return this.f22544i != x.f22555a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
