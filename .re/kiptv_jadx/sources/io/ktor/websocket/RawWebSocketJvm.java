package io.ktor.websocket;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR+\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00068V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R+\u0010\t\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010-\u001a\u00020,8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00102\u001a\u0002018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u001a068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001a0:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u001e\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030?0>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lio/ktor/websocket/RawWebSocketJvm;", "Lio/ktor/websocket/WebSocketSession;", "Lio/ktor/utils/io/ByteReadChannel;", "input", "Lio/ktor/utils/io/ByteWriteChannel;", "output", "", "maxFrameSize", "", "masking", "Ll6/h;", "coroutineContext", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "pool", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;JZLl6/h;Lio/ktor/utils/io/pool/ObjectPool;)V", "Lh6/A;", "flush", "(Ll6/c;)Ljava/lang/Object;", "terminate", "()V", "LS7/r;", "socketJob", "LS7/r;", "LU7/n;", "Lio/ktor/websocket/Frame;", "filtered", "LU7/n;", "Ll6/h;", "getCoroutineContext", "()Ll6/h;", "<set-?>", "maxFrameSize$delegate", "LA6/c;", "getMaxFrameSize", "()J", "setMaxFrameSize", "(J)V", "masking$delegate", "getMasking", "()Z", "setMasking", "(Z)V", "Lio/ktor/websocket/WebSocketWriter;", "writer", "Lio/ktor/websocket/WebSocketWriter;", "getWriter$ktor_websockets", "()Lio/ktor/websocket/WebSocketWriter;", "Lio/ktor/websocket/WebSocketReader;", "reader", "Lio/ktor/websocket/WebSocketReader;", "getReader$ktor_websockets", "()Lio/ktor/websocket/WebSocketReader;", "LU7/C;", "getIncoming", "()LU7/C;", "incoming", "LU7/D;", "getOutgoing", "()LU7/D;", "outgoing", "", "Lio/ktor/websocket/WebSocketExtension;", "getExtensions", "()Ljava/util/List;", "extensions", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RawWebSocketJvm implements io.ktor.websocket.WebSocketSession {
    static final /* synthetic */ E6.u[] $$delegatedProperties;
    private final p100l6.h coroutineContext;
    private final U7.n filtered;

    /* JADX INFO: renamed from: masking$delegate, reason: from kotlin metadata */
    private final A6.c masking;

    /* JADX INFO: renamed from: maxFrameSize$delegate, reason: from kotlin metadata */
    private final A6.c maxFrameSize;
    private final io.ktor.websocket.WebSocketReader reader;
    private final S7.r socketJob;
    private final io.ktor.websocket.WebSocketWriter writer;

    /* JADX INFO: renamed from: io.ktor.websocket.RawWebSocketJvm$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "Lh6/A;", "<anonymous>", "(LS7/A;)V"}, k = 3, mv = {2, 1, 0})
    @p117n6.e(c = "io.ktor.websocket.RawWebSocketJvm$1", f = "RawWebSocketJvm.kt", l = {dev.jdtech.mpv.MPVLib.MPV_LOG_LEVEL_TRACE, androidx.media3.extractor.ts.TsExtractor.TS_SYNC_BYTE, 74, 77}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p117n6.i implements p194x6.m {
        java.lang.Object L$0;
        int label;

        public AnonymousClass1(p100l6.c cVar) {
            super(2, cVar);
        }

        @Override // p117n6.a
        public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
            return io.ktor.websocket.RawWebSocketJvm.this.new AnonymousClass1(cVar);
        }

        @Override // p194x6.m
        public final java.lang.Object invoke(S7.A a2, p100l6.c cVar) {
            return ((io.ktor.websocket.RawWebSocketJvm.AnonymousClass1) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x0066  */
        /* JADX WARN: Code duplicated, block: B:37:0x0068  */
        /* JADX WARN: Code duplicated, block: B:40:0x0073 A[Catch: all -> 0x0039, CancellationException -> 0x003b, ProtocolViolationException -> 0x003d, FrameTooBigException -> 0x0040, TRY_LEAVE, TryCatch #5 {FrameTooBigException -> 0x0040, CancellationException -> 0x003b, blocks: (B:19:0x0034, B:34:0x005c, B:38:0x006b, B:40:0x0073, B:30:0x0047, B:33:0x004e), top: B:61:0x0009, outer: #4 }] */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0087, code lost:
        
            if (r7.send(r10, r9) == r0) goto L53;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0087 -> B:20:0x0037). Please report as a decompilation issue!!! */
        @Override // p117n6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            io.ktor.websocket.ProtocolViolationException protocolViolationException;
            io.ktor.websocket.FrameTooBigException frameTooBigException;
            U7.C0957e it;
            U7.C0957e c0957e;
            java.lang.Object objB;
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            try {
                try {
                    try {
                        if (i3 == 0) {
                            com.google.common.util.concurrent.P.u0(obj);
                            it = io.ktor.websocket.RawWebSocketJvm.this.getReader().getIncoming().iterator();
                            this.L$0 = it;
                            this.label = 1;
                            objB = it.b(this);
                            if (objB == aVar) {
                                c0957e = it;
                                obj = objB;
                                if (((java.lang.Boolean) obj).booleanValue()) {
                                    io.ktor.websocket.Frame frame = (io.ktor.websocket.Frame) c0957e.c();
                                    U7.n nVar = io.ktor.websocket.RawWebSocketJvm.this.filtered;
                                    this.L$0 = c0957e;
                                    this.label = 2;
                                }
                                io.ktor.websocket.RawWebSocketJvm.this.filtered.close(null);
                                return p070h6.A.f22523a;
                            }
                            return aVar;
                        }
                        if (i3 == 1) {
                            c0957e = (U7.C0957e) this.L$0;
                            com.google.common.util.concurrent.P.u0(obj);
                            if (((java.lang.Boolean) obj).booleanValue()) {
                                io.ktor.websocket.Frame frame2 = (io.ktor.websocket.Frame) c0957e.c();
                                U7.n nVar2 = io.ktor.websocket.RawWebSocketJvm.this.filtered;
                                this.L$0 = c0957e;
                                this.label = 2;
                            }
                            io.ktor.websocket.RawWebSocketJvm.this.filtered.close(null);
                            return p070h6.A.f22523a;
                        }
                        if (i3 != 2) {
                            if (i3 == 3) {
                                frameTooBigException = (io.ktor.websocket.FrameTooBigException) this.L$0;
                                com.google.common.util.concurrent.P.u0(obj);
                                io.ktor.websocket.RawWebSocketJvm.this.filtered.close(frameTooBigException);
                                io.ktor.websocket.RawWebSocketJvm.this.filtered.close(null);
                                return p070h6.A.f22523a;
                            }
                            if (i3 != 4) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            protocolViolationException = (io.ktor.websocket.ProtocolViolationException) this.L$0;
                            com.google.common.util.concurrent.P.u0(obj);
                            io.ktor.websocket.RawWebSocketJvm.this.filtered.close(protocolViolationException);
                            io.ktor.websocket.RawWebSocketJvm.this.filtered.close(null);
                            return p070h6.A.f22523a;
                        }
                        c0957e = (U7.C0957e) this.L$0;
                        com.google.common.util.concurrent.P.u0(obj);
                        it = c0957e;
                        this.L$0 = it;
                        this.label = 1;
                        objB = it.b(this);
                        if (objB == aVar) {
                            c0957e = it;
                            obj = objB;
                            if (((java.lang.Boolean) obj).booleanValue()) {
                                io.ktor.websocket.Frame frame3 = (io.ktor.websocket.Frame) c0957e.c();
                                U7.n nVar3 = io.ktor.websocket.RawWebSocketJvm.this.filtered;
                                this.L$0 = c0957e;
                                this.label = 2;
                            }
                            io.ktor.websocket.RawWebSocketJvm.this.filtered.close(null);
                            return p070h6.A.f22523a;
                        }
                    } catch (io.ktor.websocket.FrameTooBigException e6) {
                        U7.D outgoing = io.ktor.websocket.RawWebSocketJvm.this.getOutgoing();
                        io.ktor.websocket.Frame.Close close = new io.ktor.websocket.Frame.Close(new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.TOO_BIG, e6.getMessage()));
                        this.L$0 = e6;
                        this.label = 3;
                        if (outgoing.send(close, this) != aVar) {
                            frameTooBigException = e6;
                        }
                        return aVar;
                    } catch (java.util.concurrent.CancellationException e9) {
                        io.ktor.websocket.RawWebSocketJvm.this.getReader().getIncoming().e(e9);
                    }
                } catch (io.ktor.websocket.ProtocolViolationException e10) {
                    U7.D outgoing2 = io.ktor.websocket.RawWebSocketJvm.this.getOutgoing();
                    io.ktor.websocket.Frame.Close close2 = new io.ktor.websocket.Frame.Close(new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.PROTOCOL_ERROR, e10.getMessage()));
                    this.L$0 = e10;
                    this.label = 4;
                    if (outgoing2.send(close2, this) == aVar) {
                        return aVar;
                    }
                    protocolViolationException = e10;
                } catch (java.lang.Throwable th) {
                    io.ktor.websocket.RawWebSocketJvm.this.filtered.close(th);
                }
                return aVar;
            } catch (java.lang.Throwable th2) {
                io.ktor.websocket.RawWebSocketJvm.this.filtered.close(null);
                throw th2;
            }
        }
    }

    static {
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r(io.ktor.websocket.RawWebSocketJvm.class, "maxFrameSize", "getMaxFrameSize()J", 0);
        kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
        $$delegatedProperties = new E6.u[]{c9.f(rVar), B2.a.d(io.ktor.websocket.RawWebSocketJvm.class, "masking", "getMasking()Z", 0, c9)};
    }

    public RawWebSocketJvm(io.ktor.utils.io.ByteReadChannel input, io.ktor.utils.io.ByteWriteChannel output, long j, boolean z6, p100l6.h coroutineContext, io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> pool) {
        kotlin.jvm.internal.m.e(input, "input");
        kotlin.jvm.internal.m.e(output, "output");
        kotlin.jvm.internal.m.e(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.m.e(pool, "pool");
        S7.j0 j0Var = new S7.j0((S7.InterfaceC0891h0) coroutineContext.get(S7.C0889g0.f9584h));
        this.socketJob = j0Var;
        this.filtered = N3.a.b(0, 6, null);
        this.coroutineContext = coroutineContext.plus(j0Var).plus(new S7.C0909z("raw-ws"));
        final java.lang.Long lValueOf = java.lang.Long.valueOf(j);
        this.maxFrameSize = new A6.a(lValueOf) { // from class: io.ktor.websocket.RawWebSocketJvm$special$$inlined$observable$1
            @Override // A6.a
            public void afterChange(E6.u property, java.lang.Long oldValue, java.lang.Long newValue) {
                kotlin.jvm.internal.m.e(property, "property");
                long jLongValue = newValue.longValue();
                oldValue.longValue();
                this.getReader().setMaxFrameSize(jLongValue);
            }
        };
        final java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z6);
        this.masking = new A6.a(boolValueOf) { // from class: io.ktor.websocket.RawWebSocketJvm$special$$inlined$observable$2
            @Override // A6.a
            public void afterChange(E6.u property, java.lang.Boolean oldValue, java.lang.Boolean newValue) {
                kotlin.jvm.internal.m.e(property, "property");
                boolean zBooleanValue = newValue.booleanValue();
                oldValue.getClass();
                this.getWriter().setMasking(zBooleanValue);
            }
        };
        this.writer = new io.ktor.websocket.WebSocketWriter(output, getCoroutineContext(), z6, pool);
        this.reader = new io.ktor.websocket.WebSocketReader(input, getCoroutineContext(), j, pool);
        S7.C.A(this, null, new io.ktor.websocket.RawWebSocketJvm.AnonymousClass1(null), 3);
        j0Var.Z();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public java.lang.Object flush(p100l6.c cVar) {
        java.lang.Object objFlush = this.writer.flush(cVar);
        return objFlush == p109m6.a.f25430h ? objFlush : p070h6.A.f22523a;
    }

    @Override // io.ktor.websocket.WebSocketSession, S7.A
    public p100l6.h getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public java.util.List<io.ktor.websocket.WebSocketExtension<?>> getExtensions() {
        return p078i6.w.f23205h;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public U7.C getIncoming() {
        return this.filtered;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public boolean getMasking() {
        return ((java.lang.Boolean) this.masking.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public long getMaxFrameSize() {
        return ((java.lang.Number) this.maxFrameSize.getValue(this, $$delegatedProperties[0])).longValue();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public U7.D getOutgoing() {
        return this.writer.getOutgoing();
    }

    /* JADX INFO: renamed from: getReader$ktor_websockets, reason: from getter */
    public final io.ktor.websocket.WebSocketReader getReader() {
        return this.reader;
    }

    /* JADX INFO: renamed from: getWriter$ktor_websockets, reason: from getter */
    public final io.ktor.websocket.WebSocketWriter getWriter() {
        return this.writer;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public java.lang.Object send(io.ktor.websocket.Frame frame, p100l6.c cVar) {
        return io.ktor.websocket.WebSocketSession.DefaultImpls.send(this, frame, cVar);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMasking(boolean z6) {
        this.masking.setValue(this, $$delegatedProperties[1], java.lang.Boolean.valueOf(z6));
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMaxFrameSize(long j) {
        this.maxFrameSize.setValue(this, $$delegatedProperties[0], java.lang.Long.valueOf(j));
    }

    @Override // io.ktor.websocket.WebSocketSession
    @p070h6.c
    public void terminate() {
        getOutgoing().close(null);
        ((S7.j0) this.socketJob).Z();
    }

    public /* synthetic */ RawWebSocketJvm(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, long j, boolean z6, p100l6.h hVar, io.ktor.utils.io.pool.ObjectPool objectPool, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(byteReadChannel, byteWriteChannel, (i3 & 4) != 0 ? 2147483647L : j, (i3 & 8) != 0 ? false : z6, hVar, (i3 & 32) != 0 ? io.ktor.util.cio.ByteBufferPoolKt.getKtorDefaultPool() : objectPool);
    }
}
