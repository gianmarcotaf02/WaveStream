package R6;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends N6.i0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final R6.a f9072k = new R6.a(io.sentry.protocol.SentryStackFrame.JsonKeys.PACKAGE, false);

    @Override // N6.i0
    public final java.lang.Integer a(N6.i0 visibility) {
        kotlin.jvm.internal.m.e(visibility, "visibility");
        if (this == visibility) {
            return 0;
        }
        p086j6.e eVar = N6.h0.f7397a;
        return (visibility == N6.c0.f7384k || visibility == N6.d0.f7387k) ? 1 : -1;
    }

    @Override // N6.i0
    public final java.lang.String d() {
        return "public/*package*/";
    }

    @Override // N6.i0
    public final N6.i0 k() {
        return N6.e0.f7388k;
    }
}
