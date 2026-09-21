package O7;

import java.util.Iterator;

public final class c implements N7.m {

    public final CharSequence f8033a;

    public final int f8034b;

    public final p194x6.m f8035c;

    public c(CharSequence input, int i3, p194x6.m mVar) {
        kotlin.jvm.internal.m.e(input, "input");
        this.f8033a = input;
        this.f8034b = i3;
        this.f8035c = mVar;
    }

    @Override
    public final Iterator iterator() {
        return new b(this);
    }
}
