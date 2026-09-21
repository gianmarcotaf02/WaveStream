package I6;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

public abstract class q extends x {

    public final boolean f5537e;

    public q(Field field, boolean z6, boolean z9) {
        Class TYPE = Void.TYPE;
        kotlin.jvm.internal.m.d(TYPE, "TYPE");
        super(field, TYPE, z9 ? field.getDeclaringClass() : null, new Type[]{field.getGenericType()});
        this.f5537e = z6;
    }

    @Override
    public Object call(Object[] args) throws IllegalAccessException {
        kotlin.jvm.internal.m.e(args, "args");
        d(args);
        ((Field) this.f5543a).set(this.f5545c != null ? p078i6.m.m0(args) : null, p078i6.m.w0(args));
        return p070h6.A.f22523a;
    }

    @Override
    public void d(Object[] args) {
        kotlin.jvm.internal.m.e(args, "args");
        p199y3.e.k(this, args);
        if (this.f5537e && p078i6.m.w0(args) == null) {
            throw new IllegalArgumentException("null is not allowed as a value for this property.");
        }
    }
}
