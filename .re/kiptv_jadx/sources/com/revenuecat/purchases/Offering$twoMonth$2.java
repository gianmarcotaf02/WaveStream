package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/Package;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Offering$twoMonth$2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    final /* synthetic */ com.revenuecat.purchases.Offering this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Offering$twoMonth$2(com.revenuecat.purchases.Offering offering) {
        super(0);
        this.this$0 = offering;
    }

    @Override // kotlin.jvm.functions.Function0
    public final com.revenuecat.purchases.Package invoke() {
        return this.this$0.findPackage(com.revenuecat.purchases.PackageType.TWO_MONTH);
    }
}
