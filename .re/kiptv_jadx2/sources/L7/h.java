package L7;

import D0.G;
import I7.p;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.m;
import p078i6.AbstractC2258i;
import p078i6.D;

public final class h extends AbstractC2258i {
    public static final int j = 0;

    public Object f7101h;

    public int f7102i;

    @Override
    public final boolean add(Object obj) {
        Object obj2;
        int i3 = this.f7102i;
        if (i3 == 0) {
            this.f7101h = obj;
        } else if (i3 == 1) {
            if (m.a(this.f7101h, obj)) {
                return false;
            }
            this.f7101h = new Object[]{this.f7101h, obj};
        } else if (i3 < 5) {
            Object obj3 = this.f7101h;
            m.c(obj3, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr = (Object[]) obj3;
            if (p078i6.m.W(objArr, obj)) {
                return false;
            }
            int i9 = this.f7102i;
            if (i9 == 4) {
                Object[] elements = Arrays.copyOf(objArr, objArr.length);
                m.e(elements, "elements");
                LinkedHashSet linkedHashSet = new LinkedHashSet(D.I0(elements.length));
                p078i6.m.D0(elements, linkedHashSet);
                linkedHashSet.add(obj);
                obj2 = linkedHashSet;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, i9 + 1);
                m.d(objArrCopyOf, "copyOf(...)");
                objArrCopyOf[objArrCopyOf.length - 1] = obj;
                obj2 = objArrCopyOf;
            }
            this.f7101h = obj2;
        } else {
            Object obj4 = this.f7101h;
            m.c(obj4, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!E.b(obj4).add(obj)) {
                return false;
            }
        }
        this.f7102i++;
        return true;
    }

    @Override
    public final void clear() {
        this.f7101h = null;
        this.f7102i = 0;
    }

    @Override
    public final boolean contains(Object obj) {
        if (d() == 0) {
            return false;
        }
        if (d() == 1) {
            return m.a(this.f7101h, obj);
        }
        if (d() < 5) {
            Object obj2 = this.f7101h;
            m.c(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return p078i6.m.W((Object[]) obj2, obj);
        }
        Object obj3 = this.f7101h;
        m.c(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override
    public final int d() {
        return this.f7102i;
    }

    @Override
    public final Iterator iterator() {
        int i3 = this.f7102i;
        if (i3 == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (i3 == 1) {
            return new p(1, this.f7101h);
        }
        if (i3 < 5) {
            Object obj = this.f7101h;
            m.c(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new G((Object[]) obj);
        }
        Object obj2 = this.f7101h;
        m.c(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return E.b(obj2).iterator();
    }
}
