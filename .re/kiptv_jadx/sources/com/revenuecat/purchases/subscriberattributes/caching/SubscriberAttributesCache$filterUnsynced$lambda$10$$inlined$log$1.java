package com.revenuecat.purchases.subscriberattributes.caching;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SubscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    final /* synthetic */ java.lang.String $appUserID$inlined;
    final /* synthetic */ com.revenuecat.purchases.common.LogIntent $intent;
    final /* synthetic */ java.util.Map $unsyncedAttributesByKey$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1(com.revenuecat.purchases.common.LogIntent logIntent, java.util.Map map, java.lang.String str) {
        super(0);
        this.$intent = logIntent;
        this.$unsyncedAttributesByKey$inlined = map;
        this.$appUserID$inlined = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.String invoke() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(p078i6.o.o1(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(java.lang.String.format(com.revenuecat.purchases.strings.AttributionStrings.UNSYNCED_ATTRIBUTES_COUNT, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(this.$unsyncedAttributesByKey$inlined.size()), this.$appUserID$inlined}, 2)));
        sb2.append(!this.$unsyncedAttributesByKey$inlined.isEmpty() ? p078i6.o.o1(this.$unsyncedAttributesByKey$inlined.values(), "\n", null, null, null, 62) : "");
        sb.append(sb2.toString());
        return sb.toString();
    }
}
