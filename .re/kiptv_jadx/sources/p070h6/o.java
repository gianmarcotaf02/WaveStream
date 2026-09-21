package p070h6;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements p070h6.h, java.io.Serializable {
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater j = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p070h6.o.class, java.lang.Object.class, androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_INIT_SEGMENT);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile kotlin.jvm.functions.Function0 f22543h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile java.lang.Object f22544i;

    @Override // p070h6.h
    public final java.lang.Object getValue() {
        java.lang.Object obj = this.f22544i;
        p070h6.x xVar = p070h6.x.f22555a;
        if (obj != xVar) {
            return obj;
        }
        kotlin.jvm.functions.Function0 function0 = this.f22543h;
        if (function0 != null) {
            java.lang.Object objInvoke = function0.invoke();
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, xVar, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != xVar) {
                }
            }
            this.f22543h = null;
            return objInvoke;
        }
        return this.f22544i;
    }

    @Override // p070h6.h
    public final boolean isInitialized() {
        return this.f22544i != p070h6.x.f22555a;
    }

    public final java.lang.String toString() {
        return isInitialized() ? java.lang.String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
