package io.ktor.util.internal;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "cause", "Lh6/A;", "initCauseBridge", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ExceptionUtilsJvmKt {
    public static final void initCauseBridge(java.lang.Throwable th, java.lang.Throwable cause) {
        kotlin.jvm.internal.m.e(th, "<this>");
        kotlin.jvm.internal.m.e(cause, "cause");
        th.initCause(cause);
    }
}
