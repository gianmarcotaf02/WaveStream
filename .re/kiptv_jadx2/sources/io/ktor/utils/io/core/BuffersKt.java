package io.ktor.utils.io.core;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p094k8.a;
import p094k8.p;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lk8/a;", "", "count", "", "readBytes", "(Lk8/a;I)[B", "", "isEmpty", "(Lk8/a;)Z", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class BuffersKt {
    public static final boolean isEmpty(a aVar) {
        m.e(aVar, "<this>");
        return aVar.j == 0;
    }

    public static final byte[] readBytes(a aVar, int i3) {
        m.e(aVar, "<this>");
        return p.h(aVar, i3);
    }

    public static byte[] readBytes$default(a aVar, int i3, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i3 = (int) aVar.j;
        }
        return readBytes(aVar, i3);
    }
}
