package com.revenuecat.purchases.google.usecase;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class QueryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    final /* synthetic */ com.revenuecat.purchases.common.LogIntent $intent;
    final /* synthetic */ Y2.A $it$inlined;
    final /* synthetic */ com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1(com.revenuecat.purchases.common.LogIntent logIntent, Y2.A a2, com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase queryProductDetailsUseCase) {
        super(0);
        this.$intent = logIntent;
        this.$it$inlined = a2;
        this.this$0 = queryProductDetailsUseCase;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.String invoke() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(p078i6.o.o1(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        Y2.A a2 = this.$it$inlined;
        return B2.a.p(new java.lang.Object[]{a2.f11357b, a2.f11358c, this.this$0.convertUnfetchedProductStatusCodeToString(a2.f11359d), this.$it$inlined.f11360e}, 4, com.revenuecat.purchases.strings.OfferingStrings.LIST_UNFETCHED_PRODUCTS, sb);
    }
}
