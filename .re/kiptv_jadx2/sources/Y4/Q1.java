package Y4;

import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.function.Supplier;

public final class Q1 implements Supplier {

    public final int f11717a;

    @Override
    public final Object get() {
        switch (this.f11717a) {
            case 0:
                return new SimpleDateFormat("yyyyMMddHHmmss Z", Locale.US);
            default:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                return simpleDateFormat;
        }
    }
}
