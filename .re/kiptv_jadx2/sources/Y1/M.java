package Y1;

import android.util.Log;
import java.io.Writer;

public final class M extends Writer implements AutoCloseable {

    public final StringBuilder f11229i = new StringBuilder(128);

    public final String f11228h = "FragmentManager";

    public final void b() {
        StringBuilder sb = this.f11229i;
        if (sb.length() > 0) {
            Log.d(this.f11228h, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override
    public final void close() {
        b();
    }

    @Override
    public final void flush() {
        b();
    }

    @Override
    public final void write(char[] cArr, int i3, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            char c9 = cArr[i3 + i10];
            if (c9 == '\n') {
                b();
            } else {
                this.f11229i.append(c9);
            }
        }
    }
}
