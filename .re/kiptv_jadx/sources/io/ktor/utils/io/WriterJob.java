package io.ktor.utils.io;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/ktor/utils/io/WriterJob;", "Lio/ktor/utils/io/ChannelJob;", "Lio/ktor/utils/io/ByteReadChannel;", "channel", "LS7/h0;", "job", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;LS7/h0;)V", "Lio/ktor/utils/io/ByteReadChannel;", "getChannel", "()Lio/ktor/utils/io/ByteReadChannel;", "LS7/h0;", "getJob", "()LS7/h0;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WriterJob implements io.ktor.utils.io.ChannelJob {
    private final io.ktor.utils.io.ByteReadChannel channel;
    private final S7.InterfaceC0891h0 job;

    public WriterJob(io.ktor.utils.io.ByteReadChannel channel, S7.InterfaceC0891h0 job) {
        kotlin.jvm.internal.m.e(channel, "channel");
        kotlin.jvm.internal.m.e(job, "job");
        this.channel = channel;
        this.job = job;
    }

    public final io.ktor.utils.io.ByteReadChannel getChannel() {
        return this.channel;
    }

    @Override // io.ktor.utils.io.ChannelJob
    public S7.InterfaceC0891h0 getJob() {
        return this.job;
    }
}
