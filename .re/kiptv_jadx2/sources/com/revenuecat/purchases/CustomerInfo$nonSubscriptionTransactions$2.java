package com.revenuecat.purchases;

import androidx.media3.container.NalUnitUtil;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.models.Transaction;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/revenuecat/purchases/models/Transaction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CustomerInfo$nonSubscriptionTransactions$2 extends o implements Function0 {
    final CustomerInfo this$0;

    public CustomerInfo$nonSubscriptionTransactions$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    @Override
    public final List<Transaction> invoke() throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.this$0.subscriberJSONObject.getJSONObject(CustomerInfoResponseJsonKeys.NON_SUBSCRIPTIONS);
        Iterator<String> itKeys = jSONObject.keys();
        m.d(itKeys, "nonSubscriptions.keys()");
        while (itKeys.hasNext()) {
            String productId = itKeys.next();
            JSONArray jSONArray = jSONObject.getJSONArray(productId);
            int length = jSONArray.length();
            for (int i3 = 0; i3 < length; i3++) {
                JSONObject transactionJSONObject = jSONArray.getJSONObject(i3);
                m.d(productId, "productId");
                m.d(transactionJSONObject, "transactionJSONObject");
                arrayList.add(new Transaction(productId, transactionJSONObject, null, 4, null));
            }
        }
        return p078i6.o.I1(arrayList, new Comparator() {
            @Override
            public final int compare(T t9, T t10) {
                return q0.o(((Transaction) t9).getPurchaseDate(), ((Transaction) t10).getPurchaseDate());
            }
        });
    }
}
