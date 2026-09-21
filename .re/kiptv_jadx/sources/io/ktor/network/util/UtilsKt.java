package io.ktor.network.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001aS\u0010\r\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f*\u0004\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"LS7/A;", "", "name", "", "timeoutMs", "Lkotlin/Function0;", "clock", "Lkotlin/Function1;", "Ll6/c;", "Lh6/A;", "", "onTimeout", "Lio/ktor/network/util/Timeout;", "createTimeout", "(LS7/A;Ljava/lang/String;JLkotlin/jvm/functions/Function0;Lx6/j;)Lio/ktor/network/util/Timeout;", "T", "block", "withTimeout", "(Lio/ktor/network/util/Timeout;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "INFINITE_TIMEOUT_MS", "J", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class UtilsKt {
    public static final long INFINITE_TIMEOUT_MS = Long.MAX_VALUE;

    public static final io.ktor.network.util.Timeout createTimeout(S7.A a2, java.lang.String name, long j, kotlin.jvm.functions.Function0 clock, p194x6.j onTimeout) {
        kotlin.jvm.internal.m.e(a2, "<this>");
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(clock, "clock");
        kotlin.jvm.internal.m.e(onTimeout, "onTimeout");
        return new io.ktor.network.util.Timeout(name, j, clock, a2, onTimeout);
    }

    public static /* synthetic */ io.ktor.network.util.Timeout createTimeout$default(S7.A a2, java.lang.String str, long j, kotlin.jvm.functions.Function0 function0, p194x6.j jVar, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = "";
        }
        if ((i3 & 4) != 0) {
            function0 = new io.ktor.http.a(4);
        }
        return createTimeout(a2, str, j, function0, jVar);
    }

    public static final <T> T withTimeout(io.ktor.network.util.Timeout timeout, kotlin.jvm.functions.Function0 block) {
        kotlin.jvm.internal.m.e(block, "block");
        if (timeout == null) {
            return (T) block.invoke();
        }
        timeout.start();
        try {
            return (T) block.invoke();
        } finally {
            timeout.stop();
        }
    }
}
