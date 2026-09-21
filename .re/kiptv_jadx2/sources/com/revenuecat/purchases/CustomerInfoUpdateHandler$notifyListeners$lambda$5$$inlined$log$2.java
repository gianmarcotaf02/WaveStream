package com.revenuecat.purchases;

import Y6.f;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.common.LogIntent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CustomerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$2 extends o implements Function0 {
    final LogIntent $intent;

    public CustomerInfoUpdateHandler$notifyListeners$lambda$5$$inlined$log$2(LogIntent logIntent) {
        super(0);
        this.$intent = logIntent;
    }

    @Override
    public final String invoke() {
        return f.m(new StringBuilder(), p078i6.o.o1(this.$intent.getEmojiList(), "", null, null, null, 62), " Sending latest CustomerInfo to listener.");
    }
}
