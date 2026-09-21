package io.ktor.util;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23406h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f23407i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ a(java.lang.Object obj, java.lang.Object obj2, int i3) {
        this.f23406h = i3;
        this.f23407i = obj;
        this.j = obj2;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f23406h) {
            case 0:
                return io.ktor.util.CryptoKt__CryptoJvmKt.getDigestFunction$lambda$0$CryptoKt__CryptoJvmKt((java.lang.String) this.f23407i, (p194x6.j) this.j, (java.lang.String) obj);
            case 1:
                return io.ktor.util.BufferViewJvmKt.write$lambda$1((kotlin.jvm.internal.y) this.f23407i, (java.nio.channels.WritableByteChannel) this.j, (java.nio.ByteBuffer) obj);
            case 2:
                return io.ktor.util.BufferViewJvmKt.read$lambda$0((kotlin.jvm.internal.y) this.f23407i, (java.nio.channels.ReadableByteChannel) this.j, (java.nio.ByteBuffer) obj);
            case 3:
                return io.ktor.util.ByteChannelsKt.copyToBoth$lambda$1((io.ktor.utils.io.ByteWriteChannel) this.f23407i, (io.ktor.utils.io.ByteWriteChannel) this.j, (java.lang.Throwable) obj);
            default:
                return io.ktor.util.ByteChannelsKt.split$lambda$0((io.ktor.utils.io.ByteChannel) this.f23407i, (io.ktor.utils.io.ByteChannel) this.j, (java.lang.Throwable) obj);
        }
    }
}
