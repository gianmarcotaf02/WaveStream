package S4;

import J5.t2;
import com.google.crypto.tink.shaded.protobuf.AbstractC1909d;
import com.kiptv.core.model.C1944g0;
import com.kiptv.core.model.EnumC1937d;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class C0872k {
    public static C0873l a(C1944g0 c1944g0, List categories, EnumC1937d enumC1937d) {
        Set setH0;
        kotlin.jvm.internal.m.e(categories, "categories");
        if (c1944g0 == null) {
            return C0873l.f9408c;
        }
        N7.u uVarP0 = N7.o.p0(N7.o.k0(p078i6.o.Y0(categories), new B.K(c1944g0, enumC1937d, 22)), new t2(12));
        Iterator it = uVarP0.f7470a.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            p194x6.j jVar = uVarP0.f7471b;
            Object objInvoke = jVar.invoke(next);
            if (it.hasNext()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(objInvoke);
                while (it.hasNext()) {
                    linkedHashSet.add(jVar.invoke(it.next()));
                }
                setH0 = linkedHashSet;
            } else {
                setH0 = AbstractC1909d.h0(objInvoke);
            }
        } else {
            setH0 = p078i6.y.f23207h;
        }
        return new C0873l(setH0, p078i6.o.R1(c1944g0.d(enumC1937d).f19690b));
    }
}
