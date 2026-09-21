package p076i4;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

public final class I0 extends AbstractC2185b {

    public transient H0 f22801n;

    @Override
    public final Map d() {
        Map map = this.f22929l;
        if (map instanceof NavigableMap) {
            return new C2197h(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new C2203k(this, (SortedMap) map) : new C2193f(this, map);
    }

    @Override
    public final Set f() {
        Map map = this.f22929l;
        if (map instanceof NavigableMap) {
            return new C2199i(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new C2205l(this, (SortedMap) map) : new C2195g(this, map);
    }

    @Override
    public final Collection j() {
        return (List) this.f22801n.get();
    }
}
