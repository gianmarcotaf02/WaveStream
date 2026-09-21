package io.ktor.utils.io;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import p117n6.c;
import p117n6.e;

@Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {577}, m = "readUntil$appendPartialMatch")
public final class ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    Object result;

    public ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1(p100l6.c cVar) {
        super(cVar);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ByteReadChannelOperationsKt.readUntil$appendPartialMatch(null, null, null, null, this);
    }
}
