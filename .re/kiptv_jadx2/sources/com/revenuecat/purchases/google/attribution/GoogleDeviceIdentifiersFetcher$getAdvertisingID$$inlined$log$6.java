package com.revenuecat.purchases.google.attribution;

import B2.a;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.AttributionStrings;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6 extends o implements Function0 {
    final NullPointerException $e$inlined;
    final LogIntent $intent;

    public GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6(LogIntent logIntent, NullPointerException nullPointerException) {
        super(0);
        this.$intent = logIntent;
        this.$e$inlined = nullPointerException;
    }

    @Override
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(p078i6.o.o1(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return a.p(new Object[]{this.$e$inlined.getLocalizedMessage()}, 1, AttributionStrings.NULL_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, sb);
    }
}
