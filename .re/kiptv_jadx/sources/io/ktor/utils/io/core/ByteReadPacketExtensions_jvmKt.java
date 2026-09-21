package io.ktor.utils.io.core;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\u000e\u001a\u00020\t*\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ljava/nio/ByteBuffer;", "byteBuffer", "Lk8/n;", "ByteReadPacket", "(Ljava/nio/ByteBuffer;)Lk8/n;", "buffer", "", "readAvailable", "(Lk8/n;Ljava/nio/ByteBuffer;)I", "Lh6/A;", "readFully", "(Lk8/n;Ljava/nio/ByteBuffer;)V", "Lkotlin/Function1;", "block", "read", "(Lk8/n;Lx6/j;)V", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ByteReadPacketExtensions_jvmKt {
    public static final p094k8.n ByteReadPacket(java.nio.ByteBuffer byteBuffer) {
        kotlin.jvm.internal.m.e(byteBuffer, "byteBuffer");
        p094k8.a aVar = new p094k8.a();
        p094k8.p.m(aVar, byteBuffer);
        return aVar;
    }

    public static final void read(p094k8.n nVar, p194x6.j block) {
        kotlin.jvm.internal.m.e(nVar, "<this>");
        kotlin.jvm.internal.m.e(block, "block");
        p094k8.a aVarA = nVar.a();
        if (aVarA.o()) {
            throw new java.lang.IllegalArgumentException("Buffer is empty");
        }
        p094k8.j jVar = aVarA.f24508h;
        kotlin.jvm.internal.m.b(jVar);
        int i3 = jVar.f24524b;
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(jVar.f24523a, i3, jVar.f24525c - i3);
        kotlin.jvm.internal.m.b(byteBufferWrap);
        block.invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - i3;
        if (iPosition != 0) {
            if (iPosition < 0) {
                throw new java.lang.IllegalStateException("Returned negative read bytes count");
            }
            if (iPosition > jVar.b()) {
                throw new java.lang.IllegalStateException("Returned too many bytes");
            }
            aVarA.C(iPosition);
        }
    }

    public static final int readAvailable(p094k8.n nVar, java.nio.ByteBuffer buffer) {
        kotlin.jvm.internal.m.e(nVar, "<this>");
        kotlin.jvm.internal.m.e(buffer, "buffer");
        int iRemaining = buffer.remaining();
        p094k8.p.f(nVar, buffer);
        return iRemaining - buffer.remaining();
    }

    public static final void readFully(p094k8.n nVar, java.nio.ByteBuffer buffer) {
        kotlin.jvm.internal.m.e(nVar, "<this>");
        kotlin.jvm.internal.m.e(buffer, "buffer");
        while (!nVar.o() && buffer.hasRemaining()) {
            p094k8.p.f(nVar, buffer);
        }
    }
}
