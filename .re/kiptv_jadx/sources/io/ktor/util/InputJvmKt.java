package io.ktor.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lk8/n;", "Lio/ktor/utils/io/core/Input;", "Ljava/io/InputStream;", "asStream", "(Lk8/n;)Ljava/io/InputStream;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class InputJvmKt {
    public static final java.io.InputStream asStream(final p094k8.n nVar) {
        kotlin.jvm.internal.m.e(nVar, "<this>");
        return new java.io.InputStream() { // from class: io.ktor.util.InputJvmKt.asStream.1
            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws java.lang.Exception {
                nVar.close();
            }

            @Override // java.io.InputStream
            public int read() {
                if (io.ktor.utils.io.core.InputKt.getEndOfInput(nVar)) {
                    return -1;
                }
                return nVar.readByte();
            }

            @Override // java.io.InputStream
            public long skip(long count) {
                return io.ktor.utils.io.core.ByteReadPacketKt.discard(nVar, count);
            }

            @Override // java.io.InputStream
            public int read(byte[] buffer, int offset, int length) {
                kotlin.jvm.internal.m.e(buffer, "buffer");
                if (io.ktor.utils.io.core.InputKt.getEndOfInput(nVar)) {
                    return -1;
                }
                return io.ktor.utils.io.core.InputKt.readAvailable(nVar, buffer, offset, length);
            }
        };
    }
}
