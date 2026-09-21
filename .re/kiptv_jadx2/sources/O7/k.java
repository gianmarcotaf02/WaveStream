package O7;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p078i6.AbstractC2254e;
import p078i6.E;

public final class k extends AbstractC2254e {

    public final int f8051h = 0;

    public final Object f8052i;

    public k(m mVar) {
        this.f8052i = mVar;
    }

    @Override
    public boolean contains(Object obj) {
        switch (this.f8051h) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override
    public final int d() {
        switch (this.f8051h) {
            case 0:
                return ((m) this.f8052i).f8055a.groupCount() + 1;
            default:
                return ((List) this.f8052i).size();
        }
    }

    @Override
    public final Object get(int i3) {
        switch (this.f8051h) {
            case 0:
                String strGroup = ((m) this.f8052i).f8055a.group(i3);
                return strGroup == null ? "" : strGroup;
            default:
                return ((List) this.f8052i).get(p078i6.o.V0(i3, this));
        }
    }

    @Override
    public int indexOf(Object obj) {
        switch (this.f8051h) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override
    public Iterator iterator() {
        switch (this.f8051h) {
            case 1:
                return new E(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override
    public int lastIndexOf(Object obj) {
        switch (this.f8051h) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override
    public ListIterator listIterator() {
        switch (this.f8051h) {
            case 1:
                return new E(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override
    public ListIterator listIterator(int i3) {
        switch (this.f8051h) {
            case 1:
                return new E(this, i3);
            default:
                return super.listIterator(i3);
        }
    }

    public k(List delegate) {
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.f8052i = delegate;
    }
}
