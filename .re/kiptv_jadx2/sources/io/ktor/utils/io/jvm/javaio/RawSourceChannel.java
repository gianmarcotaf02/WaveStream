package io.ktor.utils.io.jvm.javaio;

import S7.A;
import S7.C;
import S7.C0889g0;
import S7.C0909z;
import S7.InterfaceC0891h0;
import S7.j0;
import S7.r;
import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.P;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.CloseToken;
import io.ktor.utils.io.InternalAPI;
import io.ktor.utils.io.core.ByteReadPacketKt;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import p094k8.a;
import p094k8.f;
import p094k8.n;
import p100l6.h;
import p117n6.c;
import p117n6.e;
import p117n6.i;
import p194x6.m;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010!R\u001a\u0010'\u001a\u00020\"8VX\u0097\u0004¢\u0006\f\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\u0016\u0010*\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lio/ktor/utils/io/jvm/javaio/RawSourceChannel;", "Lio/ktor/utils/io/ByteReadChannel;", "Lk8/f;", "source", "Ll6/h;", "parent", "<init>", "(Lk8/f;Ll6/h;)V", "", "min", "", "awaitContent", "(ILl6/c;)Ljava/lang/Object;", "", "cause", "Lh6/A;", "cancel", "(Ljava/lang/Throwable;)V", "Lk8/f;", "Ll6/h;", "Lio/ktor/utils/io/CloseToken;", "closedToken", "Lio/ktor/utils/io/CloseToken;", "Lk8/a;", "buffer", "Lk8/a;", "LS7/r;", "job", "LS7/r;", "getJob", "()LS7/r;", "coroutineContext", "getCoroutineContext", "()Ll6/h;", "Lk8/n;", "getReadBuffer", "()Lk8/n;", "getReadBuffer$annotations", "()V", "readBuffer", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "isClosedForRead", "()Z", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RawSourceChannel implements ByteReadChannel {
    private final a buffer;
    private CloseToken closedToken;
    private final h coroutineContext;
    private final r job;
    private final h parent;
    private final f source;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.jvm.javaio.RawSourceChannel", f = "Reading.kt", l = {69}, m = "awaitContent")
    public static final class AnonymousClass1 extends c {
        int I$0;
        Object L$0;
        int label;
        Object result;

        public AnonymousClass1(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RawSourceChannel.this.awaitContent(0, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "Lh6/A;", "<anonymous>", "(LS7/A;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2", f = "Reading.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements m {
        final int $min;
        int label;

        public AnonymousClass2(int i3, p100l6.c cVar) {
            super(2, cVar);
            this.$min = i3;
        }

        @Override
        public final p100l6.c create(Object obj, p100l6.c cVar) {
            return RawSourceChannel.this.new AnonymousClass2(this.$min, cVar);
        }

        @Override
        public final Object invoke(A a2, p100l6.c cVar) {
            return ((AnonymousClass2) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override
        public final Object invokeSuspend(Object obj) throws Exception {
            p109m6.a aVar = p109m6.a.f25430h;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P.u0(obj);
            long atMostTo = 0;
            while (ByteReadPacketKt.getRemaining(RawSourceChannel.this.buffer) < this.$min && atMostTo >= 0) {
                try {
                    atMostTo = RawSourceChannel.this.source.readAtMostTo(RawSourceChannel.this.buffer, Long.MAX_VALUE);
                } catch (EOFException unused) {
                    atMostTo = -1;
                }
            }
            if (atMostTo == -1) {
                RawSourceChannel.this.source.close();
                ((j0) RawSourceChannel.this.getJob()).Z();
                RawSourceChannel.this.closedToken = new CloseToken(null);
            }
            return p070h6.A.f22523a;
        }
    }

    public RawSourceChannel(f source, h parent) {
        kotlin.jvm.internal.m.e(source, "source");
        kotlin.jvm.internal.m.e(parent, "parent");
        this.source = source;
        this.parent = parent;
        this.buffer = new a();
        j0 j0Var = new j0((InterfaceC0891h0) parent.get(C0889g0.f9584h));
        this.job = j0Var;
        this.coroutineContext = parent.plus(j0Var).plus(new C0909z("RawSourceChannel"));
    }

    @InternalAPI
    public static void getReadBuffer$annotations() {
    }

    @Override
    public Object awaitContent(int i3, p100l6.c cVar) {
        AnonymousClass1 anonymousClass1;
        RawSourceChannel rawSourceChannel;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i9 = anonymousClass1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i9 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj = anonymousClass1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = anonymousClass1.label;
        if (i10 == 0) {
            P.u0(obj);
            if (this.closedToken != null) {
                return Boolean.TRUE;
            }
            h hVar = this.coroutineContext;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(i3, null);
            anonymousClass1.L$0 = this;
            anonymousClass1.I$0 = i3;
            anonymousClass1.label = 1;
            if (C.K(hVar, anonymousClass2, anonymousClass1) == aVar) {
                return aVar;
            }
            rawSourceChannel = this;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = anonymousClass1.I$0;
            rawSourceChannel = (RawSourceChannel) anonymousClass1.L$0;
            P.u0(obj);
        }
        return Boolean.valueOf(ByteReadPacketKt.getRemaining(rawSourceChannel.buffer) >= ((long) i3));
    }

    @Override
    public void cancel(Throwable cause) throws Exception {
        String message;
        String message2;
        if (this.closedToken != null) {
            return;
        }
        r rVar = this.job;
        String str = "Channel was cancelled";
        if (cause == null || (message = cause.getMessage()) == null) {
            message = "Channel was cancelled";
        }
        C.j(rVar, message, cause);
        this.source.close();
        if (cause != null && (message2 = cause.getMessage()) != null) {
            str = message2;
        }
        this.closedToken = new CloseToken(new IOException(str, cause));
    }

    @Override
    public Throwable getClosedCause() {
        CloseToken closeToken = this.closedToken;
        if (closeToken != null) {
            return CloseToken.wrapCause$default(closeToken, null, 1, null);
        }
        return null;
    }

    public final h getCoroutineContext() {
        return this.coroutineContext;
    }

    public final r getJob() {
        return this.job;
    }

    @Override
    public n getReadBuffer() {
        return this.buffer;
    }

    @Override
    public boolean isClosedForRead() {
        return this.closedToken != null && this.buffer.o();
    }
}
