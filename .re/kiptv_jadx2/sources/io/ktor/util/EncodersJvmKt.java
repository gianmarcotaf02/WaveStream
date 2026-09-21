package io.ktor.util;

import S7.C0877a0;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.ts.TsExtractor;
import com.google.common.util.concurrent.P;
import com.revenuecat.purchases.common.HTTPClient;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannelOperations_jvmKt;
import io.ktor.utils.io.WriterScope;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import java.util.zip.Checksum;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p070h6.A;
import p100l6.h;
import p117n6.e;
import p117n6.i;

@Metadata(d1 = {"\u0000>\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0082\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a,\u0010\u0013\u001a\u00020\u0000*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0015\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, d2 = {"", "flag", "", "has", "(II)Z", "Lio/ktor/utils/io/ByteReadChannel;", "source", HTTPClient.RC_FORMAT_ACCEPT_ENCODING, "Ll6/h;", "coroutineContext", "inflate", "(Lio/ktor/utils/io/ByteReadChannel;ZLl6/h;)Lio/ktor/utils/io/ByteReadChannel;", "Ljava/util/zip/Inflater;", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "Ljava/nio/ByteBuffer;", "buffer", "Ljava/util/zip/Checksum;", "checksum", "inflateTo", "(Ljava/util/zip/Inflater;Lio/ktor/utils/io/ByteWriteChannel;Ljava/nio/ByteBuffer;Ljava/util/zip/Checksum;Ll6/c;)Ljava/lang/Object;", "GZIP_HEADER_SIZE", "I", "Lio/ktor/util/Encoder;", "Deflate", "Lio/ktor/util/Encoder;", "getDeflate", "()Lio/ktor/util/Encoder;", "GZip", "getGZip", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class EncodersJvmKt {
    private static final int GZIP_HEADER_SIZE = 10;
    private static final Encoder Deflate = new Encoder() {
        @Override
        public ByteReadChannel decode(ByteReadChannel source, h coroutineContext) {
            m.e(source, "source");
            m.e(coroutineContext, "coroutineContext");
            return EncodersJvmKt.inflate(source, false, coroutineContext);
        }

        @Override
        public ByteReadChannel encode(ByteReadChannel source, h coroutineContext) {
            m.e(source, "source");
            m.e(coroutineContext, "coroutineContext");
            return DeflaterKt.deflated$default(source, false, (ObjectPool) null, coroutineContext, 2, (Object) null);
        }

        @Override
        public ByteWriteChannel encode(ByteWriteChannel source, h coroutineContext) {
            m.e(source, "source");
            m.e(coroutineContext, "coroutineContext");
            return DeflaterKt.deflated$default(source, false, (ObjectPool) null, coroutineContext, 2, (Object) null);
        }
    };
    private static final Encoder GZip = new Encoder() {
        @Override
        public ByteReadChannel decode(ByteReadChannel source, h coroutineContext) {
            m.e(source, "source");
            m.e(coroutineContext, "coroutineContext");
            return EncodersJvmKt.inflate$default(source, false, coroutineContext, 2, null);
        }

        @Override
        public ByteReadChannel encode(ByteReadChannel source, h coroutineContext) {
            m.e(source, "source");
            m.e(coroutineContext, "coroutineContext");
            return DeflaterKt.deflated$default(source, true, (ObjectPool) null, coroutineContext, 2, (Object) null);
        }

        @Override
        public ByteWriteChannel encode(ByteWriteChannel source, h coroutineContext) {
            m.e(source, "source");
            m.e(coroutineContext, "coroutineContext");
            return DeflaterKt.deflated$default(source, true, (ObjectPool) null, coroutineContext, 2, (Object) null);
        }
    };

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/WriterScope;", "Lh6/A;", "<anonymous>", "(Lio/ktor/utils/io/WriterScope;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.util.EncodersJvmKt$inflate$1", f = "EncodersJvm.kt", l = {82, 99, 100, 110, 117, 123, TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p194x6.m {
        final boolean $gzip;
        final ByteReadChannel $source;
        byte B$0;
        byte B$1;
        int I$0;
        private Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        short S$0;
        int label;

        public AnonymousClass1(boolean z6, ByteReadChannel byteReadChannel, p100l6.c cVar) {
            super(2, cVar);
            this.$gzip = z6;
            this.$source = byteReadChannel;
        }

        @Override
        public final p100l6.c create(Object obj, p100l6.c cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$gzip, this.$source, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override
        public final Object invoke(WriterScope writerScope, p100l6.c cVar) {
            return ((AnonymousClass1) create(writerScope, cVar)).invokeSuspend(A.f22523a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 988
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.EncodersJvmKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.util.EncodersJvmKt", f = "EncodersJvm.kt", l = {171}, m = "inflateTo")
    public static final class C24371 extends p117n6.c {
        int I$0;
        int label;
        Object result;

        public C24371(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EncodersJvmKt.inflateTo(null, null, null, null, this);
        }
    }

    public static final Encoder getDeflate() {
        return Deflate;
    }

    public static final Encoder getGZip() {
        return GZip;
    }

    public static final boolean has(int i3, int i9) {
        return (i3 & i9) != 0;
    }

    public static final ByteReadChannel inflate(ByteReadChannel byteReadChannel, boolean z6, h hVar) {
        return ByteWriteChannelOperationsKt.writer$default((S7.A) C0877a0.f9566h, hVar, false, (p194x6.m) new AnonymousClass1(z6, byteReadChannel, null), 2, (Object) null).getChannel();
    }

    public static ByteReadChannel inflate$default(ByteReadChannel byteReadChannel, boolean z6, h hVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z6 = true;
        }
        return inflate(byteReadChannel, z6, hVar);
    }

    public static final Object inflateTo(Inflater inflater, ByteWriteChannel byteWriteChannel, ByteBuffer byteBuffer, Checksum checksum, p100l6.c cVar) throws DataFormatException {
        C24371 c24371;
        int iInflate;
        if (cVar instanceof C24371) {
            c24371 = (C24371) cVar;
            int i3 = c24371.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24371.label = i3 - Integer.MIN_VALUE;
            } else {
                c24371 = new C24371(cVar);
            }
        } else {
            c24371 = new C24371(cVar);
        }
        Object obj = c24371.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24371.label;
        if (i9 == 0) {
            P.u0(obj);
            byteBuffer.clear();
            iInflate = inflater.inflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
            byteBuffer.position(byteBuffer.position() + iInflate);
            byteBuffer.flip();
            DeflaterKt.updateKeepPosition(checksum, byteBuffer);
            c24371.I$0 = iInflate;
            c24371.label = 1;
            if (ByteWriteChannelOperations_jvmKt.writeFully(byteWriteChannel, byteBuffer, c24371) == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iInflate = c24371.I$0;
            P.u0(obj);
        }
        return new Integer(iInflate);
    }
}
