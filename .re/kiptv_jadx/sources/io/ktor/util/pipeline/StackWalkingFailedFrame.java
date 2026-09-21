package io.ktor.util.pipeline;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lio/ktor/util/pipeline/StackWalkingFailedFrame;", "Ln6/d;", "Lio/ktor/util/CoroutineStackFrame;", "Ll6/c;", "", "<init>", "()V", "Ljava/lang/StackTraceElement;", "Lio/ktor/util/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lh6/n;", "result", "Lh6/A;", "resumeWith", "(Ljava/lang/Object;)V", "getCallerFrame", "()Ln6/d;", "callerFrame", "Ll6/h;", "getContext", "()Ll6/h;", "context", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class StackWalkingFailedFrame implements p117n6.d, p100l6.c {
    public static final io.ktor.util.pipeline.StackWalkingFailedFrame INSTANCE = new io.ktor.util.pipeline.StackWalkingFailedFrame();

    private StackWalkingFailedFrame() {
    }

    @Override // p117n6.d
    public p117n6.d getCallerFrame() {
        return null;
    }

    @Override // p100l6.c
    public p100l6.h getContext() {
        return p100l6.i.f24820h;
    }

    public java.lang.StackTraceElement getStackTraceElement() {
        E6.InterfaceC0331d interfaceC0331dB = kotlin.jvm.internal.B.f24540a.b(io.ktor.util.pipeline.StackWalkingFailed.class);
        io.ktor.util.pipeline.StackWalkingFailed stackWalkingFailed = io.ktor.util.pipeline.StackWalkingFailed.INSTANCE;
        return io.ktor.util.StackFramesJvmKt.createStackTraceElement(interfaceC0331dB, "failedToCaptureStackFrame", "StackWalkingFailed.kt", 8);
    }

    @Override // p100l6.c
    public void resumeWith(java.lang.Object result) {
        io.ktor.util.pipeline.StackWalkingFailed.INSTANCE.failedToCaptureStackFrame();
    }
}
