package com.revenuecat.purchases.paywalls.components.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 !*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0005\"#!$%B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tB5\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJB\u0010\u001a\u001a\u00020\u0017\"\u0004\b\u0001\u0010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006&"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "T", "", "", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "conditions", com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.PROPERTIES_KEY, "<init>", "(Ljava/util/List;Lcom/revenuecat/purchases/paywalls/components/PartialComponent;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/revenuecat/purchases/paywalls/components/PartialComponent;Lr8/k0;)V", "T0", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/KSerializer;)V", "write$Self", "Ljava/util/List;", "getConditions", "()Ljava/util/List;", "Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "getProperties", "()Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "Companion", "$serializer", "ArrayOperator", "Condition", "EqualityOperator", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class ComponentOverride<T extends com.revenuecat.purchases.paywalls.components.PartialComponent> {
    private static final kotlinx.serialization.descriptors.SerialDescriptor $cachedDescriptor;
    private final java.util.List<com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition> conditions;
    private final T properties;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Companion(null);
    private static final kotlinx.serialization.KSerializer[] $childSerializers = {new p153r8.C2691d(com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.INSTANCE, 0), null};

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator;", "", "(Ljava/lang/String;I)V", androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.SNAP_TYPE_IN, "NOT_IN", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public enum ArrayOperator {
        IN,
        NOT_IN;


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.ArrayOperator.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.ArrayOperator.Companion(null);
        private static final p070h6.h $cachedSerializer$delegate = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, com.revenuecat.purchases.paywalls.components.common.ComponentOverride.ArrayOperator.Companion.AnonymousClass1.INSTANCE);

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ComponentOverride$ArrayOperator$Companion$1, reason: invalid class name */
            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
                public static final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.ArrayOperator.Companion.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.ArrayOperator.Companion.AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final kotlinx.serialization.KSerializer invoke() {
                    return p153r8.AbstractC2686a0.e("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.ArrayOperator", com.revenuecat.purchases.paywalls.components.common.ComponentOverride.ArrayOperator.values(), new java.lang.String[]{"in", "not in"}, new java.lang.annotation.Annotation[][]{null, null});
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }

            private final /* synthetic */ kotlinx.serialization.KSerializer get$cachedSerializer() {
                return (kotlinx.serialization.KSerializer) com.revenuecat.purchases.paywalls.components.common.ComponentOverride.ArrayOperator.$cachedSerializer$delegate.getValue();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00050\u0004\"\u0004\b\u0001\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0004HÆ\u0001¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "T0", "typeSerial0", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final <T0> kotlinx.serialization.KSerializer serializer(kotlinx.serialization.KSerializer typeSerial0) {
            kotlin.jvm.internal.m.e(typeSerial0, "typeSerial0");
            return new com.revenuecat.purchases.paywalls.components.common.ComponentOverride$$serializer(typeSerial0);
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "", "(Ljava/lang/String;I)V", "EQUALS", "NOT_EQUALS", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public enum EqualityOperator {
        EQUALS,
        NOT_EQUALS;


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator.Companion(null);
        private static final p070h6.h $cachedSerializer$delegate = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator.Companion.AnonymousClass1.INSTANCE);

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ComponentOverride$EqualityOperator$Companion$1, reason: invalid class name */
            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
                public static final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator.Companion.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator.Companion.AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final kotlinx.serialization.KSerializer invoke() {
                    return p153r8.AbstractC2686a0.e("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator", com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator.values(), new java.lang.String[]{"=", "!="}, new java.lang.annotation.Annotation[][]{null, null});
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }

            private final /* synthetic */ kotlinx.serialization.KSerializer get$cachedSerializer() {
                return (kotlinx.serialization.KSerializer) com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator.$cachedSerializer$delegate.getValue();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }
    }

    static {
        p153r8.C2690c0 c2690c0 = new p153r8.C2690c0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride", null, 2);
        c2690c0.k("conditions", false);
        c2690c0.k(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.PROPERTIES_KEY, false);
        $cachedDescriptor = c2690c0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p070h6.c
    public /* synthetic */ ComponentOverride(int i3, java.util.List list, com.revenuecat.purchases.paywalls.components.PartialComponent partialComponent, p153r8.k0 k0Var) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, $cachedDescriptor);
            throw null;
        }
        this.conditions = list;
        this.properties = partialComponent;
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.common.ComponentOverride self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc, kotlinx.serialization.KSerializer typeSerial0) {
        output.h(serialDesc, 0, $childSerializers[0], self.conditions);
        output.h(serialDesc, 1, typeSerial0, self.properties);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.paywalls.components.common.ComponentOverride)) {
            return false;
        }
        com.revenuecat.purchases.paywalls.components.common.ComponentOverride componentOverride = (com.revenuecat.purchases.paywalls.components.common.ComponentOverride) obj;
        return kotlin.jvm.internal.m.a(this.conditions, componentOverride.conditions) && kotlin.jvm.internal.m.a(this.properties, componentOverride.properties);
    }

    public final /* synthetic */ java.util.List getConditions() {
        return this.conditions;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.PartialComponent getProperties() {
        return this.properties;
    }

    public int hashCode() {
        return this.properties.hashCode() + (this.conditions.hashCode() * 31);
    }

    public java.lang.String toString() {
        return "ComponentOverride(conditions=" + this.conditions + ", properties=" + this.properties + ')';
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \b2\u00020\u0001:\u000e\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014R\u001a\u0010\u0002\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0006\u0082\u0001\r\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\"À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "", "isRule", "", "isRule$annotations", "()V", "()Z", "Compact", "Companion", "Expanded", "IntroOffer", "IntroOfferRule", "Medium", "MultiplePhaseOffers", "PromoOffer", "PromoOfferRule", "Selected", "SelectedPackage", "State", "Unsupported", "Variable", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Compact;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Expanded;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOffer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOfferRule;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Medium;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$MultiplePhaseOffers;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOffer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOfferRule;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Selected;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$SelectedPackage;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$State;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Unsupported;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Variable;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i(with = com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.class)
    public interface Condition {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Companion INSTANCE = com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Companion.$$INSTANCE;

        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Compact;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final class Compact implements com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition {
            public static final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Compact INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Compact();
            private static final /* synthetic */ p070h6.h $cachedSerializer$delegate = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Compact.AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$Compact$1, reason: invalid class name */
            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
                public static final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Compact.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Compact.AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final kotlinx.serialization.KSerializer invoke() {
                    return new p153r8.C2714z("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Compact", com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Compact.INSTANCE, new java.lang.annotation.Annotation[0]);
                }
            }

            private Compact() {
            }

            private final /* synthetic */ kotlinx.serialization.KSerializer get$cachedSerializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return get$cachedSerializer();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            static final /* synthetic */ com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Companion $$INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Companion();

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.INSTANCE;
            }
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class DefaultImpls {
            @java.lang.Deprecated
            public static boolean isRule(com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition condition) {
                return com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.super.isRule();
            }

            public static /* synthetic */ void isRule$annotations() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Expanded;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final class Expanded implements com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition {
            public static final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Expanded INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Expanded();
            private static final /* synthetic */ p070h6.h $cachedSerializer$delegate = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Expanded.AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$Expanded$1, reason: invalid class name */
            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
                public static final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Expanded.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Expanded.AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final kotlinx.serialization.KSerializer invoke() {
                    return new p153r8.C2714z("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Expanded", com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Expanded.INSTANCE, new java.lang.annotation.Annotation[0]);
                }
            }

            private Expanded() {
            }

            private final /* synthetic */ kotlinx.serialization.KSerializer get$cachedSerializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return get$cachedSerializer();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOffer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final class IntroOffer implements com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition {
            public static final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.IntroOffer INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.IntroOffer();
            private static final /* synthetic */ p070h6.h $cachedSerializer$delegate = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.IntroOffer.AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$IntroOffer$1, reason: invalid class name */
            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
                public static final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.IntroOffer.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.IntroOffer.AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final kotlinx.serialization.KSerializer invoke() {
                    return new p153r8.C2714z("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.IntroOffer", com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.IntroOffer.INSTANCE, new java.lang.annotation.Annotation[0]);
                }
            }

            private IntroOffer() {
            }

            private final /* synthetic */ kotlinx.serialization.KSerializer get$cachedSerializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return get$cachedSerializer();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019R\u0014\u0010)\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0019¨\u0006,"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOfferRule;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "operator", "", "value", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;Z)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;ZLr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOfferRule;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "component2", "()Z", "copy", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;Z)Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOfferRule;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "getOperator", "Z", "getValue", "isRule", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final /* data */ class IntroOfferRule implements com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition {
            private final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator operator;
            private final boolean value;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.IntroOfferRule.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.IntroOfferRule.Companion(null);
            private static final kotlinx.serialization.KSerializer[] $childSerializers = {com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator.INSTANCE.serializer(), null};

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOfferRule$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOfferRule;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                    this();
                }

                public final kotlinx.serialization.KSerializer serializer() {
                    return com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$IntroOfferRule$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @p070h6.c
            public /* synthetic */ IntroOfferRule(int i3, com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator equalityOperator, boolean z6, p153r8.k0 k0Var) {
                if (3 != (i3 & 3)) {
                    p153r8.AbstractC2686a0.l(i3, 3, com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$IntroOfferRule$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.operator = equalityOperator;
                this.value = z6;
            }

            public static /* synthetic */ com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.IntroOfferRule copy$default(com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.IntroOfferRule introOfferRule, com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator equalityOperator, boolean z6, int i3, java.lang.Object obj) {
                if ((i3 & 1) != 0) {
                    equalityOperator = introOfferRule.operator;
                }
                if ((i3 & 2) != 0) {
                    z6 = introOfferRule.value;
                }
                return introOfferRule.copy(equalityOperator, z6);
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.IntroOfferRule self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                output.h(serialDesc, 0, $childSerializers[0], self.operator);
                output.q(serialDesc, 1, self.value);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator getOperator() {
                return this.operator;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final boolean getValue() {
                return this.value;
            }

            public final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.IntroOfferRule copy(com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator operator, boolean value) {
                kotlin.jvm.internal.m.e(operator, "operator");
                return new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.IntroOfferRule(operator, value);
            }

            public boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.IntroOfferRule)) {
                    return false;
                }
                com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.IntroOfferRule introOfferRule = (com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.IntroOfferRule) other;
                return this.operator == introOfferRule.operator && this.value == introOfferRule.value;
            }

            public final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator getOperator() {
                return this.operator;
            }

            public final boolean getValue() {
                return this.value;
            }

            public int hashCode() {
                return java.lang.Boolean.hashCode(this.value) + (this.operator.hashCode() * 31);
            }

            @Override // com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition
            public boolean isRule() {
                return true;
            }

            public java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("IntroOfferRule(operator=");
                sb.append(this.operator);
                sb.append(", value=");
                return v5.L.a(sb, this.value, ')');
            }

            public IntroOfferRule(com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator operator, boolean z6) {
                kotlin.jvm.internal.m.e(operator, "operator");
                this.operator = operator;
                this.value = z6;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Medium;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final class Medium implements com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition {
            public static final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Medium INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Medium();
            private static final /* synthetic */ p070h6.h $cachedSerializer$delegate = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Medium.AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$Medium$1, reason: invalid class name */
            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
                public static final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Medium.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Medium.AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final kotlinx.serialization.KSerializer invoke() {
                    return new p153r8.C2714z("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Medium", com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Medium.INSTANCE, new java.lang.annotation.Annotation[0]);
                }
            }

            private Medium() {
            }

            private final /* synthetic */ kotlinx.serialization.KSerializer get$cachedSerializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return get$cachedSerializer();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$MultiplePhaseOffers;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final class MultiplePhaseOffers implements com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition {
            public static final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.MultiplePhaseOffers INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.MultiplePhaseOffers();
            private static final /* synthetic */ p070h6.h $cachedSerializer$delegate = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.MultiplePhaseOffers.AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$MultiplePhaseOffers$1, reason: invalid class name */
            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
                public static final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.MultiplePhaseOffers.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.MultiplePhaseOffers.AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final kotlinx.serialization.KSerializer invoke() {
                    return new p153r8.C2714z("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.MultiplePhaseOffers", com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.MultiplePhaseOffers.INSTANCE, new java.lang.annotation.Annotation[0]);
                }
            }

            private MultiplePhaseOffers() {
            }

            private final /* synthetic */ kotlinx.serialization.KSerializer get$cachedSerializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return get$cachedSerializer();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOffer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final class PromoOffer implements com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition {
            public static final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.PromoOffer INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.PromoOffer();
            private static final /* synthetic */ p070h6.h $cachedSerializer$delegate = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.PromoOffer.AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$PromoOffer$1, reason: invalid class name */
            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
                public static final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.PromoOffer.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.PromoOffer.AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final kotlinx.serialization.KSerializer invoke() {
                    return new p153r8.C2714z("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.PromoOffer", com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.PromoOffer.INSTANCE, new java.lang.annotation.Annotation[0]);
                }
            }

            private PromoOffer() {
            }

            private final /* synthetic */ kotlinx.serialization.KSerializer get$cachedSerializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return get$cachedSerializer();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019R\u0014\u0010)\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0019¨\u0006,"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOfferRule;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "operator", "", "value", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;Z)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;ZLr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOfferRule;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "component2", "()Z", "copy", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;Z)Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOfferRule;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "getOperator", "Z", "getValue", "isRule", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final /* data */ class PromoOfferRule implements com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition {
            private final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator operator;
            private final boolean value;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.PromoOfferRule.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.PromoOfferRule.Companion(null);
            private static final kotlinx.serialization.KSerializer[] $childSerializers = {com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator.INSTANCE.serializer(), null};

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOfferRule$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOfferRule;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                    this();
                }

                public final kotlinx.serialization.KSerializer serializer() {
                    return com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$PromoOfferRule$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @p070h6.c
            public /* synthetic */ PromoOfferRule(int i3, com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator equalityOperator, boolean z6, p153r8.k0 k0Var) {
                if (3 != (i3 & 3)) {
                    p153r8.AbstractC2686a0.l(i3, 3, com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$PromoOfferRule$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.operator = equalityOperator;
                this.value = z6;
            }

            public static /* synthetic */ com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.PromoOfferRule copy$default(com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.PromoOfferRule promoOfferRule, com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator equalityOperator, boolean z6, int i3, java.lang.Object obj) {
                if ((i3 & 1) != 0) {
                    equalityOperator = promoOfferRule.operator;
                }
                if ((i3 & 2) != 0) {
                    z6 = promoOfferRule.value;
                }
                return promoOfferRule.copy(equalityOperator, z6);
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.PromoOfferRule self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                output.h(serialDesc, 0, $childSerializers[0], self.operator);
                output.q(serialDesc, 1, self.value);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator getOperator() {
                return this.operator;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final boolean getValue() {
                return this.value;
            }

            public final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.PromoOfferRule copy(com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator operator, boolean value) {
                kotlin.jvm.internal.m.e(operator, "operator");
                return new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.PromoOfferRule(operator, value);
            }

            public boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.PromoOfferRule)) {
                    return false;
                }
                com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.PromoOfferRule promoOfferRule = (com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.PromoOfferRule) other;
                return this.operator == promoOfferRule.operator && this.value == promoOfferRule.value;
            }

            public final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator getOperator() {
                return this.operator;
            }

            public final boolean getValue() {
                return this.value;
            }

            public int hashCode() {
                return java.lang.Boolean.hashCode(this.value) + (this.operator.hashCode() * 31);
            }

            @Override // com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition
            public boolean isRule() {
                return true;
            }

            public java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("PromoOfferRule(operator=");
                sb.append(this.operator);
                sb.append(", value=");
                return v5.L.a(sb, this.value, ')');
            }

            public PromoOfferRule(com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator operator, boolean z6) {
                kotlin.jvm.internal.m.e(operator, "operator");
                this.operator = operator;
                this.value = z6;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Selected;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final class Selected implements com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition {
            public static final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Selected INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Selected();
            private static final /* synthetic */ p070h6.h $cachedSerializer$delegate = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Selected.AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$Selected$1, reason: invalid class name */
            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
                public static final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Selected.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Selected.AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final kotlinx.serialization.KSerializer invoke() {
                    return new p153r8.C2714z("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Selected", com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Selected.INSTANCE, new java.lang.annotation.Annotation[0]);
                }
            }

            private Selected() {
            }

            private final /* synthetic */ kotlinx.serialization.KSerializer get$cachedSerializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return get$cachedSerializer();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001aR\u0014\u0010*\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$SelectedPackage;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator;", "operator", "", "", io.sentry.protocol.SdkVersion.JsonKeys.PACKAGES, "<init>", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator;Ljava/util/List;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator;Ljava/util/List;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$SelectedPackage;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator;", "component2", "()Ljava/util/List;", "copy", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator;Ljava/util/List;)Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$SelectedPackage;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator;", "getOperator", "Ljava/util/List;", "getPackages", "isRule", "()Z", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final /* data */ class SelectedPackage implements com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition {
            private final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.ArrayOperator operator;
            private final java.util.List<java.lang.String> packages;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.SelectedPackage.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.SelectedPackage.Companion(null);
            private static final kotlinx.serialization.KSerializer[] $childSerializers = {com.revenuecat.purchases.paywalls.components.common.ComponentOverride.ArrayOperator.INSTANCE.serializer(), new p153r8.C2691d(p153r8.p0.f26988a, 0)};

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$SelectedPackage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$SelectedPackage;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                    this();
                }

                public final kotlinx.serialization.KSerializer serializer() {
                    return com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$SelectedPackage$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @p070h6.c
            public /* synthetic */ SelectedPackage(int i3, com.revenuecat.purchases.paywalls.components.common.ComponentOverride.ArrayOperator arrayOperator, java.util.List list, p153r8.k0 k0Var) {
                if (3 != (i3 & 3)) {
                    p153r8.AbstractC2686a0.l(i3, 3, com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$SelectedPackage$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.operator = arrayOperator;
                this.packages = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.SelectedPackage copy$default(com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.SelectedPackage selectedPackage, com.revenuecat.purchases.paywalls.components.common.ComponentOverride.ArrayOperator arrayOperator, java.util.List list, int i3, java.lang.Object obj) {
                if ((i3 & 1) != 0) {
                    arrayOperator = selectedPackage.operator;
                }
                if ((i3 & 2) != 0) {
                    list = selectedPackage.packages;
                }
                return selectedPackage.copy(arrayOperator, list);
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.SelectedPackage self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                kotlinx.serialization.KSerializer[] kSerializerArr = $childSerializers;
                output.h(serialDesc, 0, kSerializerArr[0], self.operator);
                output.h(serialDesc, 1, kSerializerArr[1], self.packages);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.ArrayOperator getOperator() {
                return this.operator;
            }

            public final java.util.List<java.lang.String> component2() {
                return this.packages;
            }

            public final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.SelectedPackage copy(com.revenuecat.purchases.paywalls.components.common.ComponentOverride.ArrayOperator operator, java.util.List<java.lang.String> packages) {
                kotlin.jvm.internal.m.e(operator, "operator");
                kotlin.jvm.internal.m.e(packages, "packages");
                return new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.SelectedPackage(operator, packages);
            }

            public boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.SelectedPackage)) {
                    return false;
                }
                com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.SelectedPackage selectedPackage = (com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.SelectedPackage) other;
                return this.operator == selectedPackage.operator && kotlin.jvm.internal.m.a(this.packages, selectedPackage.packages);
            }

            public final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.ArrayOperator getOperator() {
                return this.operator;
            }

            public final java.util.List<java.lang.String> getPackages() {
                return this.packages;
            }

            public int hashCode() {
                return this.packages.hashCode() + (this.operator.hashCode() * 31);
            }

            @Override // com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition
            public boolean isRule() {
                return true;
            }

            public java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectedPackage(operator=");
                sb.append(this.operator);
                sb.append(", packages=");
                return com.google.android.gms.internal.play_billing.M0.n(sb, this.packages, ')');
            }

            public SelectedPackage(com.revenuecat.purchases.paywalls.components.common.ComponentOverride.ArrayOperator operator, java.util.List<java.lang.String> packages) {
                kotlin.jvm.internal.m.e(operator, "operator");
                kotlin.jvm.internal.m.e(packages, "packages");
                this.operator = operator;
                this.packages = packages;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Unsupported;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final class Unsupported implements com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition {
            public static final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Unsupported INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Unsupported();
            private static final /* synthetic */ p070h6.h $cachedSerializer$delegate = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Unsupported.AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$Unsupported$1, reason: invalid class name */
            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
                public static final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Unsupported.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Unsupported.AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final kotlinx.serialization.KSerializer invoke() {
                    return new p153r8.C2714z("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Unsupported", com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Unsupported.INSTANCE, new java.lang.annotation.Annotation[0]);
                }
            }

            private Unsupported() {
            }

            private final /* synthetic */ kotlinx.serialization.KSerializer get$cachedSerializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return get$cachedSerializer();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001dR\u0014\u0010.\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Variable;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "operator", "", io.sentry.rrweb.RRWebVideoEvent.REPLAY_FRAME_RATE_TYPE_VARIABLE, "Lkotlinx/serialization/json/d;", "value", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;Ljava/lang/String;Lkotlinx/serialization/json/d;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;Ljava/lang/String;Lkotlinx/serialization/json/d;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Variable;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "component2", "()Ljava/lang/String;", "component3", "()Lkotlinx/serialization/json/d;", "copy", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;Ljava/lang/String;Lkotlinx/serialization/json/d;)Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Variable;", "toString", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "getOperator", "Ljava/lang/String;", "getVariable", "Lkotlinx/serialization/json/d;", "getValue", "isRule", "()Z", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final /* data */ class Variable implements com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition {
            private final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator operator;
            private final kotlinx.serialization.json.d value;
            private final java.lang.String variable;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Variable.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Variable.Companion(null);
            private static final kotlinx.serialization.KSerializer[] $childSerializers = {com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator.INSTANCE.serializer(), null, null};

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Variable$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Variable;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                    this();
                }

                public final kotlinx.serialization.KSerializer serializer() {
                    return com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$Variable$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @p070h6.c
            public /* synthetic */ Variable(int i3, com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator equalityOperator, java.lang.String str, kotlinx.serialization.json.d dVar, p153r8.k0 k0Var) {
                if (7 != (i3 & 7)) {
                    p153r8.AbstractC2686a0.l(i3, 7, com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$Variable$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.operator = equalityOperator;
                this.variable = str;
                this.value = dVar;
            }

            public static /* synthetic */ com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Variable copy$default(com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Variable variable, com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator equalityOperator, java.lang.String str, kotlinx.serialization.json.d dVar, int i3, java.lang.Object obj) {
                if ((i3 & 1) != 0) {
                    equalityOperator = variable.operator;
                }
                if ((i3 & 2) != 0) {
                    str = variable.variable;
                }
                if ((i3 & 4) != 0) {
                    dVar = variable.value;
                }
                return variable.copy(equalityOperator, str, dVar);
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Variable self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                output.h(serialDesc, 0, $childSerializers[0], self.operator);
                output.s(serialDesc, 1, self.variable);
                output.h(serialDesc, 2, p162s8.y.f27432a, self.value);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator getOperator() {
                return this.operator;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final java.lang.String getVariable() {
                return this.variable;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final kotlinx.serialization.json.d getValue() {
                return this.value;
            }

            public final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Variable copy(com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator operator, java.lang.String variable, kotlinx.serialization.json.d value) {
                kotlin.jvm.internal.m.e(operator, "operator");
                kotlin.jvm.internal.m.e(variable, "variable");
                kotlin.jvm.internal.m.e(value, "value");
                return new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Variable(operator, variable, value);
            }

            public boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Variable)) {
                    return false;
                }
                com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Variable variable = (com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Variable) other;
                return this.operator == variable.operator && kotlin.jvm.internal.m.a(this.variable, variable.variable) && kotlin.jvm.internal.m.a(this.value, variable.value);
            }

            public final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator getOperator() {
                return this.operator;
            }

            public final kotlinx.serialization.json.d getValue() {
                return this.value;
            }

            public final java.lang.String getVariable() {
                return this.variable;
            }

            public int hashCode() {
                return this.value.hashCode() + B2.a.a(this.operator.hashCode() * 31, 31, this.variable);
            }

            @Override // com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition
            public boolean isRule() {
                return true;
            }

            public java.lang.String toString() {
                return "Variable(operator=" + this.operator + ", variable=" + this.variable + ", value=" + this.value + ')';
            }

            public Variable(com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator operator, java.lang.String variable, kotlinx.serialization.json.d value) {
                kotlin.jvm.internal.m.e(operator, "operator");
                kotlin.jvm.internal.m.e(variable, "variable");
                kotlin.jvm.internal.m.e(value, "value");
                this.operator = operator;
                this.variable = variable;
                this.value = value;
            }
        }

        default boolean isRule() {
            return false;
        }

        @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001dR\u0014\u0010.\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$State;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "operator", "", "name", "Lkotlinx/serialization/json/d;", "value", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;Ljava/lang/String;Lkotlinx/serialization/json/d;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;Ljava/lang/String;Lkotlinx/serialization/json/d;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$State;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "component2", "()Ljava/lang/String;", "component3", "()Lkotlinx/serialization/json/d;", "copy", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;Ljava/lang/String;Lkotlinx/serialization/json/d;)Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$State;", "toString", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "getOperator", "Ljava/lang/String;", "getName", "Lkotlinx/serialization/json/d;", "getValue", "isRule", "()Z", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final /* data */ class State implements com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition {
            private final java.lang.String name;
            private final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator operator;
            private final kotlinx.serialization.json.d value;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.State.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.State.Companion(null);
            private static final kotlinx.serialization.KSerializer[] $childSerializers = {com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator.INSTANCE.serializer(), null, null};

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$State$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$State;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                    this();
                }

                public final kotlinx.serialization.KSerializer serializer() {
                    return com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$State$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @p070h6.c
            public /* synthetic */ State(int i3, com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator equalityOperator, java.lang.String str, kotlinx.serialization.json.d dVar, p153r8.k0 k0Var) {
                if (7 != (i3 & 7)) {
                    p153r8.AbstractC2686a0.l(i3, 7, com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$State$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.operator = equalityOperator;
                this.name = str;
                this.value = dVar;
                if (dVar instanceof kotlinx.serialization.json.JsonNull) {
                    throw new java.lang.IllegalArgumentException("State condition value must not be null");
                }
            }

            public static /* synthetic */ com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.State copy$default(com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.State state, com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator equalityOperator, java.lang.String str, kotlinx.serialization.json.d dVar, int i3, java.lang.Object obj) {
                if ((i3 & 1) != 0) {
                    equalityOperator = state.operator;
                }
                if ((i3 & 2) != 0) {
                    str = state.name;
                }
                if ((i3 & 4) != 0) {
                    dVar = state.value;
                }
                return state.copy(equalityOperator, str, dVar);
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.State self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                output.h(serialDesc, 0, $childSerializers[0], self.operator);
                output.s(serialDesc, 1, self.name);
                output.h(serialDesc, 2, p162s8.y.f27432a, self.value);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator getOperator() {
                return this.operator;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final java.lang.String getName() {
                return this.name;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final kotlinx.serialization.json.d getValue() {
                return this.value;
            }

            public final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.State copy(com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator operator, java.lang.String name, kotlinx.serialization.json.d value) {
                kotlin.jvm.internal.m.e(operator, "operator");
                kotlin.jvm.internal.m.e(name, "name");
                kotlin.jvm.internal.m.e(value, "value");
                return new com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.State(operator, name, value);
            }

            public boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.State)) {
                    return false;
                }
                com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.State state = (com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.State) other;
                return this.operator == state.operator && kotlin.jvm.internal.m.a(this.name, state.name) && kotlin.jvm.internal.m.a(this.value, state.value);
            }

            public final java.lang.String getName() {
                return this.name;
            }

            public final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator getOperator() {
                return this.operator;
            }

            public final kotlinx.serialization.json.d getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode() + B2.a.a(this.operator.hashCode() * 31, 31, this.name);
            }

            @Override // com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition
            public boolean isRule() {
                return true;
            }

            public java.lang.String toString() {
                return "State(operator=" + this.operator + ", name=" + this.name + ", value=" + this.value + ')';
            }

            public State(com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator operator, java.lang.String name, kotlinx.serialization.json.d value) {
                kotlin.jvm.internal.m.e(operator, "operator");
                kotlin.jvm.internal.m.e(name, "name");
                kotlin.jvm.internal.m.e(value, "value");
                this.operator = operator;
                this.name = name;
                this.value = value;
                if (value instanceof kotlinx.serialization.json.JsonNull) {
                    throw new java.lang.IllegalArgumentException("State condition value must not be null");
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComponentOverride(java.util.List<? extends com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition> conditions, T properties) {
        kotlin.jvm.internal.m.e(conditions, "conditions");
        kotlin.jvm.internal.m.e(properties, "properties");
        this.conditions = conditions;
        this.properties = properties;
    }
}
