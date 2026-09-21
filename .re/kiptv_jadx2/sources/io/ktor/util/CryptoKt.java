package io.ktor.util;

import androidx.media3.container.NalUnitUtil;
import io.ktor.utils.io.InternalAPI;
import java.nio.charset.Charset;
import kotlin.Metadata;
import p194x6.j;

@Metadata(d1 = {"io/ktor/util/CryptoKt__CryptoJvmKt", "io/ktor/util/CryptoKt__CryptoKt"}, k = 4, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CryptoKt {
    public static final int NONCE_SIZE_IN_BYTES = 16;

    public static final Digest Digest(String str) {
        return CryptoKt__CryptoJvmKt.Digest(str);
    }

    @InternalAPI
    public static final Object build(Digest digest, String str, Charset charset, p100l6.c cVar) {
        return CryptoKt__CryptoKt.build(digest, str, charset, cVar);
    }

    public static final String generateNonce() {
        return CryptoKt__CryptoJvmKt.generateNonce();
    }

    public static final j getDigestFunction(String str, j jVar) {
        return CryptoKt__CryptoJvmKt.getDigestFunction(str, jVar);
    }

    public static final String hex(byte[] bArr) {
        return CryptoKt__CryptoKt.hex(bArr);
    }

    public static final byte[] sha1(byte[] bArr) {
        return CryptoKt__CryptoJvmKt.sha1(bArr);
    }

    @InternalAPI
    public static final Object build(Digest digest, byte[] bArr, p100l6.c cVar) {
        return CryptoKt__CryptoKt.build(digest, bArr, cVar);
    }

    public static final byte[] generateNonce(int i3) {
        return CryptoKt__CryptoKt.generateNonce(i3);
    }

    public static final byte[] hex(String str) {
        return CryptoKt__CryptoKt.hex(str);
    }
}
