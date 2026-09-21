package p174u4;

import android.content.Context;
import android.preference.PreferenceManager;
import o4.f;
import p103m.c1;

public final class a {

    public static final Object f28677b = new Object();

    public final f f28678a;

    public a(c1 c1Var) {
        Context context = (Context) c1Var.f25018h;
        String str = (String) c1Var.f25019i;
        String str2 = (String) c1Var.j;
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            applicationContext.getSharedPreferences(str2, 0).edit();
        }
        this.f28678a = (f) c1Var.f25023n;
    }
}
