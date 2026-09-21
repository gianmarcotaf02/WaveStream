package io.ktor.network.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u001c\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR*\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lio/ktor/network/util/Timeout;", "", "", "name", "", "timeoutMs", "Lkotlin/Function0;", "clock", "LS7/A;", "scope", "Lkotlin/Function1;", "Ll6/c;", "Lh6/A;", "onTimeout", "<init>", "(Ljava/lang/String;JLkotlin/jvm/functions/Function0;LS7/A;Lx6/j;)V", "LS7/h0;", "initTimeoutJob", "()LS7/h0;", androidx.media3.extractor.text.ttml.TtmlNode.START, "()V", "stop", "finish", "Ljava/lang/String;", "J", "Lkotlin/jvm/functions/Function0;", "LS7/A;", "Lx6/j;", "workerJob", "LS7/h0;", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Timeout {
    private final kotlin.jvm.functions.Function0 clock;
    volatile /* synthetic */ int isStarted;
    volatile /* synthetic */ long lastActivityTime;
    private final java.lang.String name;
    private final p194x6.j onTimeout;
    private final S7.A scope;
    private final long timeoutMs;
    private S7.InterfaceC0891h0 workerJob;

    /* JADX INFO: renamed from: io.ktor.network.util.Timeout$initTimeoutJob$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "Lh6/A;", "<anonymous>", "(LS7/A;)V"}, k = 3, mv = {2, 1, 0})
    @p117n6.e(c = "io.ktor.network.util.Timeout$initTimeoutJob$1", f = "Utils.kt", l = {55, 57, 58}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p117n6.i implements p194x6.m {
        int label;

        public AnonymousClass1(p100l6.c cVar) {
            super(2, cVar);
        }

        @Override // p117n6.a
        public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
            return io.ktor.network.util.Timeout.this.new AnonymousClass1(cVar);
        }

        @Override // p194x6.m
        public final java.lang.Object invoke(S7.A a2, p100l6.c cVar) {
            return ((io.ktor.network.util.Timeout.AnonymousClass1) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x007e A[EDGE_INSN: B:27:0x007e->B:30:0x0087 BREAK  A[LOOP:0: B:15:0x0027->B:38:?]] */
        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            long jLongValue;
            p194x6.j jVar;
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            try {
                if (i3 == 0 || i3 == 1) {
                    com.google.common.util.concurrent.P.u0(obj);
                    do {
                        if (io.ktor.network.util.Timeout.this.isStarted == 0) {
                            io.ktor.network.util.Timeout timeout = io.ktor.network.util.Timeout.this;
                            timeout.lastActivityTime = ((java.lang.Number) timeout.clock.invoke()).longValue();
                        }
                        jLongValue = (io.ktor.network.util.Timeout.this.lastActivityTime + io.ktor.network.util.Timeout.this.timeoutMs) - ((java.lang.Number) io.ktor.network.util.Timeout.this.clock.invoke()).longValue();
                        if (jLongValue <= 0 && io.ktor.network.util.Timeout.this.isStarted != 0) {
                            this.label = 2;
                            if (S7.C.M(this) != aVar) {
                                jVar = io.ktor.network.util.Timeout.this.onTimeout;
                                this.label = 3;
                                if (jVar.invoke(this) == aVar) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            this.label = 1;
                        }
                    } while (S7.C.n(jLongValue, this) != aVar);
                    return aVar;
                }
                if (i3 == 2) {
                    com.google.common.util.concurrent.P.u0(obj);
                    jVar = io.ktor.network.util.Timeout.this.onTimeout;
                    this.label = 3;
                    if (jVar.invoke(this) == aVar) {
                        break;
                        return aVar;
                    }
                } else {
                    if (i3 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj);
                }
            } catch (java.lang.Throwable unused) {
            }
            return p070h6.A.f22523a;
        }
    }

    public Timeout(java.lang.String name, long j, kotlin.jvm.functions.Function0 clock, S7.A scope, p194x6.j onTimeout) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(clock, "clock");
        kotlin.jvm.internal.m.e(scope, "scope");
        kotlin.jvm.internal.m.e(onTimeout, "onTimeout");
        this.name = name;
        this.timeoutMs = j;
        this.clock = clock;
        this.scope = scope;
        this.onTimeout = onTimeout;
        this.lastActivityTime = 0L;
        this.isStarted = 0;
        this.workerJob = initTimeoutJob();
    }

    private final S7.InterfaceC0891h0 initTimeoutJob() {
        if (this.timeoutMs == Long.MAX_VALUE) {
            return null;
        }
        S7.A a2 = this.scope;
        return S7.C.A(a2, a2.getCoroutineContext().plus(new S7.C0909z("Timeout " + this.name)), new io.ktor.network.util.Timeout.AnonymousClass1(null), 2);
    }

    public final void finish() {
        S7.InterfaceC0891h0 interfaceC0891h0 = this.workerJob;
        if (interfaceC0891h0 != null) {
            interfaceC0891h0.e(null);
        }
    }

    public final void start() {
        this.lastActivityTime = ((java.lang.Number) this.clock.invoke()).longValue();
        this.isStarted = 1;
    }

    public final void stop() {
        this.isStarted = 0;
    }
}
