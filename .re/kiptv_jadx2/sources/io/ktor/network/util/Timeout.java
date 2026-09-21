package io.ktor.network.util;

import S7.A;
import S7.C;
import S7.C0909z;
import S7.InterfaceC0891h0;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.common.util.concurrent.P;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p100l6.c;
import p109m6.a;
import p117n6.e;
import p117n6.i;
import p194x6.j;
import p194x6.m;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u001c\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR*\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lio/ktor/network/util/Timeout;", "", "", "name", "", "timeoutMs", "Lkotlin/Function0;", "clock", "LS7/A;", "scope", "Lkotlin/Function1;", "Ll6/c;", "Lh6/A;", "onTimeout", "<init>", "(Ljava/lang/String;JLkotlin/jvm/functions/Function0;LS7/A;Lx6/j;)V", "LS7/h0;", "initTimeoutJob", "()LS7/h0;", TtmlNode.START, "()V", "stop", "finish", "Ljava/lang/String;", "J", "Lkotlin/jvm/functions/Function0;", "LS7/A;", "Lx6/j;", "workerJob", "LS7/h0;", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Timeout {
    private final Function0 clock;
    volatile int isStarted;
    volatile long lastActivityTime;
    private final String name;
    private final j onTimeout;
    private final A scope;
    private final long timeoutMs;
    private InterfaceC0891h0 workerJob;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "Lh6/A;", "<anonymous>", "(LS7/A;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.network.util.Timeout$initTimeoutJob$1", f = "Utils.kt", l = {55, 57, 58}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements m {
        int label;

        public AnonymousClass1(c cVar) {
            super(2, cVar);
        }

        @Override
        public final c create(Object obj, c cVar) {
            return Timeout.this.new AnonymousClass1(cVar);
        }

        @Override
        public final Object invoke(A a2, c cVar) {
            return ((AnonymousClass1) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            long jLongValue;
            j jVar;
            a aVar = a.f25430h;
            int i3 = this.label;
            try {
                if (i3 == 0 || i3 == 1) {
                    P.u0(obj);
                    do {
                        if (Timeout.this.isStarted == 0) {
                            Timeout timeout = Timeout.this;
                            timeout.lastActivityTime = ((Number) timeout.clock.invoke()).longValue();
                        }
                        jLongValue = (Timeout.this.lastActivityTime + Timeout.this.timeoutMs) - ((Number) Timeout.this.clock.invoke()).longValue();
                        if (jLongValue <= 0 && Timeout.this.isStarted != 0) {
                            this.label = 2;
                            if (C.M(this) != aVar) {
                                jVar = Timeout.this.onTimeout;
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
                    } while (C.n(jLongValue, this) != aVar);
                    return aVar;
                }
                if (i3 == 2) {
                    P.u0(obj);
                    jVar = Timeout.this.onTimeout;
                    this.label = 3;
                    if (jVar.invoke(this) == aVar) {
                        break;
                        return aVar;
                    }
                } else {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    P.u0(obj);
                }
            } catch (Throwable unused) {
            }
            return p070h6.A.f22523a;
        }
    }

    public Timeout(String name, long j, Function0 clock, A scope, j onTimeout) {
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

    private final InterfaceC0891h0 initTimeoutJob() {
        if (this.timeoutMs == Long.MAX_VALUE) {
            return null;
        }
        A a2 = this.scope;
        return C.A(a2, a2.getCoroutineContext().plus(new C0909z("Timeout " + this.name)), new AnonymousClass1(null), 2);
    }

    public final void finish() {
        InterfaceC0891h0 interfaceC0891h0 = this.workerJob;
        if (interfaceC0891h0 != null) {
            interfaceC0891h0.e(null);
        }
    }

    public final void start() {
        this.lastActivityTime = ((Number) this.clock.invoke()).longValue();
        this.isStarted = 1;
    }

    public final void stop() {
        this.isStarted = 0;
    }
}
