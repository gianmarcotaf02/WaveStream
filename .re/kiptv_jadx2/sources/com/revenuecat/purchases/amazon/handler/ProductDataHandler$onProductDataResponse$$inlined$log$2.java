package com.revenuecat.purchases.amazon.handler;

import androidx.media3.container.NalUnitUtil;
import com.amazon.device.iap.model.ProductDataResponse;
import com.revenuecat.purchases.amazon.AmazonStrings;
import com.revenuecat.purchases.common.LogIntent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ProductDataHandler$onProductDataResponse$$inlined$log$2 extends o implements Function0 {
    final LogIntent $intent;
    final ProductDataResponse $response$inlined;

    public ProductDataHandler$onProductDataResponse$$inlined$log$2(LogIntent logIntent, ProductDataResponse productDataResponse) {
        super(0);
        this.$intent = logIntent;
        this.$response$inlined = productDataResponse;
    }

    @Override
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(p078i6.o.o1(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return B2.a.p(new Object[]{this.$response$inlined.getUnavailableSkus()}, 1, AmazonStrings.PRODUCTS_REQUEST_UNAVAILABLE, sb);
    }
}
