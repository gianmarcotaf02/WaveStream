package com.revenuecat.purchases;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreReplacementMode;
import com.revenuecat.purchases.strings.PurchaseStrings;
import io.ktor.sse.ServerSentEventKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PurchasesOrchestrator$startProductChange$$inlined$log$1 extends o implements Function0 {
    final LogIntent $intent;
    final String $oldProductId$inlined;
    final PresentedOfferingContext $presentedOfferingContext$inlined;
    final PurchasingData $purchasingData$inlined;
    final StoreReplacementMode $replacementMode$inlined;

    public PurchasesOrchestrator$startProductChange$$inlined$log$1(LogIntent logIntent, PurchasingData purchasingData, PresentedOfferingContext presentedOfferingContext, String str, StoreReplacementMode storeReplacementMode) {
        super(0);
        this.$intent = logIntent;
        this.$purchasingData$inlined = purchasingData;
        this.$presentedOfferingContext$inlined = presentedOfferingContext;
        this.$oldProductId$inlined = str;
        this.$replacementMode$inlined = storeReplacementMode;
    }

    @Override
    public final String invoke() {
        String offeringIdentifier;
        StringBuilder sb = new StringBuilder();
        sb.append(p078i6.o.o1(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        StringBuilder sb2 = new StringBuilder(ServerSentEventKt.SPACE);
        sb2.append(this.$purchasingData$inlined);
        sb2.append(' ');
        PresentedOfferingContext presentedOfferingContext = this.$presentedOfferingContext$inlined;
        sb2.append((presentedOfferingContext == null || (offeringIdentifier = presentedOfferingContext.getOfferingIdentifier()) == null) ? null : PurchaseStrings.OFFERING.concat(offeringIdentifier));
        sb2.append(" oldProductId: ");
        sb2.append(this.$oldProductId$inlined);
        sb2.append(" replacementMode ");
        sb2.append(this.$replacementMode$inlined);
        return B2.a.p(new Object[]{sb2.toString()}, 1, PurchaseStrings.PRODUCT_CHANGE_STARTED, sb);
    }
}
