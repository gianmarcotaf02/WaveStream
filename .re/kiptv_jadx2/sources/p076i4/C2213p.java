package p076i4;

import java.util.Collection;
import java.util.Set;

public final class C2213p extends AbstractC2207m implements Set {

    public final Q f22927m;

    public C2213p(Q q9, Object obj, Set set) {
        super(q9, obj, set, null);
        this.f22927m = q9;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zT = AbstractC2230y.t((Set) this.f22918i, collection);
        if (zT) {
            int size2 = this.f22918i.size();
            this.f22927m.f22930m += size2 - size;
            f();
        }
        return zT;
    }
}
