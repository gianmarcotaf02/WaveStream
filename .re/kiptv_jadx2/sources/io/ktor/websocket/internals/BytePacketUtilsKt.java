package io.ktor.websocket.internals;

import androidx.media3.container.NalUnitUtil;
import io.ktor.utils.io.core.ByteReadPacketKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p094k8.a;
import p094k8.j;
import p094k8.n;
import p094k8.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk8/n;", "", "data", "", "endsWith", "(Lk8/n;[B)Z", "ktor-websockets"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class BytePacketUtilsKt {
    public static final boolean endsWith(n nVar, byte[] data) {
        m.e(nVar, "<this>");
        m.e(data, "data");
        a aVarA = nVar.a();
        a aVar = new a();
        if (aVarA.j != 0) {
            j jVar = aVarA.f24508h;
            m.b(jVar);
            j jVarF = jVar.f();
            aVar.f24508h = jVarF;
            aVar.f24509i = jVarF;
            for (j jVar2 = jVar.f24528f; jVar2 != null; jVar2 = jVar2.f24528f) {
                j jVar3 = aVar.f24509i;
                m.b(jVar3);
                j jVarF2 = jVar2.f();
                jVar3.e(jVarF2);
                aVar.f24509i = jVarF2;
            }
            aVar.j = aVarA.j;
        }
        ByteReadPacketKt.discard(aVar, ByteReadPacketKt.getRemaining(aVar) - ((long) data.length));
        return Arrays.equals(p.i(aVar, -1), data);
    }
}
