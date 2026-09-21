package io.ktor.utils.io.core;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk8/a;", io.sentry.protocol.Request.JsonKeys.OTHER, "", "maxSize", "writeBufferAppend", "(Lk8/a;Lk8/a;I)I", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class BufferAppendKt {
    @p070h6.c
    public static final int writeBufferAppend(p094k8.a aVar, p094k8.a other, int i3) {
        kotlin.jvm.internal.m.e(aVar, "<this>");
        kotlin.jvm.internal.m.e(other, "other");
        long jMin = java.lang.Math.min(other.j, i3);
        aVar.write(other, jMin);
        return (int) jMin;
    }
}
