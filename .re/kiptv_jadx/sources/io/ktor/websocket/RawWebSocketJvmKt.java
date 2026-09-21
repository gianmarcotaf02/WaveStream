package io.ktor.websocket;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "input", "Lio/ktor/utils/io/ByteWriteChannel;", "output", "", "maxFrameSize", "", "masking", "Ll6/h;", "coroutineContext", "Lio/ktor/websocket/WebSocketSession;", "RawWebSocket", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;JZLl6/h;)Lio/ktor/websocket/WebSocketSession;", "ktor-websockets"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RawWebSocketJvmKt {
    public static final io.ktor.websocket.WebSocketSession RawWebSocket(io.ktor.utils.io.ByteReadChannel input, io.ktor.utils.io.ByteWriteChannel output, long j, boolean z6, p100l6.h coroutineContext) {
        kotlin.jvm.internal.m.e(input, "input");
        kotlin.jvm.internal.m.e(output, "output");
        kotlin.jvm.internal.m.e(coroutineContext, "coroutineContext");
        return new io.ktor.websocket.RawWebSocketJvm(input, output, j, z6, coroutineContext, null, 32, null);
    }

    public static /* synthetic */ io.ktor.websocket.WebSocketSession RawWebSocket$default(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, long j, boolean z6, p100l6.h hVar, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            j = 2147483647L;
        }
        long j9 = j;
        if ((i3 & 8) != 0) {
            z6 = false;
        }
        return RawWebSocket(byteReadChannel, byteWriteChannel, j9, z6, hVar);
    }
}
