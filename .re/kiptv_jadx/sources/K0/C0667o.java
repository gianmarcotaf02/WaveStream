package K0;

/* JADX INFO: renamed from: K0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0667o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f6724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K0.C0661i f6725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6729f;

    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    public C0667o(java.util.List list, K0.C0661i c0661i) {
        android.view.MotionEvent motionEventA;
        this.f6724a = list;
        this.f6725b = c0661i;
        int i3 = 0;
        this.f6726c = (android.os.Build.VERSION.SDK_INT < 29 || (motionEventA = a()) == null) ? 0 : motionEventA.getClassification();
        android.view.MotionEvent motionEventA2 = a();
        this.f6727d = motionEventA2 != null ? motionEventA2.getButtonState() : 0;
        android.view.MotionEvent motionEventA3 = a();
        this.f6728e = motionEventA3 != null ? motionEventA3.getMetaState() : 0;
        android.view.MotionEvent motionEventA4 = a();
        if (motionEventA4 != null) {
            int actionMasked = motionEventA4.getActionMasked();
            if (actionMasked == 0) {
                i3 = 1;
            } else if (actionMasked == 1) {
                i3 = 2;
            } else if (actionMasked != 2) {
                switch (actionMasked) {
                    case 5:
                        i3 = 1;
                        break;
                    case 6:
                        i3 = 2;
                        break;
                    case 7:
                        i3 = 3;
                        break;
                    case 8:
                        i3 = 6;
                        break;
                    case 9:
                        i3 = 4;
                        break;
                    case 10:
                        i3 = 5;
                        break;
                }
            } else {
                i3 = 3;
            }
        } else {
            int size = list.size();
            while (true) {
                if (i3 < size) {
                    K0.x xVar = (K0.x) list.get(i3);
                    if (K0.w.d(xVar)) {
                        i3 = 2;
                    } else if (K0.w.b(xVar)) {
                        i3 = 1;
                    } else {
                        i3++;
                    }
                } else {
                    i3 = 3;
                }
            }
        }
        this.f6729f = i3;
    }

    public final android.view.MotionEvent a() {
        K0.C0661i c0661i = this.f6725b;
        if (c0661i != null) {
            return (android.view.MotionEvent) ((S.p) c0661i.f6708d).j;
        }
        return null;
    }
}
