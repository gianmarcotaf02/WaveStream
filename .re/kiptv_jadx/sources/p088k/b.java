package p088k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends android.content.ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.content.res.Resources.Theme f24342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public android.view.LayoutInflater f24343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public android.content.res.Resources f24344d;

    public b(android.content.Context context, int i3) {
        super(context);
        this.f24341a = i3;
    }

    public final void a() {
        if (this.f24342b == null) {
            this.f24342b = getResources().newTheme();
            android.content.res.Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f24342b.setTo(theme);
            }
        }
        this.f24342b.applyStyle(this.f24341a, true);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.res.AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.res.Resources getResources() {
        if (this.f24344d == null) {
            this.f24344d = super.getResources();
        }
        return this.f24344d;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final java.lang.Object getSystemService(java.lang.String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f24343c == null) {
            this.f24343c = android.view.LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f24343c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.res.Resources.Theme getTheme() {
        android.content.res.Resources.Theme theme = this.f24342b;
        if (theme != null) {
            return theme;
        }
        if (this.f24341a == 0) {
            this.f24341a = com.kiptv.tv.R.style.Theme_AppCompat_Light;
        }
        a();
        return this.f24342b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i3) {
        if (this.f24341a != i3) {
            this.f24341a = i3;
            a();
        }
    }
}
