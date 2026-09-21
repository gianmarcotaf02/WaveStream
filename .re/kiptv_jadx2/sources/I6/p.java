package I6;

import java.lang.reflect.Field;

public final class p extends q {

    public final int f5536f;

    public p(Field field, boolean z6, boolean z9, int i3) {
        super(field, z6, z9);
        this.f5536f = i3;
    }

    @Override
    public void d(Object[] args) {
        switch (this.f5536f) {
            case 1:
                kotlin.jvm.internal.m.e(args, "args");
                super.d(args);
                e(p078i6.m.n0(args));
                break;
            default:
                super.d(args);
                break;
        }
    }
}
