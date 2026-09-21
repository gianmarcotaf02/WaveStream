package io.ktor.client.plugins.observer;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0080@¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ll6/h;", "getResponseObserverContext", "(Ll6/c;)Ljava/lang/Object;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ResponseObserverContextJvmKt {
    public static final java.lang.Object getResponseObserverContext(p100l6.c cVar) {
        p018b8.a aVar = (p018b8.a) cVar.getContext().get(p018b8.a.f18024i);
        return aVar != null ? aVar : p100l6.i.f24820h;
    }
}
