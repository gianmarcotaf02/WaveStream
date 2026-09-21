package androidx.lifecycle;

import V7.n0;
import android.os.Looper;
import com.google.android.gms.internal.play_billing.M0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class C1542y extends AbstractC1534p {

    public final boolean f16377b;

    public p120o.a f16378c;

    public EnumC1533o f16379d;

    public final WeakReference f16380e;

    public int f16381f;
    public boolean g;

    public boolean f16382h;

    public final ArrayList f16383i;
    public final n0 j;

    public C1542y(InterfaceC1540w interfaceC1540w, boolean z6) {
        this.f16369a = new i0();
        this.f16377b = z6;
        this.f16378c = new p120o.a();
        EnumC1533o enumC1533o = EnumC1533o.f16365i;
        this.f16379d = enumC1533o;
        this.f16383i = new ArrayList();
        this.f16380e = new WeakReference(interfaceC1540w);
        this.j = V7.r.b(enumC1533o);
    }

    @Override
    public final void a(InterfaceC1539v observer) {
        InterfaceC1538u c1525g;
        Object obj;
        InterfaceC1540w interfaceC1540w;
        EnumC1532n enumC1532n;
        ArrayList arrayList = this.f16383i;
        int i3 = 0;
        kotlin.jvm.internal.m.e(observer, "observer");
        d("addObserver");
        EnumC1533o enumC1533o = this.f16379d;
        EnumC1533o enumC1533o2 = EnumC1533o.f16364h;
        if (enumC1533o != enumC1533o2) {
            enumC1533o2 = EnumC1533o.f16365i;
        }
        C1541x c1541x = new C1541x();
        HashMap map = A.f16270a;
        boolean z6 = observer instanceof InterfaceC1538u;
        boolean z9 = observer instanceof DefaultLifecycleObserver;
        if (z6 && z9) {
            c1525g = new C1525g((DefaultLifecycleObserver) observer, (InterfaceC1538u) observer);
        } else if (z9) {
            c1525g = new C1525g((DefaultLifecycleObserver) observer, (InterfaceC1538u) null);
        } else if (z6) {
            c1525g = (InterfaceC1538u) observer;
        } else {
            Class<?> cls = observer.getClass();
            if (A.b(cls) == 2) {
                Object obj2 = A.f16271b.get(cls);
                kotlin.jvm.internal.m.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    A.a((Constructor) list.get(0), observer);
                    throw null;
                }
                int size = list.size();
                InterfaceC1527i[] interfaceC1527iArr = new InterfaceC1527i[size];
                if (size > 0) {
                    A.a((Constructor) list.get(0), observer);
                    throw null;
                }
                c1525g = new C1523e(i3, interfaceC1527iArr);
            } else {
                c1525g = new C1525g(observer);
            }
        }
        c1541x.f16376b = c1525g;
        c1541x.f16375a = enumC1533o2;
        p120o.a aVar = this.f16378c;
        p120o.c cVarD = aVar.d(observer);
        if (cVarD != null) {
            obj = cVarD.f25955i;
        } else {
            HashMap map2 = aVar.f25951l;
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
        if (((C1541x) obj) == null && (interfaceC1540w = (InterfaceC1540w) this.f16380e.get()) != null) {
            i3 = (this.f16381f != 0 || this.g) ? 1 : 0;
            EnumC1533o enumC1533oC = c(observer);
            this.f16381f++;
            while (c1541x.f16375a.compareTo(enumC1533oC) < 0 && this.f16378c.f25951l.containsKey(observer)) {
                arrayList.add(c1541x.f16375a);
                C1530l c1530l = EnumC1532n.Companion;
                EnumC1533o state = c1541x.f16375a;
                c1530l.getClass();
                kotlin.jvm.internal.m.e(state, "state");
                int iOrdinal = state.ordinal();
                if (iOrdinal == 1) {
                    enumC1532n = EnumC1532n.ON_CREATE;
                } else if (iOrdinal != 2) {
                    enumC1532n = iOrdinal != 3 ? null : EnumC1532n.ON_RESUME;
                } else {
                    enumC1532n = EnumC1532n.ON_START;
                }
                if (enumC1532n == null) {
                    throw new IllegalStateException("no event up from " + c1541x.f16375a);
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

    @Override
    public final void b(InterfaceC1539v observer) {
        kotlin.jvm.internal.m.e(observer, "observer");
        d("removeObserver");
        this.f16378c.e(observer);
    }

    public final EnumC1533o c(InterfaceC1539v interfaceC1539v) {
        HashMap map = this.f16378c.f25951l;
        p120o.c cVar = map.containsKey(interfaceC1539v) ? ((p120o.c) map.get(interfaceC1539v)).f25956k : null;
        EnumC1533o enumC1533o = cVar != null ? ((C1541x) cVar.f25955i).f16375a : null;
        ArrayList arrayList = this.f16383i;
        EnumC1533o enumC1533o2 = arrayList.isEmpty() ? null : (EnumC1533o) M0.j(1, arrayList);
        EnumC1533o state1 = this.f16379d;
        kotlin.jvm.internal.m.e(state1, "state1");
        if (enumC1533o == null || enumC1533o.compareTo(state1) >= 0) {
            enumC1533o = state1;
        }
        return (enumC1533o2 == null || enumC1533o2.compareTo(enumC1533o) >= 0) ? enumC1533o : enumC1533o2;
    }

    public final void d(String str) {
        if (this.f16377b) {
            p111n.a.m0().f25518a.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(Y6.f.h("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(EnumC1532n event) {
        kotlin.jvm.internal.m.e(event, "event");
        d("handleLifecycleEvent");
        f(event.a());
    }

    public final void f(EnumC1533o next) {
        if (this.f16379d == next) {
            return;
        }
        InterfaceC1540w interfaceC1540w = (InterfaceC1540w) this.f16380e.get();
        EnumC1533o current = this.f16379d;
        kotlin.jvm.internal.m.e(current, "current");
        kotlin.jvm.internal.m.e(next, "next");
        if (current == EnumC1533o.f16365i && next == EnumC1533o.f16364h) {
            throw new IllegalStateException(("State must be at least '" + EnumC1533o.j + "' to be moved to '" + next + "' in component " + interfaceC1540w).toString());
        }
        EnumC1533o enumC1533o = EnumC1533o.f16364h;
        if (current == enumC1533o && current != next) {
            throw new IllegalStateException(("State is '" + enumC1533o + "' and cannot be moved to `" + next + "` in component " + interfaceC1540w).toString());
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

    public final void g(EnumC1533o state) {
        kotlin.jvm.internal.m.e(state, "state");
        d("setCurrentState");
        f(state);
    }

    public final void h() {
        EnumC1532n enumC1532n;
        EnumC1532n enumC1532n2;
        InterfaceC1540w interfaceC1540w = (InterfaceC1540w) this.f16380e.get();
        if (interfaceC1540w == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            p120o.a aVar = this.f16378c;
            if (aVar.f25961k != 0) {
                p120o.c cVar = aVar.f25959h;
                kotlin.jvm.internal.m.b(cVar);
                EnumC1533o enumC1533o = ((C1541x) cVar.f25955i).f16375a;
                p120o.c cVar2 = this.f16378c.f25960i;
                kotlin.jvm.internal.m.b(cVar2);
                EnumC1533o enumC1533o2 = ((C1541x) cVar2.f25955i).f16375a;
                if (enumC1533o == enumC1533o2 && this.f16379d == enumC1533o2) {
                    break;
                }
                this.f16382h = false;
                EnumC1533o enumC1533o3 = this.f16379d;
                p120o.c cVar3 = this.f16378c.f25959h;
                kotlin.jvm.internal.m.b(cVar3);
                if (enumC1533o3.compareTo(((C1541x) cVar3.f25955i).f16375a) < 0) {
                    p120o.a aVar2 = this.f16378c;
                    p120o.b bVar = new p120o.b(aVar2.f25960i, aVar2.f25959h, 1);
                    aVar2.j.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f16382h) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        kotlin.jvm.internal.m.b(entry);
                        InterfaceC1539v interfaceC1539v = (InterfaceC1539v) entry.getKey();
                        C1541x c1541x = (C1541x) entry.getValue();
                        while (c1541x.f16375a.compareTo(this.f16379d) > 0 && !this.f16382h && this.f16378c.f25951l.containsKey(interfaceC1539v)) {
                            C1530l c1530l = EnumC1532n.Companion;
                            EnumC1533o state = c1541x.f16375a;
                            c1530l.getClass();
                            kotlin.jvm.internal.m.e(state, "state");
                            int iOrdinal = state.ordinal();
                            if (iOrdinal == 2) {
                                enumC1532n2 = EnumC1532n.ON_DESTROY;
                            } else if (iOrdinal != 3) {
                                enumC1532n2 = iOrdinal != 4 ? null : EnumC1532n.ON_PAUSE;
                            } else {
                                enumC1532n2 = EnumC1532n.ON_STOP;
                            }
                            if (enumC1532n2 == null) {
                                throw new IllegalStateException("no event down from " + c1541x.f16375a);
                            }
                            this.f16383i.add(enumC1532n2.a());
                            c1541x.a(interfaceC1540w, enumC1532n2);
                            ArrayList arrayList = this.f16383i;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                p120o.c cVar4 = this.f16378c.f25960i;
                if (!this.f16382h && cVar4 != null && this.f16379d.compareTo(((C1541x) cVar4.f25955i).f16375a) > 0) {
                    p120o.a aVar3 = this.f16378c;
                    aVar3.getClass();
                    p120o.d dVar = new p120o.d(aVar3);
                    aVar3.j.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f16382h) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        InterfaceC1539v interfaceC1539v2 = (InterfaceC1539v) entry2.getKey();
                        C1541x c1541x2 = (C1541x) entry2.getValue();
                        while (c1541x2.f16375a.compareTo(this.f16379d) < 0 && !this.f16382h && this.f16378c.f25951l.containsKey(interfaceC1539v2)) {
                            this.f16383i.add(c1541x2.f16375a);
                            C1530l c1530l2 = EnumC1532n.Companion;
                            EnumC1533o state2 = c1541x2.f16375a;
                            c1530l2.getClass();
                            kotlin.jvm.internal.m.e(state2, "state");
                            int iOrdinal2 = state2.ordinal();
                            if (iOrdinal2 == 1) {
                                enumC1532n = EnumC1532n.ON_CREATE;
                            } else if (iOrdinal2 != 2) {
                                enumC1532n = iOrdinal2 != 3 ? null : EnumC1532n.ON_RESUME;
                            } else {
                                enumC1532n = EnumC1532n.ON_START;
                            }
                            if (enumC1532n == null) {
                                throw new IllegalStateException("no event up from " + c1541x2.f16375a);
                            }
                            c1541x2.a(interfaceC1540w, enumC1532n);
                            ArrayList arrayList2 = this.f16383i;
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

    public C1542y(InterfaceC1540w provider) {
        this(provider, true);
        kotlin.jvm.internal.m.e(provider, "provider");
    }
}
