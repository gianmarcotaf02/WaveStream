package D6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1911f;
import java.util.Iterator;

public abstract class a implements Iterable, p201y6.a {

    public final char f2451h;

    public final char f2452i;
    public final int j = 1;

    public a(char c9, char c10) {
        this.f2451h = c9;
        this.f2452i = (char) AbstractC1911f.x(c9, c10, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f2451h, this.f2452i, this.j);
    }
}
