package io.ktor.utils.io;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/ktor/utils/io/LookAheadSuspendSession;", "", "Lio/ktor/utils/io/ByteReadChannel;", "channel", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;)V", "", "skip", "atLeast", "Ljava/nio/ByteBuffer;", io.sentry.SentryBaseEvent.JsonKeys.REQUEST, "(II)Ljava/nio/ByteBuffer;", "min", "", "awaitAtLeast", "(ILl6/c;)Ljava/lang/Object;", "count", "Lh6/A;", "consumed", "(I)V", "Lio/ktor/utils/io/ByteReadChannel;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class LookAheadSuspendSession {
    private final io.ktor.utils.io.ByteReadChannel channel;

    /* JADX INFO: renamed from: io.ktor.utils.io.LookAheadSuspendSession$awaitAtLeast$1, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.LookAheadSuspendSession", f = "LookAheadSession.kt", l = {androidx.media3.extractor.AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE}, m = "awaitAtLeast")
    public static final class AnonymousClass1 extends p117n6.c {
        int I$0;
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass1(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.LookAheadSuspendSession.this.awaitAtLeast(0, this);
        }
    }

    public LookAheadSuspendSession(io.ktor.utils.io.ByteReadChannel channel) {
        kotlin.jvm.internal.m.e(channel, "channel");
        this.channel = channel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.nio.ByteBuffer request$lambda$0(p094k8.n it) {
        kotlin.jvm.internal.m.e(it, "it");
        return java.nio.ByteBuffer.wrap(p094k8.p.i(it, -1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object awaitAtLeast(int i3, p100l6.c cVar) {
        io.ktor.utils.io.LookAheadSuspendSession.AnonymousClass1 anonymousClass1;
        io.ktor.utils.io.LookAheadSuspendSession lookAheadSuspendSession;
        if (cVar instanceof io.ktor.utils.io.LookAheadSuspendSession.AnonymousClass1) {
            anonymousClass1 = (io.ktor.utils.io.LookAheadSuspendSession.AnonymousClass1) cVar;
            int i9 = anonymousClass1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i9 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new io.ktor.utils.io.LookAheadSuspendSession.AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new io.ktor.utils.io.LookAheadSuspendSession.AnonymousClass1(cVar);
        }
        java.lang.Object obj = anonymousClass1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = anonymousClass1.label;
        if (i10 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            if (io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(this.channel.getReadBuffer()) >= i3) {
                return java.lang.Boolean.TRUE;
            }
            io.ktor.utils.io.ByteReadChannel byteReadChannel = this.channel;
            anonymousClass1.L$0 = this;
            anonymousClass1.I$0 = i3;
            anonymousClass1.label = 1;
            if (byteReadChannel.awaitContent(i3, anonymousClass1) == aVar) {
                return aVar;
            }
            lookAheadSuspendSession = this;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = anonymousClass1.I$0;
            lookAheadSuspendSession = (io.ktor.utils.io.LookAheadSuspendSession) anonymousClass1.L$0;
            com.google.common.util.concurrent.P.u0(obj);
        }
        return java.lang.Boolean.valueOf(io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(lookAheadSuspendSession.channel.getReadBuffer()) >= ((long) i3));
    }

    public final void consumed(int count) {
        io.ktor.utils.io.core.ByteReadPacketKt.discard(this.channel.getReadBuffer(), count);
    }

    public final java.nio.ByteBuffer request(int skip, int atLeast) {
        if (io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(this.channel.getReadBuffer()) < atLeast + skip) {
            return null;
        }
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) io.ktor.utils.io.core.ByteReadPacketKt.preview(this.channel.getReadBuffer(), new io.ktor.http.b(24));
        if (skip > 0) {
            byteBuffer.position(byteBuffer.position() + skip);
        }
        return byteBuffer;
    }
}
