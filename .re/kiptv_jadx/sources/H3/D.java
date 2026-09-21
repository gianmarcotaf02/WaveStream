package H3;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3942c;

    public /* synthetic */ D(int i3, java.lang.String str, boolean z6) {
        this.f3940a = i3;
        this.f3941b = str;
        this.f3942c = z6;
    }

    public boolean a() {
        return this.f3942c;
    }

    public java.lang.String toString() {
        switch (this.f3940a) {
            case 1:
                java.lang.String str = this.f3941b;
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 7);
                sb.append("{");
                sb.append(str);
                sb.append("}");
                sb.append(this.f3942c);
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
