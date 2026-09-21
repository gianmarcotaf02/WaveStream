package p110m7;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements java.util.Iterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.Stack f25507h = new java.util.Stack();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p110m7.u f25508i;

    public x(p110m7.AbstractC2632e abstractC2632e) {
        while (abstractC2632e instanceof p110m7.z) {
            p110m7.z zVar = (p110m7.z) abstractC2632e;
            this.f25507h.push(zVar);
            abstractC2632e = zVar.j;
        }
        this.f25508i = (p110m7.u) abstractC2632e;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final p110m7.u next() {
        p110m7.u uVar;
        p110m7.u uVar2 = this.f25508i;
        if (uVar2 == null) {
            throw new java.util.NoSuchElementException();
        }
        do {
            java.util.Stack stack = this.f25507h;
            if (stack.isEmpty()) {
                uVar = null;
                break;
            }
            p110m7.AbstractC2632e abstractC2632e = ((p110m7.z) stack.pop()).f25513k;
            while (abstractC2632e instanceof p110m7.z) {
                p110m7.z zVar = (p110m7.z) abstractC2632e;
                stack.push(zVar);
                abstractC2632e = zVar.j;
            }
            uVar = (p110m7.u) abstractC2632e;
        } while (uVar.f25506i.length == 0);
        this.f25508i = uVar;
        return uVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25508i != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
