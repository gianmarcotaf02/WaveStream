package io.ktor.http.content;

import V7.InterfaceC0982h;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.InterfaceC2542g;
import p194x6.m;

@Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class MultipartKt$sam$kotlinx_coroutines_flow_FlowCollector$0 implements InterfaceC0982h, InterfaceC2542g {
    private final m function;

    public MultipartKt$sam$kotlinx_coroutines_flow_FlowCollector$0(m function) {
        kotlin.jvm.internal.m.e(function, "function");
        this.function = function;
    }

    @Override
    public final Object emit(Object obj, p100l6.c cVar) {
        return this.function.invoke(obj, cVar);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC0982h) && (obj instanceof InterfaceC2542g)) {
            return kotlin.jvm.internal.m.a(getFunctionDelegate(), ((InterfaceC2542g) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override
    public final p070h6.e getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
