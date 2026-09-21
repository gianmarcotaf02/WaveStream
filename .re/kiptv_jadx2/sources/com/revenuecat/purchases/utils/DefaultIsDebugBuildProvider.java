package com.revenuecat.purchases.utils;

import android.content.Context;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/utils/DefaultIsDebugBuildProvider;", "Lcom/revenuecat/purchases/utils/IsDebugBuildProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "invoke", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DefaultIsDebugBuildProvider implements IsDebugBuildProvider {
    private final Context context;

    public DefaultIsDebugBuildProvider(Context context) {
        m.e(context, "context");
        Context applicationContext = context.getApplicationContext();
        m.d(applicationContext, "context.applicationContext");
        this.context = applicationContext;
    }

    @Override
    public boolean invoke() {
        return (this.context.getApplicationInfo().flags & 2) != 0;
    }
}
