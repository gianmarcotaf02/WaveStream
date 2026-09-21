package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1542y extends androidx.lifecycle.AbstractC1534p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p120o.a f16378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.EnumC1533o f16379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f16380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16381f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f16383i;
    public final V7.n0 j;

    public C1542y(androidx.lifecycle.InterfaceC1540w interfaceC1540w, boolean z6) {
        this.f16369a = new androidx.lifecycle.i0();
        this.f16377b = z6;
        this.f16378c = new p120o.a();
        androidx.lifecycle.EnumC1533o enumC1533o = androidx.lifecycle.EnumC1533o.f16365i;
        this.f16379d = enumC1533o;
        this.f16383i = new java.util.ArrayList();
        this.f16380e = new java.lang.ref.WeakReference(interfaceC1540w);
        this.j = V7.r.b(enumC1533o);
    }

    @Override // androidx.lifecycle.AbstractC1534p
    public final void a(androidx.lifecycle.InterfaceC1539v observer) {
        androidx.lifecycle.InterfaceC1538u c1525g;
        java.lang.Object obj;
        androidx.lifecycle.InterfaceC1540w interfaceC1540w;
        androidx.lifecycle.EnumC1532n enumC1532n;
        java.util.ArrayList arrayList = this.f16383i;
        int i3 = 0;
        kotlin.jvm.internal.m.e(observer, "observer");
        d("addObserver");
        androidx.lifecycle.EnumC1533o enumC1533o = this.f16379d;
        androidx.lifecycle.EnumC1533o enumC1533o2 = androidx.lifecycle.EnumC1533o.f16364h;
        if (enumC1533o != enumC1533o2) {
            enumC1533o2 = androidx.lifecycle.EnumC1533o.f16365i;
        }
        androidx.lifecycle.C1541x c1541x = new androidx.lifecycle.C1541x();
        java.util.HashMap map = androidx.lifecycle.A.f16270a;
        boolean z6 = observer instanceof androidx.lifecycle.InterfaceC1538u;
        boolean z9 = observer instanceof androidx.lifecycle.DefaultLifecycleObserver;
        if (z6 && z9) {
            c1525g = new androidx.lifecycle.C1525g((androidx.lifecycle.DefaultLifecycleObserver) observer, (androidx.lifecycle.InterfaceC1538u) observer);
        } else if (z9) {
            c1525g = new androidx.lifecycle.C1525g((androidx.lifecycle.DefaultLifecycleObserver) observer, (androidx.lifecycle.InterfaceC1538u) null);
        } else if (z6) {
            c1525g = (androidx.lifecycle.InterfaceC1538u) observer;
        } else {
            java.lang.Class<?> cls = observer.getClass();
            if (androidx.lifecycle.A.b(cls) == 2) {
                java.lang.Object obj2 = androidx.lifecycle.A.f16271b.get(cls);
                kotlin.jvm.internal.m.b(obj2);
                java.util.List list = (java.util.List) obj2;
                if (list.size() == 1) {
                    androidx.lifecycle.A.a((java.lang.reflect.Constructor) list.get(0), observer);
                    throw null;
                }
                int size = list.size();
                androidx.lifecycle.InterfaceC1527i[] interfaceC1527iArr = new androidx.lifecycle.InterfaceC1527i[size];
                if (size > 0) {
                    androidx.lifecycle.A.a((java.lang.reflect.Constructor) list.get(0), observer);
                    throw null;
                }
                c1525g = new androidx.lifecycle.C1523e(i3, interfaceC1527iArr);
            } else {
                c1525g = new androidx.lifecycle.C1525g(observer);
            }
        }
        c1541x.f16376b = c1525g;
        c1541x.f16375a = enumC1533o2;
        p120o.a aVar = this.f16378c;
        p120o.c cVarD = aVar.d(observer);
        if (cVarD != null) {
            obj = cVarD.f25955i;
        } else {
            java.util.HashMap map2 = aVar.f25951l;
            p120o.c cVar = new p120o.c(observer, c1541x);
            aVar.f25961k++;
            p120o.c cVar2 = aVar.f25960i;
            if (cVar2 == null) {
                aVar.f25959h = cVar;
                aVar.f25960i = cVar;
            } else {
                cVar2.j = cVar;
                cVar.f25956k = cVar2;
                aVar.f25960i = cVar;
            }
            map2.put(observer, cVar);
            obj = null;
        }
        if (((androidx.lifecycle.C1541x) obj) == null && (interfaceC1540w = (androidx.lifecycle.InterfaceC1540w) this.f16380e.get()) != null) {
            i3 = (this.f16381f != 0 || this.g) ? 1 : 0;
            androidx.lifecycle.EnumC1533o enumC1533oC = c(observer);
            this.f16381f++;
            while (c1541x.f16375a.compareTo(enumC1533oC) < 0 && this.f16378c.f25951l.containsKey(observer)) {
                arrayList.add(c1541x.f16375a);
                androidx.lifecycle.C1530l c1530l = androidx.lifecycle.EnumC1532n.Companion;
                androidx.lifecycle.EnumC1533o state = c1541x.f16375a;
                c1530l.getClass();
                kotlin.jvm.internal.m.e(state, "state");
                int iOrdinal = state.ordinal();
                if (iOrdinal == 1) {
                    enumC1532n = androidx.lifecycle.EnumC1532n.ON_CREATE;
                } else if (iOrdinal != 2) {
                    enumC1532n = iOrdinal != 3 ? null : androidx.lifecycle.EnumC1532n.ON_RESUME;
                } else {
                    enumC1532n = androidx.lifecycle.EnumC1532n.ON_START;
                }
                if (enumC1532n == null) {
                    throw new java.lang.IllegalStateException("no event up from " + c1541x.f16375a);
                }
                c1541x.a(interfaceC1540w, enumC1532n);
                arrayList.remove(arrayList.size() - 1);
                enumC1533oC = c(observer);
            }
            if (i3 == 0) {
                h();
            }
            this.f16381f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC1534p
    public final void b(androidx.lifecycle.InterfaceC1539v observer) {
        kotlin.jvm.internal.m.e(observer, "observer");
        d("removeObserver");
        this.f16378c.e(observer);
    }

    public final androidx.lifecycle.EnumC1533o c(androidx.lifecycle.InterfaceC1539v interfaceC1539v) {
        java.util.HashMap map = this.f16378c.f25951l;
        p120o.c cVar = map.containsKey(interfaceC1539v) ? ((p120o.c) map.get(interfaceC1539v)).f25956k : null;
        androidx.lifecycle.EnumC1533o enumC1533o = cVar != null ? ((androidx.lifecycle.C1541x) cVar.f25955i).f16375a : null;
        java.util.ArrayList arrayList = this.f16383i;
        androidx.lifecycle.EnumC1533o enumC1533o2 = arrayList.isEmpty() ? null : (androidx.lifecycle.EnumC1533o) com.google.android.gms.internal.play_billing.M0.j(1, arrayList);
        androidx.lifecycle.EnumC1533o state1 = this.f16379d;
        kotlin.jvm.internal.m.e(state1, "state1");
        if (enumC1533o == null || enumC1533o.compareTo(state1) >= 0) {
            enumC1533o = state1;
        }
        return (enumC1533o2 == null || enumC1533o2.compareTo(enumC1533o) >= 0) ? enumC1533o : enumC1533o2;
    }

    public final void d(java.lang.String str) {
        if (this.f16377b) {
            p111n.a.m0().f25518a.getClass();
            if (android.os.Looper.getMainLooper().getThread() != java.lang.Thread.currentThread()) {
                throw new java.lang.IllegalStateException(Y6.f.h("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(androidx.lifecycle.EnumC1532n event) {
        kotlin.jvm.internal.m.e(event, "event");
        d("handleLifecycleEvent");
        f(event.a());
    }

    public final void f(androidx.lifecycle.EnumC1533o next) {
        if (this.f16379d == next) {
            return;
        }
        androidx.lifecycle.InterfaceC1540w interfaceC1540w = (androidx.lifecycle.InterfaceC1540w) this.f16380e.get();
        androidx.lifecycle.EnumC1533o current = this.f16379d;
        kotlin.jvm.internal.m.e(current, "current");
        kotlin.jvm.internal.m.e(next, "next");
        if (current == androidx.lifecycle.EnumC1533o.f16365i && next == androidx.lifecycle.EnumC1533o.f16364h) {
            throw new java.lang.IllegalStateException(("State must be at least '" + androidx.lifecycle.EnumC1533o.j + "' to be moved to '" + next + "' in component " + interfaceC1540w).toString());
        }
        androidx.lifecycle.EnumC1533o enumC1533o = androidx.lifecycle.EnumC1533o.f16364h;
        if (current == enumC1533o && current != next) {
            throw new java.lang.IllegalStateException(("State is '" + enumC1533o + "' and cannot be moved to `" + next + "` in component " + interfaceC1540w).toString());
        }
        this.f16379d = next;
        if (this.g || this.f16381f != 0) {
            this.f16382h = true;
            return;
        }
        this.g = true;
        h();
        this.g = false;
        if (this.f16379d == enumC1533o) {
            this.f16378c = new p120o.a();
        }
    }

    public final void g(androidx.lifecycle.EnumC1533o state) {
        kotlin.jvm.internal.m.e(state, "state");
        d("setCurrentState");
        f(state);
    }

    public final void h() {
        androidx.lifecycle.EnumC1532n enumC1532n;
        androidx.lifecycle.EnumC1532n enumC1532n2;
        androidx.lifecycle.InterfaceC1540w interfaceC1540w = (androidx.lifecycle.InterfaceC1540w) this.f16380e.get();
        if (interfaceC1540w == null) {
            throw new java.lang.IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            p120o.a aVar = this.f16378c;
            if (aVar.f25961k != 0) {
                p120o.c cVar = aVar.f25959h;
                kotlin.jvm.internal.m.b(cVar);
                androidx.lifecycle.EnumC1533o enumC1533o = ((androidx.lifecycle.C1541x) cVar.f25955i).f16375a;
                p120o.c cVar2 = this.f16378c.f25960i;
                kotlin.jvm.internal.m.b(cVar2);
                androidx.lifecycle.EnumC1533o enumC1533o2 = ((androidx.lifecycle.C1541x) cVar2.f25955i).f16375a;
                if (enumC1533o == enumC1533o2 && this.f16379d == enumC1533o2) {
                    break;
                }
                this.f16382h = false;
                androidx.lifecycle.EnumC1533o enumC1533o3 = this.f16379d;
                p120o.c cVar3 = this.f16378c.f25959h;
                kotlin.jvm.internal.m.b(cVar3);
                if (enumC1533o3.compareTo(((androidx.lifecycle.C1541x) cVar3.f25955i).f16375a) < 0) {
                    p120o.a aVar2 = this.f16378c;
                    p120o.b bVar = new p120o.b(aVar2.f25960i, aVar2.f25959h, 1);
                    aVar2.j.put(bVar, java.lang.Boolean.FALSE);
                    while (bVar.hasNext() && !this.f16382h) {
                        java.util.Map.Entry entry = (java.util.Map.Entry) bVar.next();
                        kotlin.jvm.internal.m.b(entry);
                        androidx.lifecycle.InterfaceC1539v interfaceC1539v = (androidx.lifecycle.InterfaceC1539v) entry.getKey();
                        androidx.lifecycle.C1541x c1541x = (androidx.lifecycle.C1541x) entry.getValue();
                        while (c1541x.f16375a.compareTo(this.f16379d) > 0 && !this.f16382h && this.f16378c.f25951l.containsKey(interfaceC1539v)) {
                            androidx.lifecycle.C1530l c1530l = androidx.lifecycle.EnumC1532n.Companion;
                            androidx.lifecycle.EnumC1533o state = c1541x.f16375a;
                            c1530l.getClass();
                            kotlin.jvm.internal.m.e(state, "state");
                            int iOrdinal = state.ordinal();
                            if (iOrdinal == 2) {
                                enumC1532n2 = androidx.lifecycle.EnumC1532n.ON_DESTROY;
                            } else if (iOrdinal != 3) {
                                enumC1532n2 = iOrdinal != 4 ? null : androidx.lifecycle.EnumC1532n.ON_PAUSE;
                            } else {
                                enumC1532n2 = androidx.lifecycle.EnumC1532n.ON_STOP;
                            }
                            if (enumC1532n2 == null) {
                                throw new java.lang.IllegalStateException("no event down from " + c1541x.f16375a);
                            }
                            this.f16383i.add(enumC1532n2.a());
                            c1541x.a(interfaceC1540w, enumC1532n2);
                            java.util.ArrayList arrayList = this.f16383i;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                p120o.c cVar4 = this.f16378c.f25960i;
                if (!this.f16382h && cVar4 != null && this.f16379d.compareTo(((androidx.lifecycle.C1541x) cVar4.f25955i).f16375a) > 0) {
                    p120o.a aVar3 = this.f16378c;
                    aVar3.getClass();
                    p120o.d dVar = new p120o.d(aVar3);
                    aVar3.j.put(dVar, java.lang.Boolean.FALSE);
                    while (dVar.hasNext() && !this.f16382h) {
                        java.util.Map.Entry entry2 = (java.util.Map.Entry) dVar.next();
                        androidx.lifecycle.InterfaceC1539v interfaceC1539v2 = (androidx.lifecycle.InterfaceC1539v) entry2.getKey();
                        androidx.lifecycle.C1541x c1541x2 = (androidx.lifecycle.C1541x) entry2.getValue();
                        while (c1541x2.f16375a.compareTo(this.f16379d) < 0 && !this.f16382h && this.f16378c.f25951l.containsKey(interfaceC1539v2)) {
                            this.f16383i.add(c1541x2.f16375a);
                            androidx.lifecycle.C1530l c1530l2 = androidx.lifecycle.EnumC1532n.Companion;
                            androidx.lifecycle.EnumC1533o state2 = c1541x2.f16375a;
                            c1530l2.getClass();
                            kotlin.jvm.internal.m.e(state2, "state");
                            int iOrdinal2 = state2.ordinal();
                            if (iOrdinal2 == 1) {
                                enumC1532n = androidx.lifecycle.EnumC1532n.ON_CREATE;
                            } else if (iOrdinal2 != 2) {
                                enumC1532n = iOrdinal2 != 3 ? null : androidx.lifecycle.EnumC1532n.ON_RESUME;
                            } else {
                                enumC1532n = androidx.lifecycle.EnumC1532n.ON_START;
                            }
                            if (enumC1532n == null) {
                                throw new java.lang.IllegalStateException("no event up from " + c1541x2.f16375a);
                            }
                            c1541x2.a(interfaceC1540w, enumC1532n);
                            java.util.ArrayList arrayList2 = this.f16383i;
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.f16382h = false;
        this.j.h(this.f16379d);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1542y(androidx.lifecycle.InterfaceC1540w provider) {
        this(provider, true);
        kotlin.jvm.internal.m.e(provider, "provider");
    }
}
