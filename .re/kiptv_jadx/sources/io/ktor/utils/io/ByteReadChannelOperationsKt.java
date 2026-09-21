package io.ktor.utils.io;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0013\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0014\u0010\t\u001a\u00020\b*\u00020\u0000H\u0086@¢\u0006\u0004\b\t\u0010\u0003\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0086@¢\u0006\u0004\b\u000b\u0010\u0003\u001a\u0014\u0010\r\u001a\u00020\f*\u00020\u0000H\u0086@¢\u0006\u0004\b\r\u0010\u0003\u001a\u0014\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0086@¢\u0006\u0004\b\u000f\u0010\u0003\u001a\u0014\u0010\u0011\u001a\u00020\u0010*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0011\u0010\u0003\u001a\u001c\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0014\u0010\u0017\u001a\u00020\u0016*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0017\u0010\u0003\u001a\u001c\u0010\u0017\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0017\u0010\u0015\u001a\u001c\u0010\u001b\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001b\u0010\u001c\u001a \u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u001e\u0010\u0015\u001a\u001c\u0010\u001f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001f\u0010\u001c\u001a$\u0010\u001f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u001f\u0010!\u001a\u001c\u0010#\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\"\u001a\u00020\nH\u0086@¢\u0006\u0004\b#\u0010\u0015\u001a\u0014\u0010%\u001a\u00020$*\u00020\u0000H\u0086@¢\u0006\u0004\b%\u0010\u0003\u001a\u001c\u0010%\u001a\u00020$*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b%\u0010&\u001a0\u0010*\u001a\u00020\n*\u00020\u00002\u0006\u0010'\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\n2\b\b\u0002\u0010)\u001a\u00020\nH\u0086@¢\u0006\u0004\b*\u0010+\u001a-\u0010*\u001a\u00020\n*\u00020\u00002\u0006\u0010,\u001a\u00020\n2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0-¢\u0006\u0004\b*\u0010/\u001aI\u00109\u001a\u000208*\u0002002\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u00020\u00012\"\u0010.\u001a\u001e\b\u0001\u0012\u0004\u0012\u000205\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001306\u0012\u0006\u0012\u0004\u0018\u00010704¢\u0006\u0004\b9\u0010:\u001aE\u00109\u001a\u000208*\u0002002\u0006\u00102\u001a\u0002012\u0006\u0010\u001a\u001a\u00020;2\"\u0010.\u001a\u001e\b\u0001\u0012\u0004\u0012\u000205\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001306\u0012\u0006\u0012\u0004\u0018\u00010704¢\u0006\u0004\b9\u0010<\u001a\u001c\u0010>\u001a\u00020$*\u00020\u00002\u0006\u0010=\u001a\u00020\nH\u0086@¢\u0006\u0004\b>\u0010\u0015\u001a\u001c\u0010@\u001a\u00020\u0013*\u00020\u00002\u0006\u0010?\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b@\u0010&\u001a\u001e\u0010A\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u000eH\u0086@¢\u0006\u0004\bA\u0010&\u001a*\u0010E\u001a\u00020\u0001*\u00020\u00002\n\u0010D\u001a\u00060Bj\u0002`C2\b\b\u0002\u0010\u0018\u001a\u00020\nH\u0086@¢\u0006\u0004\bE\u0010F\u001a4\u0010E\u001a\u00020\u0001*\u00020\u00002\n\u0010D\u001a\u00060Bj\u0002`C2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010H\u001a\u00020GH\u0087@¢\u0006\u0004\bI\u0010J\u001aF\u0010L\u001a\u00020\n*\u00020\u000020\b\u0004\u0010.\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n06\u0012\u0006\u0012\u0004\u0018\u0001070KH\u0086H¢\u0006\u0004\bL\u0010M\u001a0\u0010P\u001a\u00020\u0013*\u00020\u00002\u0006\u0010D\u001a\u00020\u00042\b\b\u0002\u0010N\u001a\u00020\n2\b\b\u0002\u0010O\u001a\u00020\nH\u0086@¢\u0006\u0004\bP\u0010+\u001a\u0013\u0010Q\u001a\u00020\u0013*\u00020\u0000H\u0007¢\u0006\u0004\bQ\u0010R\u001a\u0013\u0010Q\u001a\u00020\u0013*\u00020\u0019H\u0007¢\u0006\u0004\bQ\u0010S\u001a\u0013\u0010Q\u001a\u00020\u0013*\u00020;H\u0007¢\u0006\u0004\bQ\u0010T\u001a8\u0010Y\u001a\u00020\u000e*\u00020\u00002\u0006\u0010V\u001a\u00020U2\u0006\u0010W\u001a\u00020\u00192\b\b\u0002\u0010 \u001a\u00020\u000e2\b\b\u0002\u0010X\u001a\u00020\u0001H\u0086@¢\u0006\u0004\bY\u0010Z\u001a\u0017\u0010]\u001a\u00020\\2\u0006\u0010[\u001a\u00020UH\u0002¢\u0006\u0004\b]\u0010^\u001a\u0013\u0010_\u001a\u00020\u001d*\u00020UH\u0002¢\u0006\u0004\b_\u0010`\u001a\u001c\u0010a\u001a\u00020\u0001*\u00020\u00002\u0006\u0010[\u001a\u00020UH\u0086@¢\u0006\u0004\ba\u0010b\u001a\u001e\u0010c\u001a\u0004\u0018\u00010U*\u00020\u00002\u0006\u0010\"\u001a\u00020\nH\u0086@¢\u0006\u0004\bc\u0010\u0015\"\u0014\u0010d\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bd\u0010e\"\u0014\u0010f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bf\u0010e\"\u001b\u0010j\u001a\u00020\n*\u00020\u00198F¢\u0006\f\u0012\u0004\bi\u0010S\u001a\u0004\bg\u0010h\"\u001b\u0010n\u001a\u00020\n*\u00020\u00008F¢\u0006\f\u0012\u0004\bm\u0010R\u001a\u0004\bk\u0010l¨\u0006o"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "", "exhausted", "(Lio/ktor/utils/io/ByteReadChannel;Ll6/c;)Ljava/lang/Object;", "", "toByteArray", "", "readByte", "", "readShort", "", "readInt", "", "readFloat", "", "readLong", "", "readDouble", "numberOfBytes", "Lh6/A;", "awaitUntilReadable", "(Lio/ktor/utils/io/ByteReadChannel;ILl6/c;)Ljava/lang/Object;", "Lk8/a;", "readBuffer", "max", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "copyAndClose", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;Ll6/c;)Ljava/lang/Object;", "", "readUTF8Line", "copyTo", "limit", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;JLl6/c;)Ljava/lang/Object;", "count", "readByteArray", "Lk8/n;", "readRemaining", "(Lio/ktor/utils/io/ByteReadChannel;JLl6/c;)Ljava/lang/Object;", "buffer", "offset", io.sentry.SentryEnvelopeItemHeader.JsonKeys.LENGTH, "readAvailable", "(Lio/ktor/utils/io/ByteReadChannel;[BIILl6/c;)Ljava/lang/Object;", "min", "Lkotlin/Function1;", "block", "(Lio/ktor/utils/io/ByteReadChannel;ILx6/j;)I", "LS7/A;", "Ll6/h;", "coroutineContext", "autoFlush", "Lkotlin/Function2;", "Lio/ktor/utils/io/ReaderScope;", "Ll6/c;", "", "Lio/ktor/utils/io/ReaderJob;", "reader", "(LS7/A;Ll6/h;ZLx6/m;)Lio/ktor/utils/io/ReaderJob;", "Lio/ktor/utils/io/ByteChannel;", "(LS7/A;Ll6/h;Lio/ktor/utils/io/ByteChannel;Lx6/m;)Lio/ktor/utils/io/ReaderJob;", "packet", "readPacket", "value", "discardExact", "discard", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "out", "readUTF8LineTo", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/lang/Appendable;ILl6/c;)Ljava/lang/Object;", "Lio/ktor/utils/io/LineEndingMode;", "lineEnding", "readUTF8LineTo-RRvyBJ8", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/lang/Appendable;IILl6/c;)Ljava/lang/Object;", "Lkotlin/Function4;", "read", "(Lio/ktor/utils/io/ByteReadChannel;Lx6/o;Ll6/c;)Ljava/lang/Object;", androidx.media3.extractor.text.ttml.TtmlNode.START, androidx.media3.extractor.text.ttml.TtmlNode.END, "readFully", "rethrowCloseCauseIfNeeded", "(Lio/ktor/utils/io/ByteReadChannel;)V", "(Lio/ktor/utils/io/ByteWriteChannel;)V", "(Lio/ktor/utils/io/ByteChannel;)V", "Ll8/a;", "matchString", "writeChannel", "ignoreMissing", "readUntil", "(Lio/ktor/utils/io/ByteReadChannel;Ll8/a;Lio/ktor/utils/io/ByteWriteChannel;JZLl6/c;)Ljava/lang/Object;", "byteString", "", "buildPartialMatchTable", "(Ll8/a;)[I", "toSingleLineString", "(Ll8/a;)Ljava/lang/String;", "skipIfFound", "(Lio/ktor/utils/io/ByteReadChannel;Ll8/a;Ll6/c;)Ljava/lang/Object;", "peek", "CR", "B", "LF", "getAvailableForWrite", "(Lio/ktor/utils/io/ByteWriteChannel;)I", "getAvailableForWrite$annotations", "availableForWrite", "getAvailableForRead", "(Lio/ktor/utils/io/ByteReadChannel;)I", "getAvailableForRead$annotations", "availableForRead", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ByteReadChannelOperationsKt {
    private static final byte CR = 13;
    private static final byte LF = 10;

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$awaitUntilReadable$1, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {95, 96}, m = "awaitUntilReadable")
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
            return io.ktor.utils.io.ByteReadChannelOperationsKt.awaitUntilReadable(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$copyAndClose$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {137, androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS, 147, 147}, m = "copyAndClose")
    public static final class C24431 extends p117n6.c {
        long J$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24431(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.ByteReadChannelOperationsKt.copyAndClose(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$copyTo$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {176, 177, 184, 184}, m = "copyTo")
    public static final class C24441 extends p117n6.c {
        long J$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24441(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.ByteReadChannelOperationsKt.copyTo(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$copyTo$2, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {195, 199, 206, 206}, m = "copyTo")
    public static final class AnonymousClass2 extends p117n6.c {
        long J$0;
        long J$1;
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass2(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.ByteReadChannelOperationsKt.copyTo(null, null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$discard$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {382}, m = "discard")
    public static final class C24451 extends p117n6.c {
        long J$0;
        long J$1;
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24451(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.ByteReadChannelOperationsKt.discard(null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$discardExact$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {374}, m = "discardExact")
    public static final class C24461 extends p117n6.c {
        long J$0;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24461(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.ByteReadChannelOperationsKt.discardExact(null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$exhausted$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {33}, m = "exhausted")
    public static final class C24471 extends p117n6.c {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24471(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.ByteReadChannelOperationsKt.exhausted(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$peek$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {674}, m = "peek")
    public static final class C24481 extends p117n6.c {
        int I$0;
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24481(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.ByteReadChannelOperationsKt.peek(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$read$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    @p117n6.e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {488, 493}, m = "read")
    public static final class C24491 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24491(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.ByteReadChannelOperationsKt.read(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readAvailable$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {264}, m = "readAvailable")
    public static final class C24501 extends p117n6.c {
        int I$0;
        int I$1;
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24501(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.ByteReadChannelOperationsKt.readAvailable(null, null, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {107}, m = "readBuffer")
    public static final class C24511 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24511(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.ByteReadChannelOperationsKt.readBuffer(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$3, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {121}, m = "readBuffer")
    public static final class AnonymousClass3 extends p117n6.c {
        int I$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass3(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.ByteReadChannelOperationsKt.readBuffer(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readByte$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {44}, m = "readByte")
    public static final class C24521 extends p117n6.c {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24521(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.ByteReadChannelOperationsKt.readByte(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readByteArray$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {214}, m = "readByteArray")
    public static final class C24531 extends p117n6.c {
        int I$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24531(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.ByteReadChannelOperationsKt.readByteArray(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readDouble$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {90}, m = "readDouble")
    public static final class C24541 extends p117n6.c {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24541(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.ByteReadChannelOperationsKt.readDouble(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readFloat$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {73}, m = "readFloat")
    public static final class C24551 extends p117n6.c {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24551(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.ByteReadChannelOperationsKt.readFloat(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readFully$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {522}, m = "readFully")
    public static final class C24561 extends p117n6.c {
        int I$0;
        int I$1;
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24561(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.ByteReadChannelOperationsKt.readFully(null, null, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readInt$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {62}, m = "readInt")
    public static final class C24571 extends p117n6.c {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24571(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.ByteReadChannelOperationsKt.readInt(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readLong$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {79}, m = "readLong")
    public static final class C24581 extends p117n6.c {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24581(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.ByteReadChannelOperationsKt.readLong(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readPacket$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {357}, m = "readPacket")
    public static final class C24591 extends p117n6.c {
        int I$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24591(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.ByteReadChannelOperationsKt.readPacket(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {224}, m = "readRemaining")
    public static final class C24601 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24601(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$2, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {244}, m = "readRemaining")
    public static final class C24612 extends p117n6.c {
        long J$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24612(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readShort$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {56}, m = "readShort")
    public static final class C24621 extends p117n6.c {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24621(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.ByteReadChannelOperationsKt.readShort(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readUTF8Line$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {166}, m = "readUTF8Line")
    public static final class C24631 extends p117n6.c {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24631(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.ByteReadChannelOperationsKt.readUTF8Line(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readUTF8LineTo$2, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {435, 450, 474}, m = "readUTF8LineTo-RRvyBJ8")
    public static final class C24642 extends p117n6.c {
        int I$0;
        int I$1;
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24642(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.ByteReadChannelOperationsKt.m480readUTF8LineToRRvyBJ8(null, null, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readUntil$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {589, 592, 602, 612, 613}, m = "readUntil")
    public static final class C24651 extends p117n6.c {
        byte B$0;
        long J$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        java.lang.Object L$6;
        boolean Z$0;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24651(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.ByteReadChannelOperationsKt.readUntil(null, null, null, 0L, false, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$reader$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    @p117n6.e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt$reader$1", f = "ByteReadChannelOperations.kt", l = {342}, m = "invokeSuspend")
    public static final class C24661 extends p117n6.i implements p194x6.j {
        final /* synthetic */ S7.InterfaceC0891h0 $job;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24661(S7.InterfaceC0891h0 interfaceC0891h0, p100l6.c cVar) {
            super(1, cVar);
            this.$job = interfaceC0891h0;
        }

        @Override // p117n6.a
        public final p100l6.c create(p100l6.c cVar) {
            return new io.ktor.utils.io.ByteReadChannelOperationsKt.C24661(this.$job, cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            if (i3 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                S7.InterfaceC0891h0 interfaceC0891h0 = this.$job;
                this.label = 1;
                if (interfaceC0891h0.z(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
            }
            return p070h6.A.f22523a;
        }

        @Override // p194x6.j
        public final java.lang.Object invoke(p100l6.c cVar) {
            return ((io.ktor.utils.io.ByteReadChannelOperationsKt.C24661) create(cVar)).invokeSuspend(p070h6.A.f22523a);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$skipIfFound$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {654, 655}, m = "skipIfFound")
    public static final class C24671 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24671(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.ByteReadChannelOperationsKt.skipIfFound(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$toByteArray$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {androidx.media3.extractor.flac.FlacConstants.STREAM_INFO_BLOCK_SIZE}, m = "toByteArray")
    public static final class C24681 extends p117n6.c {
        int label;
        /* synthetic */ java.lang.Object result;

        public C24681(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.ByteReadChannelOperationsKt.toByteArray(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX WARN: Code duplicated, block: B:34:0x007f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        if (S7.C.M(r0) == r1) goto L28;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0070 -> B:13:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitUntilReadable(io.ktor.utils.io.ByteReadChannel byteReadChannel, int i3, p100l6.c cVar) throws java.io.EOFException {
        io.ktor.utils.io.ByteReadChannelOperationsKt.AnonymousClass1 anonymousClass1;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        int i9;
        if (cVar instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.AnonymousClass1) {
            anonymousClass1 = (io.ktor.utils.io.ByteReadChannelOperationsKt.AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new io.ktor.utils.io.ByteReadChannelOperationsKt.AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new io.ktor.utils.io.ByteReadChannelOperationsKt.AnonymousClass1(cVar);
        }
        java.lang.Object objAwaitContent = anonymousClass1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            com.google.common.util.concurrent.P.u0(objAwaitContent);
            if (getAvailableForRead(byteReadChannel) < i3) {
                anonymousClass1.L$0 = byteReadChannel;
                anonymousClass1.I$0 = i3;
                anonymousClass1.label = 1;
                objAwaitContent = byteReadChannel.awaitContent(i3, anonymousClass1);
                if (objAwaitContent != aVar) {
                    int i12 = i3;
                    byteReadChannel2 = byteReadChannel;
                    i9 = i12;
                    if (((java.lang.Boolean) objAwaitContent).booleanValue()) {
                        anonymousClass1.L$0 = byteReadChannel2;
                        anonymousClass1.I$0 = i9;
                        anonymousClass1.label = 2;
                    } else {
                        io.ktor.utils.io.ByteReadChannel byteReadChannel3 = byteReadChannel2;
                        i3 = i9;
                        byteReadChannel = byteReadChannel3;
                    }
                }
                return aVar;
            }
            if (getAvailableForRead(byteReadChannel) >= i3) {
                return p070h6.A.f22523a;
            }
            throw new java.io.EOFException("Not enough data available");
        }
        if (i11 == 1) {
            i9 = anonymousClass1.I$0;
            byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) anonymousClass1.L$0;
            com.google.common.util.concurrent.P.u0(objAwaitContent);
            if (((java.lang.Boolean) objAwaitContent).booleanValue()) {
                anonymousClass1.L$0 = byteReadChannel2;
                anonymousClass1.I$0 = i9;
                anonymousClass1.label = 2;
            } else {
                io.ktor.utils.io.ByteReadChannel byteReadChannel4 = byteReadChannel2;
                i3 = i9;
                byteReadChannel = byteReadChannel4;
            }
            if (getAvailableForRead(byteReadChannel) >= i3) {
                return p070h6.A.f22523a;
            }
            throw new java.io.EOFException("Not enough data available");
        }
        if (i11 != 2) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i9 = anonymousClass1.I$0;
        byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) anonymousClass1.L$0;
        com.google.common.util.concurrent.P.u0(objAwaitContent);
        io.ktor.utils.io.ByteReadChannel byteReadChannel5 = byteReadChannel2;
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
                if (((java.lang.Boolean) objAwaitContent).booleanValue()) {
                    anonymousClass1.L$0 = byteReadChannel2;
                    anonymousClass1.I$0 = i9;
                    anonymousClass1.label = 2;
                } else {
                    io.ktor.utils.io.ByteReadChannel byteReadChannel6 = byteReadChannel2;
                    i3 = i9;
                    byteReadChannel = byteReadChannel6;
                }
            }
            return aVar;
        }
        if (getAvailableForRead(byteReadChannel) >= i3) {
            return p070h6.A.f22523a;
        }
        throw new java.io.EOFException("Not enough data available");
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

    /* JADX WARN: Code duplicated, block: B:29:0x0077 A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #1 {all -> 0x00a7, blocks: (B:27:0x0071, B:29:0x0077, B:38:0x00ad, B:46:0x00c9), top: B:57:0x0071 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad A[Catch: all -> 0x00a7, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00a7, blocks: (B:27:0x0071, B:29:0x0077, B:38:0x00ad, B:46:0x00c9), top: B:57:0x0071 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c9 A[Catch: all -> 0x00a7, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00a7, blocks: (B:27:0x0071, B:29:0x0077, B:38:0x00ad, B:46:0x00c9), top: B:57:0x0071 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a4, code lost:
    
        if (r0 == r2) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [io.ktor.utils.io.ByteReadChannel] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2, types: [io.ktor.utils.io.ByteWriteChannel] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v6, types: [io.ktor.utils.io.ByteReadChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.ByteReadChannel] */
    /* JADX WARN: Type inference failed for: r3v4, types: [io.ktor.utils.io.ByteReadChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a4 -> B:20:0x0054). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copyAndClose(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, p100l6.c cVar) throws java.lang.Throwable {
        io.ktor.utils.io.ByteReadChannelOperationsKt.C24431 c24431;
        long jH;
        io.ktor.utils.io.ByteReadChannelOperationsKt.C24431 c24432;
        ?? r9;
        ?? r14;
        java.lang.Throwable closedCause;
        long j;
        ?? r15;
        ?? r10;
        if (cVar instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C24431) {
            c24431 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C24431) cVar;
            int i3 = c24431.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24431.label = i3 - Integer.MIN_VALUE;
            } else {
                c24431 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24431(cVar);
            }
        } else {
            c24431 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24431(cVar);
        }
        java.lang.Object obj = c24431.result;
        p109m6.a aVar = p109m6.a.f25430h;
        ?? r11 = c24431.label;
        try {
            if (r11 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
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
                        io.ktor.utils.io.ByteReadChannelOperationsKt.C24431 c24433 = c24432;
                        r11 = r14;
                        byteReadChannel = r9;
                        c24431 = c24433;
                        c24431.L$0 = r11;
                        c24431.L$1 = byteReadChannel;
                        c24431.J$0 = jH;
                        c24431.label = 2;
                        java.lang.Object objAwaitContent$default = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(r11, 0, c24431, 1, null);
                        r10 = r11;
                        r15 = byteReadChannel;
                    }
                }
                return aVar;
            }
            if (r11 == 1) {
                jH = c24431.J$0;
                io.ktor.utils.io.ByteWriteChannel byteWriteChannel2 = (io.ktor.utils.io.ByteWriteChannel) c24431.L$1;
                io.ktor.utils.io.ByteReadChannel byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) c24431.L$0;
                com.google.common.util.concurrent.P.u0(obj);
                r11 = byteReadChannel2;
                byteReadChannel = byteWriteChannel2;
                c24431.L$0 = r11;
                c24431.L$1 = byteReadChannel;
                c24431.J$0 = jH;
                c24431.label = 2;
                java.lang.Object objAwaitContent$default2 = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(r11, 0, c24431, 1, null);
                r10 = r11;
                r15 = byteReadChannel;
            } else if (r11 == 2) {
                jH = c24431.J$0;
                io.ktor.utils.io.ByteWriteChannel byteWriteChannel3 = (io.ktor.utils.io.ByteWriteChannel) c24431.L$1;
                io.ktor.utils.io.ByteReadChannel byteReadChannel3 = (io.ktor.utils.io.ByteReadChannel) c24431.L$0;
                com.google.common.util.concurrent.P.u0(obj);
                r10 = byteReadChannel3;
                r15 = byteWriteChannel3;
                try {
                    io.ktor.utils.io.ByteReadChannelOperationsKt.C24431 c24434 = c24431;
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
                            io.ktor.utils.io.ByteReadChannelOperationsKt.C24431 c24435 = c24432;
                            r11 = r14;
                            byteReadChannel = r9;
                            c24431 = c24435;
                            c24431.L$0 = r11;
                            c24431.L$1 = byteReadChannel;
                            c24431.J$0 = jH;
                            c24431.label = 2;
                            java.lang.Object objAwaitContent$default3 = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(r11, 0, c24431, 1, null);
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
                } catch (java.lang.Throwable th) {
                    th = th;
                    io.ktor.utils.io.ByteReadChannelOperationsKt.C24431 c24436 = c24432;
                    r11 = r14;
                    byteReadChannel = r9;
                    c24431 = c24436;
                    try {
                        r11.cancel(th);
                        io.ktor.utils.io.ByteWriteChannelOperationsKt.close(byteReadChannel, th);
                        throw th;
                    } catch (java.lang.Throwable th2) {
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
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.Throwable th3 = (java.lang.Throwable) c24431.L$0;
                    com.google.common.util.concurrent.P.u0(obj);
                    throw th3;
                }
                j = c24431.J$0;
                com.google.common.util.concurrent.P.u0(obj);
            }
            return new java.lang.Long(j);
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b A[Catch: all -> 0x00ab, TRY_LEAVE, TryCatch #1 {all -> 0x00ab, blocks: (B:27:0x0075, B:29:0x007b), top: B:54:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:38:0x00af  */
    /* JADX WARN: Code duplicated, block: B:41:0x00be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
    
        if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(r11, 0, r1, 1, null) == r2) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.ByteWriteChannel] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a8 -> B:20:0x0054). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copyTo(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, p100l6.c cVar) throws java.lang.Throwable {
        io.ktor.utils.io.ByteReadChannelOperationsKt.C24441 c24441;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        long j;
        io.ktor.utils.io.ByteReadChannelOperationsKt.C24441 c24442;
        io.ktor.utils.io.ByteReadChannel byteReadChannel3;
        long j9;
        long j10;
        long jH;
        ?? r9;
        if (cVar instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C24441) {
            c24441 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C24441) cVar;
            int i3 = c24441.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24441.label = i3 - Integer.MIN_VALUE;
            } else {
                c24441 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24441(cVar);
            }
        } else {
            c24441 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24441(cVar);
        }
        java.lang.Object obj = c24441.result;
        p109m6.a aVar = p109m6.a.f25430h;
        ?? r10 = c24441.label;
        try {
            if (r10 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
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
                io.ktor.utils.io.ByteWriteChannel byteWriteChannel2 = (io.ktor.utils.io.ByteWriteChannel) c24441.L$1;
                byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) c24441.L$0;
                com.google.common.util.concurrent.P.u0(obj);
                r10 = byteWriteChannel2;
                c24441.L$0 = byteReadChannel2;
                c24441.L$1 = r10;
                c24441.J$0 = j9;
                c24441.label = 2;
                r9 = r10;
            } else if (r10 == 2) {
                j9 = c24441.J$0;
                io.ktor.utils.io.ByteWriteChannel byteWriteChannel3 = (io.ktor.utils.io.ByteWriteChannel) c24441.L$1;
                byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) c24441.L$0;
                com.google.common.util.concurrent.P.u0(obj);
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
                } catch (java.lang.Throwable th) {
                    th = th;
                    byteReadChannel2 = byteReadChannel3;
                    c24441 = c24442;
                    try {
                        byteReadChannel2.cancel(th);
                        io.ktor.utils.io.ByteWriteChannelOperationsKt.close(r10, th);
                        throw th;
                    } catch (java.lang.Throwable th2) {
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
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.Throwable th3 = (java.lang.Throwable) c24441.L$0;
                    com.google.common.util.concurrent.P.u0(obj);
                    throw th3;
                }
                j10 = c24441.J$0;
                com.google.common.util.concurrent.P.u0(obj);
            }
            return new java.lang.Long(j10);
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004b -> B:26:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005e -> B:25:0x0061). Please report as a decompilation issue!!! */
    public static final java.lang.Object discard(io.ktor.utils.io.ByteReadChannel byteReadChannel, long j, p100l6.c cVar) {
        io.ktor.utils.io.ByteReadChannelOperationsKt.C24451 c24451;
        long j9;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        long j10;
        if (cVar instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C24451) {
            c24451 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C24451) cVar;
            int i3 = c24451.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24451.label = i3 - Integer.MIN_VALUE;
            } else {
                c24451 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24451(cVar);
            }
        } else {
            c24451 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24451(cVar);
        }
        java.lang.Object obj = c24451.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24451.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            j9 = j;
            if (j > 0 || byteReadChannel.isClosedForRead()) {
                return new java.lang.Long(j9 - j);
            }
            if (getAvailableForRead(byteReadChannel) == 0) {
                c24451.L$0 = byteReadChannel;
                c24451.J$0 = j9;
                c24451.J$1 = j;
                c24451.label = 1;
                if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, c24451, 1, null) == aVar) {
                    return aVar;
                }
                byteReadChannel2 = byteReadChannel;
                j10 = j;
            }
            long jMin = java.lang.Math.min(j, io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer()));
            io.ktor.utils.io.core.ByteReadPacketKt.discard(byteReadChannel.getReadBuffer(), jMin);
            j -= jMin;
            if (j > 0) {
            }
            return new java.lang.Long(j9 - j);
        }
        if (i9 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j10 = c24451.J$1;
        j9 = c24451.J$0;
        byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) c24451.L$0;
        com.google.common.util.concurrent.P.u0(obj);
        long j11 = j10;
        byteReadChannel = byteReadChannel2;
        j = j11;
        long jMin2 = java.lang.Math.min(j, io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer()));
        io.ktor.utils.io.core.ByteReadPacketKt.discard(byteReadChannel.getReadBuffer(), jMin2);
        j -= jMin2;
        if (j > 0) {
        }
        return new java.lang.Long(j9 - j);
    }

    public static /* synthetic */ java.lang.Object discard$default(io.ktor.utils.io.ByteReadChannel byteReadChannel, long j, p100l6.c cVar, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        return discard(byteReadChannel, j, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object discardExact(io.ktor.utils.io.ByteReadChannel byteReadChannel, long j, p100l6.c cVar) throws java.io.EOFException {
        io.ktor.utils.io.ByteReadChannelOperationsKt.C24461 c24461;
        if (cVar instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C24461) {
            c24461 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C24461) cVar;
            int i3 = c24461.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24461.label = i3 - Integer.MIN_VALUE;
            } else {
                c24461 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24461(cVar);
            }
        } else {
            c24461 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24461(cVar);
        }
        java.lang.Object objDiscard = c24461.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24461.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objDiscard);
            c24461.J$0 = j;
            c24461.label = 1;
            objDiscard = discard(byteReadChannel, j, c24461);
            if (objDiscard == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = c24461.J$0;
            com.google.common.util.concurrent.P.u0(objDiscard);
        }
        if (((java.lang.Number) objDiscard).longValue() >= j) {
            return p070h6.A.f22523a;
        }
        throw new java.io.EOFException(B2.a.k(j, "Unable to discard ", " bytes"));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object exhausted(io.ktor.utils.io.ByteReadChannel byteReadChannel, p100l6.c cVar) {
        io.ktor.utils.io.ByteReadChannelOperationsKt.C24471 c24471;
        if (cVar instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C24471) {
            c24471 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C24471) cVar;
            int i3 = c24471.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24471.label = i3 - Integer.MIN_VALUE;
            } else {
                c24471 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24471(cVar);
            }
        } else {
            c24471 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24471(cVar);
        }
        java.lang.Object obj = c24471.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24471.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            if (byteReadChannel.getReadBuffer().o()) {
                c24471.L$0 = byteReadChannel;
                c24471.label = 1;
                if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, c24471, 1, null) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteReadChannel = (io.ktor.utils.io.ByteReadChannel) c24471.L$0;
            com.google.common.util.concurrent.P.u0(obj);
        }
        return java.lang.Boolean.valueOf(byteReadChannel.getReadBuffer().o());
    }

    public static final int getAvailableForRead(io.ktor.utils.io.ByteReadChannel byteReadChannel) {
        kotlin.jvm.internal.m.e(byteReadChannel, "<this>");
        return (int) byteReadChannel.getReadBuffer().a().j;
    }

    public static /* synthetic */ void getAvailableForRead$annotations(io.ktor.utils.io.ByteReadChannel byteReadChannel) {
    }

    public static final int getAvailableForWrite(io.ktor.utils.io.ByteWriteChannel byteWriteChannel) {
        kotlin.jvm.internal.m.e(byteWriteChannel, "<this>");
        return 1048576 - io.ktor.utils.io.core.BytePacketBuilderKt.getSize(byteWriteChannel.getWriteBuffer());
    }

    public static /* synthetic */ void getAvailableForWrite$annotations(io.ktor.utils.io.ByteWriteChannel byteWriteChannel) {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object peek(io.ktor.utils.io.ByteReadChannel byteReadChannel, int i3, p100l6.c cVar) {
        io.ktor.utils.io.ByteReadChannelOperationsKt.C24481 c24481;
        if (cVar instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C24481) {
            c24481 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C24481) cVar;
            int i9 = c24481.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c24481.label = i9 - Integer.MIN_VALUE;
            } else {
                c24481 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24481(cVar);
            }
        } else {
            c24481 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24481(cVar);
        }
        java.lang.Object objAwaitContent = c24481.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = c24481.label;
        if (i10 == 0) {
            com.google.common.util.concurrent.P.u0(objAwaitContent);
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
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c24481.I$0;
            byteReadChannel = (io.ktor.utils.io.ByteReadChannel) c24481.L$0;
            com.google.common.util.concurrent.P.u0(objAwaitContent);
        }
        if (((java.lang.Boolean) objAwaitContent).booleanValue()) {
            return new p102l8.a(p094k8.p.h(byteReadChannel.getReadBuffer().peek(), i3));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object read(io.ktor.utils.io.ByteReadChannel byteReadChannel, p194x6.o oVar, p100l6.c cVar) {
        io.ktor.utils.io.ByteReadChannelOperationsKt.C24491 c24491;
        p094k8.a aVar;
        kotlin.jvm.internal.y yVar;
        kotlin.jvm.internal.y yVar2;
        p094k8.j jVar;
        int i3;
        if (cVar instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C24491) {
            c24491 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C24491) cVar;
            int i9 = c24491.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c24491.label = i9 - Integer.MIN_VALUE;
            } else {
                c24491 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24491(cVar);
            }
        } else {
            c24491 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24491(cVar);
        }
        java.lang.Object obj = c24491.result;
        p109m6.a aVar2 = p109m6.a.f25430h;
        int i10 = c24491.label;
        if (i10 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            if (byteReadChannel.isClosedForRead()) {
                return new java.lang.Integer(-1);
            }
            if (byteReadChannel.getReadBuffer().o()) {
                c24491.L$0 = byteReadChannel;
                c24491.L$1 = oVar;
                c24491.label = 1;
                if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, c24491, 1, null) != aVar2) {
                }
            }
            return aVar2;
        }
        if (i10 == 1) {
            oVar = (p194x6.o) c24491.L$1;
            byteReadChannel = (io.ktor.utils.io.ByteReadChannel) c24491.L$0;
            com.google.common.util.concurrent.P.u0(obj);
        } else {
            if (i10 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yVar = (kotlin.jvm.internal.y) c24491.L$3;
            jVar = (p094k8.j) c24491.L$2;
            aVar = (p094k8.a) c24491.L$1;
            yVar2 = (kotlin.jvm.internal.y) c24491.L$0;
            com.google.common.util.concurrent.P.u0(obj);
        }
        yVar.f24555h = ((java.lang.Number) obj).intValue();
        i3 = yVar2.f24555h;
        if (i3 != 0) {
            if (i3 >= 0) {
                throw new java.lang.IllegalStateException("Returned negative read bytes count");
            }
            if (i3 <= jVar.b()) {
                throw new java.lang.IllegalStateException("Returned too many bytes");
            }
            aVar.C(i3);
        }
        return new java.lang.Integer(yVar2.f24555h);
        if (byteReadChannel.isClosedForRead()) {
            return new java.lang.Integer(-1);
        }
        kotlin.jvm.internal.y yVar3 = new kotlin.jvm.internal.y();
        p094k8.a aVarA = byteReadChannel.getReadBuffer().a();
        if (aVarA.o()) {
            throw new java.lang.IllegalArgumentException("Buffer is empty");
        }
        p094k8.j jVar2 = aVarA.f24508h;
        kotlin.jvm.internal.m.b(jVar2);
        int i11 = jVar2.f24524b;
        int i12 = jVar2.f24525c;
        java.lang.Integer num = new java.lang.Integer(i11);
        java.lang.Integer num2 = new java.lang.Integer(i12);
        c24491.L$0 = yVar3;
        c24491.L$1 = aVarA;
        c24491.L$2 = jVar2;
        c24491.L$3 = yVar3;
        c24491.label = 2;
        java.lang.Object objInvoke = oVar.invoke(jVar2.f24523a, num, num2, c24491);
        if (objInvoke != aVar2) {
            aVar = aVarA;
            yVar = yVar3;
            yVar2 = yVar;
            obj = objInvoke;
            jVar = jVar2;
            yVar.f24555h = ((java.lang.Number) obj).intValue();
            i3 = yVar2.f24555h;
            if (i3 != 0) {
                if (i3 >= 0) {
                    throw new java.lang.IllegalStateException("Returned negative read bytes count");
                }
                if (i3 <= jVar.b()) {
                    throw new java.lang.IllegalStateException("Returned too many bytes");
                }
                aVar.C(i3);
            }
            return new java.lang.Integer(yVar2.f24555h);
        }
        return aVar2;
    }

    private static final java.lang.Object read$$forInline(io.ktor.utils.io.ByteReadChannel byteReadChannel, p194x6.o oVar, p100l6.c cVar) {
        if (!byteReadChannel.isClosedForRead()) {
            if (byteReadChannel.getReadBuffer().o()) {
                io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, cVar, 1, null);
            }
            if (!byteReadChannel.isClosedForRead()) {
                p094k8.a aVarA = byteReadChannel.getReadBuffer().a();
                if (aVarA.o()) {
                    throw new java.lang.IllegalArgumentException("Buffer is empty");
                }
                p094k8.j jVar = aVarA.f24508h;
                kotlin.jvm.internal.m.b(jVar);
                int iIntValue = ((java.lang.Number) oVar.invoke(jVar.f24523a, java.lang.Integer.valueOf(jVar.f24524b), java.lang.Integer.valueOf(jVar.f24525c), null)).intValue();
                if (iIntValue != 0) {
                    if (iIntValue < 0) {
                        throw new java.lang.IllegalStateException("Returned negative read bytes count");
                    }
                    if (iIntValue > jVar.b()) {
                        throw new java.lang.IllegalStateException("Returned too many bytes");
                    }
                    aVarA.C(iIntValue);
                }
                return java.lang.Integer.valueOf(iIntValue);
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object readAvailable(io.ktor.utils.io.ByteReadChannel byteReadChannel, byte[] bArr, int i3, int i9, p100l6.c cVar) {
        io.ktor.utils.io.ByteReadChannelOperationsKt.C24501 c24501;
        if (cVar instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C24501) {
            c24501 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C24501) cVar;
            int i10 = c24501.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c24501.label = i10 - Integer.MIN_VALUE;
            } else {
                c24501 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24501(cVar);
            }
        } else {
            c24501 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24501(cVar);
        }
        java.lang.Object obj = c24501.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i11 = c24501.label;
        if (i11 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            if (byteReadChannel.isClosedForRead()) {
                return new java.lang.Integer(-1);
            }
            if (byteReadChannel.getReadBuffer().o()) {
                c24501.L$0 = byteReadChannel;
                c24501.L$1 = bArr;
                c24501.I$0 = i3;
                c24501.I$1 = i9;
                c24501.label = 1;
                if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, c24501, 1, null) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i11 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i9 = c24501.I$1;
            i3 = c24501.I$0;
            bArr = (byte[]) c24501.L$1;
            byteReadChannel = (io.ktor.utils.io.ByteReadChannel) c24501.L$0;
            com.google.common.util.concurrent.P.u0(obj);
        }
        return byteReadChannel.isClosedForRead() ? new java.lang.Integer(-1) : new java.lang.Integer(io.ktor.utils.io.core.InputKt.readAvailable(byteReadChannel.getReadBuffer(), bArr, i3, i9));
    }

    public static /* synthetic */ java.lang.Object readAvailable$default(io.ktor.utils.io.ByteReadChannel byteReadChannel, byte[] bArr, int i3, int i9, p100l6.c cVar, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = bArr.length - i3;
        }
        return readAvailable(byteReadChannel, bArr, i3, i9, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object readBuffer(io.ktor.utils.io.ByteReadChannel byteReadChannel, p100l6.c cVar) throws java.lang.Throwable {
        io.ktor.utils.io.ByteReadChannelOperationsKt.C24511 c24511;
        p094k8.a aVar;
        if (cVar instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C24511) {
            c24511 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C24511) cVar;
            int i3 = c24511.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24511.label = i3 - Integer.MIN_VALUE;
            } else {
                c24511 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24511(cVar);
            }
        } else {
            c24511 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24511(cVar);
        }
        java.lang.Object obj = c24511.result;
        p109m6.a aVar2 = p109m6.a.f25430h;
        int i9 = c24511.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            aVar = new p094k8.a();
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p094k8.a aVar3 = (p094k8.a) c24511.L$1;
            io.ktor.utils.io.ByteReadChannel byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) c24511.L$0;
            com.google.common.util.concurrent.P.u0(obj);
            aVar = aVar3;
            byteReadChannel = byteReadChannel2;
        }
        while (!byteReadChannel.isClosedForRead()) {
            aVar.D(byteReadChannel.getReadBuffer());
            c24511.L$0 = byteReadChannel;
            c24511.L$1 = aVar;
            c24511.label = 1;
            if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, c24511, 1, null) == aVar2) {
                return aVar2;
            }
        }
        java.lang.Throwable closedCause = byteReadChannel.getClosedCause();
        if (closedCause == null) {
            return aVar;
        }
        throw closedCause;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object readByte(io.ktor.utils.io.ByteReadChannel byteReadChannel, p100l6.c cVar) throws java.io.EOFException {
        io.ktor.utils.io.ByteReadChannelOperationsKt.C24521 c24521;
        if (cVar instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C24521) {
            c24521 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C24521) cVar;
            int i3 = c24521.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24521.label = i3 - Integer.MIN_VALUE;
            } else {
                c24521 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24521(cVar);
            }
        } else {
            c24521 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24521(cVar);
        }
        java.lang.Object obj = c24521.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24521.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            if (byteReadChannel.getReadBuffer().o()) {
                c24521.L$0 = byteReadChannel;
                c24521.label = 1;
                if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, c24521, 1, null) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteReadChannel = (io.ktor.utils.io.ByteReadChannel) c24521.L$0;
            com.google.common.util.concurrent.P.u0(obj);
        }
        if (byteReadChannel.getReadBuffer().o()) {
            throw new java.io.EOFException("Not enough data available");
        }
        return java.lang.Byte.valueOf(byteReadChannel.getReadBuffer().readByte());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    /* JADX WARN: Code duplicated, block: B:20:0x0069 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006a -> B:12:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object readDouble(io.ktor.utils.io.ByteReadChannel byteReadChannel, p100l6.c cVar) {
        io.ktor.utils.io.ByteReadChannelOperationsKt.C24541 c24541;
        if (cVar instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C24541) {
            c24541 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C24541) cVar;
            int i3 = c24541.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24541.label = i3 - Integer.MIN_VALUE;
            } else {
                c24541 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24541(cVar);
            }
        } else {
            c24541 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24541(cVar);
        }
        java.lang.Object obj = c24541.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24541.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            c24541.L$0 = byteReadChannel;
            c24541.label = 1;
            if (awaitUntilReadable(byteReadChannel, 8, c24541) == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteReadChannel = (io.ktor.utils.io.ByteReadChannel) c24541.L$0;
            com.google.common.util.concurrent.P.u0(obj);
        }
        p094k8.n readBuffer = byteReadChannel.getReadBuffer();
        kotlin.jvm.internal.m.e(readBuffer, "<this>");
        return new java.lang.Double(java.lang.Double.longBitsToDouble(readBuffer.readLong()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object readFloat(io.ktor.utils.io.ByteReadChannel byteReadChannel, p100l6.c cVar) {
        io.ktor.utils.io.ByteReadChannelOperationsKt.C24551 c24551;
        if (cVar instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C24551) {
            c24551 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C24551) cVar;
            int i3 = c24551.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24551.label = i3 - Integer.MIN_VALUE;
            } else {
                c24551 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24551(cVar);
            }
        } else {
            c24551 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24551(cVar);
        }
        java.lang.Object obj = c24551.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24551.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            c24551.L$0 = byteReadChannel;
            c24551.label = 1;
            if (awaitUntilReadable(byteReadChannel, 4, c24551) == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteReadChannel = (io.ktor.utils.io.ByteReadChannel) c24551.L$0;
            com.google.common.util.concurrent.P.u0(obj);
        }
        p094k8.n readBuffer = byteReadChannel.getReadBuffer();
        kotlin.jvm.internal.m.e(readBuffer, "<this>");
        return new java.lang.Float(java.lang.Float.intBitsToFloat(readBuffer.readInt()));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:26:0x006d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0059 -> B:29:0x0078). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x006e -> B:28:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
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

    public static /* synthetic */ java.lang.Object readFully$default(io.ktor.utils.io.ByteReadChannel byteReadChannel, byte[] bArr, int i3, int i9, p100l6.c cVar, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = bArr.length;
        }
        return readFully(byteReadChannel, bArr, i3, i9, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object readInt(io.ktor.utils.io.ByteReadChannel byteReadChannel, p100l6.c cVar) {
        io.ktor.utils.io.ByteReadChannelOperationsKt.C24571 c24571;
        if (cVar instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C24571) {
            c24571 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C24571) cVar;
            int i3 = c24571.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24571.label = i3 - Integer.MIN_VALUE;
            } else {
                c24571 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24571(cVar);
            }
        } else {
            c24571 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24571(cVar);
        }
        java.lang.Object obj = c24571.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24571.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            c24571.L$0 = byteReadChannel;
            c24571.label = 1;
            if (awaitUntilReadable(byteReadChannel, 4, c24571) == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteReadChannel = (io.ktor.utils.io.ByteReadChannel) c24571.L$0;
            com.google.common.util.concurrent.P.u0(obj);
        }
        return new java.lang.Integer(byteReadChannel.getReadBuffer().readInt());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object readLong(io.ktor.utils.io.ByteReadChannel byteReadChannel, p100l6.c cVar) {
        io.ktor.utils.io.ByteReadChannelOperationsKt.C24581 c24581;
        if (cVar instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C24581) {
            c24581 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C24581) cVar;
            int i3 = c24581.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24581.label = i3 - Integer.MIN_VALUE;
            } else {
                c24581 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24581(cVar);
            }
        } else {
            c24581 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24581(cVar);
        }
        java.lang.Object obj = c24581.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24581.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            c24581.L$0 = byteReadChannel;
            c24581.label = 1;
            if (awaitUntilReadable(byteReadChannel, 8, c24581) == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteReadChannel = (io.ktor.utils.io.ByteReadChannel) c24581.L$0;
            com.google.common.util.concurrent.P.u0(obj);
        }
        return new java.lang.Long(byteReadChannel.getReadBuffer().readLong());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0055  */
    /* JADX WARN: Code duplicated, block: B:21:0x0065 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[PHI: r11 r12 r13
  0x006a: PHI (r11v5 io.ktor.utils.io.ByteReadChannel) = (r11v3 io.ktor.utils.io.ByteReadChannel), (r11v7 io.ktor.utils.io.ByteReadChannel) binds: [B:18:0x0053, B:23:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x006a: PHI (r12v6 k8.a) = (r12v5 k8.a), (r12v7 k8.a) binds: [B:18:0x0053, B:23:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x006a: PHI (r13v7 int) = (r13v6 int), (r13v8 int) binds: [B:18:0x0053, B:23:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x0081  */
    /* JADX WARN: Code duplicated, block: B:29:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0053 -> B:24:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0066 -> B:23:0x0068). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object readRemaining(io.ktor.utils.io.ByteReadChannel byteReadChannel, p100l6.c cVar) throws java.lang.Throwable {
        io.ktor.utils.io.ByteReadChannelOperationsKt.C24601 c24601;
        p094k8.l lVarBytePacketBuilder;
        if (cVar instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C24601) {
            c24601 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C24601) cVar;
            int i3 = c24601.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24601.label = i3 - Integer.MIN_VALUE;
            } else {
                c24601 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24601(cVar);
            }
        } else {
            c24601 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24601(cVar);
        }
        java.lang.Object obj = c24601.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24601.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            lVarBytePacketBuilder = io.ktor.utils.io.core.BytePacketBuilderKt.BytePacketBuilder();
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p094k8.l lVar = (p094k8.l) c24601.L$1;
            io.ktor.utils.io.ByteReadChannel byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) c24601.L$0;
            com.google.common.util.concurrent.P.u0(obj);
            lVarBytePacketBuilder = lVar;
            byteReadChannel = byteReadChannel2;
        }
        while (!byteReadChannel.isClosedForRead()) {
            lVarBytePacketBuilder.D(byteReadChannel.getReadBuffer());
            c24601.L$0 = byteReadChannel;
            c24601.L$1 = lVarBytePacketBuilder;
            c24601.label = 1;
            if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, c24601, 1, null) == aVar) {
                return aVar;
            }
        }
        rethrowCloseCauseIfNeeded(byteReadChannel);
        return lVarBytePacketBuilder.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object readShort(io.ktor.utils.io.ByteReadChannel byteReadChannel, p100l6.c cVar) {
        io.ktor.utils.io.ByteReadChannelOperationsKt.C24621 c24621;
        if (cVar instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C24621) {
            c24621 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C24621) cVar;
            int i3 = c24621.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24621.label = i3 - Integer.MIN_VALUE;
            } else {
                c24621 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24621(cVar);
            }
        } else {
            c24621 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24621(cVar);
        }
        java.lang.Object obj = c24621.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24621.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            c24621.L$0 = byteReadChannel;
            c24621.label = 1;
            if (awaitUntilReadable(byteReadChannel, 2, c24621) == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteReadChannel = (io.ktor.utils.io.ByteReadChannel) c24621.L$0;
            com.google.common.util.concurrent.P.u0(obj);
        }
        return new java.lang.Short(byteReadChannel.getReadBuffer().readShort());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object readUTF8Line(io.ktor.utils.io.ByteReadChannel byteReadChannel, int i3, p100l6.c cVar) {
        io.ktor.utils.io.ByteReadChannelOperationsKt.C24631 c24631;
        java.lang.StringBuilder sb;
        if (cVar instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C24631) {
            c24631 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C24631) cVar;
            int i9 = c24631.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c24631.label = i9 - Integer.MIN_VALUE;
            } else {
                c24631 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24631(cVar);
            }
        } else {
            c24631 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24631(cVar);
        }
        java.lang.Object obj = c24631.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = c24631.label;
        if (i10 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            c24631.L$0 = sb2;
            c24631.label = 1;
            java.lang.Object uTF8LineTo = readUTF8LineTo(byteReadChannel, sb2, i3, c24631);
            if (uTF8LineTo == aVar) {
                return aVar;
            }
            obj = uTF8LineTo;
            sb = sb2;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sb = (java.lang.StringBuilder) c24631.L$0;
            com.google.common.util.concurrent.P.u0(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            return sb.toString();
        }
        return null;
    }

    public static /* synthetic */ java.lang.Object readUTF8Line$default(io.ktor.utils.io.ByteReadChannel byteReadChannel, int i3, p100l6.c cVar, int i9, java.lang.Object obj) {
        if ((i9 & 1) != 0) {
            i3 = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        }
        return readUTF8Line(byteReadChannel, i3, cVar);
    }

    public static final java.lang.Object readUTF8LineTo(io.ktor.utils.io.ByteReadChannel byteReadChannel, java.lang.Appendable appendable, int i3, p100l6.c cVar) {
        return m480readUTF8LineToRRvyBJ8(byteReadChannel, appendable, i3, io.ktor.utils.io.LineEndingMode.INSTANCE.m491getAnyf0jXZW8(), cVar);
    }

    public static /* synthetic */ java.lang.Object readUTF8LineTo$default(io.ktor.utils.io.ByteReadChannel byteReadChannel, java.lang.Appendable appendable, int i3, p100l6.c cVar, int i9, java.lang.Object obj) {
        if ((i9 & 2) != 0) {
            i3 = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        }
        return readUTF8LineTo(byteReadChannel, appendable, i3, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c8 A[Catch: all -> 0x004c, LOOP:0: B:37:0x00c8->B:61:0x0166, LOOP_START, TryCatch #1 {all -> 0x004c, blocks: (B:14:0x0045, B:35:0x00c2, B:37:0x00c8, B:39:0x00d2, B:41:0x00de, B:43:0x00e8, B:48:0x0102, B:50:0x0114, B:52:0x0134, B:51:0x012b, B:57:0x014a, B:61:0x0166, B:62:0x016b, B:64:0x0172, B:68:0x018d, B:69:0x01a8, B:70:0x01a9, B:74:0x01b5, B:76:0x01bb, B:21:0x006b), top: B:85:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d2 A[Catch: all -> 0x004c, TryCatch #1 {all -> 0x004c, blocks: (B:14:0x0045, B:35:0x00c2, B:37:0x00c8, B:39:0x00d2, B:41:0x00de, B:43:0x00e8, B:48:0x0102, B:50:0x0114, B:52:0x0134, B:51:0x012b, B:57:0x014a, B:61:0x0166, B:62:0x016b, B:64:0x0172, B:68:0x018d, B:69:0x01a8, B:70:0x01a9, B:74:0x01b5, B:76:0x01bb, B:21:0x006b), top: B:85:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e8 A[Catch: all -> 0x004c, TryCatch #1 {all -> 0x004c, blocks: (B:14:0x0045, B:35:0x00c2, B:37:0x00c8, B:39:0x00d2, B:41:0x00de, B:43:0x00e8, B:48:0x0102, B:50:0x0114, B:52:0x0134, B:51:0x012b, B:57:0x014a, B:61:0x0166, B:62:0x016b, B:64:0x0172, B:68:0x018d, B:69:0x01a8, B:70:0x01a9, B:74:0x01b5, B:76:0x01bb, B:21:0x006b), top: B:85:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:50:0x0114 A[Catch: all -> 0x004c, TryCatch #1 {all -> 0x004c, blocks: (B:14:0x0045, B:35:0x00c2, B:37:0x00c8, B:39:0x00d2, B:41:0x00de, B:43:0x00e8, B:48:0x0102, B:50:0x0114, B:52:0x0134, B:51:0x012b, B:57:0x014a, B:61:0x0166, B:62:0x016b, B:64:0x0172, B:68:0x018d, B:69:0x01a8, B:70:0x01a9, B:74:0x01b5, B:76:0x01bb, B:21:0x006b), top: B:85:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x012b A[Catch: all -> 0x004c, TryCatch #1 {all -> 0x004c, blocks: (B:14:0x0045, B:35:0x00c2, B:37:0x00c8, B:39:0x00d2, B:41:0x00de, B:43:0x00e8, B:48:0x0102, B:50:0x0114, B:52:0x0134, B:51:0x012b, B:57:0x014a, B:61:0x0166, B:62:0x016b, B:64:0x0172, B:68:0x018d, B:69:0x01a8, B:70:0x01a9, B:74:0x01b5, B:76:0x01bb, B:21:0x006b), top: B:85:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0146  */
    /* JADX WARN: Code duplicated, block: B:60:0x0165  */
    /* JADX WARN: Code duplicated, block: B:64:0x0172 A[Catch: all -> 0x004c, TryCatch #1 {all -> 0x004c, blocks: (B:14:0x0045, B:35:0x00c2, B:37:0x00c8, B:39:0x00d2, B:41:0x00de, B:43:0x00e8, B:48:0x0102, B:50:0x0114, B:52:0x0134, B:51:0x012b, B:57:0x014a, B:61:0x0166, B:62:0x016b, B:64:0x0172, B:68:0x018d, B:69:0x01a8, B:70:0x01a9, B:74:0x01b5, B:76:0x01bb, B:21:0x006b), top: B:85:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x018d A[Catch: all -> 0x004c, TryCatch #1 {all -> 0x004c, blocks: (B:14:0x0045, B:35:0x00c2, B:37:0x00c8, B:39:0x00d2, B:41:0x00de, B:43:0x00e8, B:48:0x0102, B:50:0x0114, B:52:0x0134, B:51:0x012b, B:57:0x014a, B:61:0x0166, B:62:0x016b, B:64:0x0172, B:68:0x018d, B:69:0x01a8, B:70:0x01a9, B:74:0x01b5, B:76:0x01bb, B:21:0x006b), top: B:85:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01a9 A[Catch: all -> 0x004c, TryCatch #1 {all -> 0x004c, blocks: (B:14:0x0045, B:35:0x00c2, B:37:0x00c8, B:39:0x00d2, B:41:0x00de, B:43:0x00e8, B:48:0x0102, B:50:0x0114, B:52:0x0134, B:51:0x012b, B:57:0x014a, B:61:0x0166, B:62:0x016b, B:64:0x0172, B:68:0x018d, B:69:0x01a8, B:70:0x01a9, B:74:0x01b5, B:76:0x01bb, B:21:0x006b), top: B:85:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:76:0x01bb A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #1 {all -> 0x004c, blocks: (B:14:0x0045, B:35:0x00c2, B:37:0x00c8, B:39:0x00d2, B:41:0x00de, B:43:0x00e8, B:48:0x0102, B:50:0x0114, B:52:0x0134, B:51:0x012b, B:57:0x014a, B:61:0x0166, B:62:0x016b, B:64:0x0172, B:68:0x018d, B:69:0x01a8, B:70:0x01a9, B:74:0x01b5, B:76:0x01bb, B:21:0x006b), top: B:85:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:86:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
    
        if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(r0, 0, r2, 1, null) == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0186, code lost:
    
        if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(r6, 0, r2, 1, null) == r3) goto L66;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x018d, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x01ca: INVOKE (r15 I:java.lang.AutoCloseable), (r1 I:java.lang.Throwable) STATIC call: com.google.common.util.concurrent.D.h(java.lang.AutoCloseable, java.lang.Throwable):void A[MD:(java.lang.AutoCloseable, java.lang.Throwable):void (m)] (LINE:459), block:B:81:0x01ca */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0186 -> B:67:0x0189). Please report as a decompilation issue!!! */
    @io.ktor.utils.io.InternalAPI
    /* JADX INFO: renamed from: readUTF8LineTo-RRvyBJ8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m480readUTF8LineToRRvyBJ8(io.ktor.utils.io.ByteReadChannel byteReadChannel, java.lang.Appendable appendable, int i3, int i9, p100l6.c cVar) {
        io.ktor.utils.io.ByteReadChannelOperationsKt.C24642 c24642;
        java.lang.AutoCloseable autoCloseableH;
        java.lang.Appendable appendable2;
        int i10;
        int i11;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        int i12;
        p094k8.a aVar;
        java.lang.AutoCloseable autoCloseable;
        java.lang.Appendable appendable3;
        java.lang.Appendable appendable4;
        p094k8.a aVar2;
        io.ktor.utils.io.ByteReadChannel byteReadChannel3;
        int i13;
        boolean z6;
        int i14;
        byte b9;
        io.ktor.utils.io.ByteReadChannel byteReadChannel4 = byteReadChannel;
        if (cVar instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C24642) {
            c24642 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C24642) cVar;
            int i15 = c24642.label;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                c24642.label = i15 - Integer.MIN_VALUE;
            } else {
                c24642 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24642(cVar);
            }
        } else {
            c24642 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24642(cVar);
        }
        java.lang.Object obj = c24642.result;
        p109m6.a aVar3 = p109m6.a.f25430h;
        int i16 = c24642.label;
        int i17 = 2;
        int i18 = 0;
        try {
            if (i16 != 0) {
                if (i16 == 1) {
                    int i19 = c24642.I$1;
                    i10 = c24642.I$0;
                    java.lang.Appendable appendable5 = (java.lang.Appendable) c24642.L$1;
                    io.ktor.utils.io.ByteReadChannel byteReadChannel5 = (io.ktor.utils.io.ByteReadChannel) c24642.L$0;
                    com.google.common.util.concurrent.P.u0(obj);
                    appendable2 = appendable5;
                    i11 = i19;
                    byteReadChannel4 = byteReadChannel5;
                } else {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i12 = c24642.I$1;
                        i10 = c24642.I$0;
                        aVar = (p094k8.a) c24642.L$3;
                        autoCloseable = (java.lang.AutoCloseable) c24642.L$2;
                        appendable3 = (java.lang.Appendable) c24642.L$1;
                        byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) c24642.L$0;
                        com.google.common.util.concurrent.P.u0(obj);
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
                            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z6);
                            if (z6 != 0) {
                                appendable3.append(p094k8.p.c(aVar, aVar.j));
                            }
                            com.google.common.util.concurrent.D.h(autoCloseable, null);
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
                                        if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel2, i18, c24642, 1, null) == aVar3) {
                                            byteReadChannel3 = byteReadChannel2;
                                            appendable4 = appendable3;
                                            aVar2 = aVar;
                                        }
                                    }
                                    if (byteReadChannel2.getReadBuffer().a().e(0L) == 10) {
                                        readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(i12, io.ktor.utils.io.LineEndingMode.INSTANCE.m493getCRLFf0jXZW8());
                                        p117n6.f.b(io.ktor.utils.io.core.ByteReadPacketKt.discard(byteReadChannel2.getReadBuffer(), 1L));
                                    } else {
                                        readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(i12, io.ktor.utils.io.LineEndingMode.INSTANCE.m492getCRf0jXZW8());
                                    }
                                    kotlin.jvm.internal.m.e(aVar, "<this>");
                                    appendable3.append(p094k8.p.c(aVar, aVar.j));
                                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                                    com.google.common.util.concurrent.D.h(autoCloseable, null);
                                    return bool;
                                }
                                if (b9 == 10) {
                                    readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(i12, io.ktor.utils.io.LineEndingMode.INSTANCE.m494getLFf0jXZW8());
                                    kotlin.jvm.internal.m.e(aVar, "<this>");
                                    appendable3.append(p094k8.p.c(aVar, aVar.j));
                                    java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                                    com.google.common.util.concurrent.D.h(autoCloseable, null);
                                    return bool2;
                                }
                                aVar.r(b9);
                            } else {
                                if (aVar.j < i10) {
                                    throw new io.ktor.utils.io.charsets.TooLongLineException("Line exceeds limit of " + i10 + " characters");
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
                    autoCloseable = (java.lang.AutoCloseable) c24642.L$2;
                    appendable4 = (java.lang.Appendable) c24642.L$1;
                    byteReadChannel3 = (io.ktor.utils.io.ByteReadChannel) c24642.L$0;
                    com.google.common.util.concurrent.P.u0(obj);
                }
                byteReadChannel2 = byteReadChannel3;
                aVar = aVar2;
                appendable3 = appendable4;
                if (byteReadChannel2.getReadBuffer().a().e(0L) == 10) {
                    readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(i12, io.ktor.utils.io.LineEndingMode.INSTANCE.m493getCRLFf0jXZW8());
                    p117n6.f.b(io.ktor.utils.io.core.ByteReadPacketKt.discard(byteReadChannel2.getReadBuffer(), 1L));
                } else {
                    readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(i12, io.ktor.utils.io.LineEndingMode.INSTANCE.m492getCRf0jXZW8());
                }
                kotlin.jvm.internal.m.e(aVar, "<this>");
                appendable3.append(p094k8.p.c(aVar, aVar.j));
                java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
                com.google.common.util.concurrent.D.h(autoCloseable, null);
                return bool3;
            }
            com.google.common.util.concurrent.P.u0(obj);
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
                return java.lang.Boolean.FALSE;
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
                java.lang.Boolean boolValueOf2 = java.lang.Boolean.valueOf(z6);
                if (z6 != 0) {
                    appendable3.append(p094k8.p.c(aVar, aVar.j));
                }
                com.google.common.util.concurrent.D.h(autoCloseable, null);
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
                            if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel2, i18, c24642, 1, null) == aVar3) {
                                byteReadChannel3 = byteReadChannel2;
                                appendable4 = appendable3;
                                aVar2 = aVar;
                                byteReadChannel2 = byteReadChannel3;
                                aVar = aVar2;
                                appendable3 = appendable4;
                            }
                        }
                        if (byteReadChannel2.getReadBuffer().a().e(0L) == 10) {
                            readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(i12, io.ktor.utils.io.LineEndingMode.INSTANCE.m493getCRLFf0jXZW8());
                            p117n6.f.b(io.ktor.utils.io.core.ByteReadPacketKt.discard(byteReadChannel2.getReadBuffer(), 1L));
                        } else {
                            readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(i12, io.ktor.utils.io.LineEndingMode.INSTANCE.m492getCRf0jXZW8());
                        }
                        kotlin.jvm.internal.m.e(aVar, "<this>");
                        appendable3.append(p094k8.p.c(aVar, aVar.j));
                        java.lang.Boolean bool4 = java.lang.Boolean.TRUE;
                        com.google.common.util.concurrent.D.h(autoCloseable, null);
                        return bool4;
                    }
                    if (b9 == 10) {
                        readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(i12, io.ktor.utils.io.LineEndingMode.INSTANCE.m494getLFf0jXZW8());
                        kotlin.jvm.internal.m.e(aVar, "<this>");
                        appendable3.append(p094k8.p.c(aVar, aVar.j));
                        java.lang.Boolean bool5 = java.lang.Boolean.TRUE;
                        com.google.common.util.concurrent.D.h(autoCloseable, null);
                        return bool5;
                    }
                    aVar.r(b9);
                } else {
                    if (aVar.j < i10) {
                        throw new io.ktor.utils.io.charsets.TooLongLineException("Line exceeds limit of " + i10 + " characters");
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
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                com.google.common.util.concurrent.D.h(autoCloseableH, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: readUTF8LineTo-RRvyBJ8$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m481readUTF8LineToRRvyBJ8$default(io.ktor.utils.io.ByteReadChannel byteReadChannel, java.lang.Appendable appendable, int i3, int i9, p100l6.c cVar, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            i3 = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        }
        if ((i10 & 4) != 0) {
            i9 = io.ktor.utils.io.LineEndingMode.INSTANCE.m491getAnyf0jXZW8();
        }
        return m480readUTF8LineToRRvyBJ8(byteReadChannel, appendable, i3, i9, cVar);
    }

    private static final void readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(int i3, int i9) throws java.io.IOException {
        if (io.ktor.utils.io.LineEndingMode.m484containslTjpP64(i3, i9)) {
            return;
        }
        throw new java.io.IOException("Unexpected line ending " + ((java.lang.Object) io.ktor.utils.io.LineEndingMode.m489toStringimpl(i9)) + ", while expected " + ((java.lang.Object) io.ktor.utils.io.LineEndingMode.m489toStringimpl(i3)));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:31:0x011a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0133  */
    /* JADX WARN: Code duplicated, block: B:42:0x016f  */
    /* JADX WARN: Code duplicated, block: B:44:0x017c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0184  */
    /* JADX WARN: Code duplicated, block: B:55:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0184 -> B:47:0x018f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x01af -> B:20:0x0076). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object readUntil(io.ktor.utils.io.ByteReadChannel r20, p102l8.a r21, io.ktor.utils.io.ByteWriteChannel r22, long r23, boolean r25, p100l6.c r26) {
        /*
            Method dump skipped, instruction units count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.readUntil(io.ktor.utils.io.ByteReadChannel, l8.a, io.ktor.utils.io.ByteWriteChannel, long, boolean, l6.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object readUntil$appendPartialMatch(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, byte[] bArr, kotlin.jvm.internal.y yVar, kotlin.jvm.internal.z zVar, p100l6.c cVar) {
        io.ktor.utils.io.ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1 byteReadChannelOperationsKt$readUntil$appendPartialMatch$1;
        if (cVar instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1) {
            byteReadChannelOperationsKt$readUntil$appendPartialMatch$1 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1) cVar;
            int i3 = byteReadChannelOperationsKt$readUntil$appendPartialMatch$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readUntil$appendPartialMatch$1.label = i3 - Integer.MIN_VALUE;
            } else {
                byteReadChannelOperationsKt$readUntil$appendPartialMatch$1 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1(cVar);
            }
        } else {
            byteReadChannelOperationsKt$readUntil$appendPartialMatch$1 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1(cVar);
        }
        java.lang.Object obj = byteReadChannelOperationsKt$readUntil$appendPartialMatch$1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = byteReadChannelOperationsKt$readUntil$appendPartialMatch$1.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            int i10 = yVar.f24555h;
            byteReadChannelOperationsKt$readUntil$appendPartialMatch$1.L$0 = yVar;
            byteReadChannelOperationsKt$readUntil$appendPartialMatch$1.L$1 = zVar;
            byteReadChannelOperationsKt$readUntil$appendPartialMatch$1.label = 1;
            if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully(byteWriteChannel, bArr, 0, i10, byteReadChannelOperationsKt$readUntil$appendPartialMatch$1) == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zVar = (kotlin.jvm.internal.z) byteReadChannelOperationsKt$readUntil$appendPartialMatch$1.L$1;
            yVar = (kotlin.jvm.internal.y) byteReadChannelOperationsKt$readUntil$appendPartialMatch$1.L$0;
            com.google.common.util.concurrent.P.u0(obj);
        }
        zVar.f24556h += (long) yVar.f24555h;
        yVar.f24555h = 0;
        return p070h6.A.f22523a;
    }

    public static /* synthetic */ java.lang.Object readUntil$default(io.ktor.utils.io.ByteReadChannel byteReadChannel, p102l8.a aVar, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, long j, boolean z6, p100l6.c cVar, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            j = Long.MAX_VALUE;
        }
        long j9 = j;
        if ((i3 & 8) != 0) {
            z6 = false;
        }
        return readUntil(byteReadChannel, aVar, byteWriteChannel, j9, z6, cVar);
    }

    private static final void readUntil$resetPartialMatch(kotlin.jvm.internal.y yVar, p102l8.a aVar, int[] iArr, byte b9) {
        while (true) {
            int i3 = yVar.f24555h;
            if (i3 <= 0 || b9 == aVar.a(i3)) {
                return;
            } else {
                yVar.f24555h = iArr[yVar.f24555h - 1];
            }
        }
    }

    public static final io.ktor.utils.io.ReaderJob reader(S7.A a2, p100l6.h coroutineContext, boolean z6, p194x6.m block) {
        kotlin.jvm.internal.m.e(a2, "<this>");
        kotlin.jvm.internal.m.e(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.m.e(block, "block");
        return reader(a2, coroutineContext, new io.ktor.utils.io.ByteChannel(false, 1, null), block);
    }

    public static /* synthetic */ io.ktor.utils.io.ReaderJob reader$default(S7.A a2, p100l6.h hVar, boolean z6, p194x6.m mVar, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            hVar = p100l6.i.f24820h;
        }
        if ((i3 & 2) != 0) {
            z6 = false;
        }
        return reader(a2, hVar, z6, mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A reader$lambda$6$lambda$5(io.ktor.utils.io.ByteChannel byteChannel, java.lang.Throwable th) {
        if (th != null && !byteChannel.isClosedForRead()) {
            byteChannel.cancel(th);
        }
        return p070h6.A.f22523a;
    }

    @io.ktor.utils.io.InternalAPI
    public static final void rethrowCloseCauseIfNeeded(io.ktor.utils.io.ByteReadChannel byteReadChannel) throws java.lang.Throwable {
        kotlin.jvm.internal.m.e(byteReadChannel, "<this>");
        java.lang.Throwable closedCause = byteReadChannel.getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (discard(r5, r6, r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object skipIfFound(io.ktor.utils.io.ByteReadChannel byteReadChannel, p102l8.a aVar, p100l6.c cVar) {
        io.ktor.utils.io.ByteReadChannelOperationsKt.C24671 c24671;
        if (cVar instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C24671) {
            c24671 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C24671) cVar;
            int i3 = c24671.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24671.label = i3 - Integer.MIN_VALUE;
            } else {
                c24671 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24671(cVar);
            }
        } else {
            c24671 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24671(cVar);
        }
        java.lang.Object objPeek = c24671.result;
        p109m6.a aVar2 = p109m6.a.f25430h;
        int i9 = c24671.label;
        if (i9 != 0) {
            if (i9 == 1) {
                aVar = (p102l8.a) c24671.L$1;
                byteReadChannel = (io.ktor.utils.io.ByteReadChannel) c24671.L$0;
                com.google.common.util.concurrent.P.u0(objPeek);
            } else {
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(objPeek);
            }
            return java.lang.Boolean.TRUE;
        }
        com.google.common.util.concurrent.P.u0(objPeek);
        int length = aVar.f24871h.length;
        c24671.L$0 = byteReadChannel;
        c24671.L$1 = aVar;
        c24671.label = 1;
        objPeek = peek(byteReadChannel, length, c24671);
        if (objPeek != aVar2) {
        }
        return aVar2;
        if (!kotlin.jvm.internal.m.a(objPeek, aVar)) {
            return java.lang.Boolean.FALSE;
        }
        long length2 = aVar.f24871h.length;
        c24671.L$0 = null;
        c24671.L$1 = null;
        c24671.label = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object toByteArray(io.ktor.utils.io.ByteReadChannel byteReadChannel, p100l6.c cVar) throws java.lang.Throwable {
        io.ktor.utils.io.ByteReadChannelOperationsKt.C24681 c24681;
        if (cVar instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C24681) {
            c24681 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C24681) cVar;
            int i3 = c24681.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24681.label = i3 - Integer.MIN_VALUE;
            } else {
                c24681 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24681(cVar);
            }
        } else {
            c24681 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24681(cVar);
        }
        java.lang.Object buffer = c24681.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24681.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(buffer);
            c24681.label = 1;
            buffer = readBuffer(byteReadChannel, c24681);
            if (buffer == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(buffer);
        }
        return io.ktor.utils.io.core.BuffersKt.readBytes$default((p094k8.a) buffer, 0, 1, null);
    }

    private static final java.lang.String toSingleLineString(p102l8.a aVar) {
        kotlin.jvm.internal.m.e(aVar, "<this>");
        return O7.x.w0(O7.x.n0(aVar.f24871h), "\n", "\\n");
    }

    public static final io.ktor.utils.io.ReaderJob reader(S7.A a2, p100l6.h coroutineContext, io.ktor.utils.io.ByteChannel channel, p194x6.m block) {
        kotlin.jvm.internal.m.e(a2, "<this>");
        kotlin.jvm.internal.m.e(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.m.e(channel, "channel");
        kotlin.jvm.internal.m.e(block, "block");
        S7.w0 w0VarA = S7.C.A(a2, coroutineContext, new io.ktor.utils.io.ByteReadChannelOperationsKt$reader$job$1(block, channel, null), 2);
        w0VarA.j(new io.ktor.utils.io.a(channel, 1));
        return new io.ktor.utils.io.ReaderJob(io.ktor.utils.io.CloseHookByteWriteChannelKt.onClose(channel, new io.ktor.utils.io.ByteReadChannelOperationsKt.C24661(w0VarA, null)), w0VarA);
    }

    @io.ktor.utils.io.InternalAPI
    public static final void rethrowCloseCauseIfNeeded(io.ktor.utils.io.ByteWriteChannel byteWriteChannel) throws java.lang.Throwable {
        kotlin.jvm.internal.m.e(byteWriteChannel, "<this>");
        java.lang.Throwable closedCause = byteWriteChannel.getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
    }

    @io.ktor.utils.io.InternalAPI
    public static final void rethrowCloseCauseIfNeeded(io.ktor.utils.io.ByteChannel byteChannel) throws java.lang.Throwable {
        kotlin.jvm.internal.m.e(byteChannel, "<this>");
        java.lang.Throwable closedCause = byteChannel.getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0051 -> B:25:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0064 -> B:24:0x0067). Please report as a decompilation issue!!! */
    public static final java.lang.Object readBuffer(io.ktor.utils.io.ByteReadChannel byteReadChannel, int i3, p100l6.c cVar) {
        io.ktor.utils.io.ByteReadChannelOperationsKt.AnonymousClass3 anonymousClass3;
        p094k8.a aVar;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        int i9;
        p094k8.a aVar2;
        if (cVar instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.AnonymousClass3) {
            anonymousClass3 = (io.ktor.utils.io.ByteReadChannelOperationsKt.AnonymousClass3) cVar;
            int i10 = anonymousClass3.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass3.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass3 = new io.ktor.utils.io.ByteReadChannelOperationsKt.AnonymousClass3(cVar);
            }
        } else {
            anonymousClass3 = new io.ktor.utils.io.ByteReadChannelOperationsKt.AnonymousClass3(cVar);
        }
        java.lang.Object obj = anonymousClass3.result;
        p109m6.a aVar3 = p109m6.a.f25430h;
        int i11 = anonymousClass3.label;
        if (i11 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            aVar = new p094k8.a();
            if (i3 > 0 || byteReadChannel.isClosedForRead()) {
                return aVar;
            }
            if (byteReadChannel.getReadBuffer().o()) {
                anonymousClass3.L$0 = byteReadChannel;
                anonymousClass3.L$1 = aVar;
                anonymousClass3.I$0 = i3;
                anonymousClass3.label = 1;
                if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, anonymousClass3, 1, null) == aVar3) {
                    return aVar3;
                }
                byteReadChannel2 = byteReadChannel;
                i9 = i3;
                aVar2 = aVar;
            }
            long jMin = java.lang.Math.min(i3, io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer()));
            byteReadChannel.getReadBuffer().y(aVar, jMin);
            i3 -= (int) jMin;
            if (i3 > 0) {
            }
            return aVar;
        }
        if (i11 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i9 = anonymousClass3.I$0;
        aVar2 = (p094k8.a) anonymousClass3.L$1;
        byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) anonymousClass3.L$0;
        com.google.common.util.concurrent.P.u0(obj);
        aVar = aVar2;
        i3 = i9;
        byteReadChannel = byteReadChannel2;
        long jMin2 = java.lang.Math.min(i3, io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer()));
        byteReadChannel.getReadBuffer().y(aVar, jMin2);
        i3 -= (int) jMin2;
        if (i3 > 0) {
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object readRemaining(io.ktor.utils.io.ByteReadChannel byteReadChannel, long j, p100l6.c cVar) {
        io.ktor.utils.io.ByteReadChannelOperationsKt.C24612 c24612;
        p094k8.l lVarBytePacketBuilder;
        if (cVar instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C24612) {
            c24612 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C24612) cVar;
            int i3 = c24612.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24612.label = i3 - Integer.MIN_VALUE;
            } else {
                c24612 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24612(cVar);
            }
        } else {
            c24612 = new io.ktor.utils.io.ByteReadChannelOperationsKt.C24612(cVar);
        }
        java.lang.Object obj = c24612.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24612.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            lVarBytePacketBuilder = io.ktor.utils.io.core.BytePacketBuilderKt.BytePacketBuilder();
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j9 = c24612.J$0;
            p094k8.l lVar = (p094k8.l) c24612.L$1;
            io.ktor.utils.io.ByteReadChannel byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) c24612.L$0;
            com.google.common.util.concurrent.P.u0(obj);
            lVarBytePacketBuilder = lVar;
            j = j9;
            byteReadChannel = byteReadChannel2;
        }
        while (!byteReadChannel.isClosedForRead()) {
            long remaining = 0;
            if (j <= 0) {
                break;
            }
            if (j >= io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer())) {
                remaining = j - io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer());
                p117n6.f.b(byteReadChannel.getReadBuffer().H(lVarBytePacketBuilder));
            } else {
                byteReadChannel.getReadBuffer().y(lVarBytePacketBuilder, j);
            }
            c24612.L$0 = byteReadChannel;
            c24612.L$1 = lVarBytePacketBuilder;
            c24612.J$0 = remaining;
            c24612.label = 1;
            if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, c24612, 1, null) == aVar) {
                return aVar;
            }
            j = remaining;
        }
        return lVarBytePacketBuilder.a();
    }

    public static final int readAvailable(io.ktor.utils.io.ByteReadChannel byteReadChannel, int i3, p194x6.j block) {
        kotlin.jvm.internal.m.e(byteReadChannel, "<this>");
        kotlin.jvm.internal.m.e(block, "block");
        if (i3 <= 0) {
            throw new java.lang.IllegalArgumentException("min should be positive");
        }
        if (i3 <= 1048576) {
            if (getAvailableForRead(byteReadChannel) < i3) {
                return -1;
            }
            return ((java.lang.Number) block.invoke(byteReadChannel.getReadBuffer().a())).intValue();
        }
        throw new java.lang.IllegalArgumentException(Y6.f.f(i3, "Min(", ") shouldn't be greater than 1048576").toString());
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
    
        if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(r1, 0, r13, r7, null) == r2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d7, code lost:
    
        if (r0 == r2) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.ByteWriteChannel] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00d7 -> B:20:0x0058). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copyTo(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, long j, p100l6.c cVar) throws java.lang.Throwable {
        io.ktor.utils.io.ByteReadChannelOperationsKt.AnonymousClass2 anonymousClass2;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        long j9;
        long j10;
        io.ktor.utils.io.ByteReadChannelOperationsKt.AnonymousClass2 anonymousClass3;
        io.ktor.utils.io.ByteReadChannel byteReadChannel3;
        long j11;
        long j12;
        ?? r9;
        if (cVar instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.AnonymousClass2) {
            anonymousClass2 = (io.ktor.utils.io.ByteReadChannelOperationsKt.AnonymousClass2) cVar;
            int i3 = anonymousClass2.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass2.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass2 = new io.ktor.utils.io.ByteReadChannelOperationsKt.AnonymousClass2(cVar);
            }
        } else {
            anonymousClass2 = new io.ktor.utils.io.ByteReadChannelOperationsKt.AnonymousClass2(cVar);
        }
        java.lang.Object obj = anonymousClass2.result;
        p109m6.a aVar = p109m6.a.f25430h;
        ?? r10 = anonymousClass2.label;
        int i9 = 1;
        try {
            if (r10 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
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
                io.ktor.utils.io.ByteWriteChannel byteWriteChannel2 = (io.ktor.utils.io.ByteWriteChannel) anonymousClass2.L$1;
                byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) anonymousClass2.L$0;
                com.google.common.util.concurrent.P.u0(obj);
                r10 = byteWriteChannel2;
                long jMin = java.lang.Math.min(j9, io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(byteReadChannel2.getReadBuffer()));
                byteReadChannel2.getReadBuffer().y(r10.getWriteBuffer(), jMin);
                j9 -= jMin;
                anonymousClass2.L$0 = byteReadChannel2;
                anonymousClass2.L$1 = r10;
                anonymousClass2.J$0 = j10;
                anonymousClass2.J$1 = j9;
                anonymousClass2.label = 2;
                java.lang.Object objFlush = r10.flush(anonymousClass2);
                r9 = r10;
            } else if (r10 == 2) {
                j9 = anonymousClass2.J$1;
                j10 = anonymousClass2.J$0;
                io.ktor.utils.io.ByteWriteChannel byteWriteChannel3 = (io.ktor.utils.io.ByteWriteChannel) anonymousClass2.L$1;
                byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) anonymousClass2.L$0;
                com.google.common.util.concurrent.P.u0(obj);
                r9 = byteWriteChannel3;
                try {
                    io.ktor.utils.io.ByteReadChannel byteReadChannel4 = byteReadChannel2;
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
                        io.ktor.utils.io.ByteReadChannelOperationsKt.AnonymousClass2 anonymousClass4 = anonymousClass3;
                        byteReadChannel2 = byteReadChannel3;
                        anonymousClass2 = anonymousClass4;
                        r10 = r10;
                        long jMin2 = java.lang.Math.min(j9, io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(byteReadChannel2.getReadBuffer()));
                        byteReadChannel2.getReadBuffer().y(r10.getWriteBuffer(), jMin2);
                        j9 -= jMin2;
                        anonymousClass2.L$0 = byteReadChannel2;
                        anonymousClass2.L$1 = r10;
                        anonymousClass2.J$0 = j10;
                        anonymousClass2.J$1 = j9;
                        anonymousClass2.label = 2;
                        java.lang.Object objFlush2 = r10.flush(anonymousClass2);
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
                } catch (java.lang.Throwable th) {
                    th = th;
                    io.ktor.utils.io.ByteReadChannelOperationsKt.AnonymousClass2 anonymousClass5 = anonymousClass3;
                    byteReadChannel2 = byteReadChannel3;
                    anonymousClass2 = anonymousClass5;
                    try {
                        byteReadChannel2.cancel(th);
                        io.ktor.utils.io.ByteWriteChannelOperationsKt.close(r10, th);
                        throw th;
                    } catch (java.lang.Throwable th2) {
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
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.Throwable th3 = (java.lang.Throwable) anonymousClass2.L$0;
                    com.google.common.util.concurrent.P.u0(obj);
                    throw th3;
                }
                j11 = anonymousClass2.J$1;
                j12 = anonymousClass2.J$0;
                com.google.common.util.concurrent.P.u0(obj);
            }
            return new java.lang.Long(j12 - j11);
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
    }
}
