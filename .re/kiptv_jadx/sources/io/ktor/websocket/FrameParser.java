package io.ktor.websocket;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u0003J\u0015\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R$\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R$\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R$\u0010 \u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u0016\u0010&\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$R$\u0010(\u001a\u00020'2\u0006\u0010\u0015\u001a\u00020'8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R(\u0010,\u001a\u0004\u0018\u00010\"2\b\u0010\u0015\u001a\u0004\u0018\u00010\"8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0011\u00103\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00105\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b4\u0010\u0019¨\u00067"}, d2 = {"Lio/ktor/websocket/FrameParser;", "", "<init>", "()V", "Ljava/nio/ByteBuffer;", "bb", "", "handleStep", "(Ljava/nio/ByteBuffer;)Z", "parseHeader1", "parseLength", "parseMaskKey", "Lh6/A;", "bodyComplete", "frame", "(Ljava/nio/ByteBuffer;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Lio/ktor/websocket/FrameParser$State;", "kotlin.jvm.PlatformType", io.sentry.protocol.SentryThread.JsonKeys.STATE, "Ljava/util/concurrent/atomic/AtomicReference;", "value", "fin", "Z", "getFin", "()Z", "rsv1", "getRsv1", "rsv2", "getRsv2", "rsv3", "getRsv3", "mask", "getMask", "", "opcode", "I", "lastOpcode", "lengthLength", "", io.sentry.SentryEnvelopeItemHeader.JsonKeys.LENGTH, "J", "getLength", "()J", "maskKey", "Ljava/lang/Integer;", "getMaskKey", "()Ljava/lang/Integer;", "Lio/ktor/websocket/FrameType;", "getFrameType", "()Lio/ktor/websocket/FrameType;", "frameType", "getBodyReady", "bodyReady", "State", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class FrameParser {
    private boolean fin;
    private int lastOpcode;
    private long length;
    private int lengthLength;
    private boolean mask;
    private java.lang.Integer maskKey;
    private int opcode;
    private boolean rsv1;
    private boolean rsv2;
    private boolean rsv3;
    private final java.util.concurrent.atomic.AtomicReference<io.ktor.websocket.FrameParser.State> state = new java.util.concurrent.atomic.AtomicReference<>(io.ktor.websocket.FrameParser.State.HEADER0);

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lio/ktor/websocket/FrameParser$State;", "", "<init>", "(Ljava/lang/String;I)V", "HEADER0", "LENGTH", "MASK_KEY", "BODY", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public enum State {
        HEADER0,
        LENGTH,
        MASK_KEY,
        BODY;

        private static final /* synthetic */ p126o6.a $ENTRIES = com.google.crypto.tink.shaded.protobuf.q0.t(values());

        public static p126o6.a getEntries() {
            return $ENTRIES;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[io.ktor.websocket.FrameParser.State.values().length];
            try {
                iArr[io.ktor.websocket.FrameParser.State.HEADER0.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[io.ktor.websocket.FrameParser.State.LENGTH.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[io.ktor.websocket.FrameParser.State.MASK_KEY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[io.ktor.websocket.FrameParser.State.BODY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final boolean handleStep(java.nio.ByteBuffer bb) {
        io.ktor.websocket.FrameParser.State state = this.state.get();
        kotlin.jvm.internal.m.b(state);
        int i3 = io.ktor.websocket.FrameParser.WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i3 == 1) {
            return parseHeader1(bb);
        }
        if (i3 == 2) {
            return parseLength(bb);
        }
        if (i3 == 3) {
            return parseMaskKey(bb);
        }
        if (i3 == 4) {
            return false;
        }
        throw new I3.b();
    }

    private final boolean parseHeader1(java.nio.ByteBuffer bb) throws io.ktor.websocket.ProtocolViolationException {
        int i3 = 0;
        if (bb.remaining() < 2) {
            return false;
        }
        byte b9 = bb.get();
        byte b10 = bb.get();
        this.fin = (b9 & 128) != 0;
        this.rsv1 = (b9 & 64) != 0;
        this.rsv2 = (b9 & 32) != 0;
        this.rsv3 = (b9 & 16) != 0;
        int i9 = b9 & 15;
        this.opcode = i9;
        if (i9 == 0 && this.lastOpcode == 0) {
            throw new io.ktor.websocket.ProtocolViolationException("Can't continue finished frames");
        }
        if (i9 == 0) {
            this.opcode = this.lastOpcode;
        } else if (this.lastOpcode != 0 && !getFrameType().getControlFrame()) {
            throw new io.ktor.websocket.ProtocolViolationException("Can't start new data frame before finishing previous one");
        }
        if (!getFrameType().getControlFrame()) {
            this.lastOpcode = this.fin ? 0 : this.opcode;
        } else if (!this.fin) {
            throw new io.ktor.websocket.ProtocolViolationException("control frames can't be fragmented");
        }
        this.mask = (b10 & 128) != 0;
        int i10 = b10 & 127;
        if (getFrameType().getControlFrame() && i10 > 125) {
            throw new io.ktor.websocket.ProtocolViolationException("control frames can't be larger than 125 bytes");
        }
        if (i10 == 126) {
            i3 = 2;
        } else if (i10 == 127) {
            i3 = 8;
        }
        this.lengthLength = i3;
        this.length = i3 == 0 ? i10 : 0L;
        if (i3 > 0) {
            this.state.set(io.ktor.websocket.FrameParser.State.LENGTH);
        } else if (this.mask) {
            this.state.set(io.ktor.websocket.FrameParser.State.MASK_KEY);
        } else {
            this.state.set(io.ktor.websocket.FrameParser.State.BODY);
        }
        return true;
    }

    private final boolean parseLength(java.nio.ByteBuffer bb) {
        long j;
        int iRemaining = bb.remaining();
        int i3 = this.lengthLength;
        if (iRemaining < i3) {
            return false;
        }
        if (i3 == 2) {
            j = ((long) bb.getShort()) & 65535;
        } else {
            if (i3 != 8) {
                throw new java.lang.IllegalStateException();
            }
            j = bb.getLong();
        }
        this.length = j;
        this.state.set(this.mask ? io.ktor.websocket.FrameParser.State.MASK_KEY : io.ktor.websocket.FrameParser.State.BODY);
        return true;
    }

    private final boolean parseMaskKey(java.nio.ByteBuffer bb) {
        if (bb.remaining() < 4) {
            return false;
        }
        this.maskKey = java.lang.Integer.valueOf(bb.getInt());
        this.state.set(io.ktor.websocket.FrameParser.State.BODY);
        return true;
    }

    public final void bodyComplete() {
        java.util.concurrent.atomic.AtomicReference<io.ktor.websocket.FrameParser.State> atomicReference = this.state;
        io.ktor.websocket.FrameParser.State state = io.ktor.websocket.FrameParser.State.BODY;
        io.ktor.websocket.FrameParser.State state2 = io.ktor.websocket.FrameParser.State.HEADER0;
        while (!atomicReference.compareAndSet(state, state2)) {
            if (atomicReference.get() != state) {
                throw new java.lang.IllegalStateException("It should be state BODY but it is " + this.state.get());
            }
        }
        this.opcode = 0;
        this.length = 0L;
        this.lengthLength = 0;
        this.maskKey = null;
    }

    public final void frame(java.nio.ByteBuffer bb) {
        kotlin.jvm.internal.m.e(bb, "bb");
        if (kotlin.jvm.internal.m.a(bb.order(), java.nio.ByteOrder.BIG_ENDIAN)) {
            while (handleStep(bb)) {
            }
        } else {
            throw new java.lang.IllegalArgumentException(("Buffer order should be BIG_ENDIAN but it is " + bb.order()).toString());
        }
    }

    public final boolean getBodyReady() {
        return this.state.get() == io.ktor.websocket.FrameParser.State.BODY;
    }

    public final boolean getFin() {
        return this.fin;
    }

    public final io.ktor.websocket.FrameType getFrameType() {
        io.ktor.websocket.FrameType frameType = io.ktor.websocket.FrameType.INSTANCE.get(this.opcode);
        if (frameType != null) {
            return frameType;
        }
        throw new java.lang.IllegalStateException("Unsupported opcode " + java.lang.Integer.toHexString(this.opcode));
    }

    public final long getLength() {
        return this.length;
    }

    public final boolean getMask() {
        return this.mask;
    }

    public final java.lang.Integer getMaskKey() {
        return this.maskKey;
    }

    public final boolean getRsv1() {
        return this.rsv1;
    }

    public final boolean getRsv2() {
        return this.rsv2;
    }

    public final boolean getRsv3() {
        return this.rsv3;
    }
}
