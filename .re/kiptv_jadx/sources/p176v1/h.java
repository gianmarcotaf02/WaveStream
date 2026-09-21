package p176v1;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.res.ColorStateList f29131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.res.Configuration f29132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29133c;

    public h(android.content.res.ColorStateList colorStateList, android.content.res.Configuration configuration, android.content.res.Resources.Theme theme) {
        this.f29131a = colorStateList;
        this.f29132b = configuration;
        this.f29133c = theme == null ? 0 : theme.hashCode();
    }
}
