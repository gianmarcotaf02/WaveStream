package io.ktor.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0082\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a,\u0010\u0013\u001a\u00020\u0000*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0015\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, d2 = {"", "flag", "", "has", "(II)Z", "Lio/ktor/utils/io/ByteReadChannel;", "source", com.revenuecat.purchases.common.HTTPClient.RC_FORMAT_ACCEPT_ENCODING, "Ll6/h;", "coroutineContext", "inflate", "(Lio/ktor/utils/io/ByteReadChannel;ZLl6/h;)Lio/ktor/utils/io/ByteReadChannel;", "Ljava/util/zip/Inflater;", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "Ljava/nio/ByteBuffer;", "buffer", "Ljava/util/zip/Checksum;", "checksum", "inflateTo", "(Ljava/util/zip/Inflater;Lio/ktor/utils/io/ByteWriteChannel;Ljava/nio/ByteBuffer;Ljava/util/zip/Checksum;Ll6/c;)Ljava/lang/Object;", "GZIP_HEADER_SIZE", "I", "Lio/ktor/util/Encoder;", "Deflate", "Lio/ktor/util/Encoder;", "getDeflate", "()Lio/ktor/util/Encoder;", "GZip", "getGZip", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class EncodersJvmKt {
    private static final int GZIP_HEADER_SIZE = 10;
    private static final io.ktor.util.Encoder Deflate = new io.ktor.util.Encoder() { // from class: io.ktor.util.EncodersJvmKt$Deflate$1
        @Override // io.ktor.util.Encoder
        public io.ktor.utils.io.ByteReadChannel decode(io.ktor.utils.io.ByteReadChannel source, p100l6.h coroutineContext) {
            kotlin.jvm.internal.m.e(source, "source");
            kotlin.jvm.internal.m.e(coroutineContext, "coroutineContext");
            return io.ktor.util.EncodersJvmKt.inflate(source, false, coroutineContext);
        }

        @Override // io.ktor.util.Encoder
        public io.ktor.utils.io.ByteReadChannel encode(io.ktor.utils.io.ByteReadChannel source, p100l6.h coroutineContext) {
            kotlin.jvm.internal.m.e(source, "source");
            kotlin.jvm.internal.m.e(coroutineContext, "coroutineContext");
            return io.ktor.util.DeflaterKt.deflated$default(source, false, (io.ktor.utils.io.pool.ObjectPool) null, coroutineContext, 2, (java.lang.Object) null);
        }

        @Override // io.ktor.util.Encoder
        public io.ktor.utils.io.ByteWriteChannel encode(io.ktor.utils.io.ByteWriteChannel source, p100l6.h coroutineContext) {
            kotlin.jvm.internal.m.e(source, "source");
            kotlin.jvm.internal.m.e(coroutineContext, "coroutineContext");
            return io.ktor.util.DeflaterKt.deflated$default(source, false, (io.ktor.utils.io.pool.ObjectPool) null, coroutineContext, 2, (java.lang.Object) null);
        }
    };
    private static final io.ktor.util.Encoder GZip = new io.ktor.util.Encoder() { // from class: io.ktor.util.EncodersJvmKt$GZip$1
        @Override // io.ktor.util.Encoder
        public io.ktor.utils.io.ByteReadChannel decode(io.ktor.utils.io.ByteReadChannel source, p100l6.h coroutineContext) {
            kotlin.jvm.internal.m.e(source, "source");
            kotlin.jvm.internal.m.e(coroutineContext, "coroutineContext");
            return io.ktor.util.EncodersJvmKt.inflate$default(source, false, coroutineContext, 2, null);
        }

        @Override // io.ktor.util.Encoder
        public io.ktor.utils.io.ByteReadChannel encode(io.ktor.utils.io.ByteReadChannel source, p100l6.h coroutineContext) {
            kotlin.jvm.internal.m.e(source, "source");
            kotlin.jvm.internal.m.e(coroutineContext, "coroutineContext");
            return io.ktor.util.DeflaterKt.deflated$default(source, true, (io.ktor.utils.io.pool.ObjectPool) null, coroutineContext, 2, (java.lang.Object) null);
        }

        @Override // io.ktor.util.Encoder
        public io.ktor.utils.io.ByteWriteChannel encode(io.ktor.utils.io.ByteWriteChannel source, p100l6.h coroutineContext) {
            kotlin.jvm.internal.m.e(source, "source");
            kotlin.jvm.internal.m.e(coroutineContext, "coroutineContext");
            return io.ktor.util.DeflaterKt.deflated$default(source, true, (io.ktor.utils.io.pool.ObjectPool) null, coroutineContext, 2, (java.lang.Object) null);
        }
    };

    /* JADX INFO: renamed from: io.ktor.util.EncodersJvmKt$inflate$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/WriterScope;", "Lh6/A;", "<anonymous>", "(Lio/ktor/utils/io/WriterScope;)V"}, k = 3, mv = {2, 1, 0})
    @p117n6.e(c = "io.ktor.util.EncodersJvmKt$inflate$1", f = "EncodersJvm.kt", l = {82, 99, 100, 110, 117, 123, androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p117n6.i implements p194x6.m {
        final /* synthetic */ boolean $gzip;
        final /* synthetic */ io.ktor.utils.io.ByteReadChannel $source;
        byte B$0;
        byte B$1;
        int I$0;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        java.lang.Object L$6;
        short S$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z6, io.ktor.utils.io.ByteReadChannel byteReadChannel, p100l6.c cVar) {
            super(2, cVar);
            this.$gzip = z6;
            this.$source = byteReadChannel;
        }

        @Override // p117n6.a
        public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
            io.ktor.util.EncodersJvmKt.AnonymousClass1 anonymousClass1 = new io.ktor.util.EncodersJvmKt.AnonymousClass1(this.$gzip, this.$source, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p194x6.m
        public final java.lang.Object invoke(io.ktor.utils.io.WriterScope writerScope, p100l6.c cVar) {
            return ((io.ktor.util.EncodersJvmKt.AnonymousClass1) create(writerScope, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        /* JADX WARN: Code duplicated, block: B:67:0x0237 A[Catch: all -> 0x003a, TryCatch #2 {all -> 0x003a, blocks: (B:7:0x0032, B:93:0x02f7, B:87:0x02d0, B:89:0x02d6, B:94:0x030e, B:96:0x0312, B:98:0x031a, B:100:0x033a, B:103:0x033f, B:104:0x0363, B:105:0x0364, B:106:0x036b, B:107:0x036c, B:108:0x038f, B:109:0x0390, B:113:0x03aa, B:114:0x03b1, B:73:0x026c, B:75:0x0272, B:77:0x0278, B:83:0x02bd, B:65:0x022f, B:67:0x0237, B:70:0x0252, B:72:0x025a, B:84:0x02c2, B:86:0x02ca, B:115:0x03b2, B:17:0x0083, B:64:0x0226), top: B:124:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:69:0x0250  */
        /* JADX WARN: Code duplicated, block: B:70:0x0252 A[Catch: all -> 0x003a, PHI: r2 r3 r5 r7 r8 r9 r10
  0x0252: PHI (r2v33 kotlin.jvm.internal.y) = (r2v32 kotlin.jvm.internal.y), (r2v34 kotlin.jvm.internal.y) binds: [B:18:0x0086, B:68:0x024e] A[DONT_GENERATE, DONT_INLINE]
  0x0252: PHI (r3v12 java.util.zip.CRC32) = (r3v11 java.util.zip.CRC32), (r3v13 java.util.zip.CRC32) binds: [B:18:0x0086, B:68:0x024e] A[DONT_GENERATE, DONT_INLINE]
  0x0252: PHI (r5v17 java.lang.Object) = (r5v16 java.lang.Object), (r5v24 java.lang.Object) binds: [B:18:0x0086, B:68:0x024e] A[DONT_GENERATE, DONT_INLINE]
  0x0252: PHI (r7v20 io.ktor.utils.io.WriterScope) = (r7v19 io.ktor.utils.io.WriterScope), (r7v21 io.ktor.utils.io.WriterScope) binds: [B:18:0x0086, B:68:0x024e] A[DONT_GENERATE, DONT_INLINE]
  0x0252: PHI (r8v22 java.util.zip.Inflater) = (r8v20 java.util.zip.Inflater), (r8v23 java.util.zip.Inflater) binds: [B:18:0x0086, B:68:0x024e] A[DONT_GENERATE, DONT_INLINE]
  0x0252: PHI (r9v25 java.nio.ByteBuffer) = (r9v22 java.nio.ByteBuffer), (r9v26 java.nio.ByteBuffer) binds: [B:18:0x0086, B:68:0x024e] A[DONT_GENERATE, DONT_INLINE]
  0x0252: PHI (r10v22 java.nio.ByteBuffer) = (r10v19 java.nio.ByteBuffer), (r10v23 java.nio.ByteBuffer) binds: [B:18:0x0086, B:68:0x024e] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x003a, blocks: (B:7:0x0032, B:93:0x02f7, B:87:0x02d0, B:89:0x02d6, B:94:0x030e, B:96:0x0312, B:98:0x031a, B:100:0x033a, B:103:0x033f, B:104:0x0363, B:105:0x0364, B:106:0x036b, B:107:0x036c, B:108:0x038f, B:109:0x0390, B:113:0x03aa, B:114:0x03b1, B:73:0x026c, B:75:0x0272, B:77:0x0278, B:83:0x02bd, B:65:0x022f, B:67:0x0237, B:70:0x0252, B:72:0x025a, B:84:0x02c2, B:86:0x02ca, B:115:0x03b2, B:17:0x0083, B:64:0x0226), top: B:124:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:72:0x025a A[Catch: all -> 0x003a, TryCatch #2 {all -> 0x003a, blocks: (B:7:0x0032, B:93:0x02f7, B:87:0x02d0, B:89:0x02d6, B:94:0x030e, B:96:0x0312, B:98:0x031a, B:100:0x033a, B:103:0x033f, B:104:0x0363, B:105:0x0364, B:106:0x036b, B:107:0x036c, B:108:0x038f, B:109:0x0390, B:113:0x03aa, B:114:0x03b1, B:73:0x026c, B:75:0x0272, B:77:0x0278, B:83:0x02bd, B:65:0x022f, B:67:0x0237, B:70:0x0252, B:72:0x025a, B:84:0x02c2, B:86:0x02ca, B:115:0x03b2, B:17:0x0083, B:64:0x0226), top: B:124:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:75:0x0272 A[Catch: all -> 0x003a, TryCatch #2 {all -> 0x003a, blocks: (B:7:0x0032, B:93:0x02f7, B:87:0x02d0, B:89:0x02d6, B:94:0x030e, B:96:0x0312, B:98:0x031a, B:100:0x033a, B:103:0x033f, B:104:0x0363, B:105:0x0364, B:106:0x036b, B:107:0x036c, B:108:0x038f, B:109:0x0390, B:113:0x03aa, B:114:0x03b1, B:73:0x026c, B:75:0x0272, B:77:0x0278, B:83:0x02bd, B:65:0x022f, B:67:0x0237, B:70:0x0252, B:72:0x025a, B:84:0x02c2, B:86:0x02ca, B:115:0x03b2, B:17:0x0083, B:64:0x0226), top: B:124:0x0009 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0258 -> B:65:0x022f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x025a -> B:73:0x026c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0299 -> B:81:0x02a1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x02f6 -> B:93:0x02f7). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 988
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.EncodersJvmKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: io.ktor.util.EncodersJvmKt$inflateTo$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.util.EncodersJvmKt", f = "EncodersJvm.kt", l = {171}, m = "inflateTo")
    public static final class C24371 extends p117n6.c {
        int I$0;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24371(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.util.EncodersJvmKt.inflateTo(null, null, null, null, this);
        }
    }

    public static final io.ktor.util.Encoder getDeflate() {
        return Deflate;
    }

    public static final io.ktor.util.Encoder getGZip() {
        return GZip;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean has(int i3, int i9) {
        return (i3 & i9) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.utils.io.ByteReadChannel inflate(io.ktor.utils.io.ByteReadChannel byteReadChannel, boolean z6, p100l6.h hVar) {
        return io.ktor.utils.io.ByteWriteChannelOperationsKt.writer$default((S7.A) S7.C0877a0.f9566h, hVar, false, (p194x6.m) new io.ktor.util.EncodersJvmKt.AnonymousClass1(z6, byteReadChannel, null), 2, (java.lang.Object) null).getChannel();
    }

    public static /* synthetic */ io.ktor.utils.io.ByteReadChannel inflate$default(io.ktor.utils.io.ByteReadChannel byteReadChannel, boolean z6, p100l6.h hVar, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            z6 = true;
        }
        return inflate(byteReadChannel, z6, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object inflateTo(java.util.zip.Inflater inflater, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, java.nio.ByteBuffer byteBuffer, java.util.zip.Checksum checksum, p100l6.c cVar) throws java.util.zip.DataFormatException {
        io.ktor.util.EncodersJvmKt.C24371 c24371;
        int iInflate;
        if (cVar instanceof io.ktor.util.EncodersJvmKt.C24371) {
            c24371 = (io.ktor.util.EncodersJvmKt.C24371) cVar;
            int i3 = c24371.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24371.label = i3 - Integer.MIN_VALUE;
            } else {
                c24371 = new io.ktor.util.EncodersJvmKt.C24371(cVar);
            }
        } else {
            c24371 = new io.ktor.util.EncodersJvmKt.C24371(cVar);
        }
        java.lang.Object obj = c24371.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24371.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            byteBuffer.clear();
            iInflate = inflater.inflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
            byteBuffer.position(byteBuffer.position() + iInflate);
            byteBuffer.flip();
            io.ktor.util.DeflaterKt.updateKeepPosition(checksum, byteBuffer);
            c24371.I$0 = iInflate;
            c24371.label = 1;
            if (io.ktor.utils.io.ByteWriteChannelOperations_jvmKt.writeFully(byteWriteChannel, byteBuffer, c24371) == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iInflate = c24371.I$0;
            com.google.common.util.concurrent.P.u0(obj);
        }
        return new java.lang.Integer(iInflate);
    }
}
