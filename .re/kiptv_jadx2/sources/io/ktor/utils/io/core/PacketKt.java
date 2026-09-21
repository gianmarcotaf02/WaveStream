package io.ktor.utils.io.core;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p070h6.c;
import p094k8.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0005\u001a\u0004\b\u0006\u0010\u0003¨\u0006\b"}, d2 = {"Lk8/n;", "", "isEmpty", "(Lk8/n;)Z", "isEmpty$annotations", "(Lk8/n;)V", "isNotEmpty", "isNotEmpty$annotations", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PacketKt {
    public static final boolean isEmpty(n nVar) {
        m.e(nVar, "<this>");
        return nVar.o();
    }

    public static final boolean isNotEmpty(n nVar) {
        m.e(nVar, "<this>");
        return !nVar.o();
    }

    @c
    public static void isEmpty$annotations(n nVar) {
    }

    @c
    public static void isNotEmpty$annotations(n nVar) {
    }
}
