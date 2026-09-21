package com.revenuecat.purchases.google.usecase;

import Y2.x;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.OfferingStrings;
import java.util.AbstractCollection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class QueryProductDetailsUseCase$onOk$$inlined$log$2 extends o implements Function0 {
    final LogIntent $intent;
    final x $received$inlined;

    public QueryProductDetailsUseCase$onOk$$inlined$log$2(LogIntent logIntent, x xVar) {
        super(0);
        this.$intent = logIntent;
        this.$received$inlined = xVar;
    }

    @Override
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(p078i6.o.o1(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        AbstractCollection abstractCollection = this.$received$inlined.f11516a;
        m.d(abstractCollection, "received.productDetailsList");
        return B2.a.p(new Object[]{p078i6.o.o1(abstractCollection, null, null, null, QueryProductDetailsUseCase$onOk$2$1.INSTANCE, 31)}, 1, OfferingStrings.RETRIEVED_PRODUCTS, sb);
    }
}
