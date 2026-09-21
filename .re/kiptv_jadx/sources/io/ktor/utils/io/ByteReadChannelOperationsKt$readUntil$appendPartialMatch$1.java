package io.ktor.utils.io;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p117n6.e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {577}, m = "readUntil$appendPartialMatch")
public final class ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1 extends p117n6.c {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;

    public ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1(p100l6.c cVar) {
        super(cVar);
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return io.ktor.utils.io.ByteReadChannelOperationsKt.readUntil$appendPartialMatch(null, null, null, null, this);
    }
}
