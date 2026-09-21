package com.revenuecat.purchases.google;

import Y2.C1040j;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.BillingStrings;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class BillingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1 extends o implements Function0 {
    final C1040j $billingResult$inlined;
    final LogIntent $intent;

    public BillingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1(LogIntent logIntent, C1040j c1040j) {
        super(0);
        this.$intent = logIntent;
        this.$billingResult$inlined = c1040j;
    }

    @Override
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(p078i6.o.o1(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        C1040j billingResult = this.$billingResult$inlined;
        m.d(billingResult, "billingResult");
        return B2.a.p(new Object[]{BillingResultExtensionsBillingIndependentKt.toHumanReadableDescription(this.$billingResult$inlined)}, 1, BillingStrings.BILLING_INTENT_FAILED, sb);
    }
}
