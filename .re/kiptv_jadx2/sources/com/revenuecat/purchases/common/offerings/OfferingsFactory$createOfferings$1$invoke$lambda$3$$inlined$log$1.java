package com.revenuecat.purchases.common.offerings;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.OfferingStrings;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class OfferingsFactory$createOfferings$1$invoke$lambda$3$$inlined$log$1 extends o implements Function0 {
    final LogIntent $intent;
    final boolean $isTestStore$inlined;
    final Set $missingProducts$inlined;

    public OfferingsFactory$createOfferings$1$invoke$lambda$3$$inlined$log$1(LogIntent logIntent, boolean z6, Set set) {
        super(0);
        this.$intent = logIntent;
        this.$isTestStore$inlined = z6;
        this.$missingProducts$inlined = set;
    }

    @Override
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(p078i6.o.o1(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return B2.a.p(new Object[]{p078i6.o.o1(this.$missingProducts$inlined, ", ", null, null, null, 62)}, 1, this.$isTestStore$inlined ? OfferingStrings.CANNOT_FIND_PRODUCT_CONFIGURATION_ERROR_TEST_STORE : OfferingStrings.CANNOT_FIND_PRODUCT_CONFIGURATION_ERROR, sb);
    }
}
