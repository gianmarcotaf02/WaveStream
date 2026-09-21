package androidx.media3.session;

import android.net.Uri;
import java.util.concurrent.Callable;

public final class m1 implements Callable {

    public final int f17078a;

    public final Object f17079b;

    public m1(int i3, Object obj) {
        this.f17078a = i3;
        this.f17079b = obj;
    }

    @Override
    public final Object call() {
        switch (this.f17078a) {
            case 0:
                return SimpleBitmapLoader.load((Uri) this.f17079b);
            default:
                return SimpleBitmapLoader.decode((byte[]) this.f17079b);
        }
    }
}
