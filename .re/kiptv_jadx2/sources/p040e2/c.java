package p040e2;

import E6.InterfaceC0331d;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.m;
import p194x6.j;

public final class c {

    public final LinkedHashMap f21366a;

    public c(int i3) {
        switch (i3) {
            case 1:
                this.f21366a = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.f21366a = new LinkedHashMap();
                break;
        }
    }

    public void a(InterfaceC0331d clazz, j initializer) {
        m.e(clazz, "clazz");
        m.e(initializer, "initializer");
        LinkedHashMap linkedHashMap = this.f21366a;
        if (!linkedHashMap.containsKey(clazz)) {
            linkedHashMap.put(clazz, new e(clazz, initializer));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + clazz.g() + '.').toString());
    }

    public W5.c b() {
        Collection initializers = this.f21366a.values();
        m.e(initializers, "initializers");
        e[] eVarArr = (e[]) initializers.toArray(new e[0]);
        return new W5.c((e[]) Arrays.copyOf(eVarArr, eVarArr.length));
    }
}
