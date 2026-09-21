package O0;

/* JADX INFO: loaded from: classes.dex */
public interface S {
    default int a(O0.InterfaceC0728q interfaceC0728q, java.util.List list, int i3) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.add(new O0.C0720i((O0.Q) list.get(i9), O0.r.f7684h, O0.EnumC0729s.f7687i, 0));
        }
        return g(new O0.C0731u(interfaceC0728q, interfaceC0728q.getLayoutDirection()), arrayList, p113n1.b.b(i3, 0, 13)).a();
    }

    default int b(O0.InterfaceC0728q interfaceC0728q, java.util.List list, int i3) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.add(new O0.C0720i((O0.Q) list.get(i9), O0.r.f7684h, O0.EnumC0729s.f7686h, 0));
        }
        return g(new O0.C0731u(interfaceC0728q, interfaceC0728q.getLayoutDirection()), arrayList, p113n1.b.b(0, i3, 7)).b();
    }

    default int c(O0.InterfaceC0728q interfaceC0728q, java.util.List list, int i3) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.add(new O0.C0720i((O0.Q) list.get(i9), O0.r.f7685i, O0.EnumC0729s.f7686h, 0));
        }
        return g(new O0.C0731u(interfaceC0728q, interfaceC0728q.getLayoutDirection()), arrayList, p113n1.b.b(0, i3, 7)).b();
    }

    default int d(O0.InterfaceC0728q interfaceC0728q, java.util.List list, int i3) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.add(new O0.C0720i((O0.Q) list.get(i9), O0.r.f7685i, O0.EnumC0729s.f7687i, 0));
        }
        return g(new O0.C0731u(interfaceC0728q, interfaceC0728q.getLayoutDirection()), arrayList, p113n1.b.b(i3, 0, 13)).a();
    }

    O0.T g(O0.U u6, java.util.List list, long j);
}
