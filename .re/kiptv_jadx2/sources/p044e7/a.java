package p044e7;

import p194x6.m;

public final class a implements m {

    public static final a f21439i = new a(0);
    public static final a j = new a(1);

    public final int f21440h;

    public a(int i3) {
        this.f21440h = i3;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        c loadConstantFromProperty = (c) obj;
        o it = (o) obj2;
        switch (this.f21440h) {
            case 0:
                kotlin.jvm.internal.m.e(loadConstantFromProperty, "$this$loadConstantFromProperty");
                kotlin.jvm.internal.m.e(it, "it");
                return loadConstantFromProperty.f21446c.get(it);
            default:
                kotlin.jvm.internal.m.e(loadConstantFromProperty, "$this$loadConstantFromProperty");
                kotlin.jvm.internal.m.e(it, "it");
                return loadConstantFromProperty.f21445b.get(it);
        }
    }
}
