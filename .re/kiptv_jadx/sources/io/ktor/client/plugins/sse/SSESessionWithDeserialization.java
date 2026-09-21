package io.ktor.client.plugins.sse;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R(\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\n0\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lio/ktor/client/plugins/sse/SSESessionWithDeserialization;", "LS7/A;", "LV7/g;", "Lio/ktor/sse/TypedServerSentEvent;", "", "getIncoming", "()LV7/g;", "incoming", "Lkotlin/Function2;", "Lio/ktor/util/reflect/TypeInfo;", "", "getDeserializer", "()Lx6/m;", "deserializer", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface SSESessionWithDeserialization extends S7.A {
    @Override // S7.A
    /* synthetic */ p100l6.h getCoroutineContext();

    p194x6.m getDeserializer();

    V7.InterfaceC0981g getIncoming();
}
