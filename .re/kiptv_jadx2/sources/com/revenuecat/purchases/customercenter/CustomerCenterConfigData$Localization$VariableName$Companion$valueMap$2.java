package com.revenuecat.purchases.customercenter;

import androidx.media3.container.NalUnitUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;
import p078i6.D;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CustomerCenterConfigData$Localization$VariableName$Companion$valueMap$2 extends o implements Function0 {
    public static final CustomerCenterConfigData$Localization$VariableName$Companion$valueMap$2 INSTANCE = new CustomerCenterConfigData$Localization$VariableName$Companion$valueMap$2();

    public CustomerCenterConfigData$Localization$VariableName$Companion$valueMap$2() {
        super(0);
    }

    @Override
    public final Map<String, CustomerCenterConfigData.Localization.VariableName> invoke() {
        CustomerCenterConfigData.Localization.VariableName[] variableNameArrValues = CustomerCenterConfigData.Localization.VariableName.values();
        int iI0 = D.I0(variableNameArrValues.length);
        if (iI0 < 16) {
            iI0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iI0);
        for (CustomerCenterConfigData.Localization.VariableName variableName : variableNameArrValues) {
            linkedHashMap.put(variableName.getIdentifier(), variableName);
        }
        return linkedHashMap;
    }
}
