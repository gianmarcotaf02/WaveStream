package p110m7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public final class x implements Iterator {

    public final Stack f25507h = new Stack();

    public u f25508i;

    public x(AbstractC2632e abstractC2632e) {
        while (abstractC2632e instanceof z) {
            z zVar = (z) abstractC2632e;
            this.f25507h.push(zVar);
            abstractC2632e = zVar.j;
        }
        this.f25508i = (u) abstractC2632e;
    }

    @Override
    public final u next() {
        u uVar;
        u uVar2 = this.f25508i;
        if (uVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            Stack stack = this.f25507h;
            if (stack.isEmpty()) {
                uVar = null;
                break;
            }
            AbstractC2632e abstractC2632e = ((z) stack.pop()).f25513k;
            while (abstractC2632e instanceof z) {
                z zVar = (z) abstractC2632e;
                stack.push(zVar);
                abstractC2632e = zVar.j;
            }
            uVar = (u) abstractC2632e;
        } while (uVar.f25506i.length == 0);
        this.f25508i = uVar;
        return uVar2;
    }

    @Override
    public final boolean hasNext() {
        return this.f25508i != null;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
