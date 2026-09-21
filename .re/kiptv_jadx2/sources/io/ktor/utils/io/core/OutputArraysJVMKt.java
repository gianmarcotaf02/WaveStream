package io.ktor.utils.io.core;

import androidx.media3.container.NalUnitUtil;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p094k8.l;
import p094k8.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk8/l;", "Ljava/nio/ByteBuffer;", "bb", "Lh6/A;", "writeByteBuffer", "(Lk8/l;Ljava/nio/ByteBuffer;)V", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class OutputArraysJVMKt {
    public static final void writeByteBuffer(l lVar, ByteBuffer bb) {
        m.e(lVar, "<this>");
        m.e(bb, "bb");
        p.m(lVar, bb);
    }
}
