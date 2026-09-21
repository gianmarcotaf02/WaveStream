package p199y3;

import H3.q;
import android.util.LruCache;

public final class p extends LruCache {

    public final c f31882a;

    public p(c cVar) {
        super(20);
        this.f31882a = cVar;
    }

    @Override
    public final void entryRemoved(boolean z6, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj;
        if (z6) {
            c cVar = this.f31882a;
            q.g(cVar.g);
            cVar.g.add(num);
        }
    }
}
