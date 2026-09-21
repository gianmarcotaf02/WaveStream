package com.revenuecat.purchases;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p070h6.A;
import p153r8.g0;
import p153r8.p0;
import p194x6.j;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp8/a;", "Lh6/A;", "invoke", "(Lp8/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class CustomVariableDefinitionSerializer$descriptor$1 extends o implements j {
    public static final CustomVariableDefinitionSerializer$descriptor$1 INSTANCE = new CustomVariableDefinitionSerializer$descriptor$1();

    public CustomVariableDefinitionSerializer$descriptor$1() {
        super(1);
    }

    @Override
    public Object invoke(Object obj) {
        invoke((p135p8.a) obj);
        return A.f22523a;
    }

    public final void invoke(p135p8.a buildClassSerialDescriptor) {
        m.e(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        p0 p0Var = p0.f26988a;
        g0 g0Var = p0.f26989b;
        buildClassSerialDescriptor.a("type", g0Var, false);
        buildClassSerialDescriptor.a("default_value", g0Var, false);
    }
}
