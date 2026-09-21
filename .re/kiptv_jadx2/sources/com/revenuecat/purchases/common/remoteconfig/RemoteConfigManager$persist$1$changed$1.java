package com.revenuecat.purchases.common.remoteconfig;

import Y6.f;
import androidx.media3.container.NalUnitUtil;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p194x6.j;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "", "", "Lcom/revenuecat/purchases/common/remoteconfig/ConfigTopic;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RemoteConfigManager$persist$1$changed$1 extends o implements j {
    public static final RemoteConfigManager$persist$1$changed$1 INSTANCE = new RemoteConfigManager$persist$1$changed$1();

    public RemoteConfigManager$persist$1$changed$1() {
        super(1);
    }

    @Override
    public final CharSequence invoke(Map.Entry<String, ConfigTopic> entry) {
        m.e(entry, "<name for destructuring parameter 0>");
        String key = entry.getKey();
        ConfigTopic value = entry.getValue();
        StringBuilder sbN = f.n(key, " -> items=");
        sbN.append(value.keySet());
        return sbN.toString();
    }
}
