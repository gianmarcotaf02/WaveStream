package com.revenuecat.purchases.simulatedstore;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J,\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\t2\u0006\u0010\f\u001a\u00020\rH\u0014¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/simulatedstore/SimulatedStoreOfferingParser;", "Lcom/revenuecat/purchases/common/OfferingParser;", "shouldParsePaywallComponents", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "findMatchingProduct", "Lcom/revenuecat/purchases/models/StoreProduct;", "productsById", "", "", "", "packageJson", "Lorg/json/JSONObject;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SimulatedStoreOfferingParser extends com.revenuecat.purchases.common.OfferingParser {

    /* JADX INFO: renamed from: com.revenuecat.purchases.simulatedstore.SimulatedStoreOfferingParser$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        public static final com.revenuecat.purchases.simulatedstore.SimulatedStoreOfferingParser.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.simulatedstore.SimulatedStoreOfferingParser.AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Boolean invoke() {
            return java.lang.Boolean.TRUE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimulatedStoreOfferingParser() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.revenuecat.purchases.common.OfferingParser
    public com.revenuecat.purchases.models.StoreProduct findMatchingProduct(java.util.Map<java.lang.String, ? extends java.util.List<? extends com.revenuecat.purchases.models.StoreProduct>> productsById, org.json.JSONObject packageJson) {
        kotlin.jvm.internal.m.e(productsById, "productsById");
        kotlin.jvm.internal.m.e(packageJson, "packageJson");
        java.util.List<? extends com.revenuecat.purchases.models.StoreProduct> list = productsById.get(packageJson.getString("platform_product_identifier"));
        if (list != null) {
            return (com.revenuecat.purchases.models.StoreProduct) p078i6.o.h1(list);
        }
        return null;
    }

    public /* synthetic */ SimulatedStoreOfferingParser(kotlin.jvm.functions.Function0 function0, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? com.revenuecat.purchases.simulatedstore.SimulatedStoreOfferingParser.AnonymousClass1.INSTANCE : function0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimulatedStoreOfferingParser(kotlin.jvm.functions.Function0 shouldParsePaywallComponents) {
        super(shouldParsePaywallComponents);
        kotlin.jvm.internal.m.e(shouldParsePaywallComponents, "shouldParsePaywallComponents");
    }
}
