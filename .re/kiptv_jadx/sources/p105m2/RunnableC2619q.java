package p105m2;

/* JADX INFO: renamed from: m2.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2619q implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f25352h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p105m2.C2604b f25353i;
    public final /* synthetic */ p105m2.C2617o j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f25354k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p105m2.AbstractC2620s f25355l;

    public /* synthetic */ RunnableC2619q(p105m2.AbstractC2620s abstractC2620s, p105m2.C2604b c2604b, p105m2.C2617o c2617o, java.util.ArrayList arrayList, int i3) {
        this.f25352h = i3;
        this.f25355l = abstractC2620s;
        this.f25353i = c2604b;
        this.j = c2617o;
        this.f25354k = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25352h) {
            case 0:
                java.util.ArrayList arrayList = this.f25354k;
                this.f25353i.a(this.f25355l, this.j, arrayList);
                break;
            default:
                this.f25353i.a(this.f25355l, this.j, this.f25354k);
                break;
        }
    }
}
