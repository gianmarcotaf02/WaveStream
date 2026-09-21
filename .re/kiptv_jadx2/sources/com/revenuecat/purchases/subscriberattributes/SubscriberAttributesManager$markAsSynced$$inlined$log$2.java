package com.revenuecat.purchases.subscriberattributes;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.AttributionStrings;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SubscriberAttributesManager$markAsSynced$$inlined$log$2 extends o implements Function0 {
    final String $appUserID$inlined;
    final Map $attributesToMarkAsSynced$inlined;
    final LogIntent $intent;

    public SubscriberAttributesManager$markAsSynced$$inlined$log$2(LogIntent logIntent, String str, Map map) {
        super(0);
        this.$intent = logIntent;
        this.$appUserID$inlined = str;
        this.$attributesToMarkAsSynced$inlined = map;
    }

    @Override
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(p078i6.o.o1(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        sb.append(String.format(AttributionStrings.MARKING_ATTRIBUTES_SYNCED, Arrays.copyOf(new Object[]{this.$appUserID$inlined}, 1)) + p078i6.o.o1(this.$attributesToMarkAsSynced$inlined.values(), "\n", null, null, null, 62));
        return sb.toString();
    }
}
