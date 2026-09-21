package io.ktor.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LD6/j;", io.sentry.protocol.Request.JsonKeys.OTHER, "", "contains", "(LD6/j;LD6/j;)Z", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RangesKt {
    public static final boolean contains(D6.j jVar, D6.j other) {
        kotlin.jvm.internal.m.e(jVar, "<this>");
        kotlin.jvm.internal.m.e(other, "other");
        return other.f2464h >= jVar.f2464h && other.f2465i <= jVar.f2465i;
    }
}
