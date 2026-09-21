package androidx.media3.datasource;

import java.util.Map;
import p068h4.l;

public final class d implements l {

    public final int f16474h;

    public d(int i3) {
        this.f16474h = i3;
    }

    @Override
    public final boolean apply(Object obj) {
        switch (this.f16474h) {
            case 0:
                return DefaultHttpDataSource.NullFilteringHeadersMap.lambda$entrySet$1((Map.Entry) obj);
            case 1:
                return DefaultHttpDataSource.NullFilteringHeadersMap.lambda$keySet$0((String) obj);
            default:
                return HttpDataSource.lambda$static$0((String) obj);
        }
    }
}
