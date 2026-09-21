package R6;

import N6.c0;
import N6.d0;
import N6.e0;
import N6.h0;
import N6.i0;
import io.sentry.protocol.SentryStackFrame;
import kotlin.jvm.internal.m;
import p086j6.e;

public final class a extends i0 {

    public static final a f9072k = new a(SentryStackFrame.JsonKeys.PACKAGE, false);

    @Override
    public final Integer a(i0 visibility) {
        m.e(visibility, "visibility");
        if (this == visibility) {
            return 0;
        }
        e eVar = h0.f7397a;
        return (visibility == c0.f7384k || visibility == d0.f7387k) ? 1 : -1;
    }

    @Override
    public final String d() {
        return "public/*package*/";
    }

    @Override
    public final i0 k() {
        return e0.f7388k;
    }
}
