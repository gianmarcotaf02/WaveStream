package io.ktor.utils.io.core.internal;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a-\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lk8/a;", "", "min", "Lkotlin/Function1;", "Ljava/nio/ByteBuffer;", "Lh6/A;", "block", "writeDirect", "(Lk8/a;ILx6/j;)V", "readDirect", "(Lk8/a;Lx6/j;)V", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ChunkBufferJvmKt {
    public static final void readDirect(p094k8.a aVar, p194x6.j block) {
        kotlin.jvm.internal.m.e(aVar, "<this>");
        kotlin.jvm.internal.m.e(block, "block");
        if (aVar.o()) {
            throw new java.lang.IllegalArgumentException("Buffer is empty");
        }
        p094k8.j jVar = aVar.f24508h;
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
            aVar.C(iPosition);
        }
    }

    public static final void writeDirect(p094k8.a aVar, int i3, p194x6.j block) {
        kotlin.jvm.internal.m.e(aVar, "<this>");
        kotlin.jvm.internal.m.e(block, "block");
        p094k8.j jVarU = aVar.u(i3);
        int i9 = jVarU.f24525c;
        byte[] bArr = jVarU.f24523a;
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr, i9, bArr.length - i9);
        kotlin.jvm.internal.m.b(byteBufferWrap);
        block.invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - i9;
        if (iPosition == i3) {
            jVarU.f24525c += iPosition;
            aVar.j += (long) iPosition;
            return;
        }
        if (iPosition < 0 || iPosition > jVarU.a()) {
            java.lang.StringBuilder sbT = p121o0.p.t(iPosition, "Invalid number of bytes written: ", ". Should be in 0..");
            sbT.append(jVarU.a());
            throw new java.lang.IllegalStateException(sbT.toString().toString());
        }
        if (iPosition != 0) {
            jVarU.f24525c += iPosition;
            aVar.j += (long) iPosition;
        } else if (p094k8.p.e(jVarU)) {
            aVar.j();
        }
    }
}
