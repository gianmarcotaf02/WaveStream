package com.revenuecat.purchases.google.usecase;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class QueryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    final /* synthetic */ com.revenuecat.purchases.common.LogIntent $intent;
    final /* synthetic */ Y2.x $received$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1(com.revenuecat.purchases.common.LogIntent logIntent, Y2.x xVar) {
        super(0);
        this.$intent = logIntent;
        this.$received$inlined = xVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.String invoke() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(p078i6.o.o1(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        java.util.AbstractCollection abstractCollection = this.$received$inlined.f11517b;
        kotlin.jvm.internal.m.d(abstractCollection, "received.unfetchedProductList");
        return B2.a.p(new java.lang.Object[]{p078i6.o.o1(abstractCollection, null, null, null, com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$onOk$4$1$1.INSTANCE, 31)}, 1, com.revenuecat.purchases.strings.OfferingStrings.MISSING_PRODUCT_DETAILS, sb);
    }
}
