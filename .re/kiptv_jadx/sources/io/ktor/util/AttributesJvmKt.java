package io.ktor.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "concurrent", "Lio/ktor/util/Attributes;", "Attributes", "(Z)Lio/ktor/util/Attributes;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AttributesJvmKt {
    public static final io.ktor.util.Attributes Attributes(boolean z6) {
        return z6 ? new io.ktor.util.ConcurrentSafeAttributes() : new io.ktor.util.HashMapAttributes();
    }

    public static /* synthetic */ io.ktor.util.Attributes Attributes$default(boolean z6, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            z6 = false;
        }
        return Attributes(z6);
    }
}
