package io.ktor.websocket.internals;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk8/n;", "", "data", "", "endsWith", "(Lk8/n;[B)Z", "ktor-websockets"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class BytePacketUtilsKt {
    public static final boolean endsWith(p094k8.n nVar, byte[] data) {
        kotlin.jvm.internal.m.e(nVar, "<this>");
        kotlin.jvm.internal.m.e(data, "data");
        p094k8.a aVarA = nVar.a();
        p094k8.a aVar = new p094k8.a();
        if (aVarA.j != 0) {
            p094k8.j jVar = aVarA.f24508h;
            kotlin.jvm.internal.m.b(jVar);
            p094k8.j jVarF = jVar.f();
            aVar.f24508h = jVarF;
            aVar.f24509i = jVarF;
            for (p094k8.j jVar2 = jVar.f24528f; jVar2 != null; jVar2 = jVar2.f24528f) {
                p094k8.j jVar3 = aVar.f24509i;
                kotlin.jvm.internal.m.b(jVar3);
                p094k8.j jVarF2 = jVar2.f();
                jVar3.e(jVarF2);
                aVar.f24509i = jVarF2;
            }
            aVar.j = aVarA.j;
        }
        io.ktor.utils.io.core.ByteReadPacketKt.discard(aVar, io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(aVar) - ((long) data.length));
        return java.util.Arrays.equals(p094k8.p.i(aVar, -1), data);
    }
}
