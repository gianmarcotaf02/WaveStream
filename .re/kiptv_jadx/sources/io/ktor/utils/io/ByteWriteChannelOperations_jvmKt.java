package io.ktor.utils.io;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0006\u0010\u0005\u001a2\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\tH\u0086@¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\r\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/utils/io/ByteWriteChannel;", "Ljava/nio/ByteBuffer;", "value", "Lh6/A;", "writeByteBuffer", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/nio/ByteBuffer;Ll6/c;)Ljava/lang/Object;", "writeFully", "", "min", "Lkotlin/Function1;", "block", "write", "(Lio/ktor/utils/io/ByteWriteChannel;ILx6/j;Ll6/c;)Ljava/lang/Object;", "writeAvailable", "(Lio/ktor/utils/io/ByteWriteChannel;ILx6/j;)I", "buffer", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/nio/ByteBuffer;)V", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ByteWriteChannelOperations_jvmKt {
    public static final java.lang.Object write(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, int i3, p194x6.j jVar, p100l6.c cVar) {
        p094k8.a aVarA = byteWriteChannel.getWriteBuffer().a();
        p094k8.j jVarU = aVarA.u(i3);
        int i9 = jVarU.f24525c;
        byte[] bArr = jVarU.f24523a;
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr, i9, bArr.length - i9);
        kotlin.jvm.internal.m.b(byteBufferWrap);
        jVar.invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - i9;
        if (iPosition == i3) {
            jVarU.f24525c += iPosition;
            aVarA.j += (long) iPosition;
        } else {
            if (iPosition < 0 || iPosition > jVarU.a()) {
                java.lang.StringBuilder sbT = p121o0.p.t(iPosition, "Invalid number of bytes written: ", ". Should be in 0..");
                sbT.append(jVarU.a());
                throw new java.lang.IllegalStateException(sbT.toString().toString());
            }
            if (iPosition != 0) {
                jVarU.f24525c += iPosition;
                aVarA.j += (long) iPosition;
            } else if (p094k8.p.e(jVarU)) {
                aVarA.j();
            }
        }
        java.lang.Object objFlush = byteWriteChannel.flush(cVar);
        return objFlush == p109m6.a.f25430h ? objFlush : p070h6.A.f22523a;
    }

    public static /* synthetic */ java.lang.Object write$default(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, int i3, p194x6.j jVar, p100l6.c cVar, int i9, java.lang.Object obj) {
        if ((i9 & 1) != 0) {
            i3 = 1;
        }
        return write(byteWriteChannel, i3, jVar, cVar);
    }

    public static final int writeAvailable(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, int i3, p194x6.j block) {
        kotlin.jvm.internal.m.e(byteWriteChannel, "<this>");
        kotlin.jvm.internal.m.e(block, "block");
        if (i3 <= 0) {
            throw new java.lang.IllegalArgumentException("min should be positive");
        }
        if (i3 > 1048576) {
            throw new java.lang.IllegalArgumentException(Y6.f.f(i3, "Min(", ") shouldn't be greater than 1048576").toString());
        }
        if (byteWriteChannel.isClosedForWrite()) {
            return -1;
        }
        p094k8.a aVarA = byteWriteChannel.getWriteBuffer().a();
        p094k8.j jVarU = aVarA.u(i3);
        int i9 = jVarU.f24525c;
        byte[] bArr = jVarU.f24523a;
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr, i9, bArr.length - i9);
        kotlin.jvm.internal.m.b(byteBufferWrap);
        block.invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - i9;
        int iPosition2 = byteBufferWrap.position() - i9;
        if (iPosition2 == i3) {
            jVarU.f24525c += iPosition2;
            aVarA.j += (long) iPosition2;
            return iPosition;
        }
        if (iPosition2 < 0 || iPosition2 > jVarU.a()) {
            java.lang.StringBuilder sbT = p121o0.p.t(iPosition2, "Invalid number of bytes written: ", ". Should be in 0..");
            sbT.append(jVarU.a());
            throw new java.lang.IllegalStateException(sbT.toString().toString());
        }
        if (iPosition2 != 0) {
            jVarU.f24525c += iPosition2;
            aVarA.j += (long) iPosition2;
            return iPosition;
        }
        if (p094k8.p.e(jVarU)) {
            aVarA.j();
        }
        return iPosition;
    }

    public static /* synthetic */ int writeAvailable$default(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, int i3, p194x6.j jVar, int i9, java.lang.Object obj) {
        if ((i9 & 1) != 0) {
            i3 = 1;
        }
        return writeAvailable(byteWriteChannel, i3, jVar);
    }

    public static final java.lang.Object writeByteBuffer(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, java.nio.ByteBuffer byteBuffer, p100l6.c cVar) {
        io.ktor.utils.io.core.OutputArraysJVMKt.writeByteBuffer(byteWriteChannel.getWriteBuffer(), byteBuffer);
        java.lang.Object objFlush = byteWriteChannel.flush(cVar);
        return objFlush == p109m6.a.f25430h ? objFlush : p070h6.A.f22523a;
    }

    public static final java.lang.Object writeFully(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, java.nio.ByteBuffer byteBuffer, p100l6.c cVar) {
        io.ktor.utils.io.core.OutputArraysJVMKt.writeByteBuffer(byteWriteChannel.getWriteBuffer(), byteBuffer);
        java.lang.Object objFlush = byteWriteChannel.flush(cVar);
        return objFlush == p109m6.a.f25430h ? objFlush : p070h6.A.f22523a;
    }

    public static final void writeAvailable(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, java.nio.ByteBuffer buffer) {
        kotlin.jvm.internal.m.e(byteWriteChannel, "<this>");
        kotlin.jvm.internal.m.e(buffer, "buffer");
        p094k8.p.m(byteWriteChannel.getWriteBuffer(), buffer);
    }
}
