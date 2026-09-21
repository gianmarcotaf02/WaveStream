package C7;

import N6.InterfaceC0694h;
import java.util.ArrayList;
import java.util.Map;

public final class H extends N {

    public final int f1545c;

    public final Object f1546d;

    public H(int i3, Object obj) {
        this.f1545c = i3;
        this.f1546d = obj;
    }

    @Override
    public boolean a() {
        switch (this.f1545c) {
            case 1:
                return false;
            default:
                return super.a();
        }
    }

    @Override
    public boolean e() {
        switch (this.f1545c) {
            case 1:
                return ((Map) this.f1546d).isEmpty();
            default:
                return super.e();
        }
    }

    @Override
    public final P g(M key) {
        switch (this.f1545c) {
            case 0:
                kotlin.jvm.internal.m.e(key, "key");
                if (!((ArrayList) this.f1546d).contains(key)) {
                    return null;
                }
                InterfaceC0694h interfaceC0694hH = key.h();
                kotlin.jvm.internal.m.c(interfaceC0694hH, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                return Y.j((N6.U) interfaceC0694hH);
            default:
                kotlin.jvm.internal.m.e(key, "key");
                return (P) ((Map) this.f1546d).get(key);
        }
    }
}
