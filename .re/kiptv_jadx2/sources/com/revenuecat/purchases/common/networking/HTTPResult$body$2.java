package com.revenuecat.purchases.common.networking;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lorg/json/JSONObject;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HTTPResult$body$2 extends o implements Function0 {
    final HTTPResult this$0;

    public HTTPResult$body$2(HTTPResult hTTPResult) {
        super(0);
        this.this$0 = hTTPResult;
    }

    @Override
    public final JSONObject invoke() {
        return this.this$0.parseBody();
    }
}
