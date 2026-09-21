package p070h6;

/* JADX INFO: loaded from: classes4.dex */
public final class B implements p070h6.h, java.io.Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public kotlin.jvm.functions.Function0 f22524h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f22525i;

    @Override // p070h6.h
    public final java.lang.Object getValue() {
        if (this.f22525i == p070h6.x.f22555a) {
            kotlin.jvm.functions.Function0 function0 = this.f22524h;
            kotlin.jvm.internal.m.b(function0);
            this.f22525i = function0.invoke();
            this.f22524h = null;
        }
        return this.f22525i;
    }

    @Override // p070h6.h
    public final boolean isInitialized() {
        return this.f22525i != p070h6.x.f22555a;
    }

    public final java.lang.String toString() {
        return isInitialized() ? java.lang.String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
