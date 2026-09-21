package B6;

import java.util.Random;
import kotlin.jvm.internal.m;

public final class b extends a {
    public final B4.a j = new B4.a(4);

    @Override
    public final Random j() {
        Object obj = this.j.get();
        m.d(obj, "get(...)");
        return (Random) obj;
    }
}
