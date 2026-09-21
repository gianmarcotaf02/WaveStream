package T6;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

public final class u extends w {

    public final Field f9871a;

    public u(Field member) {
        kotlin.jvm.internal.m.e(member, "member");
        this.f9871a = member;
    }

    @Override
    public final Member b() {
        return this.f9871a;
    }
}
