package io.ktor.websocket;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/websocket/Frame$Text;", "", "readText", "(Lio/ktor/websocket/Frame$Text;)Ljava/lang/String;", "Lio/ktor/websocket/Frame;", "", "readBytes", "(Lio/ktor/websocket/Frame;)[B", "Lio/ktor/websocket/Frame$Close;", "Lio/ktor/websocket/CloseReason;", "readReason", "(Lio/ktor/websocket/Frame$Close;)Lio/ktor/websocket/CloseReason;", "ktor-websockets"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class FrameCommonKt {
    public static final byte[] readBytes(io.ktor.websocket.Frame frame) {
        kotlin.jvm.internal.m.e(frame, "<this>");
        byte[] data = frame.getData();
        byte[] bArrCopyOf = java.util.Arrays.copyOf(data, data.length);
        kotlin.jvm.internal.m.d(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public static final io.ktor.websocket.CloseReason readReason(io.ktor.websocket.Frame.Close close) {
        kotlin.jvm.internal.m.e(close, "<this>");
        if (close.getData().length < 2) {
            return null;
        }
        p094k8.a aVar = new p094k8.a();
        io.ktor.utils.io.core.BytePacketBuilderKt.writeFully$default(aVar, close.getData(), 0, 0, 6, null);
        return new io.ktor.websocket.CloseReason(aVar.readShort(), io.ktor.utils.io.core.StringsKt.readText$default(aVar, null, 0, 3, null));
    }

    public static final java.lang.String readText(io.ktor.websocket.Frame.Text text) {
        kotlin.jvm.internal.m.e(text, "<this>");
        if (!text.getFin()) {
            throw new java.lang.IllegalArgumentException("Text could be only extracted from non-fragmented frame");
        }
        java.nio.charset.CharsetDecoder charsetDecoderNewDecoder = O7.a.f8024b.newDecoder();
        kotlin.jvm.internal.m.d(charsetDecoderNewDecoder, "newDecoder(...)");
        p094k8.a aVar = new p094k8.a();
        io.ktor.utils.io.core.BytePacketBuilderKt.writeFully$default(aVar, text.getData(), 0, 0, 6, null);
        return io.ktor.utils.io.charsets.EncodingKt.decode$default(charsetDecoderNewDecoder, aVar, 0, 2, null);
    }
}
