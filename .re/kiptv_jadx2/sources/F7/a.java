package F7;

import C7.P;
import java.util.ArrayList;

public final class a extends ArrayList implements g {
    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof P) {
            return super.contains((P) obj);
        }
        return false;
    }

    @Override
    public final int indexOf(Object obj) {
        if (obj instanceof P) {
            return super.indexOf((P) obj);
        }
        return -1;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        if (obj instanceof P) {
            return super.lastIndexOf((P) obj);
        }
        return -1;
    }

    @Override
    public final boolean remove(Object obj) {
        if (obj instanceof P) {
            return super.remove((P) obj);
        }
        return false;
    }
}
