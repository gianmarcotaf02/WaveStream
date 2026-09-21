package io.ktor.utils.io;

import S7.A;
import S7.C;
import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.P;
import kotlin.Metadata;
import p094k8.f;
import p100l6.c;
import p117n6.e;
import p117n6.i;
import p194x6.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/ktor/utils/io/ByteReadChannelSource;", "Lk8/f;", "Lio/ktor/utils/io/ByteReadChannel;", "origin", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;)V", "Lk8/a;", "sink", "", "byteCount", "readAtMostTo", "(Lk8/a;J)J", "Lh6/A;", "close", "()V", "Lio/ktor/utils/io/ByteReadChannel;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ByteReadChannelSource implements f {
    private final ByteReadChannel origin;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "", "<anonymous>", "(LS7/A;)Z"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.utils.io.ByteReadChannelSource$readAtMostTo$1", f = "ByteReadChannelSource.kt", l = {29}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements m {
        int label;

        public AnonymousClass1(c cVar) {
            super(2, cVar);
        }

        @Override
        public final c create(Object obj, c cVar) {
            return ByteReadChannelSource.this.new AnonymousClass1(cVar);
        }

        @Override
        public final Object invoke(A a2, c cVar) {
            return ((AnonymousClass1) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P.u0(obj);
                return obj;
            }
            P.u0(obj);
            ByteReadChannel byteReadChannel = ByteReadChannelSource.this.origin;
            this.label = 1;
            Object objAwaitContent$default = ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, this, 1, null);
            return objAwaitContent$default == aVar ? aVar : objAwaitContent$default;
        }
    }

    public ByteReadChannelSource(ByteReadChannel origin) {
        kotlin.jvm.internal.m.e(origin, "origin");
        this.origin = origin;
    }

    @Override
    public void close() {
        ByteReadChannelKt.cancel(this.origin);
    }

    @Override
    public long readAtMostTo(p094k8.a sink, long byteCount) throws Throwable {
        kotlin.jvm.internal.m.e(sink, "sink");
        if (this.origin.getReadBuffer().o()) {
            C.E(p100l6.i.f24820h, new AnonymousClass1(null));
        }
        if (this.origin.getReadBuffer().o()) {
            return -1L;
        }
        return this.origin.getReadBuffer().readAtMostTo(sink, byteCount);
    }
}
