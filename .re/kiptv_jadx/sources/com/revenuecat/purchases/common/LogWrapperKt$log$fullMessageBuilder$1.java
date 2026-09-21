package com.revenuecat.purchases.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
public final class LogWrapperKt$log$fullMessageBuilder$1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    final /* synthetic */ com.revenuecat.purchases.common.LogIntent $intent;
    final /* synthetic */ kotlin.jvm.functions.Function0 $messageBuilder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogWrapperKt$log$fullMessageBuilder$1(com.revenuecat.purchases.common.LogIntent logIntent, kotlin.jvm.functions.Function0 function0) {
        super(0);
        this.$intent = logIntent;
        this.$messageBuilder = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.String invoke() {
        return p078i6.o.o1(this.$intent.getEmojiList(), "", null, null, null, 62) + ' ' + ((java.lang.String) this.$messageBuilder.invoke());
    }
}
