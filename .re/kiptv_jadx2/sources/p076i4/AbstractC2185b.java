package p076i4;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class AbstractC2185b extends AbstractC2215q implements InterfaceC2227w0 {
    @Override
    public final Collection get(Object obj) {
        return (List) super.get(obj);
    }

    @Override
    public final Collection k(Object obj, Collection collection) {
        List list = (List) collection;
        return list instanceof RandomAccess ? new C2201j(this, obj, list, null) : new C2211o(this, obj, list, null);
    }

    @Override
    public final List get(Object obj) {
        return (List) super.get(obj);
    }
}
