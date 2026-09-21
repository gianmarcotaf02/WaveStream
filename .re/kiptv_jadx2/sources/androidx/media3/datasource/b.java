package androidx.media3.datasource;

import android.net.Uri;
import java.util.concurrent.Callable;

public final class b implements Callable {

    public final int f16471a;

    public final DataSourceBitmapLoader f16472b;

    public final Object f16473c;

    public b(DataSourceBitmapLoader dataSourceBitmapLoader, Object obj, int i3) {
        this.f16471a = i3;
        this.f16472b = dataSourceBitmapLoader;
        this.f16473c = obj;
    }

    @Override
    public final Object call() {
        switch (this.f16471a) {
            case 0:
                return this.f16472b.lambda$decodeBitmap$1((byte[]) this.f16473c);
            default:
                return this.f16472b.lambda$loadBitmap$2((Uri) this.f16473c);
        }
    }
}
