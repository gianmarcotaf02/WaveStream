package io.ktor.util;

import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteWriteChannel;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import kotlin.jvm.internal.y;
import p194x6.j;

public final class a implements j {

    public final int f23406h;

    public final Object f23407i;
    public final Object j;

    public a(Object obj, Object obj2, int i3) {
        this.f23406h = i3;
        this.f23407i = obj;
        this.j = obj2;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f23406h) {
            case 0:
                return CryptoKt__CryptoJvmKt.getDigestFunction$lambda$0$CryptoKt__CryptoJvmKt((String) this.f23407i, (j) this.j, (String) obj);
            case 1:
                return BufferViewJvmKt.write$lambda$1((y) this.f23407i, (WritableByteChannel) this.j, (ByteBuffer) obj);
            case 2:
                return BufferViewJvmKt.read$lambda$0((y) this.f23407i, (ReadableByteChannel) this.j, (ByteBuffer) obj);
            case 3:
                return ByteChannelsKt.copyToBoth$lambda$1((ByteWriteChannel) this.f23407i, (ByteWriteChannel) this.j, (Throwable) obj);
            default:
                return ByteChannelsKt.split$lambda$0((ByteChannel) this.f23407i, (ByteChannel) this.j, (Throwable) obj);
        }
    }
}
