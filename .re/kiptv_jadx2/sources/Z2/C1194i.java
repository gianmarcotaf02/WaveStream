package Z2;

import Y2.C1038h;
import java.util.Iterator;
import java.util.List;

public final class C1194i implements InterfaceC1186e {

    public List f12889a;

    @Override
    public final boolean a(AbstractC1181b0 abstractC1181b0) {
        Iterator it = this.f12889a.iterator();
        while (it.hasNext()) {
            if (C1038h.n((C1204n) it.next(), abstractC1181b0)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "not(" + this.f12889a + ")";
    }
}
