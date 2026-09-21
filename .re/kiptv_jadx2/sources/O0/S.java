package O0;

import java.util.ArrayList;
import java.util.List;

public interface S {
    default int a(InterfaceC0728q interfaceC0728q, List list, int i3) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.add(new C0720i((Q) list.get(i9), r.f7684h, EnumC0729s.f7687i, 0));
        }
        return g(new C0731u(interfaceC0728q, interfaceC0728q.getLayoutDirection()), arrayList, p113n1.b.b(i3, 0, 13)).a();
    }

    default int b(InterfaceC0728q interfaceC0728q, List list, int i3) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.add(new C0720i((Q) list.get(i9), r.f7684h, EnumC0729s.f7686h, 0));
        }
        return g(new C0731u(interfaceC0728q, interfaceC0728q.getLayoutDirection()), arrayList, p113n1.b.b(0, i3, 7)).b();
    }

    default int c(InterfaceC0728q interfaceC0728q, List list, int i3) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.add(new C0720i((Q) list.get(i9), r.f7685i, EnumC0729s.f7686h, 0));
        }
        return g(new C0731u(interfaceC0728q, interfaceC0728q.getLayoutDirection()), arrayList, p113n1.b.b(0, i3, 7)).b();
    }

    default int d(InterfaceC0728q interfaceC0728q, List list, int i3) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.add(new C0720i((Q) list.get(i9), r.f7685i, EnumC0729s.f7687i, 0));
        }
        return g(new C0731u(interfaceC0728q, interfaceC0728q.getLayoutDirection()), arrayList, p113n1.b.b(i3, 0, 13)).a();
    }

    T g(U u6, List list, long j);
}
