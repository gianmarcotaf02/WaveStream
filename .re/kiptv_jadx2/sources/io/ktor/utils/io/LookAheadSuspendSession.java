package io.ktor.utils.io;

import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.AacUtil;
import com.google.common.util.concurrent.P;
import io.ktor.http.b;
import io.ktor.utils.io.core.ByteReadPacketKt;
import io.sentry.SentryBaseEvent;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p094k8.n;
import p094k8.p;
import p117n6.c;
import p117n6.e;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/ktor/utils/io/LookAheadSuspendSession;", "", "Lio/ktor/utils/io/ByteReadChannel;", "channel", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;)V", "", "skip", "atLeast", "Ljava/nio/ByteBuffer;", SentryBaseEvent.JsonKeys.REQUEST, "(II)Ljava/nio/ByteBuffer;", "min", "", "awaitAtLeast", "(ILl6/c;)Ljava/lang/Object;", "count", "Lh6/A;", "consumed", "(I)V", "Lio/ktor/utils/io/ByteReadChannel;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class LookAheadSuspendSession {
    private final ByteReadChannel channel;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.LookAheadSuspendSession", f = "LookAheadSession.kt", l = {AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE}, m = "awaitAtLeast")
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
            return LookAheadSuspendSession.this.awaitAtLeast(0, this);
        }
    }

    public LookAheadSuspendSession(ByteReadChannel channel) {
        m.e(channel, "channel");
        this.channel = channel;
    }

    public static final ByteBuffer request$lambda$0(n it) {
        m.e(it, "it");
        return ByteBuffer.wrap(p.i(it, -1));
    }

    public final Object awaitAtLeast(int i3, p100l6.c cVar) {
        AnonymousClass1 anonymousClass1;
        LookAheadSuspendSession lookAheadSuspendSession;
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
            if (ByteReadPacketKt.getRemaining(this.channel.getReadBuffer()) >= i3) {
                return Boolean.TRUE;
            }
            ByteReadChannel byteReadChannel = this.channel;
            anonymousClass1.L$0 = this;
            anonymousClass1.I$0 = i3;
            anonymousClass1.label = 1;
            if (byteReadChannel.awaitContent(i3, anonymousClass1) == aVar) {
                return aVar;
            }
            lookAheadSuspendSession = this;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = anonymousClass1.I$0;
            lookAheadSuspendSession = (LookAheadSuspendSession) anonymousClass1.L$0;
            P.u0(obj);
        }
        return Boolean.valueOf(ByteReadPacketKt.getRemaining(lookAheadSuspendSession.channel.getReadBuffer()) >= ((long) i3));
    }

    public final void consumed(int count) {
        ByteReadPacketKt.discard(this.channel.getReadBuffer(), count);
    }

    public final ByteBuffer request(int skip, int atLeast) {
        if (ByteReadPacketKt.getRemaining(this.channel.getReadBuffer()) < atLeast + skip) {
            return null;
        }
        ByteBuffer byteBuffer = (ByteBuffer) ByteReadPacketKt.preview(this.channel.getReadBuffer(), new b(24));
        if (skip > 0) {
            byteBuffer.position(byteBuffer.position() + skip);
        }
        return byteBuffer;
    }
}
