package I6;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

public abstract class A implements g {

    public final Method f5499a;

    public final List f5500b;

    public final Class f5501c;

    public A(Method method, List list) {
        this.f5499a = method;
        this.f5500b = list;
        Class<?> returnType = method.getReturnType();
        kotlin.jvm.internal.m.d(returnType, "getReturnType(...)");
        this.f5501c = returnType;
    }

    @Override
    public final List a() {
        return this.f5500b;
    }

    @Override
    public final Member b() {
        return null;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final Type getReturnType() {
        return this.f5501c;
    }
}
