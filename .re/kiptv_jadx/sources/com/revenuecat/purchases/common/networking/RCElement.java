package com.revenuecat.purchases.common.networking;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/common/networking/RCElement;", "", "checksum", "", "data", "Ljava/nio/ByteBuffer;", "codec", "", "([BLjava/nio/ByteBuffer;I)V", "getChecksum", "()[B", "getCodec", "()I", "getData", "()Ljava/nio/ByteBuffer;", "checksumBase64", "", "decode", "matchesChecksum", "", "content", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RCElement {
    private static final com.revenuecat.purchases.common.networking.RCElement.Companion Companion = new com.revenuecat.purchases.common.networking.RCElement.Companion(null);
    private static final java.lang.String SHA_256_ALGORITHM = "SHA-256";
    private final byte[] checksum;
    private final int codec;
    private final java.nio.ByteBuffer data;

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/common/networking/RCElement$Companion;", "", "()V", "SHA_256_ALGORITHM", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        private Companion() {
        }
    }

    public RCElement(byte[] checksum, java.nio.ByteBuffer data, int i3) {
        kotlin.jvm.internal.m.e(checksum, "checksum");
        kotlin.jvm.internal.m.e(data, "data");
        this.checksum = checksum;
        this.data = data;
        this.codec = i3;
    }

    private final boolean matchesChecksum(byte[] content) {
        byte[] computed = java.security.MessageDigest.getInstance(SHA_256_ALGORITHM).digest(content);
        kotlin.jvm.internal.m.d(computed, "computed");
        byte[] bArrCopyOf = java.util.Arrays.copyOf(computed, this.checksum.length);
        kotlin.jvm.internal.m.d(bArrCopyOf, "copyOf(...)");
        return java.util.Arrays.equals(bArrCopyOf, this.checksum);
    }

    public final java.lang.String checksumBase64() {
        java.lang.String strEncodeToString = android.util.Base64.encodeToString(this.checksum, 11);
        kotlin.jvm.internal.m.d(strEncodeToString, "encodeToString(checksum,…ADDING or Base64.NO_WRAP)");
        return strEncodeToString;
    }

    public final byte[] decode() {
        byte[] bArrDecode = com.revenuecat.purchases.common.networking.RCContentEncoding.INSTANCE.decode(this.data, this.codec);
        if (matchesChecksum(bArrDecode)) {
            return bArrDecode;
        }
        throw new com.revenuecat.purchases.common.networking.RCContainerFormatException("RC element checksum verification failed.", null, 2, null);
    }

    public final byte[] getChecksum() {
        return this.checksum;
    }

    public final int getCodec() {
        return this.codec;
    }

    public final java.nio.ByteBuffer getData() {
        return this.data;
    }

    public /* synthetic */ RCElement(byte[] bArr, java.nio.ByteBuffer byteBuffer, int i3, int i9, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(bArr, byteBuffer, (i9 & 4) != 0 ? com.revenuecat.purchases.common.networking.RCContentEncoding.NONE.getId() : i3);
    }
}
