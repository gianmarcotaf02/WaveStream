package com.revenuecat.purchases.amazon;

import B2.a;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.common.LogIntent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AmazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1 extends o implements Function0 {
    final LogIntent $intent;
    final JSONObject $response$inlined;

    public AmazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1(LogIntent logIntent, JSONObject jSONObject) {
        super(0);
        this.$intent = logIntent;
        this.$response$inlined = jSONObject;
    }

    @Override
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(p078i6.o.o1(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return a.p(new Object[]{this.$response$inlined.toString()}, 1, AmazonStrings.RECEIPT_DATA_RECEIVED, sb);
    }
}
