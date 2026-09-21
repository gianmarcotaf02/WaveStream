package I6;

import java.lang.reflect.Field;

public final class n extends q implements f {

    public final Object f5535f;

    public n(Field field, boolean z6, Object obj) {
        super(field, z6, false);
        kotlin.jvm.internal.m.e(field, "field");
        this.f5535f = obj;
    }

    @Override
    public final Object call(Object[] args) throws IllegalAccessException {
        kotlin.jvm.internal.m.e(args, "args");
        d(args);
        ((Field) this.f5543a).set(this.f5535f, p078i6.m.m0(args));
        return p070h6.A.f22523a;
    }
}
