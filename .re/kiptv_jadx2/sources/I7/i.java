package I7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

public final class i {

    public final p101l7.e f5564a;

    public final O7.o f5565b;

    public final Collection f5566c;

    public final p194x6.j f5567d;

    public final e[] f5568e;

    public i(p101l7.e eVar, O7.o oVar, Collection collection, p194x6.j jVar, e... eVarArr) {
        this.f5564a = eVar;
        this.f5565b = oVar;
        this.f5566c = collection;
        this.f5567d = jVar;
        this.f5568e = eVarArr;
    }

    public i(p101l7.e eVar, e[] eVarArr) {
        this(eVar, eVarArr, h.f5555i);
    }

    public i(p101l7.e name, e[] eVarArr, p194x6.j jVar) {
        this(name, null, null, jVar, (e[]) Arrays.copyOf(eVarArr, eVarArr.length));
        kotlin.jvm.internal.m.e(name, "name");
    }

    public i(Set set, e[] eVarArr) {
        this(set, eVarArr, h.f5556k);
    }

    public i(Collection nameList, e[] eVarArr, p194x6.j jVar) {
        this(null, null, nameList, jVar, (e[]) Arrays.copyOf(eVarArr, eVarArr.length));
        kotlin.jvm.internal.m.e(nameList, "nameList");
    }
}
