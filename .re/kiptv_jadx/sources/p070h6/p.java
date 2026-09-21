package p070h6;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements p070h6.h, java.io.Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public kotlin.jvm.functions.Function0 f22545h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile java.lang.Object f22546i;
    public final java.lang.Object j;

    public p(kotlin.jvm.functions.Function0 initializer) {
        kotlin.jvm.internal.m.e(initializer, "initializer");
        this.f22545h = initializer;
        this.f22546i = p070h6.x.f22555a;
        this.j = this;
    }

    @Override // p070h6.h
    public final java.lang.Object getValue() {
        java.lang.Object objInvoke;
        java.lang.Object obj = this.f22546i;
        p070h6.x xVar = p070h6.x.f22555a;
        if (obj != xVar) {
            return obj;
        }
        synchronized (this.j) {
            objInvoke = this.f22546i;
            if (objInvoke == xVar) {
                kotlin.jvm.functions.Function0 function0 = this.f22545h;
                kotlin.jvm.internal.m.b(function0);
                objInvoke = function0.invoke();
                this.f22546i = objInvoke;
                this.f22545h = null;
            }
        }
        return objInvoke;
    }

    @Override // p070h6.h
    public final boolean isInitialized() {
        return this.f22546i != p070h6.x.f22555a;
    }

    public final java.lang.String toString() {
        return isInitialized() ? java.lang.String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
