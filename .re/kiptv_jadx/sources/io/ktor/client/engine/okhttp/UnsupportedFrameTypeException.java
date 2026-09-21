package io.ktor.client.engine.okhttp;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/client/engine/okhttp/UnsupportedFrameTypeException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "LS7/u;", "Lio/ktor/websocket/Frame;", "frame", "<init>", "(Lio/ktor/websocket/Frame;)V", "createCopy", "()Lio/ktor/client/engine/okhttp/UnsupportedFrameTypeException;", "Lio/ktor/websocket/Frame;", "ktor-client-okhttp"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class UnsupportedFrameTypeException extends java.lang.IllegalArgumentException implements S7.InterfaceC0904u {
    private final io.ktor.websocket.Frame frame;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsupportedFrameTypeException(io.ktor.websocket.Frame frame) {
        super("Unsupported frame type: " + frame);
        kotlin.jvm.internal.m.e(frame, "frame");
        this.frame = frame;
    }

    @Override // S7.InterfaceC0904u
    public io.ktor.client.engine.okhttp.UnsupportedFrameTypeException createCopy() {
        io.ktor.client.engine.okhttp.UnsupportedFrameTypeException unsupportedFrameTypeException = new io.ktor.client.engine.okhttp.UnsupportedFrameTypeException(this.frame);
        unsupportedFrameTypeException.initCause(this);
        return unsupportedFrameTypeException;
    }
}
