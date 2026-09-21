package T6;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public final class C0925c implements p194x6.j {

    public static final C0925c f9845i = new C0925c(0);
    public static final C0925c j = new C0925c(1);

    public static final C0925c f9846k = new C0925c(2);

    public static final C0925c f9847l = new C0925c(3);

    public final int f9848h;

    public C0925c(int i3) {
        this.f9848h = i3;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f9848h) {
            case 0:
                ParameterizedType it = (ParameterizedType) obj;
                List list = AbstractC0926d.f9849a;
                kotlin.jvm.internal.m.e(it, "it");
                Type ownerType = it.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 1:
                ParameterizedType it2 = (ParameterizedType) obj;
                List list2 = AbstractC0926d.f9849a;
                kotlin.jvm.internal.m.e(it2, "it");
                Type[] actualTypeArguments = it2.getActualTypeArguments();
                kotlin.jvm.internal.m.d(actualTypeArguments, "getActualTypeArguments(...)");
                return p078i6.m.T(actualTypeArguments);
            case 2:
                return Boolean.valueOf(((Class) obj).getSimpleName().length() == 0);
            default:
                String simpleName = ((Class) obj).getSimpleName();
                if (!p101l7.e.f(simpleName)) {
                    simpleName = null;
                }
                if (simpleName != null) {
                    return p101l7.e.e(simpleName);
                }
                return null;
        }
    }
}
