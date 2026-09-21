package com.revenuecat.purchases.blockstore;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p059g4.c;
import p194x6.j;

@Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class BlockstoreHelper$sam$com_google_android_gms_tasks_OnSuccessListener$0 implements c {
    private final j function;

    public BlockstoreHelper$sam$com_google_android_gms_tasks_OnSuccessListener$0(j function) {
        m.e(function, "function");
        this.function = function;
    }

    @Override
    public final void onSuccess(Object obj) {
        this.function.invoke(obj);
    }
}
