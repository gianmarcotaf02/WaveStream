package io.ktor.utils.io;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a8\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0086@¢\u0006\u0004\b\u0007\u0010\b\u001a8\u0010\t\u001a\u00020\u0004*\u00020\u00002\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0086@¢\u0006\u0004\b\t\u0010\b*\n\u0010\n\"\u00020\u00022\u00020\u0002¨\u0006\u000b"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "Lkotlin/Function2;", "Lio/ktor/utils/io/LookAheadSuspendSession;", "Ll6/c;", "Lh6/A;", "", "block", "lookAhead", "(Lio/ktor/utils/io/ByteReadChannel;Lx6/m;Ll6/c;)Ljava/lang/Object;", "lookAheadSuspend", "LookAheadSession", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class LookAheadSessionKt {
    public static final java.lang.Object lookAhead(io.ktor.utils.io.ByteReadChannel byteReadChannel, p194x6.m mVar, p100l6.c cVar) {
        java.lang.Object objInvoke = mVar.invoke(new io.ktor.utils.io.LookAheadSuspendSession(byteReadChannel), cVar);
        return objInvoke == p109m6.a.f25430h ? objInvoke : p070h6.A.f22523a;
    }

    public static final java.lang.Object lookAheadSuspend(io.ktor.utils.io.ByteReadChannel byteReadChannel, p194x6.m mVar, p100l6.c cVar) {
        java.lang.Object objInvoke = mVar.invoke(new io.ktor.utils.io.LookAheadSuspendSession(byteReadChannel), cVar);
        return objInvoke == p109m6.a.f25430h ? objInvoke : p070h6.A.f22523a;
    }
}
