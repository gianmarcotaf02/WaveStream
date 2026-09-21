package L7;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends p078i6.AbstractC2258i {
    public static final /* synthetic */ int j = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f7101h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7102i;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object obj) {
        java.lang.Object obj2;
        int i3 = this.f7102i;
        if (i3 == 0) {
            this.f7101h = obj;
        } else if (i3 == 1) {
            if (kotlin.jvm.internal.m.a(this.f7101h, obj)) {
                return false;
            }
            this.f7101h = new java.lang.Object[]{this.f7101h, obj};
        } else if (i3 < 5) {
            java.lang.Object obj3 = this.f7101h;
            kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            java.lang.Object[] objArr = (java.lang.Object[]) obj3;
            if (p078i6.m.W(objArr, obj)) {
                return false;
            }
            int i9 = this.f7102i;
            if (i9 == 4) {
                java.lang.Object[] elements = java.util.Arrays.copyOf(objArr, objArr.length);
                kotlin.jvm.internal.m.e(elements, "elements");
                java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(p078i6.D.I0(elements.length));
                p078i6.m.D0(elements, linkedHashSet);
                linkedHashSet.add(obj);
                obj2 = linkedHashSet;
            } else {
                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, i9 + 1);
                kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
                objArrCopyOf[objArrCopyOf.length - 1] = obj;
                obj2 = objArrCopyOf;
            }
            this.f7101h = obj2;
        } else {
            java.lang.Object obj4 = this.f7101h;
            kotlin.jvm.internal.m.c(obj4, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!kotlin.jvm.internal.E.b(obj4).add(obj)) {
                return false;
            }
        }
        this.f7102i++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f7101h = null;
        this.f7102i = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        if (d() == 0) {
            return false;
        }
        if (d() == 1) {
            return kotlin.jvm.internal.m.a(this.f7101h, obj);
        }
        if (d() < 5) {
            java.lang.Object obj2 = this.f7101h;
            kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return p078i6.m.W((java.lang.Object[]) obj2, obj);
        }
        java.lang.Object obj3 = this.f7101h;
        kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((java.util.Set) obj3).contains(obj);
    }

    @Override // p078i6.AbstractC2258i
    public final int d() {
        return this.f7102i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        int i3 = this.f7102i;
        if (i3 == 0) {
            return java.util.Collections.EMPTY_SET.iterator();
        }
        if (i3 == 1) {
            return new I7.p(1, this.f7101h);
        }
        if (i3 < 5) {
            java.lang.Object obj = this.f7101h;
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new D0.G((java.lang.Object[]) obj);
        }
        java.lang.Object obj2 = this.f7101h;
        kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return kotlin.jvm.internal.E.b(obj2).iterator();
    }
}
