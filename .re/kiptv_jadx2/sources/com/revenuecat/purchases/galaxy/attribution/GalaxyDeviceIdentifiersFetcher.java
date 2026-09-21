package com.revenuecat.purchases.galaxy.attribution;

import android.app.Application;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p078i6.x;
import p194x6.j;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/revenuecat/purchases/galaxy/attribution/GalaxyDeviceIdentifiersFetcher;", "Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;", "<init>", "()V", "Landroid/app/Application;", "applicationContext", "Lkotlin/Function1;", "", "", "Lh6/A;", "completion", "getDeviceIdentifiers", "(Landroid/app/Application;Lx6/j;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class GalaxyDeviceIdentifiersFetcher implements DeviceIdentifiersFetcher {
    @Override
    public void getDeviceIdentifiers(Application applicationContext, j completion) {
        m.e(applicationContext, "applicationContext");
        m.e(completion, "completion");
        completion.invoke(x.f23206h);
    }
}
