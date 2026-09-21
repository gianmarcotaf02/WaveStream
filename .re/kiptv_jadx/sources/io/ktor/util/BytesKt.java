package io.ktor.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\n\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "", "offset", "", "readShort", "([BI)S", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class BytesKt {
    @io.ktor.utils.io.InternalAPI
    public static final short readShort(byte[] bArr, int i3) {
        kotlin.jvm.internal.m.e(bArr, "<this>");
        return (short) ((bArr[i3 + 1] & 255) | ((bArr[i3] & 255) << 8));
    }
}
