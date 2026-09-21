package I6;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

public abstract class m extends x {
    public m(Field field, boolean z6) {
        Type genericType = field.getGenericType();
        kotlin.jvm.internal.m.d(genericType, "getGenericType(...)");
        super(field, genericType, z6 ? field.getDeclaringClass() : null, new Type[0]);
    }

    @Override
    public Object call(Object[] args) {
        kotlin.jvm.internal.m.e(args, "args");
        d(args);
        return ((Field) this.f5543a).get(this.f5545c != null ? p078i6.m.m0(args) : null);
    }
}
