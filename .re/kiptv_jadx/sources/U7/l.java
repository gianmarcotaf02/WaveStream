package U7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U7.s f10196a = new U7.s(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f10197b = X7.a.l(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f10198c = X7.a.l(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final N6.A f10199d = new N6.A("BUFFERED", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final N6.A f10200e = new N6.A("SHOULD_BUFFER", 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final N6.A f10201f = new N6.A("S_RESUMING_BY_RCV", 2);
    public static final N6.A g = new N6.A("RESUMING_BY_EB", 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final N6.A f10202h = new N6.A("POISONED", 2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final N6.A f10203i = new N6.A("DONE_RCV", 2);
    public static final N6.A j = new N6.A("INTERRUPTED_SEND", 2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final N6.A f10204k = new N6.A("INTERRUPTED_RCV", 2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final N6.A f10205l = new N6.A("CHANNEL_CLOSED", 2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final N6.A f10206m = new N6.A("SUSPEND", 2);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final N6.A f10207n = new N6.A("SUSPEND_NO_WAITER", 2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final N6.A f10208o = new N6.A("FAILED", 2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final N6.A f10209p = new N6.A("NO_RECEIVE_RESULT", 2);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final N6.A f10210q = new N6.A("CLOSE_HANDLER_CLOSED", 2);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final N6.A f10211r = new N6.A("CLOSE_HANDLER_INVOKED", 2);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final N6.A f10212s = new N6.A("NO_CLOSE_CAUSE", 2);

    public static final boolean a(S7.InterfaceC0894j interfaceC0894j, java.lang.Object obj, p194x6.n nVar) {
        N6.A aN = interfaceC0894j.n(obj, nVar);
        if (aN == null) {
            return false;
        }
        interfaceC0894j.o(aN);
        return true;
    }
}
