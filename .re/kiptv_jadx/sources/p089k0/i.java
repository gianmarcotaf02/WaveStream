package p089k0;

/* JADX INFO: loaded from: classes.dex */
public final class i extends java.util.AbstractMap implements java.util.Map, p201y6.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p081j0.b f24417h = new p081j0.b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p064h0.k f24418i;
    public java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24419k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f24420l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p089k0.j f24421m;

    public i(p089k0.j jVar) {
        this.f24418i = jVar.f22432h;
        this.f24420l = jVar.f22433i;
        this.f24421m = jVar;
    }

    public final p089k0.j a() {
        p064h0.k kVar = this.f24418i;
        p089k0.j jVar = this.f24421m;
        if (kVar != jVar.f22432h) {
            this.f24417h = new p081j0.b();
            jVar = new p089k0.j(this.f24418i, this.f24420l);
        }
        this.f24421m = jVar;
        return jVar;
    }

    public final boolean b(java.lang.Object obj) {
        return this.f24418i.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final java.lang.Object c(java.lang.Object obj) {
        return this.f24418i.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f24418i = p064h0.k.f22446e;
        e(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj instanceof p020c0.AbstractC1697o0) {
            return b((p020c0.AbstractC1697o0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        if (obj instanceof p020c0.h1) {
            return super.containsValue((p020c0.h1) obj);
        }
        return false;
    }

    public final java.lang.Object d(java.lang.Object obj) {
        this.j = null;
        p064h0.k kVarN = this.f24418i.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (kVarN == null) {
            kVarN = p064h0.k.f22446e;
        }
        this.f24418i = kVarN;
        return this.j;
    }

    public final void e(int i3) {
        this.f24420l = i3;
        this.f24419k++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        return new p064h0.f(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object get(java.lang.Object obj) {
        if (obj instanceof p020c0.AbstractC1697o0) {
            return (p020c0.h1) c((p020c0.AbstractC1697o0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return !(obj instanceof p020c0.AbstractC1697o0) ? obj2 : (p020c0.h1) super.getOrDefault((p020c0.AbstractC1697o0) obj, (p020c0.h1) obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
        return new p064h0.f(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        this.j = null;
        this.f24418i = this.f24418i.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        p064h0.c cVarA = null;
        p064h0.c cVar = map instanceof p064h0.c ? (p064h0.c) map : null;
        if (cVar == null) {
            p089k0.i iVar = map instanceof p089k0.i ? (p089k0.i) map : null;
            if (iVar != null) {
                cVarA = iVar.a();
            }
        } else {
            cVarA = cVar;
        }
        if (cVarA == null) {
            super.putAll(map);
            return;
        }
        p081j0.a aVar = new p081j0.a();
        aVar.f23867a = 0;
        int i3 = this.f24420l;
        p064h0.k kVar = this.f24418i;
        p064h0.k kVar2 = cVarA.f22432h;
        kotlin.jvm.internal.m.c(kVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f24418i = kVar.m(kVar2, 0, aVar, this);
        int i9 = (cVarA.f22433i + i3) - aVar.f23867a;
        if (i3 != i9) {
            e(i9);
        }
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        int i3 = this.f24420l;
        p064h0.k kVarO = this.f24418i.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (kVarO == null) {
            kVarO = p064h0.k.f22446e;
        }
        this.f24418i = kVarO;
        return i3 != this.f24420l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f24420l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection values() {
        return new p064h0.h(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object remove(java.lang.Object obj) {
        if (obj instanceof p020c0.AbstractC1697o0) {
            return (p020c0.h1) d((p020c0.AbstractC1697o0) obj);
        }
        return null;
    }
}
