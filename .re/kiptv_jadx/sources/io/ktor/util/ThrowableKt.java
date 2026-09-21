package io.ktor.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0006\" \u0010\u0005\u001a\u0004\u0018\u00010\u0000*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0001\u0010\u0002¨\u0006\u0006"}, d2 = {"", "getRootCause", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getRootCause$annotations", "(Ljava/lang/Throwable;)V", "rootCause", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ThrowableKt {
    public static final java.lang.Throwable getRootCause(java.lang.Throwable th) {
        kotlin.jvm.internal.m.e(th, "<this>");
        while (true) {
            if ((th != null ? th.getCause() : null) == null) {
                return th;
            }
            th = th.getCause();
        }
    }

    @io.ktor.utils.io.InternalAPI
    public static /* synthetic */ void getRootCause$annotations(java.lang.Throwable th) {
    }
}
