package T6;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;

public final class x extends w implements p027c7.e {

    public final Method f9873a;

    public x(Method member) {
        kotlin.jvm.internal.m.e(member, "member");
        this.f9873a = member;
    }

    @Override
    public final Member b() {
        return this.f9873a;
    }

    public final B f() {
        Type genericReturnType = this.f9873a.getGenericReturnType();
        kotlin.jvm.internal.m.d(genericReturnType, "getGenericReturnType(...)");
        boolean z6 = genericReturnType instanceof Class;
        if (z6) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new z(cls);
            }
        }
        if ((genericReturnType instanceof GenericArrayType) || (z6 && ((Class) genericReturnType).isArray())) {
            return new i(genericReturnType);
        }
        return genericReturnType instanceof WildcardType ? new E((WildcardType) genericReturnType) : new q(genericReturnType);
    }

    public final List g() {
        Method method = this.f9873a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        kotlin.jvm.internal.m.d(genericParameterTypes, "getGenericParameterTypes(...)");
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        kotlin.jvm.internal.m.d(parameterAnnotations, "getParameterAnnotations(...)");
        return d(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }

    @Override
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.f9873a.getTypeParameters();
        kotlin.jvm.internal.m.d(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new C(typeVariable));
        }
        return arrayList;
    }
}
