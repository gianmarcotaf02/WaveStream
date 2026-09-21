package io.ktor.websocket;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/websocket/FrameType;", "", "", "controlFrame", "", "opcode", "<init>", "(Ljava/lang/String;IZI)V", "Z", "getControlFrame", "()Z", "I", "getOpcode", "()I", "Companion", "TEXT", "BINARY", "CLOSE", "PING", "PONG", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public enum FrameType {
    TEXT(false, 1),
    BINARY(false, 2),
    CLOSE(true, 8),
    PING(true, 9),
    PONG(true, 10);

    private static final io.ktor.websocket.FrameType[] byOpcodeArray;
    private static final int maxOpcode;
    private final boolean controlFrame;
    private final int opcode;
    private static final /* synthetic */ p126o6.a $ENTRIES = com.google.crypto.tink.shaded.protobuf.q0.t(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.websocket.FrameType.Companion INSTANCE = new io.ktor.websocket.FrameType.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/ktor/websocket/FrameType$Companion;", "", "<init>", "()V", "", "opcode", "Lio/ktor/websocket/FrameType;", "get", "(I)Lio/ktor/websocket/FrameType;", "maxOpcode", "I", "", "byOpcodeArray", "[Lio/ktor/websocket/FrameType;", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final io.ktor.websocket.FrameType get(int opcode) {
            if (opcode < 0 || opcode > io.ktor.websocket.FrameType.maxOpcode) {
                return null;
            }
            return io.ktor.websocket.FrameType.byOpcodeArray[opcode];
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        java.lang.Object next;
        java.util.Iterator<E> it = getEntries().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int i3 = ((io.ktor.websocket.FrameType) next).opcode;
                do {
                    java.lang.Object next2 = it.next();
                    int i9 = ((io.ktor.websocket.FrameType) next2).opcode;
                    if (i3 < i9) {
                        next = next2;
                        i3 = i9;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        kotlin.jvm.internal.m.b(next);
        int i10 = ((io.ktor.websocket.FrameType) next).opcode;
        maxOpcode = i10;
        int i11 = i10 + 1;
        io.ktor.websocket.FrameType[] frameTypeArr = new io.ktor.websocket.FrameType[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            java.util.Iterator<E> it2 = getEntries().iterator();
            java.lang.Object obj = null;
            boolean z6 = false;
            while (true) {
                if (!it2.hasNext()) {
                    if (z6) {
                        break;
                    }
                } else {
                    java.lang.Object next3 = it2.next();
                    if (((io.ktor.websocket.FrameType) next3).opcode == i12) {
                        if (!z6) {
                            z6 = true;
                            obj = next3;
                        }
                    }
                }
                obj = null;
                break;
            }
            frameTypeArr[i12] = obj;
        }
        byOpcodeArray = frameTypeArr;
    }

    FrameType(boolean z6, int i3) {
        this.controlFrame = z6;
        this.opcode = i3;
    }

    public static p126o6.a getEntries() {
        return $ENTRIES;
    }

    public final boolean getControlFrame() {
        return this.controlFrame;
    }

    public final int getOpcode() {
        return this.opcode;
    }
}
