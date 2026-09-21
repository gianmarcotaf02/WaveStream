package p146r1;

import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

public final class C2682e extends o implements Function0 {

    public static final C2682e f26735i = new C2682e(0, 0);
    public static final C2682e j = new C2682e(0, 1);

    public static final C2682e f26736k = new C2682e(0, 2);

    public static final C2682e f26737l = new C2682e(0, 3);

    public final int f26738h;

    public C2682e(int i3, int i9) {
        super(i3);
        this.f26738h = i9;
    }

    @Override
    public final Object invoke() {
        switch (this.f26738h) {
            case 0:
                return UUID.randomUUID();
            case 1:
                return Boolean.FALSE;
            case 2:
                return "DEFAULT_TEST_TAG";
            default:
                return UUID.randomUUID();
        }
    }
}
