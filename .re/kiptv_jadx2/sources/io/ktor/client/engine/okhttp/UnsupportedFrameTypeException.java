package io.ktor.client.engine.okhttp;

import S7.InterfaceC0904u;
import androidx.media3.container.NalUnitUtil;
import io.ktor.websocket.Frame;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/client/engine/okhttp/UnsupportedFrameTypeException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "LS7/u;", "Lio/ktor/websocket/Frame;", "frame", "<init>", "(Lio/ktor/websocket/Frame;)V", "createCopy", "()Lio/ktor/client/engine/okhttp/UnsupportedFrameTypeException;", "Lio/ktor/websocket/Frame;", "ktor-client-okhttp"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class UnsupportedFrameTypeException extends IllegalArgumentException implements InterfaceC0904u {
    private final Frame frame;

    public UnsupportedFrameTypeException(Frame frame) {
        super("Unsupported frame type: " + frame);
        m.e(frame, "frame");
        this.frame = frame;
    }

    @Override
    public UnsupportedFrameTypeException createCopy() {
        UnsupportedFrameTypeException unsupportedFrameTypeException = new UnsupportedFrameTypeException(this.frame);
        unsupportedFrameTypeException.initCause(this);
        return unsupportedFrameTypeException;
    }
}
