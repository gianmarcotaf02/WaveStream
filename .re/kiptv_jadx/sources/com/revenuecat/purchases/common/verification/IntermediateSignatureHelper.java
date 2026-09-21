package com.revenuecat.purchases.common.verification;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/common/verification/IntermediateSignatureHelper;", "", "rootSignatureVerifier", "Lcom/revenuecat/purchases/common/verification/SignatureVerifier;", "(Lcom/revenuecat/purchases/common/verification/SignatureVerifier;)V", "createIntermediateKeyVerifierIfVerified", "Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/PurchasesError;", "signature", "Lcom/revenuecat/purchases/common/verification/Signature;", "getIntermediateKeyExpirationDate", "Ljava/util/Date;", "intermediateKeyExpirationBytes", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class IntermediateSignatureHelper {
    private final com.revenuecat.purchases.common.verification.SignatureVerifier rootSignatureVerifier;

    public IntermediateSignatureHelper(com.revenuecat.purchases.common.verification.SignatureVerifier rootSignatureVerifier) {
        kotlin.jvm.internal.m.e(rootSignatureVerifier, "rootSignatureVerifier");
        this.rootSignatureVerifier = rootSignatureVerifier;
    }

    private final java.util.Date getIntermediateKeyExpirationDate(byte[] intermediateKeyExpirationBytes) {
        P7.a aVar = P7.b.f8168i;
        return new java.util.Date(P7.b.d(E8.l.N(com.revenuecat.purchases.common.IntExtensionsKt.fromLittleEndianBytes(kotlin.jvm.internal.k.f24550a, intermediateKeyExpirationBytes), P7.d.DAYS)));
    }

    public final com.revenuecat.purchases.utils.Result<com.revenuecat.purchases.common.verification.SignatureVerifier, com.revenuecat.purchases.PurchasesError> createIntermediateKeyVerifierIfVerified(com.revenuecat.purchases.common.verification.Signature signature) {
        kotlin.jvm.internal.m.e(signature, "signature");
        if (!this.rootSignatureVerifier.verify(signature.getIntermediateKeySignature(), p078i6.m.x0(signature.getIntermediateKeyExpiration(), signature.getIntermediateKey()))) {
            return new com.revenuecat.purchases.utils.Result.Error(new com.revenuecat.purchases.PurchasesError(com.revenuecat.purchases.PurchasesErrorCode.SignatureVerificationError, "Error verifying intermediate key."));
        }
        java.util.Date intermediateKeyExpirationDate = getIntermediateKeyExpirationDate(signature.getIntermediateKeyExpiration());
        if (!intermediateKeyExpirationDate.before(new java.util.Date())) {
            return new com.revenuecat.purchases.utils.Result.Success(new com.revenuecat.purchases.common.verification.DefaultSignatureVerifier(signature.getIntermediateKey()));
        }
        return new com.revenuecat.purchases.utils.Result.Error(new com.revenuecat.purchases.PurchasesError(com.revenuecat.purchases.PurchasesErrorCode.SignatureVerificationError, "Intermediate key expired at " + intermediateKeyExpirationDate));
    }
}
