package com.revenuecat.purchases;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.common.CustomerInfoFactory;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/revenuecat/purchases/SubscriptionInfo;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CustomerInfo$subscriptionsByProductIdentifier$2 extends o implements Function0 {
    final CustomerInfo this$0;

    public CustomerInfo$subscriptionsByProductIdentifier$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    @Override
    public final Map<String, SubscriptionInfo> invoke() {
        CustomerInfoFactory customerInfoFactory = CustomerInfoFactory.INSTANCE;
        JSONObject subscriberJSONObject = this.this$0.subscriberJSONObject;
        m.d(subscriberJSONObject, "subscriberJSONObject");
        return customerInfoFactory.parseSubscriptionInfos(subscriberJSONObject, this.this$0.getRequestDate());
    }
}
