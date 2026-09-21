package S4;

import com.kiptv.core.model.XtreamLiveStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class p {

    public final int f9429a;

    public final String f9430b;

    public final List f9431c;

    public p(String baseName, int i3, List list) {
        kotlin.jvm.internal.m.e(baseName, "baseName");
        this.f9429a = i3;
        this.f9430b = baseName;
        this.f9431c = list;
    }

    public static p a(p pVar, int i3, ArrayList arrayList) {
        String baseName = pVar.f9430b;
        kotlin.jvm.internal.m.e(baseName, "baseName");
        return new p(baseName, i3, arrayList);
    }

    public final boolean b() {
        List list = this.f9431c;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C0867f) it.next()).f9387a.a()) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        return this.f9431c.size() > 1;
    }

    public final int d() {
        return this.f9429a;
    }

    public final XtreamLiveStream e() {
        XtreamLiveStream xtreamLiveStream;
        List list = this.f9431c;
        C0867f c0867f = (C0867f) p078i6.o.s1(list);
        return (c0867f == null || (xtreamLiveStream = c0867f.f9387a) == null) ? ((C0867f) list.get(0)).f9387a : xtreamLiveStream;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f9429a == pVar.f9429a && kotlin.jvm.internal.m.a(this.f9430b, pVar.f9430b) && kotlin.jvm.internal.m.a(this.f9431c, pVar.f9431c);
    }

    public final List f() {
        return this.f9431c;
    }

    public final int hashCode() {
        return this.f9431c.hashCode() + B2.a.a(Integer.hashCode(this.f9429a) * 31, 31, this.f9430b);
    }

    public final String toString() {
        return "GroupedChannel(id=" + this.f9429a + ", baseName=" + this.f9430b + ", variants=" + this.f9431c + ")";
    }
}
