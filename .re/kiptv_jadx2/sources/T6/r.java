package T6;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

public final class r extends w implements p027c7.e {

    public final Constructor f9869a;

    public r(Constructor member) {
        kotlin.jvm.internal.m.e(member, "member");
        this.f9869a = member;
    }

    @Override
    public final Member b() {
        return this.f9869a;
    }

    @Override
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f9869a.getTypeParameters();
        kotlin.jvm.internal.m.d(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new C(typeVariable));
        }
        return arrayList;
    }
}
