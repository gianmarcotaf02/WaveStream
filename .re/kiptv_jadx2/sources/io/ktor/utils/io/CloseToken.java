package io.ktor.utils.io;

import S7.C;
import S7.InterfaceC0904u;
import androidx.media3.container.NalUnitUtil;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;
import p070h6.A;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\b\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lio/ktor/utils/io/CloseToken;", "", "", "origin", "<init>", "(Ljava/lang/Throwable;)V", "Lkotlin/Function1;", "wrap", "wrapCause", "(Lx6/j;)Ljava/lang/Throwable;", "Lh6/A;", "throwOrNull", "(Lx6/j;)Lh6/A;", "Ljava/lang/Throwable;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CloseToken {
    private final Throwable origin;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public class AnonymousClass1 extends j implements p194x6.j {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1, ClosedByteChannelException.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);
        }

        @Override
        public final ClosedByteChannelException invoke(Throwable th) {
            return new ClosedByteChannelException(th);
        }
    }

    public CloseToken(Throwable th) {
        this.origin = th;
    }

    public static Throwable wrapCause$default(CloseToken closeToken, p194x6.j jVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            jVar = AnonymousClass1.INSTANCE;
        }
        return closeToken.wrapCause(jVar);
    }

    public final A throwOrNull(p194x6.j wrap) throws Throwable {
        m.e(wrap, "wrap");
        Throwable thWrapCause = wrapCause(wrap);
        if (thWrapCause == null) {
            return null;
        }
        throw thWrapCause;
    }

    public final Throwable wrapCause(p194x6.j wrap) {
        m.e(wrap, "wrap");
        Object obj = this.origin;
        if (obj == null) {
            return null;
        }
        if (obj instanceof InterfaceC0904u) {
            return ((InterfaceC0904u) obj).createCopy();
        }
        return obj instanceof CancellationException ? C.a(((CancellationException) obj).getMessage(), this.origin) : (Throwable) wrap.invoke(obj);
    }
}
