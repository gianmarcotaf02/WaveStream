package com.revenuecat.purchases.common;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SharedPreferencesManager$migratePreferenceValue$$inlined$log$1 extends o implements Function0 {
    final LogIntent $intent;
    final String $key$inlined;
    final Object $value$inlined;

    public SharedPreferencesManager$migratePreferenceValue$$inlined$log$1(LogIntent logIntent, String str, Object obj) {
        super(0);
        this.$intent = logIntent;
        this.$key$inlined = str;
        this.$value$inlined = obj;
    }

    @Override
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(p078i6.o.o1(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        StringBuilder sb2 = new StringBuilder("Unknown preference type for key ");
        sb2.append(this.$key$inlined);
        sb2.append(": ");
        Object obj = this.$value$inlined;
        sb2.append(obj != null ? obj.getClass().getSimpleName() : null);
        sb.append(sb2.toString());
        return sb.toString();
    }
}
