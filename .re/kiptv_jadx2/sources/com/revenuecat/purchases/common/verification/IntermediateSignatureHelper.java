package com.revenuecat.purchases.common.verification;

import E8.l;
import P7.a;
import P7.b;
import P7.d;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.IntExtensionsKt;
import com.revenuecat.purchases.utils.Result;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/common/verification/IntermediateSignatureHelper;", "", "rootSignatureVerifier", "Lcom/revenuecat/purchases/common/verification/SignatureVerifier;", "(Lcom/revenuecat/purchases/common/verification/SignatureVerifier;)V", "createIntermediateKeyVerifierIfVerified", "Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/PurchasesError;", "signature", "Lcom/revenuecat/purchases/common/verification/Signature;", "getIntermediateKeyExpirationDate", "Ljava/util/Date;", "intermediateKeyExpirationBytes", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class IntermediateSignatureHelper {
    private final SignatureVerifier rootSignatureVerifier;

    public IntermediateSignatureHelper(SignatureVerifier rootSignatureVerifier) {
        m.e(rootSignatureVerifier, "rootSignatureVerifier");
        this.rootSignatureVerifier = rootSignatureVerifier;
    }

    private final Date getIntermediateKeyExpirationDate(byte[] intermediateKeyExpirationBytes) {
        a aVar = b.f8168i;
        return new Date(b.d(l.N(IntExtensionsKt.fromLittleEndianBytes(k.f24550a, intermediateKeyExpirationBytes), d.DAYS)));
    }

    public final Result<SignatureVerifier, PurchasesError> createIntermediateKeyVerifierIfVerified(Signature signature) {
        m.e(signature, "signature");
        if (!this.rootSignatureVerifier.verify(signature.getIntermediateKeySignature(), p078i6.m.x0(signature.getIntermediateKeyExpiration(), signature.getIntermediateKey()))) {
            return new Result.Error(new PurchasesError(PurchasesErrorCode.SignatureVerificationError, "Error verifying intermediate key."));
        }
        Date intermediateKeyExpirationDate = getIntermediateKeyExpirationDate(signature.getIntermediateKeyExpiration());
        if (!intermediateKeyExpirationDate.before(new Date())) {
            return new Result.Success(new DefaultSignatureVerifier(signature.getIntermediateKey()));
        }
        return new Result.Error(new PurchasesError(PurchasesErrorCode.SignatureVerificationError, "Intermediate key expired at " + intermediateKeyExpirationDate));
    }
}
