package io.ktor.utils.io.core;

import androidx.media3.container.NalUnitUtil;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p094k8.a;
import p094k8.n;
import p094k8.p;
import p194x6.j;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\u000e\u001a\u00020\t*\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ljava/nio/ByteBuffer;", "byteBuffer", "Lk8/n;", "ByteReadPacket", "(Ljava/nio/ByteBuffer;)Lk8/n;", "buffer", "", "readAvailable", "(Lk8/n;Ljava/nio/ByteBuffer;)I", "Lh6/A;", "readFully", "(Lk8/n;Ljava/nio/ByteBuffer;)V", "Lkotlin/Function1;", "block", "read", "(Lk8/n;Lx6/j;)V", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ByteReadPacketExtensions_jvmKt {
    public static final n ByteReadPacket(ByteBuffer byteBuffer) {
        m.e(byteBuffer, "byteBuffer");
        a aVar = new a();
        p.m(aVar, byteBuffer);
        return aVar;
    }

    public static final void read(n nVar, j block) {
        m.e(nVar, "<this>");
        m.e(block, "block");
        a aVarA = nVar.a();
        if (aVarA.o()) {
            throw new IllegalArgumentException("Buffer is empty");
        }
        p094k8.j jVar = aVarA.f24508h;
        m.b(jVar);
        int i3 = jVar.f24524b;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(jVar.f24523a, i3, jVar.f24525c - i3);
        m.b(byteBufferWrap);
        block.invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - i3;
        if (iPosition != 0) {
            if (iPosition < 0) {
                throw new IllegalStateException("Returned negative read bytes count");
            }
            if (iPosition > jVar.b()) {
                throw new IllegalStateException("Returned too many bytes");
            }
            aVarA.C(iPosition);
        }
    }

    public static final int readAvailable(n nVar, ByteBuffer buffer) {
        m.e(nVar, "<this>");
        m.e(buffer, "buffer");
        int iRemaining = buffer.remaining();
        p.f(nVar, buffer);
        return iRemaining - buffer.remaining();
    }

    public static final void readFully(n nVar, ByteBuffer buffer) {
        m.e(nVar, "<this>");
        m.e(buffer, "buffer");
        while (!nVar.o() && buffer.hasRemaining()) {
            p.f(nVar, buffer);
        }
    }
}
