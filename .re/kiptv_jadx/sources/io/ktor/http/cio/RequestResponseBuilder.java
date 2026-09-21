package io.ktor.http.cio;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\u0003J\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\t¢\u0006\u0004\b#\u0010\u0003R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lio/ktor/http/cio/RequestResponseBuilder;", "", "<init>", "()V", "", "version", "", "status", "statusText", "Lh6/A;", "responseLine", "(Ljava/lang/CharSequence;ILjava/lang/CharSequence;)V", "Lio/ktor/http/HttpMethod;", io.sentry.protocol.Request.JsonKeys.METHOD, "uri", "requestLine", "(Lio/ktor/http/HttpMethod;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "line", "(Ljava/lang/CharSequence;)V", "", "content", "offset", io.sentry.SentryEnvelopeItemHeader.JsonKeys.LENGTH, "bytes", "([BII)V", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)V", "name", "value", "headerLine", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "emptyLine", "Lk8/n;", io.sentry.protocol.OperatingSystem.JsonKeys.BUILD, "()Lk8/n;", "release", "Lk8/l;", "packet", "Lk8/l;", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RequestResponseBuilder {
    private final p094k8.l packet = io.ktor.utils.io.core.BytePacketBuilderKt.BytePacketBuilder();

    public static /* synthetic */ void bytes$default(io.ktor.http.cio.RequestResponseBuilder requestResponseBuilder, byte[] bArr, int i3, int i9, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = bArr.length;
        }
        requestResponseBuilder.bytes(bArr, i3, i9);
    }

    public final p094k8.n build() {
        return io.ktor.utils.io.core.BytePacketBuilderKt.build(this.packet);
    }

    public final void bytes(byte[] content, int offset, int length) {
        kotlin.jvm.internal.m.e(content, "content");
        io.ktor.utils.io.core.BytePacketBuilderKt.writeFully(this.packet, content, offset, length);
    }

    public final void emptyLine() {
        this.packet.r((byte) 13);
        this.packet.r((byte) 10);
    }

    public final void headerLine(java.lang.CharSequence name, java.lang.CharSequence value) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
        io.ktor.utils.io.core.BytePacketBuilderKt.append$default(this.packet, name, 0, 0, 6, null);
        io.ktor.utils.io.core.BytePacketBuilderKt.append$default(this.packet, ": ", 0, 0, 6, null);
        io.ktor.utils.io.core.BytePacketBuilderKt.append$default(this.packet, value, 0, 0, 6, null);
        this.packet.r((byte) 13);
        this.packet.r((byte) 10);
    }

    public final void line(java.lang.CharSequence line) {
        kotlin.jvm.internal.m.e(line, "line");
        io.ktor.utils.io.core.BytePacketBuilderKt.append$default(this.packet, line, 0, 0, 6, null);
        this.packet.r((byte) 13);
        this.packet.r((byte) 10);
    }

    public final void release() {
        this.packet.close();
    }

    public final void requestLine(io.ktor.http.HttpMethod method, java.lang.CharSequence uri, java.lang.CharSequence version) {
        kotlin.jvm.internal.m.e(method, "method");
        kotlin.jvm.internal.m.e(uri, "uri");
        kotlin.jvm.internal.m.e(version, "version");
        io.ktor.utils.io.core.StringsKt.writeText$default(this.packet, method.getValue(), 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
        this.packet.r((byte) 32);
        io.ktor.utils.io.core.StringsKt.writeText$default(this.packet, uri, 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
        this.packet.r((byte) 32);
        io.ktor.utils.io.core.StringsKt.writeText$default(this.packet, version, 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
        this.packet.r((byte) 13);
        this.packet.r((byte) 10);
    }

    public final void responseLine(java.lang.CharSequence version, int status, java.lang.CharSequence statusText) {
        kotlin.jvm.internal.m.e(version, "version");
        kotlin.jvm.internal.m.e(statusText, "statusText");
        io.ktor.utils.io.core.StringsKt.writeText$default(this.packet, version, 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
        this.packet.r((byte) 32);
        io.ktor.utils.io.core.StringsKt.writeText$default(this.packet, java.lang.String.valueOf(status), 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
        this.packet.r((byte) 32);
        io.ktor.utils.io.core.StringsKt.writeText$default(this.packet, statusText, 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
        this.packet.r((byte) 13);
        this.packet.r((byte) 10);
    }

    public final void bytes(java.nio.ByteBuffer content) {
        kotlin.jvm.internal.m.e(content, "content");
        io.ktor.utils.io.core.BytePacketBuilderExtensions_jvmKt.writeFully(this.packet, content);
    }
}
