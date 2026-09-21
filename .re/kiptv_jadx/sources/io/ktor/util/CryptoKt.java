package io.ktor.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"io/ktor/util/CryptoKt__CryptoJvmKt", "io/ktor/util/CryptoKt__CryptoKt"}, k = 4, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CryptoKt {
    public static final int NONCE_SIZE_IN_BYTES = 16;

    public static final io.ktor.util.Digest Digest(java.lang.String str) {
        return io.ktor.util.CryptoKt__CryptoJvmKt.Digest(str);
    }

    @io.ktor.utils.io.InternalAPI
    public static final java.lang.Object build(io.ktor.util.Digest digest, java.lang.String str, java.nio.charset.Charset charset, p100l6.c cVar) {
        return io.ktor.util.CryptoKt__CryptoKt.build(digest, str, charset, cVar);
    }

    public static final java.lang.String generateNonce() {
        return io.ktor.util.CryptoKt__CryptoJvmKt.generateNonce();
    }

    public static final p194x6.j getDigestFunction(java.lang.String str, p194x6.j jVar) {
        return io.ktor.util.CryptoKt__CryptoJvmKt.getDigestFunction(str, jVar);
    }

    public static final java.lang.String hex(byte[] bArr) {
        return io.ktor.util.CryptoKt__CryptoKt.hex(bArr);
    }

    public static final byte[] sha1(byte[] bArr) {
        return io.ktor.util.CryptoKt__CryptoJvmKt.sha1(bArr);
    }

    @io.ktor.utils.io.InternalAPI
    public static final java.lang.Object build(io.ktor.util.Digest digest, byte[] bArr, p100l6.c cVar) {
        return io.ktor.util.CryptoKt__CryptoKt.build(digest, bArr, cVar);
    }

    public static final byte[] generateNonce(int i3) {
        return io.ktor.util.CryptoKt__CryptoKt.generateNonce(i3);
    }

    public static final byte[] hex(java.lang.String str) {
        return io.ktor.util.CryptoKt__CryptoKt.hex(str);
    }
}
