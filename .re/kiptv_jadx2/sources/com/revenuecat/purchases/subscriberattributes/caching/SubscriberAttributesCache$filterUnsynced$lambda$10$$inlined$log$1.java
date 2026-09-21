package com.revenuecat.purchases.subscriberattributes.caching;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.AttributionStrings;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SubscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1 extends o implements Function0 {
    final String $appUserID$inlined;
    final LogIntent $intent;
    final Map $unsyncedAttributesByKey$inlined;

    public SubscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1(LogIntent logIntent, Map map, String str) {
        super(0);
        this.$intent = logIntent;
        this.$unsyncedAttributesByKey$inlined = map;
        this.$appUserID$inlined = str;
    }

    @Override
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(p078i6.o.o1(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(AttributionStrings.UNSYNCED_ATTRIBUTES_COUNT, Arrays.copyOf(new Object[]{Integer.valueOf(this.$unsyncedAttributesByKey$inlined.size()), this.$appUserID$inlined}, 2)));
        sb2.append(!this.$unsyncedAttributesByKey$inlined.isEmpty() ? p078i6.o.o1(this.$unsyncedAttributesByKey$inlined.values(), "\n", null, null, null, 62) : "");
        sb.append(sb2.toString());
        return sb.toString();
    }
}
