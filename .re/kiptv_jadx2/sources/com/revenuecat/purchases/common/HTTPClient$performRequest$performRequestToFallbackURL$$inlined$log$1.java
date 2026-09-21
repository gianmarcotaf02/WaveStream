package com.revenuecat.purchases.common;

import B2.a;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.strings.NetworkStrings;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1 extends o implements Function0 {
    final Endpoint $endpoint$inlined;
    final URL $fallbackBaseURL$inlined;
    final LogIntent $intent;

    public HTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1(LogIntent logIntent, Endpoint endpoint, URL url) {
        super(0);
        this.$intent = logIntent;
        this.$endpoint$inlined = endpoint;
        this.$fallbackBaseURL$inlined = url;
    }

    @Override
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(p078i6.o.o1(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return a.p(new Object[]{this.$endpoint$inlined.getPath(true), this.$fallbackBaseURL$inlined}, 2, NetworkStrings.RETRYING_CALL_WITH_FALLBACK_URL, sb);
    }
}
