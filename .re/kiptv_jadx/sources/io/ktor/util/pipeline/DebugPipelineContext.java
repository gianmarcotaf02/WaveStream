package io.ktor.util.pipeline;

/* JADX INFO: loaded from: classes4.dex */
@io.ktor.utils.io.KtorDsl
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004Bk\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012J\u0010\u000b\u001aF\u0012B\u0012@\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\n0\u0006\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0017\u0010\u0012J\u0018\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0000H\u0090@¢\u0006\u0004\b\u0019\u0010\u0016RX\u0010\u000b\u001aF\u0012B\u0012@\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\f\u001a\u00028\u00008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lio/ktor/util/pipeline/DebugPipelineContext;", "", "TSubject", "TContext", "Lio/ktor/util/pipeline/PipelineContext;", "context", "", "Lkotlin/Function3;", "Ll6/c;", "Lh6/A;", "Lio/ktor/util/pipeline/PipelineInterceptor;", "interceptors", "subject", "Ll6/h;", "coroutineContext", "<init>", "(Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;Ll6/h;)V", "proceedLoop", "(Ll6/c;)Ljava/lang/Object;", "finish", "()V", "proceedWith", "(Ljava/lang/Object;Ll6/c;)Ljava/lang/Object;", "proceed", "initial", "execute$ktor_utils", "execute", "Ljava/util/List;", "Ll6/h;", "getCoroutineContext", "()Ll6/h;", "Ljava/lang/Object;", "getSubject", "()Ljava/lang/Object;", "setSubject", "(Ljava/lang/Object;)V", "", "index", "I", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DebugPipelineContext<TSubject, TContext> extends io.ktor.util.pipeline.PipelineContext<TSubject, TContext> {
    private final p100l6.h coroutineContext;
    private int index;
    private final java.util.List<p194x6.n> interceptors;
    private TSubject subject;

    /* JADX INFO: renamed from: io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.util.pipeline.DebugPipelineContext", f = "DebugPipelineContext.kt", l = {79}, m = "proceedLoop")
    public static final class AnonymousClass1 extends p117n6.c {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ io.ktor.util.pipeline.DebugPipelineContext<TSubject, TContext> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(io.ktor.util.pipeline.DebugPipelineContext<TSubject, TContext> debugPipelineContext, p100l6.c cVar) {
            super(cVar);
            this.this$0 = debugPipelineContext;
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.proceedLoop(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DebugPipelineContext(TContext context, java.util.List<? extends p194x6.n> interceptors, TSubject subject, p100l6.h coroutineContext) {
        super(context);
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(interceptors, "interceptors");
        kotlin.jvm.internal.m.e(subject, "subject");
        kotlin.jvm.internal.m.e(coroutineContext, "coroutineContext");
        this.interceptors = interceptors;
        this.coroutineContext = coroutineContext;
        this.subject = subject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object proceedLoop(p100l6.c cVar) {
        io.ktor.util.pipeline.DebugPipelineContext.AnonymousClass1 anonymousClass1;
        io.ktor.util.pipeline.DebugPipelineContext<TSubject, TContext> debugPipelineContext;
        p194x6.n nVar;
        TSubject subject;
        if (cVar instanceof io.ktor.util.pipeline.DebugPipelineContext.AnonymousClass1) {
            anonymousClass1 = (io.ktor.util.pipeline.DebugPipelineContext.AnonymousClass1) cVar;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new io.ktor.util.pipeline.DebugPipelineContext.AnonymousClass1(this, cVar);
            }
        } else {
            anonymousClass1 = new io.ktor.util.pipeline.DebugPipelineContext.AnonymousClass1(this, cVar);
        }
        java.lang.Object obj = anonymousClass1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = anonymousClass1.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            debugPipelineContext = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            debugPipelineContext = (io.ktor.util.pipeline.DebugPipelineContext) anonymousClass1.L$0;
            com.google.common.util.concurrent.P.u0(obj);
        }
        do {
            int i10 = debugPipelineContext.index;
            if (i10 != -1) {
                java.util.List<p194x6.n> list = debugPipelineContext.interceptors;
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

    @Override // io.ktor.util.pipeline.PipelineContext
    public java.lang.Object execute$ktor_utils(TSubject tsubject, p100l6.c cVar) {
        this.index = 0;
        setSubject(tsubject);
        return proceed(cVar);
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public void finish() {
        this.index = -1;
    }

    @Override // io.ktor.util.pipeline.PipelineContext, S7.A
    public p100l6.h getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public TSubject getSubject() {
        return this.subject;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public java.lang.Object proceed(p100l6.c cVar) {
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

    @Override // io.ktor.util.pipeline.PipelineContext
    public java.lang.Object proceedWith(TSubject tsubject, p100l6.c cVar) {
        setSubject(tsubject);
        return proceed(cVar);
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public void setSubject(TSubject tsubject) {
        kotlin.jvm.internal.m.e(tsubject, "<set-?>");
        this.subject = tsubject;
    }
}
