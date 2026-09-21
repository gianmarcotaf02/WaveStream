package N7;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class a implements m {

    public final AtomicReference f7431a;

    public a(m mVar) {
        this.f7431a = new AtomicReference(mVar);
    }

    @Override
    public final Iterator iterator() {
        m mVar = (m) this.f7431a.getAndSet(null);
        if (mVar != null) {
            return mVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
