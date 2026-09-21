package com.revenuecat.purchases.google.usecase;

import Y2.A;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p194x6.j;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LY2/A;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(LY2/A;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class QueryProductDetailsUseCase$onOk$4$1$1 extends o implements j {
    public static final QueryProductDetailsUseCase$onOk$4$1$1 INSTANCE = new QueryProductDetailsUseCase$onOk$4$1$1();

    public QueryProductDetailsUseCase$onOk$4$1$1() {
        super(1);
    }

    @Override
    public final CharSequence invoke(A a2) {
        String string = a2.toString();
        m.d(string, "it.toString()");
        return string;
    }
}
