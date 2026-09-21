package p072i;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.google.android.gms.internal.play_billing.M0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class x implements View.OnClickListener {

    public final View f22729h;

    public final String f22730i;
    public Method j;

    public Context f22731k;

    public x(View view, String str) {
        this.f22729h = view;
        this.f22730i = str;
    }

    @Override
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.j != null) {
            break;
        }
        View view2 = this.f22729h;
        Context context = view2.getContext();
        while (true) {
            String str2 = this.f22730i;
            if (context == null) {
                int id = view2.getId();
                if (id == -1) {
                    str = "";
                } else {
                    str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                }
                StringBuilder sbQ = M0.q("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                sbQ.append(view2.getClass());
                sbQ.append(str);
                throw new IllegalStateException(sbQ.toString());
            }
            try {
                if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                    this.j = method;
                    this.f22731k = context;
                    break;
                }
            } catch (NoSuchMethodException unused) {
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        }
        try {
            this.j.invoke(this.f22731k, view);
        } catch (IllegalAccessException e6) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e6);
        } catch (InvocationTargetException e9) {
            throw new IllegalStateException("Could not execute method for android:onClick", e9);
        }
    }
}
