package H1;

/* JADX INFO: loaded from: classes.dex */
public final class i implements android.view.ActionMode.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.ActionMode.Callback f3866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f3867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Class f3868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.reflect.Method f3869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3871f = false;

    public i(android.view.ActionMode.Callback callback, android.widget.TextView textView) {
        this.f3866a = callback;
        this.f3867b = textView;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(android.view.ActionMode actionMode, android.view.MenuItem menuItem) {
        return this.f3866a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
        return this.f3866a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(android.view.ActionMode actionMode) {
        this.f3866a.onDestroyActionMode(actionMode);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
        java.lang.String str;
        android.widget.TextView textView = this.f3867b;
        android.content.Context context = textView.getContext();
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        boolean z6 = this.f3871f;
        java.lang.Class cls = java.lang.Integer.TYPE;
        if (!z6) {
            this.f3871f = true;
            try {
                java.lang.Class<?> cls2 = java.lang.Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.f3868c = cls2;
                this.f3869d = cls2.getDeclaredMethod("removeItemAt", cls);
                this.f3870e = true;
            } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
                this.f3868c = null;
                this.f3869d = null;
                this.f3870e = false;
            }
        }
        try {
            java.lang.reflect.Method declaredMethod = (this.f3870e && this.f3868c.isInstance(menu)) ? this.f3869d : menu.getClass().getDeclaredMethod("removeItemAt", cls);
            for (int size = menu.size() - 1; size >= 0; size--) {
                android.view.MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    declaredMethod.invoke(menu, java.lang.Integer.valueOf(size));
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (context instanceof android.app.Activity) {
                for (android.content.pm.ResolveInfo resolveInfo : packageManager.queryIntentActivities(new android.content.Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                        android.content.pm.ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                        }
                    }
                    arrayList.add(resolveInfo);
                }
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                android.content.pm.ResolveInfo resolveInfo2 = (android.content.pm.ResolveInfo) arrayList.get(i3);
                android.view.MenuItem menuItemAdd = menu.add(0, 0, i3 + 100, resolveInfo2.loadLabel(packageManager));
                android.content.Intent intentPutExtra = new android.content.Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof android.text.Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()));
                android.content.pm.ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                menuItemAdd.setIntent(intentPutExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused2) {
        }
        return this.f3866a.onPrepareActionMode(actionMode, menu);
    }
}
