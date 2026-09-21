package io.ktor.network.sockets;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0004\u001a\u00020\u00022\u0016\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\t\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\"\"\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\"\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/Function1;", "", "Lh6/A;", "handler", "failInvokeOnClose", "(Lx6/j;)V", "Lk8/n;", "Ljava/nio/ByteBuffer;", "buffer", "writeMessageTo", "(Lk8/n;Ljava/nio/ByteBuffer;)V", "CLOSED", "Lx6/j;", "CLOSED_INVOKED", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DatagramSendChannelKt {
    private static final p194x6.j CLOSED = new io.ktor.http.b(9);
    private static final p194x6.j CLOSED_INVOKED = new io.ktor.http.b(10);

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A CLOSED$lambda$0(java.lang.Throwable th) {
        return p070h6.A.f22523a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A CLOSED_INVOKED$lambda$1(java.lang.Throwable th) {
        return p070h6.A.f22523a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void failInvokeOnClose(p194x6.j jVar) {
        java.lang.String str;
        if (jVar == CLOSED_INVOKED) {
            str = "Another handler was already registered and successfully invoked";
        } else {
            str = "Another handler was already registered: " + jVar;
        }
        throw new java.lang.IllegalStateException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void writeMessageTo(p094k8.n nVar, java.nio.ByteBuffer byteBuffer) {
        io.ktor.utils.io.core.ByteReadPacketExtensions_jvmKt.readFully(nVar, byteBuffer);
        byteBuffer.flip();
    }
}
