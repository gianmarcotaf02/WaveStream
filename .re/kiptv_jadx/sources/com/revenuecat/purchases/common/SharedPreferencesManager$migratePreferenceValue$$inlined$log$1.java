package com.revenuecat.purchases.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SharedPreferencesManager$migratePreferenceValue$$inlined$log$1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    final /* synthetic */ com.revenuecat.purchases.common.LogIntent $intent;
    final /* synthetic */ java.lang.String $key$inlined;
    final /* synthetic */ java.lang.Object $value$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesManager$migratePreferenceValue$$inlined$log$1(com.revenuecat.purchases.common.LogIntent logIntent, java.lang.String str, java.lang.Object obj) {
        super(0);
        this.$intent = logIntent;
        this.$key$inlined = str;
        this.$value$inlined = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.String invoke() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(p078i6.o.o1(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unknown preference type for key ");
        sb2.append(this.$key$inlined);
        sb2.append(": ");
        java.lang.Object obj = this.$value$inlined;
        sb2.append(obj != null ? obj.getClass().getSimpleName() : null);
        sb.append(sb2.toString());
        return sb.toString();
    }
}
