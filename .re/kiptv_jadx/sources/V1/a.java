package V1;

/* JADX INFO: loaded from: classes.dex */
public final class a extends android.text.Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f10230a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile V1.a f10231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static java.lang.Class f10232c;

    @Override // android.text.Editable.Factory
    public final android.text.Editable newEditable(java.lang.CharSequence charSequence) {
        java.lang.Class cls = f10232c;
        return cls != null ? new T1.v(cls, charSequence) : super.newEditable(charSequence);
    }
}
