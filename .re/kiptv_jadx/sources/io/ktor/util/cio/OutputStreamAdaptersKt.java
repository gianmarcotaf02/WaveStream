package io.ktor.util.cio;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/utils/io/ByteWriteChannel;", "Ljava/nio/charset/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "Ljava/io/BufferedWriter;", "bufferedWriter", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/nio/charset/Charset;)Ljava/io/BufferedWriter;", "Ljava/io/Writer;", "writer", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/nio/charset/Charset;)Ljava/io/Writer;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class OutputStreamAdaptersKt {
    public static final java.io.BufferedWriter bufferedWriter(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.m.e(byteWriteChannel, "<this>");
        kotlin.jvm.internal.m.e(charset, "charset");
        return new java.io.BufferedWriter(new java.io.OutputStreamWriter(io.ktor.utils.io.jvm.javaio.BlockingKt.toOutputStream(byteWriteChannel), charset), 8192);
    }

    public static /* synthetic */ java.io.BufferedWriter bufferedWriter$default(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, java.nio.charset.Charset charset, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            charset = O7.a.f8024b;
        }
        return bufferedWriter(byteWriteChannel, charset);
    }

    public static final java.io.Writer writer(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.m.e(byteWriteChannel, "<this>");
        kotlin.jvm.internal.m.e(charset, "charset");
        return new java.io.OutputStreamWriter(io.ktor.utils.io.jvm.javaio.BlockingKt.toOutputStream(byteWriteChannel), charset);
    }

    public static /* synthetic */ java.io.Writer writer$default(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, java.nio.charset.Charset charset, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            charset = O7.a.f8024b;
        }
        return writer(byteWriteChannel, charset);
    }
}
