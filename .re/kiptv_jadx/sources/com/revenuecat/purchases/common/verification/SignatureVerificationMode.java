package com.revenuecat.purchases.common.verification;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u000b2\u00020\u0001:\u0004\u000b\f\r\u000eB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "", "()V", "intermediateSignatureHelper", "Lcom/revenuecat/purchases/common/verification/IntermediateSignatureHelper;", "getIntermediateSignatureHelper", "()Lcom/revenuecat/purchases/common/verification/IntermediateSignatureHelper;", "shouldVerify", "", "getShouldVerify", "()Z", "Companion", "Disabled", "Enforced", "Informational", "Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode$Disabled;", "Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode$Enforced;", "Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode$Informational;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class SignatureVerificationMode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.common.verification.SignatureVerificationMode.Companion INSTANCE = new com.revenuecat.purchases.common.verification.SignatureVerificationMode.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode$Companion;", "", "()V", "createIntermediateSignatureHelper", "Lcom/revenuecat/purchases/common/verification/IntermediateSignatureHelper;", "fromEntitlementVerificationMode", "Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "verificationMode", "Lcom/revenuecat/purchases/EntitlementVerificationMode;", "rootVerifier", "Lcom/revenuecat/purchases/common/verification/SignatureVerifier;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.revenuecat.purchases.EntitlementVerificationMode.values().length];
                try {
                    iArr[com.revenuecat.purchases.EntitlementVerificationMode.DISABLED.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.revenuecat.purchases.EntitlementVerificationMode.INFORMATIONAL.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final com.revenuecat.purchases.common.verification.IntermediateSignatureHelper createIntermediateSignatureHelper() {
            return new com.revenuecat.purchases.common.verification.IntermediateSignatureHelper(new com.revenuecat.purchases.common.verification.DefaultSignatureVerifier(null, 1, 0 == true ? 1 : 0));
        }

        public static /* synthetic */ com.revenuecat.purchases.common.verification.SignatureVerificationMode fromEntitlementVerificationMode$default(com.revenuecat.purchases.common.verification.SignatureVerificationMode.Companion companion, com.revenuecat.purchases.EntitlementVerificationMode entitlementVerificationMode, com.revenuecat.purchases.common.verification.SignatureVerifier signatureVerifier, int i3, java.lang.Object obj) {
            if ((i3 & 2) != 0) {
                signatureVerifier = null;
            }
            return companion.fromEntitlementVerificationMode(entitlementVerificationMode, signatureVerifier);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final com.revenuecat.purchases.common.verification.SignatureVerificationMode fromEntitlementVerificationMode(com.revenuecat.purchases.EntitlementVerificationMode verificationMode, com.revenuecat.purchases.common.verification.SignatureVerifier rootVerifier) {
            kotlin.jvm.internal.m.e(verificationMode, "verificationMode");
            int i3 = com.revenuecat.purchases.common.verification.SignatureVerificationMode.Companion.WhenMappings.$EnumSwitchMapping$0[verificationMode.ordinal()];
            int i9 = 1;
            if (i3 == 1) {
                return com.revenuecat.purchases.common.verification.SignatureVerificationMode.Disabled.INSTANCE;
            }
            if (i3 != 2) {
                throw new I3.b();
            }
            if (rootVerifier == null) {
                rootVerifier = new com.revenuecat.purchases.common.verification.DefaultSignatureVerifier(null, i9, 0 == true ? 1 : 0);
            }
            return new com.revenuecat.purchases.common.verification.SignatureVerificationMode.Informational(new com.revenuecat.purchases.common.verification.IntermediateSignatureHelper(rootVerifier));
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode$Disabled;", "Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Disabled extends com.revenuecat.purchases.common.verification.SignatureVerificationMode {
        public static final com.revenuecat.purchases.common.verification.SignatureVerificationMode.Disabled INSTANCE = new com.revenuecat.purchases.common.verification.SignatureVerificationMode.Disabled();

        private Disabled() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode$Enforced;", "Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "intermediateSignatureHelper", "Lcom/revenuecat/purchases/common/verification/IntermediateSignatureHelper;", "(Lcom/revenuecat/purchases/common/verification/IntermediateSignatureHelper;)V", "getIntermediateSignatureHelper", "()Lcom/revenuecat/purchases/common/verification/IntermediateSignatureHelper;", "component1", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Enforced extends com.revenuecat.purchases.common.verification.SignatureVerificationMode {
        private final com.revenuecat.purchases.common.verification.IntermediateSignatureHelper intermediateSignatureHelper;

        /* JADX WARN: Multi-variable type inference failed */
        public Enforced() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ com.revenuecat.purchases.common.verification.SignatureVerificationMode.Enforced copy$default(com.revenuecat.purchases.common.verification.SignatureVerificationMode.Enforced enforced, com.revenuecat.purchases.common.verification.IntermediateSignatureHelper intermediateSignatureHelper, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                intermediateSignatureHelper = enforced.intermediateSignatureHelper;
            }
            return enforced.copy(intermediateSignatureHelper);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final com.revenuecat.purchases.common.verification.IntermediateSignatureHelper getIntermediateSignatureHelper() {
            return this.intermediateSignatureHelper;
        }

        public final com.revenuecat.purchases.common.verification.SignatureVerificationMode.Enforced copy(com.revenuecat.purchases.common.verification.IntermediateSignatureHelper intermediateSignatureHelper) {
            kotlin.jvm.internal.m.e(intermediateSignatureHelper, "intermediateSignatureHelper");
            return new com.revenuecat.purchases.common.verification.SignatureVerificationMode.Enforced(intermediateSignatureHelper);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.revenuecat.purchases.common.verification.SignatureVerificationMode.Enforced) && kotlin.jvm.internal.m.a(this.intermediateSignatureHelper, ((com.revenuecat.purchases.common.verification.SignatureVerificationMode.Enforced) other).intermediateSignatureHelper);
        }

        @Override // com.revenuecat.purchases.common.verification.SignatureVerificationMode
        public com.revenuecat.purchases.common.verification.IntermediateSignatureHelper getIntermediateSignatureHelper() {
            return this.intermediateSignatureHelper;
        }

        public int hashCode() {
            return this.intermediateSignatureHelper.hashCode();
        }

        public java.lang.String toString() {
            return "Enforced(intermediateSignatureHelper=" + this.intermediateSignatureHelper + ')';
        }

        public /* synthetic */ Enforced(com.revenuecat.purchases.common.verification.IntermediateSignatureHelper intermediateSignatureHelper, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this((i3 & 1) != 0 ? com.revenuecat.purchases.common.verification.SignatureVerificationMode.INSTANCE.createIntermediateSignatureHelper() : intermediateSignatureHelper);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Enforced(com.revenuecat.purchases.common.verification.IntermediateSignatureHelper intermediateSignatureHelper) {
            super(null);
            kotlin.jvm.internal.m.e(intermediateSignatureHelper, "intermediateSignatureHelper");
            this.intermediateSignatureHelper = intermediateSignatureHelper;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode$Informational;", "Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "intermediateSignatureHelper", "Lcom/revenuecat/purchases/common/verification/IntermediateSignatureHelper;", "(Lcom/revenuecat/purchases/common/verification/IntermediateSignatureHelper;)V", "getIntermediateSignatureHelper", "()Lcom/revenuecat/purchases/common/verification/IntermediateSignatureHelper;", "component1", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Informational extends com.revenuecat.purchases.common.verification.SignatureVerificationMode {
        private final com.revenuecat.purchases.common.verification.IntermediateSignatureHelper intermediateSignatureHelper;

        /* JADX WARN: Multi-variable type inference failed */
        public Informational() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ com.revenuecat.purchases.common.verification.SignatureVerificationMode.Informational copy$default(com.revenuecat.purchases.common.verification.SignatureVerificationMode.Informational informational, com.revenuecat.purchases.common.verification.IntermediateSignatureHelper intermediateSignatureHelper, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                intermediateSignatureHelper = informational.intermediateSignatureHelper;
            }
            return informational.copy(intermediateSignatureHelper);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final com.revenuecat.purchases.common.verification.IntermediateSignatureHelper getIntermediateSignatureHelper() {
            return this.intermediateSignatureHelper;
        }

        public final com.revenuecat.purchases.common.verification.SignatureVerificationMode.Informational copy(com.revenuecat.purchases.common.verification.IntermediateSignatureHelper intermediateSignatureHelper) {
            kotlin.jvm.internal.m.e(intermediateSignatureHelper, "intermediateSignatureHelper");
            return new com.revenuecat.purchases.common.verification.SignatureVerificationMode.Informational(intermediateSignatureHelper);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.revenuecat.purchases.common.verification.SignatureVerificationMode.Informational) && kotlin.jvm.internal.m.a(this.intermediateSignatureHelper, ((com.revenuecat.purchases.common.verification.SignatureVerificationMode.Informational) other).intermediateSignatureHelper);
        }

        @Override // com.revenuecat.purchases.common.verification.SignatureVerificationMode
        public com.revenuecat.purchases.common.verification.IntermediateSignatureHelper getIntermediateSignatureHelper() {
            return this.intermediateSignatureHelper;
        }

        public int hashCode() {
            return this.intermediateSignatureHelper.hashCode();
        }

        public java.lang.String toString() {
            return "Informational(intermediateSignatureHelper=" + this.intermediateSignatureHelper + ')';
        }

        public /* synthetic */ Informational(com.revenuecat.purchases.common.verification.IntermediateSignatureHelper intermediateSignatureHelper, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this((i3 & 1) != 0 ? com.revenuecat.purchases.common.verification.SignatureVerificationMode.INSTANCE.createIntermediateSignatureHelper() : intermediateSignatureHelper);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Informational(com.revenuecat.purchases.common.verification.IntermediateSignatureHelper intermediateSignatureHelper) {
            super(null);
            kotlin.jvm.internal.m.e(intermediateSignatureHelper, "intermediateSignatureHelper");
            this.intermediateSignatureHelper = intermediateSignatureHelper;
        }
    }

    public /* synthetic */ SignatureVerificationMode(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this();
    }

    public com.revenuecat.purchases.common.verification.IntermediateSignatureHelper getIntermediateSignatureHelper() {
        if (this instanceof com.revenuecat.purchases.common.verification.SignatureVerificationMode.Disabled) {
            return null;
        }
        if (this instanceof com.revenuecat.purchases.common.verification.SignatureVerificationMode.Informational) {
            return ((com.revenuecat.purchases.common.verification.SignatureVerificationMode.Informational) this).getIntermediateSignatureHelper();
        }
        if (this instanceof com.revenuecat.purchases.common.verification.SignatureVerificationMode.Enforced) {
            return ((com.revenuecat.purchases.common.verification.SignatureVerificationMode.Enforced) this).getIntermediateSignatureHelper();
        }
        throw new I3.b();
    }

    public final boolean getShouldVerify() {
        if (equals(com.revenuecat.purchases.common.verification.SignatureVerificationMode.Disabled.INSTANCE)) {
            return false;
        }
        if (this instanceof com.revenuecat.purchases.common.verification.SignatureVerificationMode.Informational ? true : this instanceof com.revenuecat.purchases.common.verification.SignatureVerificationMode.Enforced) {
            return true;
        }
        throw new I3.b();
    }

    private SignatureVerificationMode() {
    }
}
