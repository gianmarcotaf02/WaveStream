package p100l6;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements p100l6.h, java.io.Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p100l6.h f24817h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p100l6.f f24818i;

    public b(p100l6.f element, p100l6.h left) {
        kotlin.jvm.internal.m.e(left, "left");
        kotlin.jvm.internal.m.e(element, "element");
        this.f24817h = left;
        this.f24818i = element;
    }

    public final boolean equals(java.lang.Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof p100l6.b) {
            p100l6.b bVar = (p100l6.b) obj;
            bVar.getClass();
            int i3 = 2;
            p100l6.b bVar2 = bVar;
            int i9 = 2;
            while (true) {
                p100l6.h hVar = bVar2.f24817h;
                bVar2 = hVar instanceof p100l6.b ? (p100l6.b) hVar : null;
                if (bVar2 == null) {
                    break;
                }
                i9++;
            }
            p100l6.b bVar3 = this;
            while (true) {
                p100l6.h hVar2 = bVar3.f24817h;
                bVar3 = hVar2 instanceof p100l6.b ? (p100l6.b) hVar2 : null;
                if (bVar3 == null) {
                    break;
                }
                i3++;
            }
            if (i9 == i3) {
                p100l6.b bVar4 = this;
                while (true) {
                    p100l6.f fVar = bVar4.f24818i;
                    if (!kotlin.jvm.internal.m.a(bVar.get(fVar.getKey()), fVar)) {
                        zA = false;
                        break;
                    }
                    p100l6.h hVar3 = bVar4.f24817h;
                    if (!(hVar3 instanceof p100l6.b)) {
                        kotlin.jvm.internal.m.c(hVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        p100l6.f fVar2 = (p100l6.f) hVar3;
                        zA = kotlin.jvm.internal.m.a(bVar.get(fVar2.getKey()), fVar2);
                        break;
                    }
                    bVar4 = (p100l6.b) hVar3;
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p100l6.h
    public final java.lang.Object fold(java.lang.Object obj, p194x6.m mVar) {
        return mVar.invoke(this.f24817h.fold(obj, mVar), this.f24818i);
    }

    @Override // p100l6.h
    public final p100l6.f get(p100l6.g key) {
        kotlin.jvm.internal.m.e(key, "key");
        p100l6.b bVar = this;
        while (true) {
            p100l6.f fVar = bVar.f24818i.get(key);
            if (fVar != null) {
                return fVar;
            }
            p100l6.h hVar = bVar.f24817h;
            if (!(hVar instanceof p100l6.b)) {
                return hVar.get(key);
            }
            bVar = (p100l6.b) hVar;
        }
    }

    public final int hashCode() {
        return this.f24818i.hashCode() + this.f24817h.hashCode();
    }

    @Override // p100l6.h
    public final p100l6.h minusKey(p100l6.g key) {
        kotlin.jvm.internal.m.e(key, "key");
        p100l6.f fVar = this.f24818i;
        p100l6.f fVar2 = fVar.get(key);
        p100l6.h hVar = this.f24817h;
        if (fVar2 != null) {
            return hVar;
        }
        p100l6.h hVarMinusKey = hVar.minusKey(key);
        if (hVarMinusKey == hVar) {
            return this;
        }
        return hVarMinusKey == p100l6.i.f24820h ? fVar : new p100l6.b(fVar, hVarMinusKey);
    }

    @Override // p100l6.h
    public final p100l6.h plus(p100l6.h context) {
        kotlin.jvm.internal.m.e(context, "context");
        return context == p100l6.i.f24820h ? this : (p100l6.h) context.fold(this, new p011b1.y(22));
    }

    public final java.lang.String toString() {
        return Y6.f.l(new java.lang.StringBuilder("["), (java.lang.String) fold("", new p011b1.y(21)), ']');
    }
}
