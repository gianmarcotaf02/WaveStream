package com.revenuecat.purchases.common;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
public final class LogWrapperKt$log$fullMessageBuilder$1 extends o implements Function0 {
    final LogIntent $intent;
    final Function0 $messageBuilder;

    public LogWrapperKt$log$fullMessageBuilder$1(LogIntent logIntent, Function0 function0) {
        super(0);
        this.$intent = logIntent;
        this.$messageBuilder = function0;
    }

    @Override
    public final String invoke() {
        return p078i6.o.o1(this.$intent.getEmojiList(), "", null, null, null, 62) + ' ' + ((String) this.$messageBuilder.invoke());
    }
}
