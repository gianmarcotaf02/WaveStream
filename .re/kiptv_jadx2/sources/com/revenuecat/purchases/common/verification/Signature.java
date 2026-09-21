package com.revenuecat.purchases.common.verification;

import Y6.f;
import android.util.Base64;
import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import p121o0.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/common/verification/Signature;", "", "intermediateKey", "", "intermediateKeyExpiration", "intermediateKeySignature", "salt", "payload", "([B[B[B[B[B)V", "getIntermediateKey", "()[B", "getIntermediateKeyExpiration", "getIntermediateKeySignature", "getPayload", "getSalt", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", Request.JsonKeys.OTHER, "hashCode", "", "toString", "", "Companion", "Component", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Signature {

    public static final Companion INSTANCE = new Companion(null);
    private final byte[] intermediateKey;
    private final byte[] intermediateKeyExpiration;
    private final byte[] intermediateKeySignature;
    private final byte[] payload;
    private final byte[] salt;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/verification/Signature$Companion;", "", "()V", "fromString", "Lcom/revenuecat/purchases/common/verification/Signature;", "signature", "", "fromString$purchases_defaultsRelease", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public final Signature fromString$purchases_defaultsRelease(String signature) throws InvalidSignatureSizeException {
            m.e(signature, "signature");
            byte[] bArrDecode = Base64.decode(signature, 0);
            int totalSize = Component.INSTANCE.getTotalSize();
            if (bArrDecode.length == totalSize) {
                return new Signature(SignatureKt.copyOf(bArrDecode, Component.INTERMEDIATE_KEY), SignatureKt.copyOf(bArrDecode, Component.INTERMEDIATE_KEY_EXPIRATION), SignatureKt.copyOf(bArrDecode, Component.INTERMEDIATE_KEY_SIGNATURE), SignatureKt.copyOf(bArrDecode, Component.SALT), SignatureKt.copyOf(bArrDecode, Component.PAYLOAD));
            }
            throw new InvalidSignatureSizeException(f.k(p.t(totalSize, "Invalid signature size. Expected ", ", got "), bArrDecode.length, " bytes"));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0081\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R\u0011\u0010\t\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/common/verification/Signature$Component;", "", "size", "", "(Ljava/lang/String;II)V", "endByte", "getEndByte", "()I", "getSize", "startByte", "getStartByte", "INTERMEDIATE_KEY", "INTERMEDIATE_KEY_EXPIRATION", "INTERMEDIATE_KEY_SIGNATURE", "SALT", "PAYLOAD", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public enum Component {
        INTERMEDIATE_KEY(32),
        INTERMEDIATE_KEY_EXPIRATION(4),
        INTERMEDIATE_KEY_SIGNATURE(64),
        SALT(16),
        PAYLOAD(64);


        public static final Companion INSTANCE = new Companion(null);
        private final int size;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/verification/Signature$Component$Companion;", "", "()V", "totalSize", "", "getTotalSize", "()I", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public Companion(AbstractC2541f abstractC2541f) {
                this();
            }

            public final int getTotalSize() {
                int size = 0;
                for (Component component : Component.values()) {
                    size += component.getSize();
                }
                return size;
            }

            private Companion() {
            }
        }

        Component(int i3) {
            this.size = i3;
        }

        public final int getEndByte() {
            return getStartByte() + this.size;
        }

        public final int getSize() {
            return this.size;
        }

        public final int getStartByte() {
            int i3 = 0;
            for (Object obj : p078i6.m.g0(values(), 0, ordinal())) {
                i3 += ((Component) obj).size;
            }
            return i3;
        }
    }

    public Signature(byte[] intermediateKey, byte[] intermediateKeyExpiration, byte[] intermediateKeySignature, byte[] salt, byte[] payload) {
        m.e(intermediateKey, "intermediateKey");
        m.e(intermediateKeyExpiration, "intermediateKeyExpiration");
        m.e(intermediateKeySignature, "intermediateKeySignature");
        m.e(salt, "salt");
        m.e(payload, "payload");
        this.intermediateKey = intermediateKey;
        this.intermediateKeyExpiration = intermediateKeyExpiration;
        this.intermediateKeySignature = intermediateKeySignature;
        this.salt = salt;
        this.payload = payload;
    }

    public static Signature copy$default(Signature signature, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            bArr = signature.intermediateKey;
        }
        if ((i3 & 2) != 0) {
            bArr2 = signature.intermediateKeyExpiration;
        }
        if ((i3 & 4) != 0) {
            bArr3 = signature.intermediateKeySignature;
        }
        if ((i3 & 8) != 0) {
            bArr4 = signature.salt;
        }
        if ((i3 & 16) != 0) {
            bArr5 = signature.payload;
        }
        byte[] bArr6 = bArr5;
        byte[] bArr7 = bArr3;
        return signature.copy(bArr, bArr2, bArr7, bArr4, bArr6);
    }

    public final byte[] getIntermediateKey() {
        return this.intermediateKey;
    }

    public final byte[] getIntermediateKeyExpiration() {
        return this.intermediateKeyExpiration;
    }

    public final byte[] getIntermediateKeySignature() {
        return this.intermediateKeySignature;
    }

    public final byte[] getSalt() {
        return this.salt;
    }

    public final byte[] getPayload() {
        return this.payload;
    }

    public final Signature copy(byte[] intermediateKey, byte[] intermediateKeyExpiration, byte[] intermediateKeySignature, byte[] salt, byte[] payload) {
        m.e(intermediateKey, "intermediateKey");
        m.e(intermediateKeyExpiration, "intermediateKeyExpiration");
        m.e(intermediateKeySignature, "intermediateKeySignature");
        m.e(salt, "salt");
        m.e(payload, "payload");
        return new Signature(intermediateKey, intermediateKeyExpiration, intermediateKeySignature, salt, payload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Signature.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        m.c(other, "null cannot be cast to non-null type com.revenuecat.purchases.common.verification.Signature");
        Signature signature = (Signature) other;
        return Arrays.equals(this.intermediateKey, signature.intermediateKey) && Arrays.equals(this.intermediateKeyExpiration, signature.intermediateKeyExpiration) && Arrays.equals(this.intermediateKeySignature, signature.intermediateKeySignature) && Arrays.equals(this.salt, signature.salt) && Arrays.equals(this.payload, signature.payload);
    }

    public final byte[] getIntermediateKey() {
        return this.intermediateKey;
    }

    public final byte[] getIntermediateKeyExpiration() {
        return this.intermediateKeyExpiration;
    }

    public final byte[] getIntermediateKeySignature() {
        return this.intermediateKeySignature;
    }

    public final byte[] getPayload() {
        return this.payload;
    }

    public final byte[] getSalt() {
        return this.salt;
    }

    public int hashCode() {
        return Arrays.hashCode(this.payload) + ((Arrays.hashCode(this.salt) + ((Arrays.hashCode(this.intermediateKeySignature) + ((Arrays.hashCode(this.intermediateKeyExpiration) + (Arrays.hashCode(this.intermediateKey) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "Signature(intermediateKey=" + Arrays.toString(this.intermediateKey) + ", intermediateKeyExpiration=" + Arrays.toString(this.intermediateKeyExpiration) + ", intermediateKeySignature=" + Arrays.toString(this.intermediateKeySignature) + ", salt=" + Arrays.toString(this.salt) + ", payload=" + Arrays.toString(this.payload) + ')';
    }
}
