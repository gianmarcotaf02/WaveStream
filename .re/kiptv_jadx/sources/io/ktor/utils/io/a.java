package io.ktor.utils.io;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23412h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.io.ByteChannel f23413i;

    public /* synthetic */ a(io.ktor.utils.io.ByteChannel byteChannel, int i3) {
        this.f23412h = i3;
        this.f23413i = byteChannel;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f23412h) {
            case 0:
                return io.ktor.utils.io.ByteChannelUtilsKt.attachJob$lambda$0(this.f23413i, (java.lang.Throwable) obj);
            case 1:
                return io.ktor.utils.io.ByteReadChannelOperationsKt.reader$lambda$6$lambda$5(this.f23413i, (java.lang.Throwable) obj);
            default:
                return io.ktor.utils.io.ByteWriteChannelOperationsKt.writer$lambda$2$lambda$1(this.f23413i, (java.lang.Throwable) obj);
        }
    }
}
