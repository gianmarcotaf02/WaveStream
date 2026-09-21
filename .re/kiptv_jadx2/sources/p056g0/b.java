package p056g0;

import java.util.Collection;
import java.util.List;
import p194x6.j;

public final class b implements j {

    public final int f21750h;

    public final Collection f21751i;

    public b(int i3, Collection collection) {
        this.f21750h = i3;
        this.f21751i = collection;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f21750h) {
            case 0:
                return Boolean.valueOf(this.f21751i.contains(obj));
            case 1:
                return Boolean.valueOf(this.f21751i.contains(obj));
            default:
                return Boolean.valueOf(((List) obj).retainAll(this.f21751i));
        }
    }
}
