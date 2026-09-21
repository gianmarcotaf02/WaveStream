package io.ktor.client.plugins.observer;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import p100l6.c;
import p100l6.i;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0080@¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ll6/h;", "getResponseObserverContext", "(Ll6/c;)Ljava/lang/Object;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ResponseObserverContextJvmKt {
    public static final Object getResponseObserverContext(c cVar) {
        p018b8.a aVar = (p018b8.a) cVar.getContext().get(p018b8.a.f18024i);
        return aVar != null ? aVar : i.f24820h;
    }
}
