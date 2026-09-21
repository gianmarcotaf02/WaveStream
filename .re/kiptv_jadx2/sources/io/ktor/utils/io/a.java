package io.ktor.utils.io;

import p194x6.j;

public final class a implements j {

    public final int f23412h;

    public final ByteChannel f23413i;

    public a(ByteChannel byteChannel, int i3) {
        this.f23412h = i3;
        this.f23413i = byteChannel;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f23412h) {
            case 0:
                return ByteChannelUtilsKt.attachJob$lambda$0(this.f23413i, (Throwable) obj);
            case 1:
                return ByteReadChannelOperationsKt.reader$lambda$6$lambda$5(this.f23413i, (Throwable) obj);
            default:
                return ByteWriteChannelOperationsKt.writer$lambda$2$lambda$1(this.f23413i, (Throwable) obj);
        }
    }
}
