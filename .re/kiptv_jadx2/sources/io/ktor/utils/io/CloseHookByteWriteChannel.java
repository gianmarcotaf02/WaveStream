package io.ktor.utils.io;

import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.P;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p070h6.A;
import p094k8.l;
import p117n6.c;
import p117n6.e;
import p194x6.j;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005H\u0096A¢\u0006\u0004\b\f\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0011R*\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lio/ktor/utils/io/CloseHookByteWriteChannel;", "Lio/ktor/utils/io/ByteWriteChannel;", "delegate", "Lkotlin/Function1;", "Ll6/c;", "Lh6/A;", "", "onClose", "<init>", "(Lio/ktor/utils/io/ByteWriteChannel;Lx6/j;)V", "flushAndClose", "(Ll6/c;)Ljava/lang/Object;", "flush", "", "cause", "cancel", "(Ljava/lang/Throwable;)V", "Lio/ktor/utils/io/ByteWriteChannel;", "Lx6/j;", "", "isClosedForWrite", "()Z", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "Lk8/l;", "getWriteBuffer", "()Lk8/l;", "writeBuffer", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CloseHookByteWriteChannel implements ByteWriteChannel {
    private final ByteWriteChannel delegate;
    private final j onClose;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.CloseHookByteWriteChannel", f = "CloseHookByteWriteChannel.kt", l = {24, 25}, m = "flushAndClose")
    public static final class AnonymousClass1 extends c {
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
            return CloseHookByteWriteChannel.this.flushAndClose(this);
        }
    }

    public CloseHookByteWriteChannel(ByteWriteChannel delegate, j onClose) {
        m.e(delegate, "delegate");
        m.e(onClose, "onClose");
        this.delegate = delegate;
        this.onClose = onClose;
    }

    @Override
    public void cancel(Throwable cause) {
        this.delegate.cancel(cause);
    }

    @Override
    public Object flush(p100l6.c cVar) {
        return this.delegate.flush(cVar);
    }

    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object flushAndClose(p100l6.c cVar) {
        AnonymousClass1 anonymousClass1;
        CloseHookByteWriteChannel closeHookByteWriteChannel;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj = anonymousClass1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = anonymousClass1.label;
        if (i9 != 0) {
            if (i9 == 1) {
                closeHookByteWriteChannel = (CloseHookByteWriteChannel) anonymousClass1.L$0;
                P.u0(obj);
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P.u0(obj);
            }
            return A.f22523a;
        }
        P.u0(obj);
        ByteWriteChannel byteWriteChannel = this.delegate;
        anonymousClass1.L$0 = this;
        anonymousClass1.label = 1;
        if (byteWriteChannel.flushAndClose(anonymousClass1) != aVar) {
            closeHookByteWriteChannel = this;
        }
        return aVar;
        j jVar = closeHookByteWriteChannel.onClose;
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 2;
    }

    @Override
    public Throwable getClosedCause() {
        return this.delegate.getClosedCause();
    }

    @Override
    public l getWriteBuffer() {
        return this.delegate.getWriteBuffer();
    }

    @Override
    public boolean isClosedForWrite() {
        return this.delegate.isClosedForWrite();
    }
}
