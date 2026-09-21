package com.revenuecat.purchases.common.remoteconfig;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.common.events.BackendEvent;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigTopic;", "", "wireName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getWireName", "()Ljava/lang/String;", "Workflows", "UiConfig", "Sources", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public enum RemoteConfigTopic {
    Workflows(BackendEvent.WORKFLOW_EVENT_TYPE),
    UiConfig("ui_config"),
    Sources("sources");

    private final String wireName;

    RemoteConfigTopic(String str) {
        this.wireName = str;
    }

    public final String getWireName() {
        return this.wireName;
    }
}
