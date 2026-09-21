package com.revenuecat.purchases.common.verification;

import I3.b;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.EntitlementVerificationMode;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u000b2\u00020\u0001:\u0004\u000b\f\r\u000eB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "", "()V", "intermediateSignatureHelper", "Lcom/revenuecat/purchases/common/verification/IntermediateSignatureHelper;", "getIntermediateSignatureHelper", "()Lcom/revenuecat/purchases/common/verification/IntermediateSignatureHelper;", "shouldVerify", "", "getShouldVerify", "()Z", "Companion", "Disabled", "Enforced", "Informational", "Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode$Disabled;", "Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode$Enforced;", "Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode$Informational;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class SignatureVerificationMode {

    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode$Companion;", "", "()V", "createIntermediateSignatureHelper", "Lcom/revenuecat/purchases/common/verification/IntermediateSignatureHelper;", "fromEntitlementVerificationMode", "Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "verificationMode", "Lcom/revenuecat/purchases/EntitlementVerificationMode;", "rootVerifier", "Lcom/revenuecat/purchases/common/verification/SignatureVerifier;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public class WhenMappings {
            public static final int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EntitlementVerificationMode.values().length];
                try {
                    iArr[EntitlementVerificationMode.DISABLED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EntitlementVerificationMode.INFORMATIONAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public final IntermediateSignatureHelper createIntermediateSignatureHelper() {
            return new IntermediateSignatureHelper(new DefaultSignatureVerifier(null, 1, 0 == true ? 1 : 0));
        }

        public static SignatureVerificationMode fromEntitlementVerificationMode$default(Companion companion, EntitlementVerificationMode entitlementVerificationMode, SignatureVerifier signatureVerifier, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                signatureVerifier = null;
            }
            return companion.fromEntitlementVerificationMode(entitlementVerificationMode, signatureVerifier);
        }

        public final SignatureVerificationMode fromEntitlementVerificationMode(EntitlementVerificationMode verificationMode, SignatureVerifier rootVerifier) {
            m.e(verificationMode, "verificationMode");
            int i3 = WhenMappings.$EnumSwitchMapping$0[verificationMode.ordinal()];
            int i9 = 1;
            if (i3 == 1) {
                return Disabled.INSTANCE;
            }
            if (i3 != 2) {
                throw new b();
            }
            if (rootVerifier == null) {
                rootVerifier = new DefaultSignatureVerifier(null, i9, 0 == true ? 1 : 0);
            }
            return new Informational(new IntermediateSignatureHelper(rootVerifier));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode$Disabled;", "Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Disabled extends SignatureVerificationMode {
        public static final Disabled INSTANCE = new Disabled();

        private Disabled() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode$Enforced;", "Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "intermediateSignatureHelper", "Lcom/revenuecat/purchases/common/verification/IntermediateSignatureHelper;", "(Lcom/revenuecat/purchases/common/verification/IntermediateSignatureHelper;)V", "getIntermediateSignatureHelper", "()Lcom/revenuecat/purchases/common/verification/IntermediateSignatureHelper;", "component1", "copy", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Enforced extends SignatureVerificationMode {
        private final IntermediateSignatureHelper intermediateSignatureHelper;

        public Enforced() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static Enforced copy$default(Enforced enforced, IntermediateSignatureHelper intermediateSignatureHelper, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                intermediateSignatureHelper = enforced.intermediateSignatureHelper;
            }
            return enforced.copy(intermediateSignatureHelper);
        }

        public final IntermediateSignatureHelper getIntermediateSignatureHelper() {
            return this.intermediateSignatureHelper;
        }

        public final Enforced copy(IntermediateSignatureHelper intermediateSignatureHelper) {
            m.e(intermediateSignatureHelper, "intermediateSignatureHelper");
            return new Enforced(intermediateSignatureHelper);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Enforced) && m.a(this.intermediateSignatureHelper, ((Enforced) other).intermediateSignatureHelper);
        }

        @Override
        public IntermediateSignatureHelper getIntermediateSignatureHelper() {
            return this.intermediateSignatureHelper;
        }

        public int hashCode() {
            return this.intermediateSignatureHelper.hashCode();
        }

        public String toString() {
            return "Enforced(intermediateSignatureHelper=" + this.intermediateSignatureHelper + ')';
        }

        public Enforced(IntermediateSignatureHelper intermediateSignatureHelper, int i3, AbstractC2541f abstractC2541f) {
            this((i3 & 1) != 0 ? SignatureVerificationMode.INSTANCE.createIntermediateSignatureHelper() : intermediateSignatureHelper);
        }

        public Enforced(IntermediateSignatureHelper intermediateSignatureHelper) {
            super(null);
            m.e(intermediateSignatureHelper, "intermediateSignatureHelper");
            this.intermediateSignatureHelper = intermediateSignatureHelper;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode$Informational;", "Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "intermediateSignatureHelper", "Lcom/revenuecat/purchases/common/verification/IntermediateSignatureHelper;", "(Lcom/revenuecat/purchases/common/verification/IntermediateSignatureHelper;)V", "getIntermediateSignatureHelper", "()Lcom/revenuecat/purchases/common/verification/IntermediateSignatureHelper;", "component1", "copy", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Informational extends SignatureVerificationMode {
        private final IntermediateSignatureHelper intermediateSignatureHelper;

        public Informational() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static Informational copy$default(Informational informational, IntermediateSignatureHelper intermediateSignatureHelper, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                intermediateSignatureHelper = informational.intermediateSignatureHelper;
            }
            return informational.copy(intermediateSignatureHelper);
        }

        public final IntermediateSignatureHelper getIntermediateSignatureHelper() {
            return this.intermediateSignatureHelper;
        }

        public final Informational copy(IntermediateSignatureHelper intermediateSignatureHelper) {
            m.e(intermediateSignatureHelper, "intermediateSignatureHelper");
            return new Informational(intermediateSignatureHelper);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Informational) && m.a(this.intermediateSignatureHelper, ((Informational) other).intermediateSignatureHelper);
        }

        @Override
        public IntermediateSignatureHelper getIntermediateSignatureHelper() {
            return this.intermediateSignatureHelper;
        }

        public int hashCode() {
            return this.intermediateSignatureHelper.hashCode();
        }

        public String toString() {
            return "Informational(intermediateSignatureHelper=" + this.intermediateSignatureHelper + ')';
        }

        public Informational(IntermediateSignatureHelper intermediateSignatureHelper, int i3, AbstractC2541f abstractC2541f) {
            this((i3 & 1) != 0 ? SignatureVerificationMode.INSTANCE.createIntermediateSignatureHelper() : intermediateSignatureHelper);
        }

        public Informational(IntermediateSignatureHelper intermediateSignatureHelper) {
            super(null);
            m.e(intermediateSignatureHelper, "intermediateSignatureHelper");
            this.intermediateSignatureHelper = intermediateSignatureHelper;
        }
    }

    public SignatureVerificationMode(AbstractC2541f abstractC2541f) {
        this();
    }

    public IntermediateSignatureHelper getIntermediateSignatureHelper() {
        if (this instanceof Disabled) {
            return null;
        }
        if (this instanceof Informational) {
            return ((Informational) this).getIntermediateSignatureHelper();
        }
        if (this instanceof Enforced) {
            return ((Enforced) this).getIntermediateSignatureHelper();
        }
        throw new b();
    }

    public final boolean getShouldVerify() {
        if (equals(Disabled.INSTANCE)) {
            return false;
        }
        if (this instanceof Informational ? true : this instanceof Enforced) {
            return true;
        }
        throw new b();
    }

    private SignatureVerificationMode() {
    }
}
