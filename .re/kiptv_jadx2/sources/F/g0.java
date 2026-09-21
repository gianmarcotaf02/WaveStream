package F;

import java.util.List;

public final class g0 {

    public final List f3438a;

    public final List[] f3439b;

    public int f3440c;

    public int f3441d;

    public boolean f3442e;

    public final h0 f3443f;

    public g0(h0 h0Var, List list) {
        this.f3443f = h0Var;
        this.f3438a = list;
        this.f3439b = new List[list.size()];
        if (list.isEmpty()) {
            A.b.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
