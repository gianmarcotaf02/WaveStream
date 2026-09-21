package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class C1520b {

    public final HashMap f16336a = new HashMap();

    public final HashMap f16337b;

    public C1520b(HashMap map) {
        this.f16337b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC1532n enumC1532n = (EnumC1532n) entry.getValue();
            List arrayList = (List) this.f16336a.get(enumC1532n);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f16336a.put(enumC1532n, arrayList);
            }
            arrayList.add((C1521c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC1540w interfaceC1540w, EnumC1532n enumC1532n, InterfaceC1539v interfaceC1539v) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C1521c c1521c = (C1521c) list.get(size);
                c1521c.getClass();
                try {
                    int i3 = c1521c.f16340a;
                    Method method = c1521c.f16341b;
                    if (i3 == 0) {
                        method.invoke(interfaceC1539v, null);
                    } else if (i3 == 1) {
                        method.invoke(interfaceC1539v, interfaceC1540w);
                    } else if (i3 == 2) {
                        method.invoke(interfaceC1539v, interfaceC1540w, enumC1532n);
                    }
                } catch (IllegalAccessException e6) {
                    throw new RuntimeException(e6);
                } catch (InvocationTargetException e9) {
                    throw new RuntimeException("Failed to call observer method", e9.getCause());
                }
            }
        }
    }
}
