package com.revenuecat.purchases.models;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0004+,-*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u001d¨\u0006."}, d2 = {"Lcom/revenuecat/purchases/models/Checksum;", "", "Lcom/revenuecat/purchases/models/Checksum$Algorithm;", "algorithm", "", "value", "<init>", "(Lcom/revenuecat/purchases/models/Checksum$Algorithm;Ljava/lang/String;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/models/Checksum$Algorithm;Ljava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/models/Checksum;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "component1", "()Lcom/revenuecat/purchases/models/Checksum$Algorithm;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/revenuecat/purchases/models/Checksum$Algorithm;Ljava/lang/String;)Lcom/revenuecat/purchases/models/Checksum;", "toString", "hashCode", "()I", "Lcom/revenuecat/purchases/models/Checksum$Algorithm;", "getAlgorithm", "getAlgorithm$annotations", "()V", "Ljava/lang/String;", "getValue", "getValue$annotations", "Companion", "$serializer", "Algorithm", "ChecksumValidationException", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class Checksum {
    private final com.revenuecat.purchases.models.Checksum.Algorithm algorithm;
    private final java.lang.String value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.models.Checksum.Companion INSTANCE = new com.revenuecat.purchases.models.Checksum.Companion(null);
    private static final kotlinx.serialization.KSerializer[] $childSerializers = {com.revenuecat.purchases.models.Checksum.Algorithm.INSTANCE.serializer(), null};

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/revenuecat/purchases/models/Checksum$Algorithm;", "", "algorithmName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getAlgorithmName", "()Ljava/lang/String;", "SHA256", "SHA384", "SHA512", "MD5", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public enum Algorithm {
        SHA256("SHA-256"),
        SHA384("SHA-384"),
        SHA512("SHA-512"),
        MD5("MD5");

        private final java.lang.String algorithmName;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.revenuecat.purchases.models.Checksum.Algorithm.Companion INSTANCE = new com.revenuecat.purchases.models.Checksum.Algorithm.Companion(null);
        private static final p070h6.h $cachedSerializer$delegate = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, com.revenuecat.purchases.models.Checksum.Algorithm.Companion.AnonymousClass1.INSTANCE);

        @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0001¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/models/Checksum$Algorithm$Companion;", "", "()V", "fromString", "Lcom/revenuecat/purchases/models/Checksum$Algorithm;", "value", "", "serializer", "Lkotlinx/serialization/KSerializer;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {

            /* JADX INFO: renamed from: com.revenuecat.purchases.models.Checksum$Algorithm$Companion$1, reason: invalid class name */
            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
                public static final com.revenuecat.purchases.models.Checksum.Algorithm.Companion.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.models.Checksum.Algorithm.Companion.AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final kotlinx.serialization.KSerializer invoke() {
                    return p153r8.AbstractC2686a0.e("com.revenuecat.purchases.models.Checksum.Algorithm", com.revenuecat.purchases.models.Checksum.Algorithm.values(), new java.lang.String[]{com.revenuecat.purchases.common.verification.SigningManager.POST_PARAMS_ALGORITHM, "sha384", "sha512", "md5"}, new java.lang.annotation.Annotation[][]{null, null, null, null});
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }

            private final /* synthetic */ kotlinx.serialization.KSerializer get$cachedSerializer() {
                return (kotlinx.serialization.KSerializer) com.revenuecat.purchases.models.Checksum.Algorithm.$cachedSerializer$delegate.getValue();
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            public final com.revenuecat.purchases.models.Checksum.Algorithm fromString(java.lang.String value) {
                kotlin.jvm.internal.m.e(value, "value");
                java.lang.String lowerCase = value.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                switch (lowerCase.hashCode()) {
                    case -903629273:
                        if (lowerCase.equals(com.revenuecat.purchases.common.verification.SigningManager.POST_PARAMS_ALGORITHM)) {
                            return com.revenuecat.purchases.models.Checksum.Algorithm.SHA256;
                        }
                        return null;
                    case -903628221:
                        if (lowerCase.equals("sha384")) {
                            return com.revenuecat.purchases.models.Checksum.Algorithm.SHA384;
                        }
                        return null;
                    case -903626518:
                        if (lowerCase.equals("sha512")) {
                            return com.revenuecat.purchases.models.Checksum.Algorithm.SHA512;
                        }
                        return null;
                    case 107902:
                        if (lowerCase.equals("md5")) {
                            return com.revenuecat.purchases.models.Checksum.Algorithm.MD5;
                        }
                        return null;
                    default:
                        return null;
                }
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }

        Algorithm(java.lang.String str) {
            this.algorithmName = str;
        }

        public final java.lang.String getAlgorithmName() {
            return this.algorithmName;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revenuecat/purchases/models/Checksum$ChecksumValidationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class ChecksumValidationException extends java.lang.Exception {
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nHÆ\u0001¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/models/Checksum$Companion;", "", "()V", "generate", "Lcom/revenuecat/purchases/models/Checksum;", "data", "", "algorithm", "Lcom/revenuecat/purchases/models/Checksum$Algorithm;", "serializer", "Lkotlinx/serialization/KSerializer;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final com.revenuecat.purchases.models.Checksum generate(byte[] data, com.revenuecat.purchases.models.Checksum.Algorithm algorithm) {
            kotlin.jvm.internal.m.e(data, "data");
            kotlin.jvm.internal.m.e(algorithm, "algorithm");
            byte[] hash = java.security.MessageDigest.getInstance(algorithm.getAlgorithmName()).digest(data);
            kotlin.jvm.internal.m.d(hash, "hash");
            return new com.revenuecat.purchases.models.Checksum(algorithm, com.revenuecat.purchases.models.ChecksumKt.toHexString(hash));
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.models.Checksum$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @p070h6.c
    public /* synthetic */ Checksum(int i3, @p119n8.h("algo") com.revenuecat.purchases.models.Checksum.Algorithm algorithm, @p119n8.h("value") java.lang.String str, p153r8.k0 k0Var) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, com.revenuecat.purchases.models.Checksum$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.algorithm = algorithm;
        this.value = str;
    }

    public static /* synthetic */ com.revenuecat.purchases.models.Checksum copy$default(com.revenuecat.purchases.models.Checksum checksum, com.revenuecat.purchases.models.Checksum.Algorithm algorithm, java.lang.String str, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            algorithm = checksum.algorithm;
        }
        if ((i3 & 2) != 0) {
            str = checksum.value;
        }
        return checksum.copy(algorithm, str);
    }

    @p119n8.h("algo")
    public static /* synthetic */ void getAlgorithm$annotations() {
    }

    @p119n8.h("value")
    public static /* synthetic */ void getValue$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.models.Checksum self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.h(serialDesc, 0, $childSerializers[0], self.algorithm);
        output.s(serialDesc, 1, self.value);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final com.revenuecat.purchases.models.Checksum.Algorithm getAlgorithm() {
        return this.algorithm;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    public final com.revenuecat.purchases.models.Checksum copy(com.revenuecat.purchases.models.Checksum.Algorithm algorithm, java.lang.String value) {
        kotlin.jvm.internal.m.e(algorithm, "algorithm");
        kotlin.jvm.internal.m.e(value, "value");
        return new com.revenuecat.purchases.models.Checksum(algorithm, value);
    }

    public boolean equals(java.lang.Object other) {
        if (!(other instanceof com.revenuecat.purchases.models.Checksum)) {
            return false;
        }
        java.lang.String str = this.value;
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        com.revenuecat.purchases.models.Checksum checksum = (com.revenuecat.purchases.models.Checksum) other;
        java.lang.String lowerCase2 = checksum.value.toLowerCase(locale);
        kotlin.jvm.internal.m.d(lowerCase2, "toLowerCase(...)");
        return lowerCase.equals(lowerCase2) && this.algorithm == checksum.algorithm;
    }

    public final com.revenuecat.purchases.models.Checksum.Algorithm getAlgorithm() {
        return this.algorithm;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.algorithm.hashCode() * 31);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Checksum(algorithm=");
        sb.append(this.algorithm);
        sb.append(", value=");
        return Y6.f.l(sb, this.value, ')');
    }

    public Checksum(com.revenuecat.purchases.models.Checksum.Algorithm algorithm, java.lang.String value) {
        kotlin.jvm.internal.m.e(algorithm, "algorithm");
        kotlin.jvm.internal.m.e(value, "value");
        this.algorithm = algorithm;
        this.value = value;
    }
}
