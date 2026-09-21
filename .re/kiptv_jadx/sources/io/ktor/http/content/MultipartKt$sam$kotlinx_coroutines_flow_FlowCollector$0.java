package io.ktor.http.content;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class MultipartKt$sam$kotlinx_coroutines_flow_FlowCollector$0 implements V7.InterfaceC0982h, kotlin.jvm.internal.InterfaceC2542g {
    private final /* synthetic */ p194x6.m function;

    public MultipartKt$sam$kotlinx_coroutines_flow_FlowCollector$0(p194x6.m function) {
        kotlin.jvm.internal.m.e(function, "function");
        this.function = function;
    }

    @Override // V7.InterfaceC0982h
    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, p100l6.c cVar) {
        return this.function.invoke(obj, cVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof V7.InterfaceC0982h) && (obj instanceof kotlin.jvm.internal.InterfaceC2542g)) {
            return kotlin.jvm.internal.m.a(getFunctionDelegate(), ((kotlin.jvm.internal.InterfaceC2542g) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC2542g
    public final p070h6.e getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
