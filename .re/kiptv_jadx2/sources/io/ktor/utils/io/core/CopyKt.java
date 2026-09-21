package io.ktor.utils.io.core;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p070h6.c;
import p094k8.l;
import p094k8.n;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk8/n;", "Lk8/l;", "output", "", "copyTo", "(Lk8/n;Lk8/l;)J", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CopyKt {
    @c
    public static final long copyTo(n nVar, l output) {
        m.e(nVar, "<this>");
        m.e(output, "output");
        return nVar.H(output);
    }
}
