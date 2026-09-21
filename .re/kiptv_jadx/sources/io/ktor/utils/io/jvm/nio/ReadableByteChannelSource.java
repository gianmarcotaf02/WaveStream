package io.ktor.utils.io.jvm.nio;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/ktor/utils/io/jvm/nio/ReadableByteChannelSource;", "Lk8/f;", "Ljava/nio/channels/ReadableByteChannel;", "channel", "<init>", "(Ljava/nio/channels/ReadableByteChannel;)V", "Lk8/a;", "sink", "", "byteCount", "readAtMostTo", "(Lk8/a;J)J", "Lh6/A;", "close", "()V", "", "toString", "()Ljava/lang/String;", "Ljava/nio/channels/ReadableByteChannel;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
class ReadableByteChannelSource implements p094k8.f {
    private final java.nio.channels.ReadableByteChannel channel;

    public ReadableByteChannelSource(java.nio.channels.ReadableByteChannel channel) {
        kotlin.jvm.internal.m.e(channel, "channel");
        this.channel = channel;
    }

    @Override // java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.channel.close();
    }

    @Override // p094k8.f
    public long readAtMostTo(p094k8.a sink, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.m.e(sink, "sink");
        if (byteCount <= 0) {
            return 0L;
        }
        int iMin = (int) java.lang.Math.min(byteCount, 2147483647L);
        p094k8.j jVarU = sink.u(1);
        int i3 = jVarU.f24525c;
        byte[] bArr = jVarU.f24523a;
        int i9 = this.channel.read(java.nio.ByteBuffer.wrap(bArr, i3, java.lang.Math.min(iMin, bArr.length - i3)));
        int iMax = java.lang.Math.max(i9, 0);
        if (iMax == 1) {
            jVarU.f24525c += iMax;
            sink.j += (long) iMax;
        } else {
            if (iMax < 0 || iMax > jVarU.a()) {
                java.lang.StringBuilder sbT = p121o0.p.t(iMax, "Invalid number of bytes written: ", ". Should be in 0..");
                sbT.append(jVarU.a());
                throw new java.lang.IllegalStateException(sbT.toString().toString());
            }
            if (iMax != 0) {
                jVarU.f24525c += iMax;
                sink.j += (long) iMax;
            } else if (p094k8.p.e(jVarU)) {
                sink.j();
            }
        }
        return i9;
    }

    public java.lang.String toString() {
        return "ReadableByteChannelSource(" + this.channel + ')';
    }
}
