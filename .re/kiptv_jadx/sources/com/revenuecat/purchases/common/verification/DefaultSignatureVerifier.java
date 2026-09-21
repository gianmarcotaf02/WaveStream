package com.revenuecat.purchases.common.verification;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/common/verification/DefaultSignatureVerifier;", "Lcom/revenuecat/purchases/common/verification/SignatureVerifier;", "", "publicKeyBytes", "<init>", "([B)V", "", "publicKey", "(Ljava/lang/String;)V", "signatureToVerify", "messageToVerify", "", "verify", "([B[B)Z", "LB4/m;", "verifier", "LB4/m;", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DefaultSignatureVerifier implements com.revenuecat.purchases.common.verification.SignatureVerifier {
    private static final java.lang.String DEFAULT_PUBLIC_KEY = "UC1upXWg5QVmyOSwozp755xLqquBKjjU+di6U8QhMlM=";
    private final B4.m verifier;

    public DefaultSignatureVerifier(byte[] publicKeyBytes) {
        kotlin.jvm.internal.m.e(publicKeyBytes, "publicKeyBytes");
        this.verifier = new B4.m(publicKeyBytes);
    }

    @Override // com.revenuecat.purchases.common.verification.SignatureVerifier
    public boolean verify(byte[] signatureToVerify, byte[] messageToVerify) {
        kotlin.jvm.internal.m.e(signatureToVerify, "signatureToVerify");
        kotlin.jvm.internal.m.e(messageToVerify, "messageToVerify");
        try {
            this.verifier.a(signatureToVerify, messageToVerify);
            return true;
        } catch (java.security.GeneralSecurityException unused) {
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DefaultSignatureVerifier(java.lang.String publicKey) {
        kotlin.jvm.internal.m.e(publicKey, "publicKey");
        byte[] bArrDecode = android.util.Base64.decode(publicKey, 0);
        kotlin.jvm.internal.m.d(bArrDecode, "decode(publicKey, Base64.DEFAULT)");
        this(bArrDecode);
    }

    public /* synthetic */ DefaultSignatureVerifier(java.lang.String str, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? DEFAULT_PUBLIC_KEY : str);
    }
}
