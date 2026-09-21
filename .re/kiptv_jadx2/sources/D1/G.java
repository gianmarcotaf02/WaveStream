package D1;

import android.text.TextUtils;
import android.view.View;

public final class G extends I {

    public final int f1968l;

    public G(int i3, Class cls, int i9, int i10, int i11) {
        this.f1968l = i11;
        this.f1970h = i3;
        this.f1972k = cls;
        this.j = i9;
        this.f1971i = i10;
    }

    @Override
    public final Object c(View view) {
        switch (this.f1968l) {
            case 0:
                return Boolean.valueOf(O.c(view));
            case 1:
                return O.a(view);
            default:
                return Boolean.valueOf(O.b(view));
        }
    }

    @Override
    public final void d(View view, Object obj) {
        switch (this.f1968l) {
            case 0:
                O.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                O.e(view, (CharSequence) obj);
                break;
            default:
                O.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override
    public final boolean i(Object obj, Object obj2) {
        switch (this.f1968l) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
