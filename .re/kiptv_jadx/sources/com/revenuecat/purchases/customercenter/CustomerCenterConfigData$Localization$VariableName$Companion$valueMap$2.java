package com.revenuecat.purchases.customercenter;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CustomerCenterConfigData$Localization$VariableName$Companion$valueMap$2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    public static final com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$VariableName$Companion$valueMap$2 INSTANCE = new com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$VariableName$Companion$valueMap$2();

    public CustomerCenterConfigData$Localization$VariableName$Companion$valueMap$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.util.Map<java.lang.String, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.VariableName> invoke() {
        com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.VariableName[] variableNameArrValues = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.VariableName.values();
        int iI0 = p078i6.D.I0(variableNameArrValues.length);
        if (iI0 < 16) {
            iI0 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(iI0);
        for (com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.VariableName variableName : variableNameArrValues) {
            linkedHashMap.put(variableName.getIdentifier(), variableName);
        }
        return linkedHashMap;
    }
}
