package K0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class M implements androidx.compose.ui.input.pointer.PointerInputEventHandler, kotlin.jvm.internal.InterfaceC2542g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Z.B0 f6661h;

    public M(Z.B0 b9) {
        this.f6661h = b9;
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof androidx.compose.ui.input.pointer.PointerInputEventHandler) && (obj instanceof kotlin.jvm.internal.InterfaceC2542g)) {
            return this.f6661h.equals(((kotlin.jvm.internal.InterfaceC2542g) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC2542g
    public final p070h6.e getFunctionDelegate() {
        return this.f6661h;
    }

    public final int hashCode() {
        return this.f6661h.hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ java.lang.Object invoke(K0.B b9, p100l6.c cVar) {
        this.f6661h.invoke(b9, cVar);
        return p070h6.A.f22523a;
    }
}
