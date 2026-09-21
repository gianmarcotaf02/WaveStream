package io.ktor.utils.io;

import O7.x;
import S7.C;
import S7.InterfaceC0891h0;
import S7.w0;
import androidx.media3.common.util.Log;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.flac.FlacConstants;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.media3.extractor.ts.TsExtractor;
import com.google.common.util.concurrent.D;
import com.google.common.util.concurrent.P;
import io.ktor.utils.io.charsets.TooLongLineException;
import io.ktor.utils.io.core.BuffersKt;
import io.ktor.utils.io.core.BytePacketBuilderKt;
import io.ktor.utils.io.core.ByteReadPacketKt;
import io.ktor.utils.io.core.InputKt;
import io.sentry.SentryEnvelopeItemHeader;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z;
import p070h6.A;
import p094k8.l;
import p094k8.n;
import p094k8.p;
import p100l6.h;
import p117n6.c;
import p117n6.e;
import p117n6.f;
import p117n6.i;
import p194x6.j;
import p194x6.o;

@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0013\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0014\u0010\t\u001a\u00020\b*\u00020\u0000H\u0086@¢\u0006\u0004\b\t\u0010\u0003\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0086@¢\u0006\u0004\b\u000b\u0010\u0003\u001a\u0014\u0010\r\u001a\u00020\f*\u00020\u0000H\u0086@¢\u0006\u0004\b\r\u0010\u0003\u001a\u0014\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0086@¢\u0006\u0004\b\u000f\u0010\u0003\u001a\u0014\u0010\u0011\u001a\u00020\u0010*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0011\u0010\u0003\u001a\u001c\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0014\u0010\u0017\u001a\u00020\u0016*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0017\u0010\u0003\u001a\u001c\u0010\u0017\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0017\u0010\u0015\u001a\u001c\u0010\u001b\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001b\u0010\u001c\u001a \u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u001e\u0010\u0015\u001a\u001c\u0010\u001f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001f\u0010\u001c\u001a$\u0010\u001f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u001f\u0010!\u001a\u001c\u0010#\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\"\u001a\u00020\nH\u0086@¢\u0006\u0004\b#\u0010\u0015\u001a\u0014\u0010%\u001a\u00020$*\u00020\u0000H\u0086@¢\u0006\u0004\b%\u0010\u0003\u001a\u001c\u0010%\u001a\u00020$*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b%\u0010&\u001a0\u0010*\u001a\u00020\n*\u00020\u00002\u0006\u0010'\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\n2\b\b\u0002\u0010)\u001a\u00020\nH\u0086@¢\u0006\u0004\b*\u0010+\u001a-\u0010*\u001a\u00020\n*\u00020\u00002\u0006\u0010,\u001a\u00020\n2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0-¢\u0006\u0004\b*\u0010/\u001aI\u00109\u001a\u000208*\u0002002\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u00020\u00012\"\u0010.\u001a\u001e\b\u0001\u0012\u0004\u0012\u000205\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001306\u0012\u0006\u0012\u0004\u0018\u00010704¢\u0006\u0004\b9\u0010:\u001aE\u00109\u001a\u000208*\u0002002\u0006\u00102\u001a\u0002012\u0006\u0010\u001a\u001a\u00020;2\"\u0010.\u001a\u001e\b\u0001\u0012\u0004\u0012\u000205\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001306\u0012\u0006\u0012\u0004\u0018\u00010704¢\u0006\u0004\b9\u0010<\u001a\u001c\u0010>\u001a\u00020$*\u00020\u00002\u0006\u0010=\u001a\u00020\nH\u0086@¢\u0006\u0004\b>\u0010\u0015\u001a\u001c\u0010@\u001a\u00020\u0013*\u00020\u00002\u0006\u0010?\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b@\u0010&\u001a\u001e\u0010A\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u000eH\u0086@¢\u0006\u0004\bA\u0010&\u001a*\u0010E\u001a\u00020\u0001*\u00020\u00002\n\u0010D\u001a\u00060Bj\u0002`C2\b\b\u0002\u0010\u0018\u001a\u00020\nH\u0086@¢\u0006\u0004\bE\u0010F\u001a4\u0010E\u001a\u00020\u0001*\u00020\u00002\n\u0010D\u001a\u00060Bj\u0002`C2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010H\u001a\u00020GH\u0087@¢\u0006\u0004\bI\u0010J\u001aF\u0010L\u001a\u00020\n*\u00020\u000020\b\u0004\u0010.\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n06\u0012\u0006\u0012\u0004\u0018\u0001070KH\u0086H¢\u0006\u0004\bL\u0010M\u001a0\u0010P\u001a\u00020\u0013*\u00020\u00002\u0006\u0010D\u001a\u00020\u00042\b\b\u0002\u0010N\u001a\u00020\n2\b\b\u0002\u0010O\u001a\u00020\nH\u0086@¢\u0006\u0004\bP\u0010+\u001a\u0013\u0010Q\u001a\u00020\u0013*\u00020\u0000H\u0007¢\u0006\u0004\bQ\u0010R\u001a\u0013\u0010Q\u001a\u00020\u0013*\u00020\u0019H\u0007¢\u0006\u0004\bQ\u0010S\u001a\u0013\u0010Q\u001a\u00020\u0013*\u00020;H\u0007¢\u0006\u0004\bQ\u0010T\u001a8\u0010Y\u001a\u00020\u000e*\u00020\u00002\u0006\u0010V\u001a\u00020U2\u0006\u0010W\u001a\u00020\u00192\b\b\u0002\u0010 \u001a\u00020\u000e2\b\b\u0002\u0010X\u001a\u00020\u0001H\u0086@¢\u0006\u0004\bY\u0010Z\u001a\u0017\u0010]\u001a\u00020\\2\u0006\u0010[\u001a\u00020UH\u0002¢\u0006\u0004\b]\u0010^\u001a\u0013\u0010_\u001a\u00020\u001d*\u00020UH\u0002¢\u0006\u0004\b_\u0010`\u001a\u001c\u0010a\u001a\u00020\u0001*\u00020\u00002\u0006\u0010[\u001a\u00020UH\u0086@¢\u0006\u0004\ba\u0010b\u001a\u001e\u0010c\u001a\u0004\u0018\u00010U*\u00020\u00002\u0006\u0010\"\u001a\u00020\nH\u0086@¢\u0006\u0004\bc\u0010\u0015\"\u0014\u0010d\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bd\u0010e\"\u0014\u0010f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bf\u0010e\"\u001b\u0010j\u001a\u00020\n*\u00020\u00198F¢\u0006\f\u0012\u0004\bi\u0010S\u001a\u0004\bg\u0010h\"\u001b\u0010n\u001a\u00020\n*\u00020\u00008F¢\u0006\f\u0012\u0004\bm\u0010R\u001a\u0004\bk\u0010l¨\u0006o"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "", "exhausted", "(Lio/ktor/utils/io/ByteReadChannel;Ll6/c;)Ljava/lang/Object;", "", "toByteArray", "", "readByte", "", "readShort", "", "readInt", "", "readFloat", "", "readLong", "", "readDouble", "numberOfBytes", "Lh6/A;", "awaitUntilReadable", "(Lio/ktor/utils/io/ByteReadChannel;ILl6/c;)Ljava/lang/Object;", "Lk8/a;", "readBuffer", "max", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "copyAndClose", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;Ll6/c;)Ljava/lang/Object;", "", "readUTF8Line", "copyTo", "limit", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;JLl6/c;)Ljava/lang/Object;", "count", "readByteArray", "Lk8/n;", "readRemaining", "(Lio/ktor/utils/io/ByteReadChannel;JLl6/c;)Ljava/lang/Object;", "buffer", "offset", SentryEnvelopeItemHeader.JsonKeys.LENGTH, "readAvailable", "(Lio/ktor/utils/io/ByteReadChannel;[BIILl6/c;)Ljava/lang/Object;", "min", "Lkotlin/Function1;", "block", "(Lio/ktor/utils/io/ByteReadChannel;ILx6/j;)I", "LS7/A;", "Ll6/h;", "coroutineContext", "autoFlush", "Lkotlin/Function2;", "Lio/ktor/utils/io/ReaderScope;", "Ll6/c;", "", "Lio/ktor/utils/io/ReaderJob;", "reader", "(LS7/A;Ll6/h;ZLx6/m;)Lio/ktor/utils/io/ReaderJob;", "Lio/ktor/utils/io/ByteChannel;", "(LS7/A;Ll6/h;Lio/ktor/utils/io/ByteChannel;Lx6/m;)Lio/ktor/utils/io/ReaderJob;", "packet", "readPacket", "value", "discardExact", "discard", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "out", "readUTF8LineTo", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/lang/Appendable;ILl6/c;)Ljava/lang/Object;", "Lio/ktor/utils/io/LineEndingMode;", "lineEnding", "readUTF8LineTo-RRvyBJ8", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/lang/Appendable;IILl6/c;)Ljava/lang/Object;", "Lkotlin/Function4;", "read", "(Lio/ktor/utils/io/ByteReadChannel;Lx6/o;Ll6/c;)Ljava/lang/Object;", TtmlNode.START, TtmlNode.END, "readFully", "rethrowCloseCauseIfNeeded", "(Lio/ktor/utils/io/ByteReadChannel;)V", "(Lio/ktor/utils/io/ByteWriteChannel;)V", "(Lio/ktor/utils/io/ByteChannel;)V", "Ll8/a;", "matchString", "writeChannel", "ignoreMissing", "readUntil", "(Lio/ktor/utils/io/ByteReadChannel;Ll8/a;Lio/ktor/utils/io/ByteWriteChannel;JZLl6/c;)Ljava/lang/Object;", "byteString", "", "buildPartialMatchTable", "(Ll8/a;)[I", "toSingleLineString", "(Ll8/a;)Ljava/lang/String;", "skipIfFound", "(Lio/ktor/utils/io/ByteReadChannel;Ll8/a;Ll6/c;)Ljava/lang/Object;", "peek", "CR", "B", "LF", "getAvailableForWrite", "(Lio/ktor/utils/io/ByteWriteChannel;)I", "getAvailableForWrite$annotations", "availableForWrite", "getAvailableForRead", "(Lio/ktor/utils/io/ByteReadChannel;)I", "getAvailableForRead$annotations", "availableForRead", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ByteReadChannelOperationsKt {
    private static final byte CR = 13;
    private static final byte LF = 10;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {95, 96}, m = "awaitUntilReadable")
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
            return ByteReadChannelOperationsKt.awaitUntilReadable(null, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {137, TsExtractor.TS_STREAM_TYPE_DTS, 147, 147}, m = "copyAndClose")
    public static final class C24431 extends c {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        Object result;

        public C24431(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.copyAndClose(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {176, 177, 184, 184}, m = "copyTo")
    public static final class C24441 extends c {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        Object result;

        public C24441(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.copyTo(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {195, 199, 206, 206}, m = "copyTo")
    public static final class AnonymousClass2 extends c {
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        int label;
        Object result;

        public AnonymousClass2(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.copyTo(null, null, 0L, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {382}, m = "discard")
    public static final class C24451 extends c {
        long J$0;
        long J$1;
        Object L$0;
        int label;
        Object result;

        public C24451(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.discard(null, 0L, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {374}, m = "discardExact")
    public static final class C24461 extends c {
        long J$0;
        int label;
        Object result;

        public C24461(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.discardExact(null, 0L, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {33}, m = "exhausted")
    public static final class C24471 extends c {
        Object L$0;
        int label;
        Object result;

        public C24471(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.exhausted(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {674}, m = "peek")
    public static final class C24481 extends c {
        int I$0;
        Object L$0;
        int label;
        Object result;

        public C24481(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.peek(null, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {488, 493}, m = "read")
    public static final class C24491 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        Object result;

        public C24491(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.read(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {264}, m = "readAvailable")
    public static final class C24501 extends c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        Object result;

        public C24501(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readAvailable(null, null, 0, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {107}, m = "readBuffer")
    public static final class C24511 extends c {
        Object L$0;
        Object L$1;
        int label;
        Object result;

        public C24511(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readBuffer(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {121}, m = "readBuffer")
    public static final class AnonymousClass3 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        Object result;

        public AnonymousClass3(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readBuffer(null, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {44}, m = "readByte")
    public static final class C24521 extends c {
        Object L$0;
        int label;
        Object result;

        public C24521(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readByte(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {214}, m = "readByteArray")
    public static final class C24531 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        Object result;

        public C24531(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readByteArray(null, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {90}, m = "readDouble")
    public static final class C24541 extends c {
        Object L$0;
        int label;
        Object result;

        public C24541(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readDouble(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {73}, m = "readFloat")
    public static final class C24551 extends c {
        Object L$0;
        int label;
        Object result;

        public C24551(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readFloat(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {522}, m = "readFully")
    public static final class C24561 extends c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        Object result;

        public C24561(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readFully(null, null, 0, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {62}, m = "readInt")
    public static final class C24571 extends c {
        Object L$0;
        int label;
        Object result;

        public C24571(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readInt(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {79}, m = "readLong")
    public static final class C24581 extends c {
        Object L$0;
        int label;
        Object result;

        public C24581(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readLong(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {357}, m = "readPacket")
    public static final class C24591 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        Object result;

        public C24591(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readPacket(null, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {224}, m = "readRemaining")
    public static final class C24601 extends c {
        Object L$0;
        Object L$1;
        int label;
        Object result;

        public C24601(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readRemaining(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {244}, m = "readRemaining")
    public static final class C24612 extends c {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        Object result;

        public C24612(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readRemaining(null, 0L, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {56}, m = "readShort")
    public static final class C24621 extends c {
        Object L$0;
        int label;
        Object result;

        public C24621(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readShort(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {166}, m = "readUTF8Line")
    public static final class C24631 extends c {
        Object L$0;
        int label;
        Object result;

        public C24631(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readUTF8Line(null, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {435, 450, 474}, m = "readUTF8LineTo-RRvyBJ8")
    public static final class C24642 extends c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        Object result;

        public C24642(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.m480readUTF8LineToRRvyBJ8(null, null, 0, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {589, 592, 602, 612, 613}, m = "readUntil")
    public static final class C24651 extends c {
        byte B$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        boolean Z$0;
        int label;
        Object result;

        public C24651(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readUntil(null, null, null, 0L, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt$reader$1", f = "ByteReadChannelOperations.kt", l = {342}, m = "invokeSuspend")
    public static final class C24661 extends i implements j {
        final InterfaceC0891h0 $job;
        int label;

        public C24661(InterfaceC0891h0 interfaceC0891h0, p100l6.c cVar) {
            super(1, cVar);
            this.$job = interfaceC0891h0;
        }

        @Override
        public final p100l6.c create(p100l6.c cVar) {
            return new C24661(this.$job, cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            if (i3 == 0) {
                P.u0(obj);
                InterfaceC0891h0 interfaceC0891h0 = this.$job;
                this.label = 1;
                if (interfaceC0891h0.z(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P.u0(obj);
            }
            return A.f22523a;
        }

        @Override
        public final Object invoke(p100l6.c cVar) {
            return ((C24661) create(cVar)).invokeSuspend(A.f22523a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {654, 655}, m = "skipIfFound")
    public static final class C24671 extends c {
        Object L$0;
        Object L$1;
        int label;
        Object result;

        public C24671(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.skipIfFound(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {FlacConstants.STREAM_INFO_BLOCK_SIZE}, m = "toByteArray")
    public static final class C24681 extends c {
        int label;
        Object result;

        public C24681(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.toByteArray(null, this);
        }
    }

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitUntilReadable(ByteReadChannel byteReadChannel, int i3, p100l6.c cVar) throws EOFException {
        AnonymousClass1 anonymousClass1;
        ByteReadChannel byteReadChannel2;
        int i9;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object objAwaitContent = anonymousClass1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            P.u0(objAwaitContent);
            if (getAvailableForRead(byteReadChannel) < i3) {
                anonymousClass1.L$0 = byteReadChannel;
                anonymousClass1.I$0 = i3;
                anonymousClass1.label = 1;
                objAwaitContent = byteReadChannel.awaitContent(i3, anonymousClass1);
                if (objAwaitContent != aVar) {
                    int i12 = i3;
                    byteReadChannel2 = byteReadChannel;
                    i9 = i12;
                    if (((Boolean) objAwaitContent).booleanValue()) {
                        anonymousClass1.L$0 = byteReadChannel2;
                        anonymousClass1.I$0 = i9;
                        anonymousClass1.label = 2;
                    } else {
                        ByteReadChannel byteReadChannel3 = byteReadChannel2;
                        i3 = i9;
                        byteReadChannel = byteReadChannel3;
                    }
                }
                return aVar;
            }
            if (getAvailableForRead(byteReadChannel) >= i3) {
                return A.f22523a;
            }
            throw new EOFException("Not enough data available");
        }
        if (i11 == 1) {
            i9 = anonymousClass1.I$0;
            byteReadChannel2 = (ByteReadChannel) anonymousClass1.L$0;
            P.u0(objAwaitContent);
            if (((Boolean) objAwaitContent).booleanValue()) {
                anonymousClass1.L$0 = byteReadChannel2;
                anonymousClass1.I$0 = i9;
                anonymousClass1.label = 2;
            } else {
                ByteReadChannel byteReadChannel4 = byteReadChannel2;
                i3 = i9;
                byteReadChannel = byteReadChannel4;
            }
            if (getAvailableForRead(byteReadChannel) >= i3) {
                return A.f22523a;
            }
            throw new EOFException("Not enough data available");
        }
        if (i11 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i9 = anonymousClass1.I$0;
        byteReadChannel2 = (ByteReadChannel) anonymousClass1.L$0;
        P.u0(objAwaitContent);
        ByteReadChannel byteReadChannel5 = byteReadChannel2;
        i3 = i9;
        byteReadChannel = byteReadChannel5;
        if (getAvailableForRead(byteReadChannel) < i3) {
            anonymousClass1.L$0 = byteReadChannel;
            anonymousClass1.I$0 = i3;
            anonymousClass1.label = 1;
            objAwaitContent = byteReadChannel.awaitContent(i3, anonymousClass1);
            if (objAwaitContent != aVar) {
                int i13 = i3;
                byteReadChannel2 = byteReadChannel;
                i9 = i13;
                if (((Boolean) objAwaitContent).booleanValue()) {
                    anonymousClass1.L$0 = byteReadChannel2;
                    anonymousClass1.I$0 = i9;
                    anonymousClass1.label = 2;
                } else {
                    ByteReadChannel byteReadChannel6 = byteReadChannel2;
                    i3 = i9;
                    byteReadChannel = byteReadChannel6;
                }
            }
            return aVar;
        }
        if (getAvailableForRead(byteReadChannel) >= i3) {
            return A.f22523a;
        }
        throw new EOFException("Not enough data available");
    }

    private static final int[] buildPartialMatchTable(p102l8.a aVar) {
        byte[] bArr = aVar.f24871h;
        int[] iArr = new int[bArr.length];
        int length = bArr.length;
        int i3 = 0;
        for (int i9 = 1; i9 < length; i9++) {
            while (i3 > 0 && aVar.a(i9) != aVar.a(i3)) {
                i3 = iArr[i3 - 1];
            }
            if (aVar.a(i9) == aVar.a(i3)) {
                i3++;
            }
            iArr[i9] = i3;
        }
        return iArr;
    }

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object copyAndClose(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, p100l6.c cVar) throws Throwable {
        C24431 c24431;
        long jH;
        C24431 c24432;
        ?? r9;
        ?? r14;
        Throwable closedCause;
        long j;
        ?? r15;
        ?? r10;
        if (cVar instanceof C24431) {
            c24431 = (C24431) cVar;
            int i3 = c24431.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24431.label = i3 - Integer.MIN_VALUE;
            } else {
                c24431 = new C24431(cVar);
            }
        } else {
            c24431 = new C24431(cVar);
        }
        Object obj = c24431.result;
        p109m6.a aVar = p109m6.a.f25430h;
        ?? r11 = c24431.label;
        try {
            if (r11 == 0) {
                P.u0(obj);
                jH = 0;
                c24432 = c24431;
                r9 = byteWriteChannel;
                r14 = byteReadChannel;
                if (r14.isClosedForRead()) {
                    closedCause = r14.getClosedCause();
                    if (closedCause == null) {
                        throw closedCause;
                    }
                    c24432.L$0 = null;
                    c24432.L$1 = null;
                    c24432.J$0 = jH;
                    c24432.label = 3;
                    if (r9.flushAndClose(c24432) != aVar) {
                        j = jH;
                    }
                } else {
                    jH += r14.getReadBuffer().H(r9.getWriteBuffer());
                    c24432.L$0 = r14;
                    c24432.L$1 = r9;
                    c24432.J$0 = jH;
                    c24432.label = 1;
                    if (r9.flush(c24432) != aVar) {
                        C24431 c24433 = c24432;
                        r11 = r14;
                        byteReadChannel = r9;
                        c24431 = c24433;
                        c24431.L$0 = r11;
                        c24431.L$1 = byteReadChannel;
                        c24431.J$0 = jH;
                        c24431.label = 2;
                        Object objAwaitContent$default = ByteReadChannel.DefaultImpls.awaitContent$default(r11, 0, c24431, 1, null);
                        r10 = r11;
                        r15 = byteReadChannel;
                    }
                }
                return aVar;
            }
            if (r11 == 1) {
                jH = c24431.J$0;
                ByteWriteChannel byteWriteChannel2 = (ByteWriteChannel) c24431.L$1;
                ByteReadChannel byteReadChannel2 = (ByteReadChannel) c24431.L$0;
                P.u0(obj);
                r11 = byteReadChannel2;
                byteReadChannel = byteWriteChannel2;
                c24431.L$0 = r11;
                c24431.L$1 = byteReadChannel;
                c24431.J$0 = jH;
                c24431.label = 2;
                Object objAwaitContent$default2 = ByteReadChannel.DefaultImpls.awaitContent$default(r11, 0, c24431, 1, null);
                r10 = r11;
                r15 = byteReadChannel;
            } else if (r11 == 2) {
                jH = c24431.J$0;
                ByteWriteChannel byteWriteChannel3 = (ByteWriteChannel) c24431.L$1;
                ByteReadChannel byteReadChannel3 = (ByteReadChannel) c24431.L$0;
                P.u0(obj);
                r10 = byteReadChannel3;
                r15 = byteWriteChannel3;
                try {
                    C24431 c24434 = c24431;
                    r9 = r15;
                    r14 = r10;
                    c24432 = c24434;
                    if (r14.isClosedForRead()) {
                        jH += r14.getReadBuffer().H(r9.getWriteBuffer());
                        c24432.L$0 = r14;
                        c24432.L$1 = r9;
                        c24432.J$0 = jH;
                        c24432.label = 1;
                        if (r9.flush(c24432) != aVar) {
                            C24431 c24435 = c24432;
                            r11 = r14;
                            byteReadChannel = r9;
                            c24431 = c24435;
                            c24431.L$0 = r11;
                            c24431.L$1 = byteReadChannel;
                            c24431.J$0 = jH;
                            c24431.label = 2;
                            Object objAwaitContent$default3 = ByteReadChannel.DefaultImpls.awaitContent$default(r11, 0, c24431, 1, null);
                            r10 = r11;
                            r15 = byteReadChannel;
                        }
                    } else {
                        closedCause = r14.getClosedCause();
                        if (closedCause == null) {
                            throw closedCause;
                        }
                        c24432.L$0 = null;
                        c24432.L$1 = null;
                        c24432.J$0 = jH;
                        c24432.label = 3;
                        if (r9.flushAndClose(c24432) != aVar) {
                            j = jH;
                        }
                    }
                    return aVar;
                } catch (Throwable th) {
                    th = th;
                    C24431 c24436 = c24432;
                    r11 = r14;
                    byteReadChannel = r9;
                    c24431 = c24436;
                    try {
                        r11.cancel(th);
                        ByteWriteChannelOperationsKt.close(byteReadChannel, th);
                        throw th;
                    } catch (Throwable th2) {
                        c24431.L$0 = th2;
                        c24431.L$1 = null;
                        c24431.label = 4;
                        if (byteReadChannel.flushAndClose(c24431) != aVar) {
                            throw th2;
                        }
                    }
                }
            } else {
                if (r11 != 3) {
                    if (r11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th3 = (Throwable) c24431.L$0;
                    P.u0(obj);
                    throw th3;
                }
                j = c24431.J$0;
                P.u0(obj);
            }
            return new Long(j);
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object copyTo(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, p100l6.c cVar) throws Throwable {
        C24441 c24441;
        ByteReadChannel byteReadChannel2;
        long j;
        C24441 c24442;
        ByteReadChannel byteReadChannel3;
        long j9;
        long j10;
        long jH;
        ?? r9;
        if (cVar instanceof C24441) {
            c24441 = (C24441) cVar;
            int i3 = c24441.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24441.label = i3 - Integer.MIN_VALUE;
            } else {
                c24441 = new C24441(cVar);
            }
        } else {
            c24441 = new C24441(cVar);
        }
        Object obj = c24441.result;
        p109m6.a aVar = p109m6.a.f25430h;
        ?? r10 = c24441.label;
        try {
            if (r10 == 0) {
                P.u0(obj);
                r10 = byteWriteChannel;
                j = 0;
                c24442 = c24441;
                byteReadChannel3 = byteReadChannel;
                if (byteReadChannel3.isClosedForRead()) {
                    c24442.L$0 = null;
                    c24442.L$1 = null;
                    c24442.J$0 = j;
                    c24442.label = 3;
                    if (r10.flush(c24442) != aVar) {
                        j10 = j;
                    }
                } else {
                    jH = j + byteReadChannel3.getReadBuffer().H(r10.getWriteBuffer());
                    c24442.L$0 = byteReadChannel3;
                    c24442.L$1 = r10;
                    c24442.J$0 = jH;
                    c24442.label = 1;
                    if (r10.flush(c24442) != aVar) {
                        byteReadChannel2 = byteReadChannel3;
                        c24441 = c24442;
                        j9 = jH;
                        r10 = r10;
                        c24441.L$0 = byteReadChannel2;
                        c24441.L$1 = r10;
                        c24441.J$0 = j9;
                        c24441.label = 2;
                        r9 = r10;
                    }
                }
                return aVar;
            }
            if (r10 == 1) {
                j9 = c24441.J$0;
                ByteWriteChannel byteWriteChannel2 = (ByteWriteChannel) c24441.L$1;
                byteReadChannel2 = (ByteReadChannel) c24441.L$0;
                P.u0(obj);
                r10 = byteWriteChannel2;
                c24441.L$0 = byteReadChannel2;
                c24441.L$1 = r10;
                c24441.J$0 = j9;
                c24441.label = 2;
                r9 = r10;
            } else if (r10 == 2) {
                j9 = c24441.J$0;
                ByteWriteChannel byteWriteChannel3 = (ByteWriteChannel) c24441.L$1;
                byteReadChannel2 = (ByteReadChannel) c24441.L$0;
                P.u0(obj);
                r9 = byteWriteChannel3;
                try {
                    long j11 = j9;
                    c24442 = c24441;
                    byteReadChannel3 = byteReadChannel2;
                    j = j11;
                    r10 = r9;
                    if (byteReadChannel3.isClosedForRead()) {
                        jH = j + byteReadChannel3.getReadBuffer().H(r10.getWriteBuffer());
                        c24442.L$0 = byteReadChannel3;
                        c24442.L$1 = r10;
                        c24442.J$0 = jH;
                        c24442.label = 1;
                        if (r10.flush(c24442) != aVar) {
                            byteReadChannel2 = byteReadChannel3;
                            c24441 = c24442;
                            j9 = jH;
                            r10 = r10;
                            c24441.L$0 = byteReadChannel2;
                            c24441.L$1 = r10;
                            c24441.J$0 = j9;
                            c24441.label = 2;
                            r9 = r10;
                        }
                    } else {
                        c24442.L$0 = null;
                        c24442.L$1 = null;
                        c24442.J$0 = j;
                        c24442.label = 3;
                        if (r10.flush(c24442) != aVar) {
                            j10 = j;
                        }
                    }
                    return aVar;
                } catch (Throwable th) {
                    th = th;
                    byteReadChannel2 = byteReadChannel3;
                    c24441 = c24442;
                    try {
                        byteReadChannel2.cancel(th);
                        ByteWriteChannelOperationsKt.close(r10, th);
                        throw th;
                    } catch (Throwable th2) {
                        c24441.L$0 = th2;
                        c24441.L$1 = null;
                        c24441.label = 4;
                        if (r10.flush(c24441) != aVar) {
                            throw th2;
                        }
                    }
                }
            } else {
                if (r10 != 3) {
                    if (r10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th3 = (Throwable) c24441.L$0;
                    P.u0(obj);
                    throw th3;
                }
                j10 = c24441.J$0;
                P.u0(obj);
            }
            return new Long(j10);
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static final Object discard(ByteReadChannel byteReadChannel, long j, p100l6.c cVar) {
        C24451 c24451;
        long j9;
        ByteReadChannel byteReadChannel2;
        long j10;
        if (cVar instanceof C24451) {
            c24451 = (C24451) cVar;
            int i3 = c24451.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24451.label = i3 - Integer.MIN_VALUE;
            } else {
                c24451 = new C24451(cVar);
            }
        } else {
            c24451 = new C24451(cVar);
        }
        Object obj = c24451.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24451.label;
        if (i9 == 0) {
            P.u0(obj);
            j9 = j;
            if (j > 0 || byteReadChannel.isClosedForRead()) {
                return new Long(j9 - j);
            }
            if (getAvailableForRead(byteReadChannel) == 0) {
                c24451.L$0 = byteReadChannel;
                c24451.J$0 = j9;
                c24451.J$1 = j;
                c24451.label = 1;
                if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, c24451, 1, null) == aVar) {
                    return aVar;
                }
                byteReadChannel2 = byteReadChannel;
                j10 = j;
            }
            long jMin = Math.min(j, ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer()));
            ByteReadPacketKt.discard(byteReadChannel.getReadBuffer(), jMin);
            j -= jMin;
            if (j > 0) {
            }
            return new Long(j9 - j);
        }
        if (i9 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j10 = c24451.J$1;
        j9 = c24451.J$0;
        byteReadChannel2 = (ByteReadChannel) c24451.L$0;
        P.u0(obj);
        long j11 = j10;
        byteReadChannel = byteReadChannel2;
        j = j11;
        long jMin2 = Math.min(j, ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer()));
        ByteReadPacketKt.discard(byteReadChannel.getReadBuffer(), jMin2);
        j -= jMin2;
        if (j > 0) {
        }
        return new Long(j9 - j);
    }

    public static Object discard$default(ByteReadChannel byteReadChannel, long j, p100l6.c cVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        return discard(byteReadChannel, j, cVar);
    }

    public static final Object discardExact(ByteReadChannel byteReadChannel, long j, p100l6.c cVar) throws EOFException {
        C24461 c24461;
        if (cVar instanceof C24461) {
            c24461 = (C24461) cVar;
            int i3 = c24461.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24461.label = i3 - Integer.MIN_VALUE;
            } else {
                c24461 = new C24461(cVar);
            }
        } else {
            c24461 = new C24461(cVar);
        }
        Object objDiscard = c24461.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24461.label;
        if (i9 == 0) {
            P.u0(objDiscard);
            c24461.J$0 = j;
            c24461.label = 1;
            objDiscard = discard(byteReadChannel, j, c24461);
            if (objDiscard == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = c24461.J$0;
            P.u0(objDiscard);
        }
        if (((Number) objDiscard).longValue() >= j) {
            return A.f22523a;
        }
        throw new EOFException(B2.a.k(j, "Unable to discard ", " bytes"));
    }

    public static final Object exhausted(ByteReadChannel byteReadChannel, p100l6.c cVar) {
        C24471 c24471;
        if (cVar instanceof C24471) {
            c24471 = (C24471) cVar;
            int i3 = c24471.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24471.label = i3 - Integer.MIN_VALUE;
            } else {
                c24471 = new C24471(cVar);
            }
        } else {
            c24471 = new C24471(cVar);
        }
        Object obj = c24471.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24471.label;
        if (i9 == 0) {
            P.u0(obj);
            if (byteReadChannel.getReadBuffer().o()) {
                c24471.L$0 = byteReadChannel;
                c24471.label = 1;
                if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, c24471, 1, null) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteReadChannel = (ByteReadChannel) c24471.L$0;
            P.u0(obj);
        }
        return Boolean.valueOf(byteReadChannel.getReadBuffer().o());
    }

    public static final int getAvailableForRead(ByteReadChannel byteReadChannel) {
        m.e(byteReadChannel, "<this>");
        return (int) byteReadChannel.getReadBuffer().a().j;
    }

    public static void getAvailableForRead$annotations(ByteReadChannel byteReadChannel) {
    }

    public static final int getAvailableForWrite(ByteWriteChannel byteWriteChannel) {
        m.e(byteWriteChannel, "<this>");
        return 1048576 - BytePacketBuilderKt.getSize(byteWriteChannel.getWriteBuffer());
    }

    public static void getAvailableForWrite$annotations(ByteWriteChannel byteWriteChannel) {
    }

    public static final Object peek(ByteReadChannel byteReadChannel, int i3, p100l6.c cVar) {
        C24481 c24481;
        if (cVar instanceof C24481) {
            c24481 = (C24481) cVar;
            int i9 = c24481.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c24481.label = i9 - Integer.MIN_VALUE;
            } else {
                c24481 = new C24481(cVar);
            }
        } else {
            c24481 = new C24481(cVar);
        }
        Object objAwaitContent = c24481.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = c24481.label;
        if (i10 == 0) {
            P.u0(objAwaitContent);
            if (byteReadChannel.isClosedForRead()) {
                return null;
            }
            c24481.L$0 = byteReadChannel;
            c24481.I$0 = i3;
            c24481.label = 1;
            objAwaitContent = byteReadChannel.awaitContent(i3, c24481);
            if (objAwaitContent == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c24481.I$0;
            byteReadChannel = (ByteReadChannel) c24481.L$0;
            P.u0(objAwaitContent);
        }
        if (((Boolean) objAwaitContent).booleanValue()) {
            return new p102l8.a(p.h(byteReadChannel.getReadBuffer().peek(), i3));
        }
        return null;
    }

    public static final Object read(ByteReadChannel byteReadChannel, o oVar, p100l6.c cVar) {
        C24491 c24491;
        p094k8.a aVar;
        y yVar;
        y yVar2;
        p094k8.j jVar;
        int i3;
        if (cVar instanceof C24491) {
            c24491 = (C24491) cVar;
            int i9 = c24491.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c24491.label = i9 - Integer.MIN_VALUE;
            } else {
                c24491 = new C24491(cVar);
            }
        } else {
            c24491 = new C24491(cVar);
        }
        Object obj = c24491.result;
        p109m6.a aVar2 = p109m6.a.f25430h;
        int i10 = c24491.label;
        if (i10 == 0) {
            P.u0(obj);
            if (byteReadChannel.isClosedForRead()) {
                return new Integer(-1);
            }
            if (byteReadChannel.getReadBuffer().o()) {
                c24491.L$0 = byteReadChannel;
                c24491.L$1 = oVar;
                c24491.label = 1;
                if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, c24491, 1, null) != aVar2) {
                }
            }
            return aVar2;
        }
        if (i10 == 1) {
            oVar = (o) c24491.L$1;
            byteReadChannel = (ByteReadChannel) c24491.L$0;
            P.u0(obj);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yVar = (y) c24491.L$3;
            jVar = (p094k8.j) c24491.L$2;
            aVar = (p094k8.a) c24491.L$1;
            yVar2 = (y) c24491.L$0;
            P.u0(obj);
        }
        yVar.f24555h = ((Number) obj).intValue();
        i3 = yVar2.f24555h;
        if (i3 != 0) {
            if (i3 >= 0) {
                throw new IllegalStateException("Returned negative read bytes count");
            }
            if (i3 <= jVar.b()) {
                throw new IllegalStateException("Returned too many bytes");
            }
            aVar.C(i3);
        }
        return new Integer(yVar2.f24555h);
        if (byteReadChannel.isClosedForRead()) {
            return new Integer(-1);
        }
        y yVar3 = new y();
        p094k8.a aVarA = byteReadChannel.getReadBuffer().a();
        if (aVarA.o()) {
            throw new IllegalArgumentException("Buffer is empty");
        }
        p094k8.j jVar2 = aVarA.f24508h;
        m.b(jVar2);
        int i11 = jVar2.f24524b;
        int i12 = jVar2.f24525c;
        Integer num = new Integer(i11);
        Integer num2 = new Integer(i12);
        c24491.L$0 = yVar3;
        c24491.L$1 = aVarA;
        c24491.L$2 = jVar2;
        c24491.L$3 = yVar3;
        c24491.label = 2;
        Object objInvoke = oVar.invoke(jVar2.f24523a, num, num2, c24491);
        if (objInvoke != aVar2) {
            aVar = aVarA;
            yVar = yVar3;
            yVar2 = yVar;
            obj = objInvoke;
            jVar = jVar2;
            yVar.f24555h = ((Number) obj).intValue();
            i3 = yVar2.f24555h;
            if (i3 != 0) {
                if (i3 >= 0) {
                    throw new IllegalStateException("Returned negative read bytes count");
                }
                if (i3 <= jVar.b()) {
                    throw new IllegalStateException("Returned too many bytes");
                }
                aVar.C(i3);
            }
            return new Integer(yVar2.f24555h);
        }
        return aVar2;
    }

    private static final Object read$$forInline(ByteReadChannel byteReadChannel, o oVar, p100l6.c cVar) {
        if (!byteReadChannel.isClosedForRead()) {
            if (byteReadChannel.getReadBuffer().o()) {
                ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, cVar, 1, null);
            }
            if (!byteReadChannel.isClosedForRead()) {
                p094k8.a aVarA = byteReadChannel.getReadBuffer().a();
                if (aVarA.o()) {
                    throw new IllegalArgumentException("Buffer is empty");
                }
                p094k8.j jVar = aVarA.f24508h;
                m.b(jVar);
                int iIntValue = ((Number) oVar.invoke(jVar.f24523a, Integer.valueOf(jVar.f24524b), Integer.valueOf(jVar.f24525c), null)).intValue();
                if (iIntValue != 0) {
                    if (iIntValue < 0) {
                        throw new IllegalStateException("Returned negative read bytes count");
                    }
                    if (iIntValue > jVar.b()) {
                        throw new IllegalStateException("Returned too many bytes");
                    }
                    aVarA.C(iIntValue);
                }
                return Integer.valueOf(iIntValue);
            }
        }
        return -1;
    }

    public static final Object readAvailable(ByteReadChannel byteReadChannel, byte[] bArr, int i3, int i9, p100l6.c cVar) {
        C24501 c24501;
        if (cVar instanceof C24501) {
            c24501 = (C24501) cVar;
            int i10 = c24501.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c24501.label = i10 - Integer.MIN_VALUE;
            } else {
                c24501 = new C24501(cVar);
            }
        } else {
            c24501 = new C24501(cVar);
        }
        Object obj = c24501.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i11 = c24501.label;
        if (i11 == 0) {
            P.u0(obj);
            if (byteReadChannel.isClosedForRead()) {
                return new Integer(-1);
            }
            if (byteReadChannel.getReadBuffer().o()) {
                c24501.L$0 = byteReadChannel;
                c24501.L$1 = bArr;
                c24501.I$0 = i3;
                c24501.I$1 = i9;
                c24501.label = 1;
                if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, c24501, 1, null) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i9 = c24501.I$1;
            i3 = c24501.I$0;
            bArr = (byte[]) c24501.L$1;
            byteReadChannel = (ByteReadChannel) c24501.L$0;
            P.u0(obj);
        }
        return byteReadChannel.isClosedForRead() ? new Integer(-1) : new Integer(InputKt.readAvailable(byteReadChannel.getReadBuffer(), bArr, i3, i9));
    }

    public static Object readAvailable$default(ByteReadChannel byteReadChannel, byte[] bArr, int i3, int i9, p100l6.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = bArr.length - i3;
        }
        return readAvailable(byteReadChannel, bArr, i3, i9, cVar);
    }

    public static final Object readBuffer(ByteReadChannel byteReadChannel, p100l6.c cVar) throws Throwable {
        C24511 c24511;
        p094k8.a aVar;
        if (cVar instanceof C24511) {
            c24511 = (C24511) cVar;
            int i3 = c24511.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24511.label = i3 - Integer.MIN_VALUE;
            } else {
                c24511 = new C24511(cVar);
            }
        } else {
            c24511 = new C24511(cVar);
        }
        Object obj = c24511.result;
        p109m6.a aVar2 = p109m6.a.f25430h;
        int i9 = c24511.label;
        if (i9 == 0) {
            P.u0(obj);
            aVar = new p094k8.a();
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p094k8.a aVar3 = (p094k8.a) c24511.L$1;
            ByteReadChannel byteReadChannel2 = (ByteReadChannel) c24511.L$0;
            P.u0(obj);
            aVar = aVar3;
            byteReadChannel = byteReadChannel2;
        }
        while (!byteReadChannel.isClosedForRead()) {
            aVar.D(byteReadChannel.getReadBuffer());
            c24511.L$0 = byteReadChannel;
            c24511.L$1 = aVar;
            c24511.label = 1;
            if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, c24511, 1, null) == aVar2) {
                return aVar2;
            }
        }
        Throwable closedCause = byteReadChannel.getClosedCause();
        if (closedCause == null) {
            return aVar;
        }
        throw closedCause;
    }

    public static final Object readByte(ByteReadChannel byteReadChannel, p100l6.c cVar) throws EOFException {
        C24521 c24521;
        if (cVar instanceof C24521) {
            c24521 = (C24521) cVar;
            int i3 = c24521.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24521.label = i3 - Integer.MIN_VALUE;
            } else {
                c24521 = new C24521(cVar);
            }
        } else {
            c24521 = new C24521(cVar);
        }
        Object obj = c24521.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24521.label;
        if (i9 == 0) {
            P.u0(obj);
            if (byteReadChannel.getReadBuffer().o()) {
                c24521.L$0 = byteReadChannel;
                c24521.label = 1;
                if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, c24521, 1, null) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteReadChannel = (ByteReadChannel) c24521.L$0;
            P.u0(obj);
        }
        if (byteReadChannel.getReadBuffer().o()) {
            throw new EOFException("Not enough data available");
        }
        return Byte.valueOf(byteReadChannel.getReadBuffer().readByte());
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object readByteArray(io.ktor.utils.io.ByteReadChannel r6, int r7, p100l6.c r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C24531
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.ByteReadChannelOperationsKt$readByteArray$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C24531) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readByteArray$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readByteArray$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            m6.a r1 = p109m6.a.f25430h
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$2
            k8.l r7 = (p094k8.l) r7
            java.lang.Object r2 = r0.L$1
            k8.a r2 = (p094k8.a) r2
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r4 = (io.ktor.utils.io.ByteReadChannel) r4
            com.google.common.util.concurrent.P.u0(r8)
            r5 = r0
            r0 = r6
            r6 = r4
        L37:
            r4 = r2
            r2 = r5
            goto L6e
        L3a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L42:
            com.google.common.util.concurrent.P.u0(r8)
            k8.a r8 = new k8.a
            r8.<init>()
            r2 = r8
            r8 = r7
            r7 = r2
        L4d:
            int r4 = io.ktor.utils.io.core.BytePacketBuilderKt.getSize(r7)
            if (r4 >= r8) goto L77
            int r4 = io.ktor.utils.io.core.BytePacketBuilderKt.getSize(r7)
            int r4 = r8 - r4
            r0.L$0 = r6
            r0.L$1 = r2
            r0.L$2 = r7
            r0.I$0 = r8
            r0.label = r3
            java.lang.Object r4 = readPacket(r6, r4, r0)
            if (r4 != r1) goto L6a
            return r1
        L6a:
            r5 = r0
            r0 = r8
            r8 = r4
            goto L37
        L6e:
            k8.n r8 = (p094k8.n) r8
            io.ktor.utils.io.core.BytePacketBuilderKt.writePacket(r7, r8)
            r8 = r0
            r0 = r2
            r2 = r4
            goto L4d
        L77:
            byte[] r6 = p094k8.p.g(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.readByteArray(io.ktor.utils.io.ByteReadChannel, int, l6.c):java.lang.Object");
    }

    public static final Object readDouble(ByteReadChannel byteReadChannel, p100l6.c cVar) {
        C24541 c24541;
        if (cVar instanceof C24541) {
            c24541 = (C24541) cVar;
            int i3 = c24541.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24541.label = i3 - Integer.MIN_VALUE;
            } else {
                c24541 = new C24541(cVar);
            }
        } else {
            c24541 = new C24541(cVar);
        }
        Object obj = c24541.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24541.label;
        if (i9 == 0) {
            P.u0(obj);
            c24541.L$0 = byteReadChannel;
            c24541.label = 1;
            if (awaitUntilReadable(byteReadChannel, 8, c24541) == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteReadChannel = (ByteReadChannel) c24541.L$0;
            P.u0(obj);
        }
        n readBuffer = byteReadChannel.getReadBuffer();
        m.e(readBuffer, "<this>");
        return new Double(Double.longBitsToDouble(readBuffer.readLong()));
    }

    public static final Object readFloat(ByteReadChannel byteReadChannel, p100l6.c cVar) {
        C24551 c24551;
        if (cVar instanceof C24551) {
            c24551 = (C24551) cVar;
            int i3 = c24551.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24551.label = i3 - Integer.MIN_VALUE;
            } else {
                c24551 = new C24551(cVar);
            }
        } else {
            c24551 = new C24551(cVar);
        }
        Object obj = c24551.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24551.label;
        if (i9 == 0) {
            P.u0(obj);
            c24551.L$0 = byteReadChannel;
            c24551.label = 1;
            if (awaitUntilReadable(byteReadChannel, 4, c24551) == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteReadChannel = (ByteReadChannel) c24551.L$0;
            P.u0(obj);
        }
        n readBuffer = byteReadChannel.getReadBuffer();
        m.e(readBuffer, "<this>");
        return new Float(Float.intBitsToFloat(readBuffer.readInt()));
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object readFully(io.ktor.utils.io.ByteReadChannel r8, byte[] r9, int r10, int r11, p100l6.c r12) {
        /*
            boolean r0 = r12 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C24561
            if (r0 == 0) goto L13
            r0 = r12
            io.ktor.utils.io.ByteReadChannelOperationsKt$readFully$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C24561) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readFully$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readFully$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            m6.a r1 = p109m6.a.f25430h
            int r2 = r0.label
            java.lang.String r3 = "Channel is already closed"
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 != r4) goto L35
            int r8 = r0.I$1
            int r9 = r0.I$0
            java.lang.Object r10 = r0.L$1
            byte[] r10 = (byte[]) r10
            java.lang.Object r11 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r11 = (io.ktor.utils.io.ByteReadChannel) r11
            com.google.common.util.concurrent.P.u0(r12)
            goto L73
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            com.google.common.util.concurrent.P.u0(r12)
            if (r11 <= r10) goto L4f
            boolean r12 = r8.isClosedForRead()
            if (r12 != 0) goto L49
            goto L4f
        L49:
            java.io.EOFException r8 = new java.io.EOFException
            r8.<init>(r3)
            throw r8
        L4f:
            if (r10 >= r11) goto L9d
            k8.n r12 = r8.getReadBuffer()
            boolean r12 = r12.o()
            if (r12 == 0) goto L78
            r0.L$0 = r8
            r0.L$1 = r9
            r0.I$0 = r11
            r0.I$1 = r10
            r0.label = r4
            r12 = 0
            r2 = 0
            java.lang.Object r12 = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(r8, r12, r0, r4, r2)
            if (r12 != r1) goto L6e
            return r1
        L6e:
            r7 = r11
            r11 = r8
            r8 = r10
            r10 = r9
            r9 = r7
        L73:
            r7 = r10
            r10 = r8
            r8 = r11
            r11 = r9
            r9 = r7
        L78:
            boolean r12 = r8.isClosedForRead()
            if (r12 != 0) goto L97
            int r12 = r11 - r10
            k8.n r2 = r8.getReadBuffer()
            long r5 = io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(r2)
            int r2 = (int) r5
            int r12 = java.lang.Math.min(r12, r2)
            k8.n r2 = r8.getReadBuffer()
            int r12 = r12 + r10
            p094k8.p.k(r2, r9, r10, r12)
            r10 = r12
            goto L4f
        L97:
            java.io.EOFException r8 = new java.io.EOFException
            r8.<init>(r3)
            throw r8
        L9d:
            h6.A r8 = p070h6.A.f22523a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.readFully(io.ktor.utils.io.ByteReadChannel, byte[], int, int, l6.c):java.lang.Object");
    }

    public static Object readFully$default(ByteReadChannel byteReadChannel, byte[] bArr, int i3, int i9, p100l6.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = bArr.length;
        }
        return readFully(byteReadChannel, bArr, i3, i9, cVar);
    }

    public static final Object readInt(ByteReadChannel byteReadChannel, p100l6.c cVar) {
        C24571 c24571;
        if (cVar instanceof C24571) {
            c24571 = (C24571) cVar;
            int i3 = c24571.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24571.label = i3 - Integer.MIN_VALUE;
            } else {
                c24571 = new C24571(cVar);
            }
        } else {
            c24571 = new C24571(cVar);
        }
        Object obj = c24571.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24571.label;
        if (i9 == 0) {
            P.u0(obj);
            c24571.L$0 = byteReadChannel;
            c24571.label = 1;
            if (awaitUntilReadable(byteReadChannel, 4, c24571) == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteReadChannel = (ByteReadChannel) c24571.L$0;
            P.u0(obj);
        }
        return new Integer(byteReadChannel.getReadBuffer().readInt());
    }

    public static final Object readLong(ByteReadChannel byteReadChannel, p100l6.c cVar) {
        C24581 c24581;
        if (cVar instanceof C24581) {
            c24581 = (C24581) cVar;
            int i3 = c24581.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24581.label = i3 - Integer.MIN_VALUE;
            } else {
                c24581 = new C24581(cVar);
            }
        } else {
            c24581 = new C24581(cVar);
        }
        Object obj = c24581.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24581.label;
        if (i9 == 0) {
            P.u0(obj);
            c24581.L$0 = byteReadChannel;
            c24581.label = 1;
            if (awaitUntilReadable(byteReadChannel, 8, c24581) == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteReadChannel = (ByteReadChannel) c24581.L$0;
            P.u0(obj);
        }
        return new Long(byteReadChannel.getReadBuffer().readLong());
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object readPacket(io.ktor.utils.io.ByteReadChannel r11, int r12, p100l6.c r13) throws java.io.EOFException {
        /*
            boolean r0 = r13 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C24591
            if (r0 == 0) goto L13
            r0 = r13
            io.ktor.utils.io.ByteReadChannelOperationsKt$readPacket$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C24591) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readPacket$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readPacket$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            m6.a r1 = p109m6.a.f25430h
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            int r11 = r0.I$0
            java.lang.Object r12 = r0.L$1
            k8.a r12 = (p094k8.a) r12
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r2 = (io.ktor.utils.io.ByteReadChannel) r2
            com.google.common.util.concurrent.P.u0(r13)
            goto L68
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            com.google.common.util.concurrent.P.u0(r13)
            k8.a r13 = new k8.a
            r13.<init>()
            r10 = r13
            r13 = r12
            r12 = r10
        L44:
            long r4 = r12.j
            long r6 = (long) r13
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L98
            k8.n r2 = r11.getReadBuffer()
            boolean r2 = r2.o()
            if (r2 == 0) goto L6a
            r0.L$0 = r11
            r0.L$1 = r12
            r0.I$0 = r13
            r0.label = r3
            r2 = 0
            r4 = 0
            java.lang.Object r2 = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(r11, r2, r0, r3, r4)
            if (r2 != r1) goto L66
            return r1
        L66:
            r2 = r11
            r11 = r13
        L68:
            r13 = r11
            r11 = r2
        L6a:
            boolean r2 = r11.isClosedForRead()
            if (r2 != 0) goto L98
            k8.n r2 = r11.getReadBuffer()
            long r4 = io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(r2)
            long r6 = (long) r13
            long r8 = r12.j
            long r8 = r6 - r8
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 <= 0) goto L8c
            k8.n r2 = r11.getReadBuffer()
            long r4 = r12.j
            long r6 = r6 - r4
            r2.y(r12, r6)
            goto L44
        L8c:
            k8.n r2 = r11.getReadBuffer()
            long r4 = r2.H(r12)
            p117n6.f.b(r4)
            goto L44
        L98:
            long r0 = r12.j
            long r2 = (long) r13
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 < 0) goto La0
            return r12
        La0:
            java.io.EOFException r11 = new java.io.EOFException
            java.lang.String r0 = "Not enough data available, required "
            java.lang.String r1 = " bytes but only "
            java.lang.StringBuilder r13 = p121o0.p.t(r13, r0, r1)
            long r0 = r12.j
            java.lang.String r12 = " available"
            java.lang.String r12 = Y6.f.g(r0, r12, r13)
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.readPacket(io.ktor.utils.io.ByteReadChannel, int, l6.c):java.lang.Object");
    }

    public static final Object readRemaining(ByteReadChannel byteReadChannel, p100l6.c cVar) throws Throwable {
        C24601 c24601;
        l lVarBytePacketBuilder;
        if (cVar instanceof C24601) {
            c24601 = (C24601) cVar;
            int i3 = c24601.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24601.label = i3 - Integer.MIN_VALUE;
            } else {
                c24601 = new C24601(cVar);
            }
        } else {
            c24601 = new C24601(cVar);
        }
        Object obj = c24601.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24601.label;
        if (i9 == 0) {
            P.u0(obj);
            lVarBytePacketBuilder = BytePacketBuilderKt.BytePacketBuilder();
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l lVar = (l) c24601.L$1;
            ByteReadChannel byteReadChannel2 = (ByteReadChannel) c24601.L$0;
            P.u0(obj);
            lVarBytePacketBuilder = lVar;
            byteReadChannel = byteReadChannel2;
        }
        while (!byteReadChannel.isClosedForRead()) {
            lVarBytePacketBuilder.D(byteReadChannel.getReadBuffer());
            c24601.L$0 = byteReadChannel;
            c24601.L$1 = lVarBytePacketBuilder;
            c24601.label = 1;
            if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, c24601, 1, null) == aVar) {
                return aVar;
            }
        }
        rethrowCloseCauseIfNeeded(byteReadChannel);
        return lVarBytePacketBuilder.a();
    }

    public static final Object readShort(ByteReadChannel byteReadChannel, p100l6.c cVar) {
        C24621 c24621;
        if (cVar instanceof C24621) {
            c24621 = (C24621) cVar;
            int i3 = c24621.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24621.label = i3 - Integer.MIN_VALUE;
            } else {
                c24621 = new C24621(cVar);
            }
        } else {
            c24621 = new C24621(cVar);
        }
        Object obj = c24621.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24621.label;
        if (i9 == 0) {
            P.u0(obj);
            c24621.L$0 = byteReadChannel;
            c24621.label = 1;
            if (awaitUntilReadable(byteReadChannel, 2, c24621) == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteReadChannel = (ByteReadChannel) c24621.L$0;
            P.u0(obj);
        }
        return new Short(byteReadChannel.getReadBuffer().readShort());
    }

    public static final Object readUTF8Line(ByteReadChannel byteReadChannel, int i3, p100l6.c cVar) {
        C24631 c24631;
        StringBuilder sb;
        if (cVar instanceof C24631) {
            c24631 = (C24631) cVar;
            int i9 = c24631.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c24631.label = i9 - Integer.MIN_VALUE;
            } else {
                c24631 = new C24631(cVar);
            }
        } else {
            c24631 = new C24631(cVar);
        }
        Object obj = c24631.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = c24631.label;
        if (i10 == 0) {
            P.u0(obj);
            StringBuilder sb2 = new StringBuilder();
            c24631.L$0 = sb2;
            c24631.label = 1;
            Object uTF8LineTo = readUTF8LineTo(byteReadChannel, sb2, i3, c24631);
            if (uTF8LineTo == aVar) {
                return aVar;
            }
            obj = uTF8LineTo;
            sb = sb2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sb = (StringBuilder) c24631.L$0;
            P.u0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return sb.toString();
        }
        return null;
    }

    public static Object readUTF8Line$default(ByteReadChannel byteReadChannel, int i3, p100l6.c cVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i3 = Log.LOG_LEVEL_OFF;
        }
        return readUTF8Line(byteReadChannel, i3, cVar);
    }

    public static final Object readUTF8LineTo(ByteReadChannel byteReadChannel, Appendable appendable, int i3, p100l6.c cVar) {
        return m480readUTF8LineToRRvyBJ8(byteReadChannel, appendable, i3, LineEndingMode.INSTANCE.m491getAnyf0jXZW8(), cVar);
    }

    public static Object readUTF8LineTo$default(ByteReadChannel byteReadChannel, Appendable appendable, int i3, p100l6.c cVar, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i3 = Log.LOG_LEVEL_OFF;
        }
        return readUTF8LineTo(byteReadChannel, appendable, i3, cVar);
    }

    @InternalAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m480readUTF8LineToRRvyBJ8(ByteReadChannel byteReadChannel, Appendable appendable, int i3, int i9, p100l6.c cVar) {
        C24642 c24642;
        AutoCloseable autoCloseableH;
        Appendable appendable2;
        int i10;
        int i11;
        ByteReadChannel byteReadChannel2;
        int i12;
        p094k8.a aVar;
        AutoCloseable autoCloseable;
        Appendable appendable3;
        Appendable appendable4;
        p094k8.a aVar2;
        ByteReadChannel byteReadChannel3;
        int i13;
        boolean z6;
        int i14;
        byte b9;
        ByteReadChannel byteReadChannel4 = byteReadChannel;
        if (cVar instanceof C24642) {
            c24642 = (C24642) cVar;
            int i15 = c24642.label;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                c24642.label = i15 - Integer.MIN_VALUE;
            } else {
                c24642 = new C24642(cVar);
            }
        } else {
            c24642 = new C24642(cVar);
        }
        Object obj = c24642.result;
        p109m6.a aVar3 = p109m6.a.f25430h;
        int i16 = c24642.label;
        int i17 = 2;
        int i18 = 0;
        try {
            if (i16 != 0) {
                if (i16 == 1) {
                    int i19 = c24642.I$1;
                    i10 = c24642.I$0;
                    Appendable appendable5 = (Appendable) c24642.L$1;
                    ByteReadChannel byteReadChannel5 = (ByteReadChannel) c24642.L$0;
                    P.u0(obj);
                    appendable2 = appendable5;
                    i11 = i19;
                    byteReadChannel4 = byteReadChannel5;
                } else {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i12 = c24642.I$1;
                        i10 = c24642.I$0;
                        aVar = (p094k8.a) c24642.L$3;
                        autoCloseable = (AutoCloseable) c24642.L$2;
                        appendable3 = (Appendable) c24642.L$1;
                        byteReadChannel2 = (ByteReadChannel) c24642.L$0;
                        P.u0(obj);
                        i14 = 0;
                        i18 = i14;
                        i17 = 2;
                        if (!byteReadChannel2.isClosedForRead()) {
                            i13 = i18;
                            if (aVar.j > 0) {
                                z6 = 1;
                            } else {
                                z6 = i13;
                            }
                            Boolean boolValueOf = Boolean.valueOf(z6);
                            if (z6 != 0) {
                                appendable3.append(p.c(aVar, aVar.j));
                            }
                            D.h(autoCloseable, null);
                            return boolValueOf;
                        }
                        while (true) {
                            if (byteReadChannel2.getReadBuffer().o()) {
                                b9 = byteReadChannel2.getReadBuffer().readByte();
                                if (b9 == 13) {
                                    if (byteReadChannel2.getReadBuffer().o()) {
                                        c24642.L$0 = byteReadChannel2;
                                        c24642.L$1 = appendable3;
                                        c24642.L$2 = autoCloseable;
                                        c24642.L$3 = aVar;
                                        c24642.I$0 = i12;
                                        c24642.label = i17;
                                        if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel2, i18, c24642, 1, null) == aVar3) {
                                            byteReadChannel3 = byteReadChannel2;
                                            appendable4 = appendable3;
                                            aVar2 = aVar;
                                        }
                                    }
                                    if (byteReadChannel2.getReadBuffer().a().e(0L) == 10) {
                                        readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(i12, LineEndingMode.INSTANCE.m493getCRLFf0jXZW8());
                                        f.b(ByteReadPacketKt.discard(byteReadChannel2.getReadBuffer(), 1L));
                                    } else {
                                        readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(i12, LineEndingMode.INSTANCE.m492getCRf0jXZW8());
                                    }
                                    m.e(aVar, "<this>");
                                    appendable3.append(p.c(aVar, aVar.j));
                                    Boolean bool = Boolean.TRUE;
                                    D.h(autoCloseable, null);
                                    return bool;
                                }
                                if (b9 == 10) {
                                    readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(i12, LineEndingMode.INSTANCE.m494getLFf0jXZW8());
                                    m.e(aVar, "<this>");
                                    appendable3.append(p.c(aVar, aVar.j));
                                    Boolean bool2 = Boolean.TRUE;
                                    D.h(autoCloseable, null);
                                    return bool2;
                                }
                                aVar.r(b9);
                            } else {
                                if (aVar.j < i10) {
                                    throw new TooLongLineException("Line exceeds limit of " + i10 + " characters");
                                }
                                c24642.L$0 = byteReadChannel2;
                                c24642.L$1 = appendable3;
                                c24642.L$2 = autoCloseable;
                                c24642.L$3 = aVar;
                                c24642.I$0 = i10;
                                c24642.I$1 = i12;
                                c24642.label = 3;
                                i14 = 0;
                            }
                            return aVar3;
                        }
                    }
                    i12 = c24642.I$0;
                    aVar2 = (p094k8.a) c24642.L$3;
                    autoCloseable = (AutoCloseable) c24642.L$2;
                    appendable4 = (Appendable) c24642.L$1;
                    byteReadChannel3 = (ByteReadChannel) c24642.L$0;
                    P.u0(obj);
                }
                byteReadChannel2 = byteReadChannel3;
                aVar = aVar2;
                appendable3 = appendable4;
                if (byteReadChannel2.getReadBuffer().a().e(0L) == 10) {
                    readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(i12, LineEndingMode.INSTANCE.m493getCRLFf0jXZW8());
                    f.b(ByteReadPacketKt.discard(byteReadChannel2.getReadBuffer(), 1L));
                } else {
                    readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(i12, LineEndingMode.INSTANCE.m492getCRf0jXZW8());
                }
                m.e(aVar, "<this>");
                appendable3.append(p.c(aVar, aVar.j));
                Boolean bool3 = Boolean.TRUE;
                D.h(autoCloseable, null);
                return bool3;
            }
            P.u0(obj);
            if (byteReadChannel4.getReadBuffer().o()) {
                c24642.L$0 = byteReadChannel4;
                appendable2 = appendable;
                c24642.L$1 = appendable2;
                i10 = i3;
                c24642.I$0 = i10;
                i11 = i9;
                c24642.I$1 = i11;
                c24642.label = 1;
            } else {
                appendable2 = appendable;
                i10 = i3;
                i11 = i9;
            }
            if (byteReadChannel4.isClosedForRead()) {
                return Boolean.FALSE;
            }
            int i20 = i11;
            byteReadChannel2 = byteReadChannel4;
            i12 = i20;
            aVar = new p094k8.a();
            autoCloseable = aVar;
            appendable3 = appendable2;
            if (!byteReadChannel2.isClosedForRead()) {
                i13 = i18;
                if (aVar.j > 0) {
                    z6 = 1;
                } else {
                    z6 = i13;
                }
                Boolean boolValueOf2 = Boolean.valueOf(z6);
                if (z6 != 0) {
                    appendable3.append(p.c(aVar, aVar.j));
                }
                D.h(autoCloseable, null);
                return boolValueOf2;
            }
            while (true) {
                if (byteReadChannel2.getReadBuffer().o()) {
                    b9 = byteReadChannel2.getReadBuffer().readByte();
                    if (b9 == 13) {
                        if (byteReadChannel2.getReadBuffer().o()) {
                            c24642.L$0 = byteReadChannel2;
                            c24642.L$1 = appendable3;
                            c24642.L$2 = autoCloseable;
                            c24642.L$3 = aVar;
                            c24642.I$0 = i12;
                            c24642.label = i17;
                            if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel2, i18, c24642, 1, null) == aVar3) {
                                byteReadChannel3 = byteReadChannel2;
                                appendable4 = appendable3;
                                aVar2 = aVar;
                                byteReadChannel2 = byteReadChannel3;
                                aVar = aVar2;
                                appendable3 = appendable4;
                            }
                        }
                        if (byteReadChannel2.getReadBuffer().a().e(0L) == 10) {
                            readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(i12, LineEndingMode.INSTANCE.m493getCRLFf0jXZW8());
                            f.b(ByteReadPacketKt.discard(byteReadChannel2.getReadBuffer(), 1L));
                        } else {
                            readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(i12, LineEndingMode.INSTANCE.m492getCRf0jXZW8());
                        }
                        m.e(aVar, "<this>");
                        appendable3.append(p.c(aVar, aVar.j));
                        Boolean bool4 = Boolean.TRUE;
                        D.h(autoCloseable, null);
                        return bool4;
                    }
                    if (b9 == 10) {
                        readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(i12, LineEndingMode.INSTANCE.m494getLFf0jXZW8());
                        m.e(aVar, "<this>");
                        appendable3.append(p.c(aVar, aVar.j));
                        Boolean bool5 = Boolean.TRUE;
                        D.h(autoCloseable, null);
                        return bool5;
                    }
                    aVar.r(b9);
                } else {
                    if (aVar.j < i10) {
                        throw new TooLongLineException("Line exceeds limit of " + i10 + " characters");
                    }
                    c24642.L$0 = byteReadChannel2;
                    c24642.L$1 = appendable3;
                    c24642.L$2 = autoCloseable;
                    c24642.L$3 = aVar;
                    c24642.I$0 = i10;
                    c24642.I$1 = i12;
                    c24642.label = 3;
                    i14 = 0;
                }
                return aVar3;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                D.h(autoCloseableH, th);
                throw th2;
            }
        }
    }

    public static Object m481readUTF8LineToRRvyBJ8$default(ByteReadChannel byteReadChannel, Appendable appendable, int i3, int i9, p100l6.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i3 = Log.LOG_LEVEL_OFF;
        }
        if ((i10 & 4) != 0) {
            i9 = LineEndingMode.INSTANCE.m491getAnyf0jXZW8();
        }
        return m480readUTF8LineToRRvyBJ8(byteReadChannel, appendable, i3, i9, cVar);
    }

    private static final void readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(int i3, int i9) throws IOException {
        if (LineEndingMode.m484containslTjpP64(i3, i9)) {
            return;
        }
        throw new IOException("Unexpected line ending " + ((Object) LineEndingMode.m489toStringimpl(i9)) + ", while expected " + ((Object) LineEndingMode.m489toStringimpl(i3)));
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object readUntil(io.ktor.utils.io.ByteReadChannel r20, p102l8.a r21, io.ktor.utils.io.ByteWriteChannel r22, long r23, boolean r25, p100l6.c r26) {
        /*
            Method dump skipped, instruction units count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.readUntil(io.ktor.utils.io.ByteReadChannel, l8.a, io.ktor.utils.io.ByteWriteChannel, long, boolean, l6.c):java.lang.Object");
    }

    public static final Object readUntil$appendPartialMatch(ByteWriteChannel byteWriteChannel, byte[] bArr, y yVar, z zVar, p100l6.c cVar) {
        ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1 byteReadChannelOperationsKt$readUntil$appendPartialMatch$1;
        if (cVar instanceof ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1) {
            byteReadChannelOperationsKt$readUntil$appendPartialMatch$1 = (ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1) cVar;
            int i3 = byteReadChannelOperationsKt$readUntil$appendPartialMatch$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readUntil$appendPartialMatch$1.label = i3 - Integer.MIN_VALUE;
            } else {
                byteReadChannelOperationsKt$readUntil$appendPartialMatch$1 = new ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1(cVar);
            }
        } else {
            byteReadChannelOperationsKt$readUntil$appendPartialMatch$1 = new ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1(cVar);
        }
        Object obj = byteReadChannelOperationsKt$readUntil$appendPartialMatch$1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = byteReadChannelOperationsKt$readUntil$appendPartialMatch$1.label;
        if (i9 == 0) {
            P.u0(obj);
            int i10 = yVar.f24555h;
            byteReadChannelOperationsKt$readUntil$appendPartialMatch$1.L$0 = yVar;
            byteReadChannelOperationsKt$readUntil$appendPartialMatch$1.L$1 = zVar;
            byteReadChannelOperationsKt$readUntil$appendPartialMatch$1.label = 1;
            if (ByteWriteChannelOperationsKt.writeFully(byteWriteChannel, bArr, 0, i10, byteReadChannelOperationsKt$readUntil$appendPartialMatch$1) == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zVar = (z) byteReadChannelOperationsKt$readUntil$appendPartialMatch$1.L$1;
            yVar = (y) byteReadChannelOperationsKt$readUntil$appendPartialMatch$1.L$0;
            P.u0(obj);
        }
        zVar.f24556h += (long) yVar.f24555h;
        yVar.f24555h = 0;
        return A.f22523a;
    }

    public static Object readUntil$default(ByteReadChannel byteReadChannel, p102l8.a aVar, ByteWriteChannel byteWriteChannel, long j, boolean z6, p100l6.c cVar, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            j = Long.MAX_VALUE;
        }
        long j9 = j;
        if ((i3 & 8) != 0) {
            z6 = false;
        }
        return readUntil(byteReadChannel, aVar, byteWriteChannel, j9, z6, cVar);
    }

    private static final void readUntil$resetPartialMatch(y yVar, p102l8.a aVar, int[] iArr, byte b9) {
        while (true) {
            int i3 = yVar.f24555h;
            if (i3 <= 0 || b9 == aVar.a(i3)) {
                return;
            } else {
                yVar.f24555h = iArr[yVar.f24555h - 1];
            }
        }
    }

    public static final ReaderJob reader(S7.A a2, h coroutineContext, boolean z6, p194x6.m block) {
        m.e(a2, "<this>");
        m.e(coroutineContext, "coroutineContext");
        m.e(block, "block");
        return reader(a2, coroutineContext, new ByteChannel(false, 1, null), block);
    }

    public static ReaderJob reader$default(S7.A a2, h hVar, boolean z6, p194x6.m mVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            hVar = p100l6.i.f24820h;
        }
        if ((i3 & 2) != 0) {
            z6 = false;
        }
        return reader(a2, hVar, z6, mVar);
    }

    public static final A reader$lambda$6$lambda$5(ByteChannel byteChannel, Throwable th) {
        if (th != null && !byteChannel.isClosedForRead()) {
            byteChannel.cancel(th);
        }
        return A.f22523a;
    }

    @InternalAPI
    public static final void rethrowCloseCauseIfNeeded(ByteReadChannel byteReadChannel) throws Throwable {
        m.e(byteReadChannel, "<this>");
        Throwable closedCause = byteReadChannel.getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
    }

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object skipIfFound(ByteReadChannel byteReadChannel, p102l8.a aVar, p100l6.c cVar) {
        C24671 c24671;
        if (cVar instanceof C24671) {
            c24671 = (C24671) cVar;
            int i3 = c24671.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24671.label = i3 - Integer.MIN_VALUE;
            } else {
                c24671 = new C24671(cVar);
            }
        } else {
            c24671 = new C24671(cVar);
        }
        Object objPeek = c24671.result;
        p109m6.a aVar2 = p109m6.a.f25430h;
        int i9 = c24671.label;
        if (i9 != 0) {
            if (i9 == 1) {
                aVar = (p102l8.a) c24671.L$1;
                byteReadChannel = (ByteReadChannel) c24671.L$0;
                P.u0(objPeek);
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P.u0(objPeek);
            }
            return Boolean.TRUE;
        }
        P.u0(objPeek);
        int length = aVar.f24871h.length;
        c24671.L$0 = byteReadChannel;
        c24671.L$1 = aVar;
        c24671.label = 1;
        objPeek = peek(byteReadChannel, length, c24671);
        if (objPeek != aVar2) {
        }
        return aVar2;
        if (!m.a(objPeek, aVar)) {
            return Boolean.FALSE;
        }
        long length2 = aVar.f24871h.length;
        c24671.L$0 = null;
        c24671.L$1 = null;
        c24671.label = 2;
    }

    public static final Object toByteArray(ByteReadChannel byteReadChannel, p100l6.c cVar) throws Throwable {
        C24681 c24681;
        if (cVar instanceof C24681) {
            c24681 = (C24681) cVar;
            int i3 = c24681.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24681.label = i3 - Integer.MIN_VALUE;
            } else {
                c24681 = new C24681(cVar);
            }
        } else {
            c24681 = new C24681(cVar);
        }
        Object buffer = c24681.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24681.label;
        if (i9 == 0) {
            P.u0(buffer);
            c24681.label = 1;
            buffer = readBuffer(byteReadChannel, c24681);
            if (buffer == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P.u0(buffer);
        }
        return BuffersKt.readBytes$default((p094k8.a) buffer, 0, 1, null);
    }

    private static final String toSingleLineString(p102l8.a aVar) {
        m.e(aVar, "<this>");
        return x.w0(x.n0(aVar.f24871h), "\n", "\\n");
    }

    public static final ReaderJob reader(S7.A a2, h coroutineContext, ByteChannel channel, p194x6.m block) {
        m.e(a2, "<this>");
        m.e(coroutineContext, "coroutineContext");
        m.e(channel, "channel");
        m.e(block, "block");
        w0 w0VarA = C.A(a2, coroutineContext, new ByteReadChannelOperationsKt$reader$job$1(block, channel, null), 2);
        w0VarA.j(new a(channel, 1));
        return new ReaderJob(CloseHookByteWriteChannelKt.onClose(channel, new C24661(w0VarA, null)), w0VarA);
    }

    @InternalAPI
    public static final void rethrowCloseCauseIfNeeded(ByteWriteChannel byteWriteChannel) throws Throwable {
        m.e(byteWriteChannel, "<this>");
        Throwable closedCause = byteWriteChannel.getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
    }

    @InternalAPI
    public static final void rethrowCloseCauseIfNeeded(ByteChannel byteChannel) throws Throwable {
        m.e(byteChannel, "<this>");
        Throwable closedCause = byteChannel.getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
    }

    public static final Object readBuffer(ByteReadChannel byteReadChannel, int i3, p100l6.c cVar) {
        AnonymousClass3 anonymousClass3;
        p094k8.a aVar;
        ByteReadChannel byteReadChannel2;
        int i9;
        p094k8.a aVar2;
        if (cVar instanceof AnonymousClass3) {
            anonymousClass3 = (AnonymousClass3) cVar;
            int i10 = anonymousClass3.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass3.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass3 = new AnonymousClass3(cVar);
            }
        } else {
            anonymousClass3 = new AnonymousClass3(cVar);
        }
        Object obj = anonymousClass3.result;
        p109m6.a aVar3 = p109m6.a.f25430h;
        int i11 = anonymousClass3.label;
        if (i11 == 0) {
            P.u0(obj);
            aVar = new p094k8.a();
            if (i3 > 0 || byteReadChannel.isClosedForRead()) {
                return aVar;
            }
            if (byteReadChannel.getReadBuffer().o()) {
                anonymousClass3.L$0 = byteReadChannel;
                anonymousClass3.L$1 = aVar;
                anonymousClass3.I$0 = i3;
                anonymousClass3.label = 1;
                if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, anonymousClass3, 1, null) == aVar3) {
                    return aVar3;
                }
                byteReadChannel2 = byteReadChannel;
                i9 = i3;
                aVar2 = aVar;
            }
            long jMin = Math.min(i3, ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer()));
            byteReadChannel.getReadBuffer().y(aVar, jMin);
            i3 -= (int) jMin;
            if (i3 > 0) {
            }
            return aVar;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i9 = anonymousClass3.I$0;
        aVar2 = (p094k8.a) anonymousClass3.L$1;
        byteReadChannel2 = (ByteReadChannel) anonymousClass3.L$0;
        P.u0(obj);
        aVar = aVar2;
        i3 = i9;
        byteReadChannel = byteReadChannel2;
        long jMin2 = Math.min(i3, ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer()));
        byteReadChannel.getReadBuffer().y(aVar, jMin2);
        i3 -= (int) jMin2;
        if (i3 > 0) {
        }
        return aVar;
    }

    public static final Object readRemaining(ByteReadChannel byteReadChannel, long j, p100l6.c cVar) {
        C24612 c24612;
        l lVarBytePacketBuilder;
        if (cVar instanceof C24612) {
            c24612 = (C24612) cVar;
            int i3 = c24612.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24612.label = i3 - Integer.MIN_VALUE;
            } else {
                c24612 = new C24612(cVar);
            }
        } else {
            c24612 = new C24612(cVar);
        }
        Object obj = c24612.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24612.label;
        if (i9 == 0) {
            P.u0(obj);
            lVarBytePacketBuilder = BytePacketBuilderKt.BytePacketBuilder();
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j9 = c24612.J$0;
            l lVar = (l) c24612.L$1;
            ByteReadChannel byteReadChannel2 = (ByteReadChannel) c24612.L$0;
            P.u0(obj);
            lVarBytePacketBuilder = lVar;
            j = j9;
            byteReadChannel = byteReadChannel2;
        }
        while (!byteReadChannel.isClosedForRead()) {
            long remaining = 0;
            if (j <= 0) {
                break;
            }
            if (j >= ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer())) {
                remaining = j - ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer());
                f.b(byteReadChannel.getReadBuffer().H(lVarBytePacketBuilder));
            } else {
                byteReadChannel.getReadBuffer().y(lVarBytePacketBuilder, j);
            }
            c24612.L$0 = byteReadChannel;
            c24612.L$1 = lVarBytePacketBuilder;
            c24612.J$0 = remaining;
            c24612.label = 1;
            if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, c24612, 1, null) == aVar) {
                return aVar;
            }
            j = remaining;
        }
        return lVarBytePacketBuilder.a();
    }

    public static final int readAvailable(ByteReadChannel byteReadChannel, int i3, j block) {
        m.e(byteReadChannel, "<this>");
        m.e(block, "block");
        if (i3 <= 0) {
            throw new IllegalArgumentException("min should be positive");
        }
        if (i3 <= 1048576) {
            if (getAvailableForRead(byteReadChannel) < i3) {
                return -1;
            }
            return ((Number) block.invoke(byteReadChannel.getReadBuffer().a())).intValue();
        }
        throw new IllegalArgumentException(Y6.f.f(i3, "Min(", ") shouldn't be greater than 1048576").toString());
    }

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object copyTo(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, long j, p100l6.c cVar) throws Throwable {
        AnonymousClass2 anonymousClass2;
        ByteReadChannel byteReadChannel2;
        long j9;
        long j10;
        AnonymousClass2 anonymousClass3;
        ByteReadChannel byteReadChannel3;
        long j11;
        long j12;
        ?? r9;
        if (cVar instanceof AnonymousClass2) {
            anonymousClass2 = (AnonymousClass2) cVar;
            int i3 = anonymousClass2.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass2.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass2 = new AnonymousClass2(cVar);
            }
        } else {
            anonymousClass2 = new AnonymousClass2(cVar);
        }
        Object obj = anonymousClass2.result;
        p109m6.a aVar = p109m6.a.f25430h;
        ?? r10 = anonymousClass2.label;
        int i9 = 1;
        try {
            if (r10 == 0) {
                P.u0(obj);
                r10 = byteWriteChannel;
                j9 = j;
                j10 = j9;
                anonymousClass3 = anonymousClass2;
                byteReadChannel3 = byteReadChannel;
                if (byteReadChannel3.isClosedForRead()) {
                    anonymousClass3.L$0 = null;
                    anonymousClass3.L$1 = null;
                    anonymousClass3.J$0 = j10;
                    anonymousClass3.J$1 = j9;
                    anonymousClass3.label = 3;
                    if (r10.flush(anonymousClass3) != aVar) {
                        j11 = j9;
                        j12 = j10;
                    }
                } else {
                    anonymousClass3.L$0 = null;
                    anonymousClass3.L$1 = null;
                    anonymousClass3.J$0 = j10;
                    anonymousClass3.J$1 = j9;
                    anonymousClass3.label = 3;
                    if (r10.flush(anonymousClass3) != aVar) {
                        j11 = j9;
                        j12 = j10;
                    }
                }
                return aVar;
            }
            if (r10 == 1) {
                j9 = anonymousClass2.J$1;
                j10 = anonymousClass2.J$0;
                ByteWriteChannel byteWriteChannel2 = (ByteWriteChannel) anonymousClass2.L$1;
                byteReadChannel2 = (ByteReadChannel) anonymousClass2.L$0;
                P.u0(obj);
                r10 = byteWriteChannel2;
                long jMin = Math.min(j9, ByteReadPacketKt.getRemaining(byteReadChannel2.getReadBuffer()));
                byteReadChannel2.getReadBuffer().y(r10.getWriteBuffer(), jMin);
                j9 -= jMin;
                anonymousClass2.L$0 = byteReadChannel2;
                anonymousClass2.L$1 = r10;
                anonymousClass2.J$0 = j10;
                anonymousClass2.J$1 = j9;
                anonymousClass2.label = 2;
                Object objFlush = r10.flush(anonymousClass2);
                r9 = r10;
            } else if (r10 == 2) {
                j9 = anonymousClass2.J$1;
                j10 = anonymousClass2.J$0;
                ByteWriteChannel byteWriteChannel3 = (ByteWriteChannel) anonymousClass2.L$1;
                byteReadChannel2 = (ByteReadChannel) anonymousClass2.L$0;
                P.u0(obj);
                r9 = byteWriteChannel3;
                try {
                    ByteReadChannel byteReadChannel4 = byteReadChannel2;
                    anonymousClass3 = anonymousClass2;
                    byteReadChannel3 = byteReadChannel4;
                    i9 = 1;
                    r10 = r9;
                    if (byteReadChannel3.isClosedForRead() && j9 > 0) {
                        if (byteReadChannel3.getReadBuffer().o()) {
                            anonymousClass3.L$0 = byteReadChannel3;
                            anonymousClass3.L$1 = r10;
                            anonymousClass3.J$0 = j10;
                            anonymousClass3.J$1 = j9;
                            anonymousClass3.label = i9;
                        }
                        AnonymousClass2 anonymousClass4 = anonymousClass3;
                        byteReadChannel2 = byteReadChannel3;
                        anonymousClass2 = anonymousClass4;
                        r10 = r10;
                        long jMin2 = Math.min(j9, ByteReadPacketKt.getRemaining(byteReadChannel2.getReadBuffer()));
                        byteReadChannel2.getReadBuffer().y(r10.getWriteBuffer(), jMin2);
                        j9 -= jMin2;
                        anonymousClass2.L$0 = byteReadChannel2;
                        anonymousClass2.L$1 = r10;
                        anonymousClass2.J$0 = j10;
                        anonymousClass2.J$1 = j9;
                        anonymousClass2.label = 2;
                        Object objFlush2 = r10.flush(anonymousClass2);
                        r9 = r10;
                    } else {
                        anonymousClass3.L$0 = null;
                        anonymousClass3.L$1 = null;
                        anonymousClass3.J$0 = j10;
                        anonymousClass3.J$1 = j9;
                        anonymousClass3.label = 3;
                        if (r10.flush(anonymousClass3) != aVar) {
                            j11 = j9;
                            j12 = j10;
                        }
                    }
                    return aVar;
                } catch (Throwable th) {
                    th = th;
                    AnonymousClass2 anonymousClass5 = anonymousClass3;
                    byteReadChannel2 = byteReadChannel3;
                    anonymousClass2 = anonymousClass5;
                    try {
                        byteReadChannel2.cancel(th);
                        ByteWriteChannelOperationsKt.close(r10, th);
                        throw th;
                    } catch (Throwable th2) {
                        anonymousClass2.L$0 = th2;
                        anonymousClass2.L$1 = null;
                        anonymousClass2.label = 4;
                        if (r10.flush(anonymousClass2) != aVar) {
                            throw th2;
                        }
                    }
                }
            } else {
                if (r10 != 3) {
                    if (r10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th3 = (Throwable) anonymousClass2.L$0;
                    P.u0(obj);
                    throw th3;
                }
                j11 = anonymousClass2.J$1;
                j12 = anonymousClass2.J$0;
                P.u0(obj);
            }
            return new Long(j12 - j11);
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
