package kotlinx.serialization.descriptors;

import com.google.android.gms.internal.play_billing.V0;
import java.util.List;
import p078i6.w;

public interface SerialDescriptor {
    String a();

    V0 c();

    default boolean d() {
        return false;
    }

    int e(String str);

    int f();

    String g(int i3);

    default List getAnnotations() {
        return w.f23205h;
    }

    List h(int i3);

    SerialDescriptor i(int i3);

    default boolean isInline() {
        return false;
    }

    boolean j(int i3);
}
