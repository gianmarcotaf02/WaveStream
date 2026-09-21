package com.revenuecat.purchases.subscriberattributes;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SubscriberAttributesManager$markAsSynced$$inlined$log$2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    final /* synthetic */ java.lang.String $appUserID$inlined;
    final /* synthetic */ java.util.Map $attributesToMarkAsSynced$inlined;
    final /* synthetic */ com.revenuecat.purchases.common.LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberAttributesManager$markAsSynced$$inlined$log$2(com.revenuecat.purchases.common.LogIntent logIntent, java.lang.String str, java.util.Map map) {
        super(0);
        this.$intent = logIntent;
        this.$appUserID$inlined = str;
        this.$attributesToMarkAsSynced$inlined = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.String invoke() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(p078i6.o.o1(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        sb.append(java.lang.String.format(com.revenuecat.purchases.strings.AttributionStrings.MARKING_ATTRIBUTES_SYNCED, java.util.Arrays.copyOf(new java.lang.Object[]{this.$appUserID$inlined}, 1)) + p078i6.o.o1(this.$attributesToMarkAsSynced$inlined.values(), "\n", null, null, null, 62));
        return sb.toString();
    }
}
