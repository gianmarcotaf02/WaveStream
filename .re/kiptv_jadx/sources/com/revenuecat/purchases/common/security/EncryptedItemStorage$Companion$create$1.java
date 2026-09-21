package com.revenuecat.purchases.common.security;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p117n6.e(c = "com.revenuecat.purchases.common.security.EncryptedItemStorage$Companion", f = "EncryptedItemStorage.kt", l = {97, 109}, m = "create")
public final class EncryptedItemStorage$Companion$create$1 extends p117n6.c {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.revenuecat.purchases.common.security.EncryptedItemStorage.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EncryptedItemStorage$Companion$create$1(com.revenuecat.purchases.common.security.EncryptedItemStorage.Companion companion, p100l6.c cVar) {
        super(cVar);
        this.this$0 = companion;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.create(null, null, null, null, null, this);
    }
}
