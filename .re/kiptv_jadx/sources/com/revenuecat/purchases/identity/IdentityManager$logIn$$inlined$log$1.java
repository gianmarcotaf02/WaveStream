package com.revenuecat.purchases.identity;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class IdentityManager$logIn$$inlined$log$1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    final /* synthetic */ com.revenuecat.purchases.common.LogIntent $intent;
    final /* synthetic */ java.lang.String $newAppUserID$inlined;
    final /* synthetic */ com.revenuecat.purchases.identity.IdentityManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityManager$logIn$$inlined$log$1(com.revenuecat.purchases.common.LogIntent logIntent, com.revenuecat.purchases.identity.IdentityManager identityManager, java.lang.String str) {
        super(0);
        this.$intent = logIntent;
        this.this$0 = identityManager;
        this.$newAppUserID$inlined = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.String invoke() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(p078i6.o.o1(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return B2.a.p(new java.lang.Object[]{this.this$0.getCurrentAppUserID(), this.$newAppUserID$inlined}, 2, com.revenuecat.purchases.strings.IdentityStrings.LOGGING_IN, sb);
    }
}
