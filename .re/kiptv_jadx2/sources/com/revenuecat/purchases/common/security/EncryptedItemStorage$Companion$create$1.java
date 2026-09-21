package com.revenuecat.purchases.common.security;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import p117n6.c;
import p117n6.e;

@Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@e(c = "com.revenuecat.purchases.common.security.EncryptedItemStorage$Companion", f = "EncryptedItemStorage.kt", l = {97, 109}, m = "create")
public final class EncryptedItemStorage$Companion$create$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    Object result;
    final EncryptedItemStorage.Companion this$0;

    public EncryptedItemStorage$Companion$create$1(EncryptedItemStorage.Companion companion, p100l6.c cVar) {
        super(cVar);
        this.this$0 = companion;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.create(null, null, null, null, null, this);
    }
}
