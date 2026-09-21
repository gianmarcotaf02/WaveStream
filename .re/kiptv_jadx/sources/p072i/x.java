package p072i;

/* JADX INFO: loaded from: classes.dex */
public final class x implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.view.View f22729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f22730i;
    public java.lang.reflect.Method j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public android.content.Context f22731k;

    public x(android.view.View view, java.lang.String str) {
        this.f22729h = view;
        this.f22730i = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.reflect.Method method;
        if (this.j != null) {
            break;
        }
        android.view.View view2 = this.f22729h;
        android.content.Context context = view2.getContext();
        while (true) {
            java.lang.String str2 = this.f22730i;
            if (context == null) {
                int id = view2.getId();
                if (id == -1) {
                    str = "";
                } else {
                    str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                }
                java.lang.StringBuilder sbQ = com.google.android.gms.internal.play_billing.M0.q("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                sbQ.append(view2.getClass());
                sbQ.append(str);
                throw new java.lang.IllegalStateException(sbQ.toString());
            }
            try {
                if (!context.isRestricted() && (method = context.getClass().getMethod(str2, android.view.View.class)) != null) {
                    this.j = method;
                    this.f22731k = context;
                    break;
                }
            } catch (java.lang.NoSuchMethodException unused) {
            }
            context = context instanceof android.content.ContextWrapper ? ((android.content.ContextWrapper) context).getBaseContext() : null;
        }
        try {
            this.j.invoke(this.f22731k, view);
        } catch (java.lang.IllegalAccessException e6) {
            throw new java.lang.IllegalStateException("Could not execute non-public method for android:onClick", e6);
        } catch (java.lang.reflect.InvocationTargetException e9) {
            throw new java.lang.IllegalStateException("Could not execute method for android:onClick", e9);
        }
    }
}
