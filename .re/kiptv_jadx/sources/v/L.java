package v;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f28876a = android.view.ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f28877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double f28878c;

    static {
        double dLog = java.lang.Math.log(0.78d) / java.lang.Math.log(0.9d);
        f28877b = dLog;
        f28878c = dLog - 1.0d;
    }
}
