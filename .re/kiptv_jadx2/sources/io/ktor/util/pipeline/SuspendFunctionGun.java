package io.ktor.util.pipeline;

import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p100l6.c;
import p100l6.h;
import p109m6.a;
import p194x6.n;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004Bc\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001\u0012J\u0010\f\u001aF\u0012B\u0012@\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000b0\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0090@¢\u0006\u0004\b\u001f\u0010\u001eJ\u001d\u0010$\u001a\u00020\n2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0000¢\u0006\u0004\b\"\u0010#RX\u0010\f\u001aF\u0012B\u0012@\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%R \u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010&\u001a\u0004\b'\u0010(R\"\u0010\u001c\u001a\u00028\u00008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u0016R\"\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u0014\u00107\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lio/ktor/util/pipeline/SuspendFunctionGun;", "", "TSubject", "TContext", "Lio/ktor/util/pipeline/PipelineContext;", "initial", "context", "", "Lkotlin/Function3;", "Ll6/c;", "Lh6/A;", "Lio/ktor/util/pipeline/PipelineInterceptor;", "blocks", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;)V", "", "direct", "loop", "(Z)Z", "Lh6/n;", "result", "resumeRootWith", "(Ljava/lang/Object;)V", "discardLastRootContinuation", "()V", "finish", "proceed", "(Ll6/c;)Ljava/lang/Object;", "subject", "proceedWith", "(Ljava/lang/Object;Ll6/c;)Ljava/lang/Object;", "execute$ktor_utils", "execute", "continuation", "addContinuation$ktor_utils", "(Ll6/c;)V", "addContinuation", "Ljava/util/List;", "Ll6/c;", "getContinuation$ktor_utils", "()Ll6/c;", "Ljava/lang/Object;", "getSubject", "()Ljava/lang/Object;", "setSubject", "", "suspensions", "[Ll6/c;", "", "lastSuspensionIndex", "I", "index", "Ll6/h;", "getCoroutineContext", "()Ll6/h;", "coroutineContext", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SuspendFunctionGun<TSubject, TContext> extends PipelineContext<TSubject, TContext> {
    private final List<n> blocks;
    private final c continuation;
    private int index;
    private int lastSuspensionIndex;
    private TSubject subject;
    private final c[] suspensions;

    public SuspendFunctionGun(TSubject initial, TContext context, List<? extends n> blocks) {
        super(context);
        m.e(initial, "initial");
        m.e(context, "context");
        m.e(blocks, "blocks");
        this.blocks = blocks;
        this.continuation = new SuspendFunctionGun$continuation$1(this);
        this.subject = initial;
        this.suspensions = new c[blocks.size()];
        this.lastSuspensionIndex = -1;
    }

    private final void discardLastRootContinuation() {
        int i3 = this.lastSuspensionIndex;
        if (i3 < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        c[] cVarArr = this.suspensions;
        this.lastSuspensionIndex = i3 - 1;
        cVarArr[i3] = null;
    }

    public final boolean loop(boolean direct) {
        int i3;
        do {
            i3 = this.index;
            if (i3 == this.blocks.size()) {
                if (direct) {
                    return true;
                }
                resumeRootWith(getSubject());
                return false;
            }
            this.index = i3 + 1;
            try {
            } catch (Throwable th) {
                resumeRootWith(P.T(th));
                return false;
            }
        } while (PipelineJvmKt.pipelineStartCoroutineUninterceptedOrReturn(this.blocks.get(i3), this, getSubject(), this.continuation) != a.f25430h);
        return false;
    }

    public final void resumeRootWith(Object result) {
        int i3 = this.lastSuspensionIndex;
        if (i3 < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        c cVar = this.suspensions[i3];
        m.b(cVar);
        c[] cVarArr = this.suspensions;
        int i9 = this.lastSuspensionIndex;
        this.lastSuspensionIndex = i9 - 1;
        cVarArr[i9] = null;
        if (!(result instanceof p070h6.m)) {
            cVar.resumeWith(result);
            return;
        }
        Throwable thA = p070h6.n.a(result);
        m.b(thA);
        cVar.resumeWith(P.T(StackTraceRecoverKt.recoverStackTraceBridge(thA, cVar)));
    }

    public final void addContinuation$ktor_utils(c continuation) {
        m.e(continuation, "continuation");
        c[] cVarArr = this.suspensions;
        int i3 = this.lastSuspensionIndex + 1;
        this.lastSuspensionIndex = i3;
        cVarArr[i3] = continuation;
    }

    @Override
    public Object execute$ktor_utils(TSubject tsubject, c cVar) {
        this.index = 0;
        if (this.blocks.size() == 0) {
            return tsubject;
        }
        setSubject(tsubject);
        if (this.lastSuspensionIndex < 0) {
            return proceed(cVar);
        }
        throw new IllegalStateException("Already started");
    }

    @Override
    public void finish() {
        this.index = this.blocks.size();
    }

    public final c getContinuation() {
        return this.continuation;
    }

    @Override
    public h getCoroutineContext() {
        return this.continuation.getContext();
    }

    @Override
    public TSubject getSubject() {
        return this.subject;
    }

    @Override
    public Object proceed(c frame) {
        Object subject;
        if (this.index == this.blocks.size()) {
            subject = getSubject();
        } else {
            addContinuation$ktor_utils(P.h0(frame));
            if (loop(true)) {
                discardLastRootContinuation();
                subject = getSubject();
            } else {
                subject = a.f25430h;
            }
        }
        if (subject == a.f25430h) {
            m.e(frame, "frame");
        }
        return subject;
    }

    @Override
    public Object proceedWith(TSubject tsubject, c cVar) {
        setSubject(tsubject);
        return proceed(cVar);
    }

    @Override
    public void setSubject(TSubject tsubject) {
        m.e(tsubject, "<set-?>");
        this.subject = tsubject;
    }
}
