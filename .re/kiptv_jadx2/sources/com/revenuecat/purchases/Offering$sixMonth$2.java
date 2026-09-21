package com.revenuecat.purchases;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/Package;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Offering$sixMonth$2 extends o implements Function0 {
    final Offering this$0;

    public Offering$sixMonth$2(Offering offering) {
        super(0);
        this.this$0 = offering;
    }

    @Override
    public final Package invoke() {
        return this.this$0.findPackage(PackageType.SIX_MONTH);
    }
}
