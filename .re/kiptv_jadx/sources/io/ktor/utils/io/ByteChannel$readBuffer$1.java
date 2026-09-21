package io.ktor.utils.io;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public /* synthetic */ class ByteChannel$readBuffer$1 extends kotlin.jvm.internal.j implements p194x6.j {
    public static final io.ktor.utils.io.ByteChannel$readBuffer$1 INSTANCE = new io.ktor.utils.io.ByteChannel$readBuffer$1();

    public ByteChannel$readBuffer$1() {
        super(1, io.ktor.utils.io.ClosedReadChannelException.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);
    }

    @Override // p194x6.j
    public final io.ktor.utils.io.ClosedReadChannelException invoke(java.lang.Throwable th) {
        return new io.ktor.utils.io.ClosedReadChannelException(th);
    }
}
