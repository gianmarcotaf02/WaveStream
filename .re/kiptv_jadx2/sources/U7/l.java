package U7;

import S7.InterfaceC0894j;

public abstract class l {

    public static final s f10196a = new s(-1, null, null, 0);

    public static final int f10197b = X7.a.l(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");

    public static final int f10198c = X7.a.l(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    public static final N6.A f10199d = new N6.A("BUFFERED", 2);

    public static final N6.A f10200e = new N6.A("SHOULD_BUFFER", 2);

    public static final N6.A f10201f = new N6.A("S_RESUMING_BY_RCV", 2);
    public static final N6.A g = new N6.A("RESUMING_BY_EB", 2);

    public static final N6.A f10202h = new N6.A("POISONED", 2);

    public static final N6.A f10203i = new N6.A("DONE_RCV", 2);
    public static final N6.A j = new N6.A("INTERRUPTED_SEND", 2);

    public static final N6.A f10204k = new N6.A("INTERRUPTED_RCV", 2);

    public static final N6.A f10205l = new N6.A("CHANNEL_CLOSED", 2);

    public static final N6.A f10206m = new N6.A("SUSPEND", 2);

    public static final N6.A f10207n = new N6.A("SUSPEND_NO_WAITER", 2);

    public static final N6.A f10208o = new N6.A("FAILED", 2);

    public static final N6.A f10209p = new N6.A("NO_RECEIVE_RESULT", 2);

    public static final N6.A f10210q = new N6.A("CLOSE_HANDLER_CLOSED", 2);

    public static final N6.A f10211r = new N6.A("CLOSE_HANDLER_INVOKED", 2);

    public static final N6.A f10212s = new N6.A("NO_CLOSE_CAUSE", 2);

    public static final boolean a(InterfaceC0894j interfaceC0894j, Object obj, p194x6.n nVar) {
        N6.A aN = interfaceC0894j.n(obj, nVar);
        if (aN == null) {
            return false;
        }
        interfaceC0894j.o(aN);
        return true;
    }
}
