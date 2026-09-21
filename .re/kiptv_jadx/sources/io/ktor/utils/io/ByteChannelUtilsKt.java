package io.ktor.utils.io;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/utils/io/ByteChannel;", "LS7/h0;", "job", "Lh6/A;", "attachJob", "(Lio/ktor/utils/io/ByteChannel;LS7/h0;)V", "Lio/ktor/utils/io/ChannelJob;", "(Lio/ktor/utils/io/ByteChannel;Lio/ktor/utils/io/ChannelJob;)V", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ByteChannelUtilsKt {
    public static final void attachJob(io.ktor.utils.io.ByteChannel byteChannel, S7.InterfaceC0891h0 job) {
        kotlin.jvm.internal.m.e(byteChannel, "<this>");
        kotlin.jvm.internal.m.e(job, "job");
        job.j(new io.ktor.utils.io.a(byteChannel, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A attachJob$lambda$0(io.ktor.utils.io.ByteChannel byteChannel, java.lang.Throwable th) {
        if (th != null) {
            byteChannel.cancel(th);
        }
        return p070h6.A.f22523a;
    }

    public static final void attachJob(io.ktor.utils.io.ByteChannel byteChannel, io.ktor.utils.io.ChannelJob job) {
        kotlin.jvm.internal.m.e(byteChannel, "<this>");
        kotlin.jvm.internal.m.e(job, "job");
        attachJob(byteChannel, job.getJob());
    }
}
