package p100l6;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements p100l6.h, java.io.Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p100l6.i f24820h = new p100l6.i();

    @Override // p100l6.h
    public final p100l6.f get(p100l6.g key) {
        kotlin.jvm.internal.m.e(key, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // p100l6.h
    public final p100l6.h minusKey(p100l6.g key) {
        kotlin.jvm.internal.m.e(key, "key");
        return this;
    }

    @Override // p100l6.h
    public final p100l6.h plus(p100l6.h context) {
        kotlin.jvm.internal.m.e(context, "context");
        return context;
    }

    public final java.lang.String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // p100l6.h
    public final java.lang.Object fold(java.lang.Object obj, p194x6.m mVar) {
        return obj;
    }
}
