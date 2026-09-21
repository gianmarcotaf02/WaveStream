package p117n6;

import p100l6.c;
import p100l6.h;
import p100l6.i;

public abstract class g extends a {
    public g(c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != i.f24820h) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override
    public final h getContext() {
        return i.f24820h;
    }
}
