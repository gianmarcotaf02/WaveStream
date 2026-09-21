package R0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o1 implements R0.D0, kotlin.jvm.internal.InterfaceC2542g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p020c0.AbstractC1709v f8953h;

    public o1(p020c0.AbstractC1709v abstractC1709v) {
        this.f8953h = abstractC1709v;
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof R0.D0) && (obj instanceof kotlin.jvm.internal.InterfaceC2542g)) {
            return getFunctionDelegate().equals(((kotlin.jvm.internal.InterfaceC2542g) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC2542g
    public final p070h6.e getFunctionDelegate() {
        return new kotlin.jvm.internal.j(1, 0, p020c0.AbstractC1709v.class, this.f8953h, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
