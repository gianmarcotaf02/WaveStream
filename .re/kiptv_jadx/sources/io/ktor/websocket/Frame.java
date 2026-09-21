package io.ktor.websocket;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 (2\u00020\u0001:\u0006)*+,-(BI\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b \u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b!\u0010\u0016R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\"\u0010\u0016R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\u0082\u0001\u0005./012¨\u00063"}, d2 = {"Lio/ktor/websocket/Frame;", "", "", "fin", "Lio/ktor/websocket/FrameType;", "frameType", "", "data", "LS7/O;", "disposableHandle", "rsv1", "rsv2", "rsv3", "<init>", "(ZLio/ktor/websocket/FrameType;[BLS7/O;ZZZ)V", "", "toString", "()Ljava/lang/String;", "copy", "()Lio/ktor/websocket/Frame;", "Z", "getFin", "()Z", "Lio/ktor/websocket/FrameType;", "getFrameType", "()Lio/ktor/websocket/FrameType;", "[B", "getData", "()[B", "LS7/O;", "getDisposableHandle", "()LS7/O;", "getRsv1", "getRsv2", "getRsv3", "Ljava/nio/ByteBuffer;", "buffer", "Ljava/nio/ByteBuffer;", "getBuffer", "()Ljava/nio/ByteBuffer;", "Companion", "Binary", "Text", "Close", "Ping", "Pong", "Lio/ktor/websocket/Frame$Binary;", "Lio/ktor/websocket/Frame$Close;", "Lio/ktor/websocket/Frame$Ping;", "Lio/ktor/websocket/Frame$Pong;", "Lio/ktor/websocket/Frame$Text;", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class Frame {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.websocket.Frame.Companion INSTANCE = new io.ktor.websocket.Frame.Companion(null);
    private static final byte[] Empty = new byte[0];
    private final java.nio.ByteBuffer buffer;
    private final byte[] data;
    private final S7.O disposableHandle;
    private final boolean fin;
    private final io.ktor.websocket.FrameType frameType;
    private final boolean rsv1;
    private final boolean rsv2;
    private final boolean rsv3;

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\t\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/ktor/websocket/Frame$Binary;", "Lio/ktor/websocket/Frame;", "", "fin", "", "data", "rsv1", "rsv2", "rsv3", "<init>", "(Z[BZZZ)V", "Ljava/nio/ByteBuffer;", "buffer", "(ZLjava/nio/ByteBuffer;)V", "(Z[B)V", "Lk8/n;", "packet", "(ZLk8/n;)V", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Binary extends io.ktor.websocket.Frame {
        public /* synthetic */ Binary(boolean z6, byte[] bArr, boolean z9, boolean z10, boolean z11, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this(z6, bArr, (i3 & 4) != 0 ? false : z9, (i3 & 8) != 0 ? false : z10, (i3 & 16) != 0 ? false : z11);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Binary(boolean z6, byte[] data, boolean z9, boolean z10, boolean z11) {
            super(z6, io.ktor.websocket.FrameType.BINARY, data, io.ktor.websocket.NonDisposableHandle.INSTANCE, z9, z10, z11, null);
            kotlin.jvm.internal.m.e(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Binary(boolean z6, java.nio.ByteBuffer buffer) {
            this(z6, io.ktor.util.NIOKt.moveToByteArray(buffer));
            kotlin.jvm.internal.m.e(buffer, "buffer");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Binary(boolean z6, byte[] data) {
            this(z6, data, false, false, false);
            kotlin.jvm.internal.m.e(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Binary(boolean z6, p094k8.n packet) {
            this(z6, p094k8.p.i(packet, -1));
            kotlin.jvm.internal.m.e(packet, "packet");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB\t\b\u0016¢\u0006\u0004\b\u0004\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0004\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/ktor/websocket/Frame$Close;", "Lio/ktor/websocket/Frame;", "", "data", "<init>", "([B)V", "Lio/ktor/websocket/CloseReason;", io.sentry.clientreport.DiscardedEvent.JsonKeys.REASON, "(Lio/ktor/websocket/CloseReason;)V", "Lk8/n;", "packet", "(Lk8/n;)V", "()V", "Ljava/nio/ByteBuffer;", "buffer", "(Ljava/nio/ByteBuffer;)V", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Close extends io.ktor.websocket.Frame {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Close(byte[] data) {
            super(true, io.ktor.websocket.FrameType.CLOSE, data, io.ktor.websocket.NonDisposableHandle.INSTANCE, false, false, false, null);
            kotlin.jvm.internal.m.e(data, "data");
        }

        public Close() {
            this(io.ktor.websocket.Frame.Empty);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Close(java.nio.ByteBuffer buffer) {
            this(io.ktor.util.NIOKt.moveToByteArray(buffer));
            kotlin.jvm.internal.m.e(buffer, "buffer");
        }

        public Close(io.ktor.websocket.CloseReason reason) {
            kotlin.jvm.internal.m.e(reason, "reason");
            p094k8.a aVar = new p094k8.a();
            aVar.l(reason.getCode());
            io.ktor.utils.io.core.StringsKt.writeText$default(aVar, reason.getMessage(), 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
            this(aVar);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Close(p094k8.n packet) {
            this(p094k8.p.i(packet, -1));
            kotlin.jvm.internal.m.e(packet, "packet");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/ktor/websocket/Frame$Companion;", "", "<init>", "()V", "", "fin", "Lio/ktor/websocket/FrameType;", "frameType", "", "data", "rsv1", "rsv2", "rsv3", "Lio/ktor/websocket/Frame;", "byType", "(ZLio/ktor/websocket/FrameType;[BZZZ)Lio/ktor/websocket/Frame;", "Empty", "[B", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {

        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[io.ktor.websocket.FrameType.values().length];
                try {
                    iArr[io.ktor.websocket.FrameType.BINARY.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[io.ktor.websocket.FrameType.TEXT.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[io.ktor.websocket.FrameType.CLOSE.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[io.ktor.websocket.FrameType.PING.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[io.ktor.websocket.FrameType.PONG.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final io.ktor.websocket.Frame byType(boolean fin, io.ktor.websocket.FrameType frameType, byte[] data, boolean rsv1, boolean rsv2, boolean rsv3) {
            kotlin.jvm.internal.m.e(frameType, "frameType");
            kotlin.jvm.internal.m.e(data, "data");
            int i3 = io.ktor.websocket.Frame.Companion.WhenMappings.$EnumSwitchMapping$0[frameType.ordinal()];
            if (i3 == 1) {
                return new io.ktor.websocket.Frame.Binary(fin, data, rsv1, rsv2, rsv3);
            }
            if (i3 == 2) {
                return new io.ktor.websocket.Frame.Text(fin, data, rsv1, rsv2, rsv3);
            }
            if (i3 == 3) {
                return new io.ktor.websocket.Frame.Close(data);
            }
            if (i3 == 4) {
                return new io.ktor.websocket.Frame.Ping(data);
            }
            if (i3 == 5) {
                return new io.ktor.websocket.Frame.Pong(data, io.ktor.websocket.NonDisposableHandle.INSTANCE);
            }
            throw new I3.b();
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/websocket/Frame$Ping;", "Lio/ktor/websocket/Frame;", "", "data", "<init>", "([B)V", "Lk8/n;", "packet", "(Lk8/n;)V", "Ljava/nio/ByteBuffer;", "buffer", "(Ljava/nio/ByteBuffer;)V", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Ping extends io.ktor.websocket.Frame {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ping(byte[] data) {
            super(true, io.ktor.websocket.FrameType.PING, data, io.ktor.websocket.NonDisposableHandle.INSTANCE, false, false, false, null);
            kotlin.jvm.internal.m.e(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Ping(java.nio.ByteBuffer buffer) {
            this(io.ktor.util.NIOKt.moveToByteArray(buffer));
            kotlin.jvm.internal.m.e(buffer, "buffer");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Ping(p094k8.n packet) {
            this(p094k8.p.i(packet, -1));
            kotlin.jvm.internal.m.e(packet, "packet");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\t\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\t\u0010\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\t\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/ktor/websocket/Frame$Text;", "Lio/ktor/websocket/Frame;", "", "fin", "", "data", "rsv1", "rsv2", "rsv3", "<init>", "(Z[BZZZ)V", "(Z[B)V", "", "text", "(Ljava/lang/String;)V", "Lk8/n;", "packet", "(ZLk8/n;)V", "Ljava/nio/ByteBuffer;", "buffer", "(ZLjava/nio/ByteBuffer;)V", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Text extends io.ktor.websocket.Frame {
        public /* synthetic */ Text(boolean z6, byte[] bArr, boolean z9, boolean z10, boolean z11, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this(z6, bArr, (i3 & 4) != 0 ? false : z9, (i3 & 8) != 0 ? false : z10, (i3 & 16) != 0 ? false : z11);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Text(boolean z6, byte[] data, boolean z9, boolean z10, boolean z11) {
            super(z6, io.ktor.websocket.FrameType.TEXT, data, io.ktor.websocket.NonDisposableHandle.INSTANCE, z9, z10, z11, null);
            kotlin.jvm.internal.m.e(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Text(boolean z6, byte[] data) {
            this(z6, data, false, false, false);
            kotlin.jvm.internal.m.e(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Text(java.lang.String text) {
            this(true, io.ktor.utils.io.core.StringsKt.toByteArray$default(text, null, 1, null));
            kotlin.jvm.internal.m.e(text, "text");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Text(boolean z6, java.nio.ByteBuffer buffer) {
            this(z6, io.ktor.util.NIOKt.moveToByteArray(buffer));
            kotlin.jvm.internal.m.e(buffer, "buffer");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Text(boolean z6, p094k8.n packet) {
            this(z6, p094k8.p.i(packet, -1));
            kotlin.jvm.internal.m.e(packet, "packet");
        }
    }

    public /* synthetic */ Frame(boolean z6, io.ktor.websocket.FrameType frameType, byte[] bArr, S7.O o8, boolean z9, boolean z10, boolean z11, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(z6, frameType, bArr, o8, z9, z10, z11);
    }

    public final io.ktor.websocket.Frame copy() {
        io.ktor.websocket.Frame.Companion companion = INSTANCE;
        boolean z6 = this.fin;
        io.ktor.websocket.FrameType frameType = this.frameType;
        byte[] bArr = this.data;
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.m.d(bArrCopyOf, "copyOf(...)");
        return companion.byType(z6, frameType, bArrCopyOf, this.rsv1, this.rsv2, this.rsv3);
    }

    public final java.nio.ByteBuffer getBuffer() {
        return this.buffer;
    }

    public final byte[] getData() {
        return this.data;
    }

    public final S7.O getDisposableHandle() {
        return this.disposableHandle;
    }

    public final boolean getFin() {
        return this.fin;
    }

    public final io.ktor.websocket.FrameType getFrameType() {
        return this.frameType;
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

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Frame ");
        sb.append(this.frameType);
        sb.append(" (fin=");
        sb.append(this.fin);
        sb.append(", buffer len = ");
        return Y6.f.j(sb, this.data.length, ')');
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/websocket/Frame$Pong;", "Lio/ktor/websocket/Frame;", "", "data", "LS7/O;", "disposableHandle", "<init>", "([BLS7/O;)V", "Lk8/n;", "packet", "(Lk8/n;)V", "Ljava/nio/ByteBuffer;", "buffer", "(Ljava/nio/ByteBuffer;LS7/O;)V", "(Ljava/nio/ByteBuffer;)V", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Pong extends io.ktor.websocket.Frame {
        public /* synthetic */ Pong(byte[] bArr, S7.O o8, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this(bArr, (i3 & 2) != 0 ? io.ktor.websocket.NonDisposableHandle.INSTANCE : o8);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pong(byte[] data, S7.O disposableHandle) {
            super(true, io.ktor.websocket.FrameType.PONG, data, disposableHandle, false, false, false, null);
            kotlin.jvm.internal.m.e(data, "data");
            kotlin.jvm.internal.m.e(disposableHandle, "disposableHandle");
        }

        public /* synthetic */ Pong(java.nio.ByteBuffer byteBuffer, S7.O o8, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this(byteBuffer, (i3 & 2) != 0 ? io.ktor.websocket.NonDisposableHandle.INSTANCE : o8);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Pong(java.nio.ByteBuffer buffer, S7.O disposableHandle) {
            this(io.ktor.util.NIOKt.moveToByteArray(buffer), disposableHandle);
            kotlin.jvm.internal.m.e(buffer, "buffer");
            kotlin.jvm.internal.m.e(disposableHandle, "disposableHandle");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Pong(java.nio.ByteBuffer buffer) {
            this(io.ktor.util.NIOKt.moveToByteArray(buffer), io.ktor.websocket.NonDisposableHandle.INSTANCE);
            kotlin.jvm.internal.m.e(buffer, "buffer");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Pong(p094k8.n packet) {
            this(p094k8.p.i(packet, -1), io.ktor.websocket.NonDisposableHandle.INSTANCE);
            kotlin.jvm.internal.m.e(packet, "packet");
        }
    }

    private Frame(boolean z6, io.ktor.websocket.FrameType frameType, byte[] bArr, S7.O o8, boolean z9, boolean z10, boolean z11) {
        this.fin = z6;
        this.frameType = frameType;
        this.data = bArr;
        this.disposableHandle = o8;
        this.rsv1 = z9;
        this.rsv2 = z10;
        this.rsv3 = z11;
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr);
        kotlin.jvm.internal.m.d(byteBufferWrap, "wrap(...)");
        this.buffer = byteBufferWrap;
    }

    public /* synthetic */ Frame(boolean z6, io.ktor.websocket.FrameType frameType, byte[] bArr, S7.O o8, boolean z9, boolean z10, boolean z11, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(z6, frameType, bArr, (i3 & 8) != 0 ? io.ktor.websocket.NonDisposableHandle.INSTANCE : o8, (i3 & 16) != 0 ? false : z9, (i3 & 32) != 0 ? false : z10, (i3 & 64) != 0 ? false : z11, null);
    }
}
