package io.ktor.util.pipeline;

import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.P;
import io.ktor.utils.io.KtorDsl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p100l6.h;
import p109m6.a;
import p117n6.c;
import p117n6.e;
import p194x6.n;

@KtorDsl
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004Bk\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012J\u0010\u000b\u001aF\u0012B\u0012@\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\n0\u0006\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0017\u0010\u0012J\u0018\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0000H\u0090@¢\u0006\u0004\b\u0019\u0010\u0016RX\u0010\u000b\u001aF\u0012B\u0012@\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\f\u001a\u00028\u00008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lio/ktor/util/pipeline/DebugPipelineContext;", "", "TSubject", "TContext", "Lio/ktor/util/pipeline/PipelineContext;", "context", "", "Lkotlin/Function3;", "Ll6/c;", "Lh6/A;", "Lio/ktor/util/pipeline/PipelineInterceptor;", "interceptors", "subject", "Ll6/h;", "coroutineContext", "<init>", "(Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;Ll6/h;)V", "proceedLoop", "(Ll6/c;)Ljava/lang/Object;", "finish", "()V", "proceedWith", "(Ljava/lang/Object;Ll6/c;)Ljava/lang/Object;", "proceed", "initial", "execute$ktor_utils", "execute", "Ljava/util/List;", "Ll6/h;", "getCoroutineContext", "()Ll6/h;", "Ljava/lang/Object;", "getSubject", "()Ljava/lang/Object;", "setSubject", "(Ljava/lang/Object;)V", "", "index", "I", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DebugPipelineContext<TSubject, TContext> extends PipelineContext<TSubject, TContext> {
    private final h coroutineContext;
    private int index;
    private final List<n> interceptors;
    private TSubject subject;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.util.pipeline.DebugPipelineContext", f = "DebugPipelineContext.kt", l = {79}, m = "proceedLoop")
    public static final class AnonymousClass1 extends c {
        Object L$0;
        int label;
        Object result;
        final DebugPipelineContext<TSubject, TContext> this$0;

        public AnonymousClass1(DebugPipelineContext<TSubject, TContext> debugPipelineContext, p100l6.c cVar) {
            super(cVar);
            this.this$0 = debugPipelineContext;
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.proceedLoop(this);
        }
    }

    public DebugPipelineContext(TContext context, List<? extends n> interceptors, TSubject subject, h coroutineContext) {
        super(context);
        m.e(context, "context");
        m.e(interceptors, "interceptors");
        m.e(subject, "subject");
        m.e(coroutineContext, "coroutineContext");
        this.interceptors = interceptors;
        this.coroutineContext = coroutineContext;
        this.subject = subject;
    }

    public final Object proceedLoop(p100l6.c cVar) {
        AnonymousClass1 anonymousClass1;
        DebugPipelineContext<TSubject, TContext> debugPipelineContext;
        n nVar;
        TSubject subject;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, cVar);
        }
        Object obj = anonymousClass1.result;
        a aVar = a.f25430h;
        int i9 = anonymousClass1.label;
        if (i9 == 0) {
            P.u0(obj);
            debugPipelineContext = this;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            debugPipelineContext = (DebugPipelineContext) anonymousClass1.L$0;
            P.u0(obj);
        }
        do {
            int i10 = debugPipelineContext.index;
            if (i10 != -1) {
                List<n> list = debugPipelineContext.interceptors;
                if (i10 >= list.size()) {
                    debugPipelineContext.finish();
                } else {
                    nVar = list.get(i10);
                    debugPipelineContext.index = i10 + 1;
                    subject = debugPipelineContext.getSubject();
                    anonymousClass1.L$0 = debugPipelineContext;
                    anonymousClass1.label = 1;
                }
            }
            return debugPipelineContext.getSubject();
        } while (nVar.invoke(debugPipelineContext, subject, anonymousClass1) != aVar);
        return aVar;
    }

    @Override
    public Object execute$ktor_utils(TSubject tsubject, p100l6.c cVar) {
        this.index = 0;
        setSubject(tsubject);
        return proceed(cVar);
    }

    @Override
    public void finish() {
        this.index = -1;
    }

    @Override
    public h getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override
    public TSubject getSubject() {
        return this.subject;
    }

    @Override
    public Object proceed(p100l6.c cVar) {
        int i3 = this.index;
        if (i3 < 0) {
            return getSubject();
        }
        if (i3 < this.interceptors.size()) {
            return proceedLoop(cVar);
        }
        finish();
        return getSubject();
    }

    @Override
    public Object proceedWith(TSubject tsubject, p100l6.c cVar) {
        setSubject(tsubject);
        return proceed(cVar);
    }

    @Override
    public void setSubject(TSubject tsubject) {
        m.e(tsubject, "<set-?>");
        this.subject = tsubject;
    }
}
