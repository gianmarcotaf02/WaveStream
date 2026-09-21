package E7;

import N6.AbstractC0702p;
import N6.EnumC0711z;
import N6.InterfaceC0694h;
import N6.P;
import com.google.crypto.tink.shaded.protobuf.AbstractC1909d;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import p078i6.w;
import p078i6.y;
import p180v7.o;

public class g implements o {

    public final String f3234b;

    public g(h hVar, String... formatParams) {
        kotlin.jvm.internal.m.e(formatParams, "formatParams");
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.f3234b = String.format(hVar.f3240h, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override
    public Collection a(p180v7.f kindFilter, p194x6.j jVar) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        return w.f23205h;
    }

    @Override
    public Set c() {
        return y.f23207h;
    }

    @Override
    public Set d() {
        return y.f23207h;
    }

    @Override
    public InterfaceC0694h f(p101l7.e name, V6.a location) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(location, "location");
        b[] bVarArr = b.f3228h;
        return new a(p101l7.e.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{name}, 1))));
    }

    @Override
    public Set g() {
        return y.f23207h;
    }

    @Override
    public Set b(p101l7.e name, V6.c cVar) {
        kotlin.jvm.internal.m.e(name, "name");
        a containingDeclaration = l.f3281c;
        kotlin.jvm.internal.m.e(containingDeclaration, "containingDeclaration");
        O6.f fVar = O6.g.f7987a;
        b[] bVarArr = b.f3228h;
        c cVar2 = new c(containingDeclaration, null, fVar, p101l7.e.g("<Error function>"), 1, P.f7377b);
        w wVar = w.f23205h;
        cVar2.L0(null, null, wVar, wVar, wVar, l.c(k.f3263l, new String[0]), EnumC0711z.f7428k, AbstractC0702p.f7406e);
        return AbstractC1909d.h0(cVar2);
    }

    @Override
    public Set e(p101l7.e name, V6.c cVar) {
        kotlin.jvm.internal.m.e(name, "name");
        return l.f3284f;
    }

    public String toString() {
        return Y6.f.l(new StringBuilder("ErrorScope{"), this.f3234b, '}');
    }
}
