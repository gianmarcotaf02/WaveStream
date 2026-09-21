package com.revenuecat.purchases.google;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class BillingWrapper$onPurchasesUpdated$$inlined$log$1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    final /* synthetic */ Y2.C1040j $billingResult$inlined;
    final /* synthetic */ com.revenuecat.purchases.common.LogIntent $intent;
    final /* synthetic */ java.util.List $notNullPurchasesList$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$onPurchasesUpdated$$inlined$log$1(com.revenuecat.purchases.common.LogIntent logIntent, Y2.C1040j c1040j, java.util.List list) {
        super(0);
        this.$intent = logIntent;
        this.$billingResult$inlined = c1040j;
        this.$notNullPurchasesList$inlined = list;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x005d  */
    @Override // kotlin.jvm.functions.Function0
    public final java.lang.String invoke() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(p078i6.o.o1(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        java.lang.String str2 = java.lang.String.format(com.revenuecat.purchases.strings.BillingStrings.BILLING_WRAPPER_PURCHASES_ERROR, java.util.Arrays.copyOf(new java.lang.Object[]{com.revenuecat.purchases.google.BillingResultExtensionsBillingIndependentKt.toHumanReadableDescription(this.$billingResult$inlined)}, 1));
        java.util.List list = this.$notNullPurchasesList$inlined;
        if (list.isEmpty()) {
            list = null;
        }
        java.util.List list2 = list;
        if (list2 != null) {
            str = " Purchases:" + p078i6.o.o1(list2, ", ", null, null, com.revenuecat.purchases.google.BillingWrapper$onPurchasesUpdated$2$2$1.INSTANCE, 30);
            if (str == null) {
                str = " No purchases received";
            }
        } else {
            str = " No purchases received";
        }
        sb.append(str2.concat(str));
        return sb.toString();
    }
}
