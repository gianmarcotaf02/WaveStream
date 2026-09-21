package Z2;

import java.util.ArrayList;
import java.util.Iterator;

public final class C1204n {

    public ArrayList f12902a = null;

    public int f12903b = 0;

    public final void a() {
        this.f12903b += 1000;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f12902a.iterator();
        while (it.hasNext()) {
            sb.append((C1205o) it.next());
            sb.append(' ');
        }
        sb.append('[');
        return Y6.f.j(sb, this.f12903b, ']');
    }
}
