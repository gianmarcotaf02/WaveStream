package io.ktor.client.plugins.sse;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a,\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0086\b¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"T", "Lio/ktor/client/plugins/sse/SSESessionWithDeserialization;", "", "data", "deserialize", "(Lio/ktor/client/plugins/sse/SSESessionWithDeserialization;Ljava/lang/String;)Ljava/lang/Object;", "Lio/ktor/sse/TypedServerSentEvent;", "event", "(Lio/ktor/client/plugins/sse/SSESessionWithDeserialization;Lio/ktor/sse/TypedServerSentEvent;)Ljava/lang/Object;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ClientSSESessionKt {
    public static final <T> T deserialize(io.ktor.client.plugins.sse.SSESessionWithDeserialization sSESessionWithDeserialization, java.lang.String str) {
        kotlin.jvm.internal.m.e(sSESessionWithDeserialization, "<this>");
        if (str == null) {
            return null;
        }
        sSESessionWithDeserialization.getDeserializer();
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public static final <T> T deserialize(io.ktor.client.plugins.sse.SSESessionWithDeserialization sSESessionWithDeserialization, io.ktor.sse.TypedServerSentEvent<java.lang.String> event) {
        kotlin.jvm.internal.m.e(sSESessionWithDeserialization, "<this>");
        kotlin.jvm.internal.m.e(event, "event");
        if (event.getData() == null) {
            return null;
        }
        sSESessionWithDeserialization.getDeserializer();
        kotlin.jvm.internal.m.j();
        throw null;
    }
}
