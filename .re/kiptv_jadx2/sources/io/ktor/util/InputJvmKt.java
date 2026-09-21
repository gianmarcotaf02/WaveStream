package io.ktor.util;

import androidx.media3.container.NalUnitUtil;
import io.ktor.utils.io.core.ByteReadPacketKt;
import io.ktor.utils.io.core.InputKt;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p094k8.n;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lk8/n;", "Lio/ktor/utils/io/core/Input;", "Ljava/io/InputStream;", "asStream", "(Lk8/n;)Ljava/io/InputStream;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class InputJvmKt {
    public static final InputStream asStream(final n nVar) {
        m.e(nVar, "<this>");
        return new InputStream() {
            @Override
            public void close() throws Exception {
                nVar.close();
            }

            @Override
            public int read() {
                if (InputKt.getEndOfInput(nVar)) {
                    return -1;
                }
                return nVar.readByte();
            }

            @Override
            public long skip(long count) {
                return ByteReadPacketKt.discard(nVar, count);
            }

            @Override
            public int read(byte[] buffer, int offset, int length) {
                m.e(buffer, "buffer");
                if (InputKt.getEndOfInput(nVar)) {
                    return -1;
                }
                return InputKt.readAvailable(nVar, buffer, offset, length);
            }
        };
    }
}
