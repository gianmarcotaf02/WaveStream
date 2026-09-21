package V1;

import T1.v;
import android.text.Editable;

public final class a extends Editable.Factory {

    public static final Object f10230a = new Object();

    public static volatile a f10231b;

    public static Class f10232c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f10232c;
        return cls != null ? new v(cls, charSequence) : super.newEditable(charSequence);
    }
}
