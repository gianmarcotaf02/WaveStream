package com.revenuecat.purchases.paywalls.components.properties;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "", "Companion", "Fill", "Fit", "Fixed", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i(with = com.revenuecat.purchases.paywalls.components.properties.SizeConstraintDeserializer.class)
public interface SizeConstraint {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Companion INSTANCE = com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        static final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Companion $$INSTANCE = new com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Companion();

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.paywalls.components.properties.SizeConstraintDeserializer.INSTANCE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final class Fill implements com.revenuecat.purchases.paywalls.components.properties.SizeConstraint {
        public static final com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fill INSTANCE = new com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fill();
        private static final /* synthetic */ p070h6.h $cachedSerializer$delegate = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fill.AnonymousClass1.INSTANCE);

        /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.properties.SizeConstraint$Fill$1, reason: invalid class name */
        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
            public static final com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fill.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fill.AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlinx.serialization.KSerializer invoke() {
                return new p153r8.C2714z("com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fill", com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fill.INSTANCE, new java.lang.annotation.Annotation[0]);
            }
        }

        private Fill() {
        }

        private final /* synthetic */ kotlinx.serialization.KSerializer get$cachedSerializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return get$cachedSerializer();
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u0019B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "Lh6/t;", "default", "<init>", "(Lh6/t;Lkotlin/jvm/internal/f;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILh6/t;Lr8/k0;Lkotlin/jvm/internal/f;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lh6/t;", "getDefault-0hXNFcg", "()Lh6/t;", "getDefault-0hXNFcg$annotations", "()V", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final class Fit implements com.revenuecat.purchases.paywalls.components.properties.SizeConstraint {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fit.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fit.Companion(null);
        private final p070h6.t default;

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return com.revenuecat.purchases.paywalls.components.properties.SizeConstraint$Fit$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @p070h6.c
        public /* synthetic */ Fit(int i3, @p119n8.h("default") p070h6.t tVar, p153r8.k0 k0Var, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this(i3, tVar, k0Var);
        }

        @p119n8.h("default")
        /* JADX INFO: renamed from: getDefault-0hXNFcg$annotations, reason: not valid java name */
        public static /* synthetic */ void m271getDefault0hXNFcg$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fit self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            if (!output.E(serialDesc) && self.default == null) {
                return;
            }
            output.t(serialDesc, 0, p153r8.w0.f27015a, self.default);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fit) && kotlin.jvm.internal.m.a(this.default, ((com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fit) obj).default);
        }

        /* JADX INFO: renamed from: getDefault-0hXNFcg, reason: not valid java name and from getter */
        public final /* synthetic */ p070h6.t getDefault() {
            return this.default;
        }

        public int hashCode() {
            p070h6.t tVar = this.default;
            if (tVar == null) {
                return 0;
            }
            return java.lang.Integer.hashCode(tVar.f22551h);
        }

        public java.lang.String toString() {
            return "Fit(default=" + this.default + ')';
        }

        public /* synthetic */ Fit(p070h6.t tVar, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this(tVar);
        }

        private Fit(int i3, p070h6.t tVar, p153r8.k0 k0Var) {
            if ((i3 & 1) == 0) {
                this.default = null;
            } else {
                this.default = tVar;
            }
        }

        private Fit(p070h6.t tVar) {
            this.default = tVar;
        }

        public /* synthetic */ Fit(p070h6.t tVar, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this((i3 & 1) != 0 ? null : tVar, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "Lh6/t;", "value", "<init>", "(ILkotlin/jvm/internal/f;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILh6/t;Lr8/k0;Lkotlin/jvm/internal/f;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getValue-pVg5ArA", "()I", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final class Fixed implements com.revenuecat.purchases.paywalls.components.properties.SizeConstraint {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fixed.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fixed.Companion(null);
        private final int value;

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return com.revenuecat.purchases.paywalls.components.properties.SizeConstraint$Fixed$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @p070h6.c
        public /* synthetic */ Fixed(int i3, p070h6.t tVar, p153r8.k0 k0Var, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this(i3, tVar, k0Var);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fixed) && this.value == ((com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fixed) obj).value;
        }

        /* JADX INFO: renamed from: getValue-pVg5ArA, reason: not valid java name and from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value;
        }

        public java.lang.String toString() {
            return "Fixed(value=" + ((java.lang.Object) p070h6.t.a(this.value)) + ')';
        }

        public /* synthetic */ Fixed(int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this(i3);
        }

        private Fixed(int i3) {
            this.value = i3;
        }

        private Fixed(int i3, p070h6.t tVar, p153r8.k0 k0Var) {
            if (1 == (i3 & 1)) {
                this.value = tVar.f22551h;
            } else {
                p153r8.AbstractC2686a0.l(i3, 1, com.revenuecat.purchases.paywalls.components.properties.SizeConstraint$Fixed$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }
    }
}
