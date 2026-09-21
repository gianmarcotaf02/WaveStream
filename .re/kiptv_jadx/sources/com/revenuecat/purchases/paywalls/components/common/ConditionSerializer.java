package com.revenuecat.purchases.paywalls.components.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer;", "Lcom/revenuecat/purchases/utils/serializers/SealedDeserializerWithDefault;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ConditionSerializer extends com.revenuecat.purchases.utils.serializers.SealedDeserializerWithDefault<com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition> {
    public static final com.revenuecat.purchases.paywalls.components.common.ConditionSerializer INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ConditionSerializer();

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Compact;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        public static final com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final kotlinx.serialization.KSerializer invoke() {
            return com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Compact.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer$10, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$SelectedPackage;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass10 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        public static final com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass10 INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass10();

        public AnonymousClass10() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final kotlinx.serialization.KSerializer invoke() {
            return com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.SelectedPackage.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer$11, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Variable;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass11 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        public static final com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass11 INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass11();

        public AnonymousClass11() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final kotlinx.serialization.KSerializer invoke() {
            return com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Variable.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer$12, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$State;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass12 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        public static final com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass12 INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass12();

        public AnonymousClass12() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final kotlinx.serialization.KSerializer invoke() {
            return com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.State.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer$13, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass13 extends kotlin.jvm.internal.o implements p194x6.j {
        public static final com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass13 INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass13();

        public AnonymousClass13() {
            super(1);
        }

        @Override // p194x6.j
        public final com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition invoke(java.lang.String it) {
            kotlin.jvm.internal.m.e(it, "it");
            return com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Unsupported.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer$2, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Medium;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        public static final com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass2 INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final kotlinx.serialization.KSerializer invoke() {
            return com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Medium.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer$3, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Expanded;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass3 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        public static final com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass3 INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final kotlinx.serialization.KSerializer invoke() {
            return com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Expanded.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer$4, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOffer;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass4 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        public static final com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass4 INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass4();

        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final kotlinx.serialization.KSerializer invoke() {
            return com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.IntroOffer.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer$5, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOfferRule;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass5 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        public static final com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass5 INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass5();

        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final kotlinx.serialization.KSerializer invoke() {
            return com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.IntroOfferRule.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer$6, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$MultiplePhaseOffers;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass6 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        public static final com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass6 INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass6();

        public AnonymousClass6() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final kotlinx.serialization.KSerializer invoke() {
            return com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.MultiplePhaseOffers.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer$7, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Selected;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass7 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        public static final com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass7 INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass7();

        public AnonymousClass7() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final kotlinx.serialization.KSerializer invoke() {
            return com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Selected.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer$8, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOffer;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass8 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        public static final com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass8 INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass8();

        public AnonymousClass8() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final kotlinx.serialization.KSerializer invoke() {
            return com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.PromoOffer.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer$9, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOfferRule;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass9 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        public static final com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass9 INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass9();

        public AnonymousClass9() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final kotlinx.serialization.KSerializer invoke() {
            return com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.PromoOfferRule.INSTANCE.serializer();
        }
    }

    private ConditionSerializer() {
        super("Condition", p078i6.C.N0(new p070h6.k("compact", com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass1.INSTANCE), new p070h6.k("medium", com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass2.INSTANCE), new p070h6.k("expanded", com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass3.INSTANCE), new p070h6.k("intro_offer", com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass4.INSTANCE), new p070h6.k("intro_offer_condition", com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass5.INSTANCE), new p070h6.k("multiple_intro_offers", com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass6.INSTANCE), new p070h6.k("selected", com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass7.INSTANCE), new p070h6.k("promo_offer", com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass8.INSTANCE), new p070h6.k("promo_offer_condition", com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass9.INSTANCE), new p070h6.k("selected_package_condition", com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass10.INSTANCE), new p070h6.k("variable_condition", com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass11.INSTANCE), new p070h6.k("state_condition", com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass12.INSTANCE)), com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.AnonymousClass13.INSTANCE, null, 8, null);
    }
}
