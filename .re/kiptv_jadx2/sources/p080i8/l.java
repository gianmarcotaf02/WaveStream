package p080i8;

import com.google.crypto.tink.shaded.protobuf.q0;
import java.util.Comparator;
import p070h6.k;

public final class l implements Comparator {

    public final int f23272h;

    public l(int i3) {
        this.f23272h = i3;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f23272h) {
            case 0:
                return q0.o(Integer.valueOf(((i) obj2).f23267a), Integer.valueOf(((i) obj).f23267a));
            default:
                return q0.o((String) ((k) obj).f22539h, (String) ((k) obj2).f22539h);
        }
    }
}
