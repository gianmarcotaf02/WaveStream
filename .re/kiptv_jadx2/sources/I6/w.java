package I6;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;

public abstract class w extends x {

    public final boolean f5542e;

    public w(Method method, boolean z6, int i3) {
        this(method, (i3 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z6, method.getGenericParameterTypes());
    }

    public final Object f(Object[] args, Object obj) {
        kotlin.jvm.internal.m.e(args, "args");
        return this.f5542e ? p070h6.A.f22523a : ((Method) this.f5543a).invoke(obj, Arrays.copyOf(args, args.length));
    }

    public w(Method method, boolean z6, Type[] typeArr) {
        Type genericReturnType = method.getGenericReturnType();
        kotlin.jvm.internal.m.d(genericReturnType, "getGenericReturnType(...)");
        super(method, genericReturnType, z6 ? method.getDeclaringClass() : null, typeArr);
        this.f5542e = genericReturnType.equals(Void.TYPE);
    }
}
