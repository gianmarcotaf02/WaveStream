package p089k0;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;
import p020c0.AbstractC1697o0;
import p020c0.h1;
import p064h0.c;
import p064h0.f;
import p064h0.h;
import p064h0.k;
import p081j0.a;
import p081j0.b;
import p201y6.d;

public final class i extends AbstractMap implements Map, d {

    public b f24417h = new b();

    public k f24418i;
    public Object j;

    public int f24419k;

    public int f24420l;

    public j f24421m;

    public i(j jVar) {
        this.f24418i = jVar.f22432h;
        this.f24420l = jVar.f22433i;
        this.f24421m = jVar;
    }

    public final j a() {
        k kVar = this.f24418i;
        j jVar = this.f24421m;
        if (kVar != jVar.f22432h) {
            this.f24417h = new b();
            jVar = new j(this.f24418i, this.f24420l);
        }
        this.f24421m = jVar;
        return jVar;
    }

    public final boolean b(Object obj) {
        return this.f24418i.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final Object c(Object obj) {
        return this.f24418i.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override
    public final void clear() {
        this.f24418i = k.f22446e;
        e(0);
    }

    @Override
    public final boolean containsKey(Object obj) {
        if (obj instanceof AbstractC1697o0) {
            return b((AbstractC1697o0) obj);
        }
        return false;
    }

    @Override
    public final boolean containsValue(Object obj) {
        if (obj instanceof h1) {
            return super.containsValue((h1) obj);
        }
        return false;
    }

    public final Object d(Object obj) {
        this.j = null;
        k kVarN = this.f24418i.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (kVarN == null) {
            kVarN = k.f22446e;
        }
        this.f24418i = kVarN;
        return this.j;
    }

    public final void e(int i3) {
        this.f24420l = i3;
        this.f24419k++;
    }

    @Override
    public final Set entrySet() {
        return new f(0, this);
    }

    @Override
    public final Object get(Object obj) {
        if (obj instanceof AbstractC1697o0) {
            return (h1) c((AbstractC1697o0) obj);
        }
        return null;
    }

    @Override
    public final Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC1697o0) ? obj2 : (h1) super.getOrDefault((AbstractC1697o0) obj, (h1) obj2);
    }

    @Override
    public final Set keySet() {
        return new f(1, this);
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        this.j = null;
        this.f24418i = this.f24418i.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.j;
    }

    @Override
    public final void putAll(Map map) {
        c cVarA = null;
        c cVar = map instanceof c ? (c) map : null;
        if (cVar == null) {
            i iVar = map instanceof i ? (i) map : null;
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
        a aVar = new a();
        aVar.f23867a = 0;
        int i3 = this.f24420l;
        k kVar = this.f24418i;
        k kVar2 = cVarA.f22432h;
        m.c(kVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f24418i = kVar.m(kVar2, 0, aVar, this);
        int i9 = (cVarA.f22433i + i3) - aVar.f23867a;
        if (i3 != i9) {
            e(i9);
        }
    }

    @Override
    public final boolean remove(Object obj, Object obj2) {
        int i3 = this.f24420l;
        k kVarO = this.f24418i.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (kVarO == null) {
            kVarO = k.f22446e;
        }
        this.f24418i = kVarO;
        return i3 != this.f24420l;
    }

    @Override
    public final int size() {
        return this.f24420l;
    }

    @Override
    public final Collection values() {
        return new h(0, this);
    }

    @Override
    public final Object remove(Object obj) {
        if (obj instanceof AbstractC1697o0) {
            return (h1) d((AbstractC1697o0) obj);
        }
        return null;
    }
}
