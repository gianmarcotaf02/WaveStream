package p076i4;

import java.util.Map;

public final class U0 extends AbstractC2214p0 {

    public final transient AbstractC2194f0 f22837k;

    public final transient Object[] f22838l;

    public final transient int f22839m;

    public final transient int f22840n;

    public U0(AbstractC2194f0 abstractC2194f0, Object[] objArr, int i3, int i9) {
        this.f22837k = abstractC2194f0;
        this.f22838l = objArr;
        this.f22839m = i3;
        this.f22840n = i9;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f22837k.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int e(Object[] objArr, int i3) {
        return d().e(objArr, i3);
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final j1 iterator() {
        return d().listIterator(0);
    }

    @Override
    public final int size() {
        return this.f22840n;
    }

    @Override
    public final AbstractC2186b0 u() {
        return new T0(this);
    }
}
