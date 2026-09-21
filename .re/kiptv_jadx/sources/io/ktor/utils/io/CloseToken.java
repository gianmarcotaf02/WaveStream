package io.ktor.utils.io;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\b\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lio/ktor/utils/io/CloseToken;", "", "", "origin", "<init>", "(Ljava/lang/Throwable;)V", "Lkotlin/Function1;", "wrap", "wrapCause", "(Lx6/j;)Ljava/lang/Throwable;", "Lh6/A;", "throwOrNull", "(Lx6/j;)Lh6/A;", "Ljava/lang/Throwable;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CloseToken {
    private final java.lang.Throwable origin;

    /* JADX INFO: renamed from: io.ktor.utils.io.CloseToken$wrapCause$1, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.j implements p194x6.j {
        public static final io.ktor.utils.io.CloseToken.AnonymousClass1 INSTANCE = new io.ktor.utils.io.CloseToken.AnonymousClass1();

        public AnonymousClass1() {
            super(1, io.ktor.utils.io.ClosedByteChannelException.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);
        }

        @Override // p194x6.j
        public final io.ktor.utils.io.ClosedByteChannelException invoke(java.lang.Throwable th) {
            return new io.ktor.utils.io.ClosedByteChannelException(th);
        }
    }

    public CloseToken(java.lang.Throwable th) {
        this.origin = th;
    }

    public static /* synthetic */ java.lang.Throwable wrapCause$default(io.ktor.utils.io.CloseToken closeToken, p194x6.j jVar, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            jVar = io.ktor.utils.io.CloseToken.AnonymousClass1.INSTANCE;
        }
        return closeToken.wrapCause(jVar);
    }

    public final p070h6.A throwOrNull(p194x6.j wrap) throws java.lang.Throwable {
        kotlin.jvm.internal.m.e(wrap, "wrap");
        java.lang.Throwable thWrapCause = wrapCause(wrap);
        if (thWrapCause == null) {
            return null;
        }
        throw thWrapCause;
    }

    public final java.lang.Throwable wrapCause(p194x6.j wrap) {
        kotlin.jvm.internal.m.e(wrap, "wrap");
        java.lang.Object obj = this.origin;
        if (obj == null) {
            return null;
        }
        if (obj instanceof S7.InterfaceC0904u) {
            return ((S7.InterfaceC0904u) obj).createCopy();
        }
        return obj instanceof java.util.concurrent.CancellationException ? S7.C.a(((java.util.concurrent.CancellationException) obj).getMessage(), this.origin) : (java.lang.Throwable) wrap.invoke(obj);
    }
}
