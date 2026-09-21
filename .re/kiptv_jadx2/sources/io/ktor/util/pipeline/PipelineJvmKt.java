package io.ktor.util.pipeline;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.m;
import p100l6.c;
import p194x6.n;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0095\u0001\u0010\f\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002D\u0010\b\u001a@\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "TSubject", "TContext", "Lkotlin/Function3;", "Lio/ktor/util/pipeline/PipelineContext;", "Ll6/c;", "Lh6/A;", "Lio/ktor/util/pipeline/PipelineInterceptor;", "interceptor", "context", "subject", "continuation", "pipelineStartCoroutineUninterceptedOrReturn", "(Lx6/n;Lio/ktor/util/pipeline/PipelineContext;Ljava/lang/Object;Ll6/c;)Ljava/lang/Object;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PipelineJvmKt {
    public static final <TSubject, TContext> Object pipelineStartCoroutineUninterceptedOrReturn(n interceptor, PipelineContext<TSubject, TContext> context, TSubject subject, c continuation) {
        m.e(interceptor, "interceptor");
        m.e(context, "context");
        m.e(subject, "subject");
        m.e(continuation, "continuation");
        E.c(3, interceptor);
        return interceptor.invoke(context, subject, continuation);
    }
}
