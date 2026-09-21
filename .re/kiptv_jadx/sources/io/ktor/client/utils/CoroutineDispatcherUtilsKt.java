package io.ktor.client.utils;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LS7/M;", "", "threadCount", "", "dispatcherName", "LS7/w;", "clientDispatcher", "(LS7/M;ILjava/lang/String;)LS7/w;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CoroutineDispatcherUtilsKt {
    @io.ktor.utils.io.InternalAPI
    public static final S7.AbstractC0906w clientDispatcher(S7.M m8, int i3, java.lang.String dispatcherName) {
        kotlin.jvm.internal.m.e(m8, "<this>");
        kotlin.jvm.internal.m.e(dispatcherName, "dispatcherName");
        Z7.e eVar = S7.M.f9549a;
        return Z7.d.f13044i.Y(i3);
    }

    public static /* synthetic */ S7.AbstractC0906w clientDispatcher$default(S7.M m8, int i3, java.lang.String str, int i9, java.lang.Object obj) {
        if ((i9 & 2) != 0) {
            str = "ktor-client-dispatcher";
        }
        return clientDispatcher(m8, i3, str);
    }
}
