package com.revenuecat.purchases.customercenter.events;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;", "", "(Ljava/lang/String;I)V", "FULL_SCREEN", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public enum CustomerCenterDisplayMode {
    FULL_SCREEN;


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.customercenter.events.CustomerCenterDisplayMode.Companion INSTANCE = new com.revenuecat.purchases.customercenter.events.CustomerCenterDisplayMode.Companion(null);
    private static final p070h6.h $cachedSerializer$delegate = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, com.revenuecat.purchases.customercenter.events.CustomerCenterDisplayMode.Companion.AnonymousClass1.INSTANCE);

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {

        /* JADX INFO: renamed from: com.revenuecat.purchases.customercenter.events.CustomerCenterDisplayMode$Companion$1, reason: invalid class name */
        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
            public static final com.revenuecat.purchases.customercenter.events.CustomerCenterDisplayMode.Companion.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.customercenter.events.CustomerCenterDisplayMode.Companion.AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlinx.serialization.KSerializer invoke() {
                return p153r8.AbstractC2686a0.e("com.revenuecat.purchases.customercenter.events.CustomerCenterDisplayMode", com.revenuecat.purchases.customercenter.events.CustomerCenterDisplayMode.values(), new java.lang.String[]{"full_screen"}, new java.lang.annotation.Annotation[][]{null});
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        private final /* synthetic */ kotlinx.serialization.KSerializer get$cachedSerializer() {
            return (kotlinx.serialization.KSerializer) com.revenuecat.purchases.customercenter.events.CustomerCenterDisplayMode.$cachedSerializer$delegate.getValue();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
