package io.ktor.util.pipeline;

import androidx.media3.container.NalUnitUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p100l6.h;
import p194x6.n;

@Metadata(d1 = {"\u00002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u009d\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00012J\u0010\n\u001aF\u0012B\u0012@\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\t0\u00042\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "TSubject", "TContext", "context", "", "Lkotlin/Function3;", "Lio/ktor/util/pipeline/PipelineContext;", "Ll6/c;", "Lh6/A;", "Lio/ktor/util/pipeline/PipelineInterceptor;", "interceptors", "subject", "Ll6/h;", "coroutineContext", "", "debugMode", "pipelineContextFor", "(Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;Ll6/h;Z)Lio/ktor/util/pipeline/PipelineContext;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PipelineContextKt {
    public static final <TSubject, TContext> PipelineContext<TSubject, TContext> pipelineContextFor(TContext context, List<? extends n> interceptors, TSubject subject, h coroutineContext, boolean z6) {
        m.e(context, "context");
        m.e(interceptors, "interceptors");
        m.e(subject, "subject");
        m.e(coroutineContext, "coroutineContext");
        return (PipelineContext_jvmKt.getDISABLE_SFG() || z6) ? new DebugPipelineContext(context, interceptors, subject, coroutineContext) : new SuspendFunctionGun(subject, context, interceptors);
    }

    public static PipelineContext pipelineContextFor$default(Object obj, List list, Object obj2, h hVar, boolean z6, int i3, Object obj3) {
        if ((i3 & 16) != 0) {
            z6 = false;
        }
        return pipelineContextFor(obj, list, obj2, hVar, z6);
    }
}
