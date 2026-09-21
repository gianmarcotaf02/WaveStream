package A1;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class f implements Callable {

    public final int f136a;

    public final String f137b;

    public final Context f138c;

    public final int f139d;

    public final Object f140e;

    public f(String str, Context context, Object obj, int i3, int i9) {
        this.f136a = i9;
        this.f137b = str;
        this.f138c = context;
        this.f140e = obj;
        this.f139d = i3;
    }

    @Override
    public final Object call() {
        switch (this.f136a) {
            case 0:
                Object[] objArr = {(e) this.f140e};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return i.b(this.f137b, this.f138c, Collections.unmodifiableList(arrayList), this.f139d);
            default:
                try {
                    return i.b(this.f137b, this.f138c, (List) this.f140e, this.f139d);
                } catch (Throwable unused) {
                    return new h(-3);
                }
        }
    }
}
