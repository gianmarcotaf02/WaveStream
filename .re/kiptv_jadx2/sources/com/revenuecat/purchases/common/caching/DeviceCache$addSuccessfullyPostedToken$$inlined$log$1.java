package com.revenuecat.purchases.common.caching;

import B2.a;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.ReceiptStrings;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DeviceCache$addSuccessfullyPostedToken$$inlined$log$1 extends o implements Function0 {
    final String $hashedToken$inlined;
    final LogIntent $intent;
    final String $token$inlined;

    public DeviceCache$addSuccessfullyPostedToken$$inlined$log$1(LogIntent logIntent, String str, String str2) {
        super(0);
        this.$intent = logIntent;
        this.$token$inlined = str;
        this.$hashedToken$inlined = str2;
    }

    @Override
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(p078i6.o.o1(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return a.p(new Object[]{this.$token$inlined, this.$hashedToken$inlined}, 2, ReceiptStrings.SAVING_TOKENS_WITH_HASH, sb);
    }
}
