package O6;

import C7.C0189v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class l implements h {

    public final h f7995h;

    public final C0189v f7996i;

    public l(h hVar, C0189v c0189v) {
        this.f7995h = hVar;
        this.f7996i = c0189v;
    }

    @Override
    public final boolean h(p101l7.c fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        if (((Boolean) this.f7996i.invoke(fqName)).booleanValue()) {
            return this.f7995h.h(fqName);
        }
        return false;
    }

    @Override
    public final boolean isEmpty() {
        h hVar = this.f7995h;
        if ((hVar instanceof Collection) && ((Collection) hVar).isEmpty()) {
            return false;
        }
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            p101l7.c cVarA = ((b) it.next()).a();
            if (cVarA != null && ((Boolean) this.f7996i.invoke(cVarA)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f7995h) {
            p101l7.c cVarA = ((b) obj).a();
            if (cVarA != null && ((Boolean) this.f7996i.invoke(cVarA)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }

    @Override
    public final b k(p101l7.c fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        if (((Boolean) this.f7996i.invoke(fqName)).booleanValue()) {
            return this.f7995h.k(fqName);
        }
        return null;
    }
}
