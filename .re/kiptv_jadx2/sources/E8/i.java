package E8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class i implements InvocationHandler {

    public final ArrayList f3307a;

    public boolean f3308b;

    public String f3309c;

    public i(ArrayList arrayList) {
        this.f3307a = arrayList;
    }

    @Override
    public final Object invoke(Object proxy, Method method, Object[] objArr) {
        kotlin.jvm.internal.m.e(proxy, "proxy");
        kotlin.jvm.internal.m.e(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (kotlin.jvm.internal.m.a(name, "supports") && kotlin.jvm.internal.m.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (kotlin.jvm.internal.m.a(name, "unsupported") && kotlin.jvm.internal.m.a(Void.TYPE, returnType)) {
            this.f3308b = true;
            return null;
        }
        boolean zA = kotlin.jvm.internal.m.a(name, "protocols");
        ArrayList arrayList = this.f3307a;
        if (zA && objArr.length == 0) {
            return arrayList;
        }
        if ((kotlin.jvm.internal.m.a(name, "selectProtocol") || kotlin.jvm.internal.m.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj = objArr[0];
            if (obj instanceof List) {
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj;
                int size = list.size();
                if (size >= 0) {
                    int i3 = 0;
                    while (true) {
                        Object obj2 = list.get(i3);
                        kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj2;
                        if (arrayList.contains(str)) {
                            this.f3309c = str;
                            return str;
                        }
                        if (i3 != size) {
                            i3++;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f3309c = str2;
                return str2;
            }
        }
        if ((!kotlin.jvm.internal.m.a(name, "protocolSelected") && !kotlin.jvm.internal.m.a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj3 = objArr[0];
        kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type kotlin.String");
        this.f3309c = (String) obj3;
        return null;
    }
}
