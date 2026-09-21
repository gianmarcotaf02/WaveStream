package io.ktor.network.selector;

import E6.InterfaceC0330c;
import I3.b;
import S7.InterfaceC0894j;
import androidx.media3.container.NalUnitUtil;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.r;
import p194x6.j;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ5\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u000f\u001a\u00020\u00072\u001e\u0010\u000e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0011H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0012J\u001d\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 "}, d2 = {"Lio/ktor/network/selector/InterestSuspensionsMap;", "", "<init>", "()V", "Lio/ktor/network/selector/SelectInterest;", "interest", "LS7/j;", "Lh6/A;", "continuation", "addSuspension", "(Lio/ktor/network/selector/SelectInterest;LS7/j;)V", "", "readyOps", "Lkotlin/Function1;", "block", "invokeForEachPresent", "(ILx6/j;)V", "Lkotlin/Function2;", "(Lx6/m;)V", "removeSuspension", "(Lio/ktor/network/selector/SelectInterest;)LS7/j;", "interestOrdinal", "(I)LS7/j;", "", "toString", "()Ljava/lang/String;", "readHandlerReference", "LS7/j;", "writeHandlerReference", "connectHandlerReference", "acceptHandlerReference", "Companion", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class InterestSuspensionsMap {

    public static final Companion INSTANCE = new Companion(null);
    private static final AtomicReferenceFieldUpdater<InterestSuspensionsMap, InterfaceC0894j>[] updaters;
    private volatile InterfaceC0894j acceptHandlerReference;
    private volatile InterfaceC0894j connectHandlerReference;
    private volatile InterfaceC0894j readHandlerReference;
    private volatile InterfaceC0894j writeHandlerReference;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bR4\u0010\r\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00060\f8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u000f\u0010\u0003¨\u0006\u0010"}, d2 = {"Lio/ktor/network/selector/InterestSuspensionsMap$Companion;", "", "<init>", "()V", "Lio/ktor/network/selector/SelectInterest;", "interest", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lio/ktor/network/selector/InterestSuspensionsMap;", "LS7/j;", "Lh6/A;", "updater", "(Lio/ktor/network/selector/SelectInterest;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "", "updaters", "[Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "getUpdaters$annotations", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        private static void getUpdaters$annotations() {
        }

        public final AtomicReferenceFieldUpdater<InterestSuspensionsMap, InterfaceC0894j> updater(SelectInterest interest) {
            return InterestSuspensionsMap.updaters[interest.ordinal()];
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SelectInterest.values().length];
            try {
                iArr[SelectInterest.READ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelectInterest.WRITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelectInterest.ACCEPT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SelectInterest.CONNECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        InterfaceC0330c interfaceC0330c;
        SelectInterest[] allInterests = SelectInterest.INSTANCE.getAllInterests();
        ArrayList arrayList = new ArrayList(allInterests.length);
        for (SelectInterest selectInterest : allInterests) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[selectInterest.ordinal()];
            if (i3 == 1) {
                interfaceC0330c = new r() {
                    @Override
                    public Object get(Object obj) {
                        return ((InterestSuspensionsMap) obj).readHandlerReference;
                    }

                    @Override
                    public void set(Object obj, Object obj2) {
                        ((InterestSuspensionsMap) obj).readHandlerReference = (InterfaceC0894j) obj2;
                    }
                };
            } else if (i3 == 2) {
                interfaceC0330c = new r() {
                    @Override
                    public Object get(Object obj) {
                        return ((InterestSuspensionsMap) obj).writeHandlerReference;
                    }

                    @Override
                    public void set(Object obj, Object obj2) {
                        ((InterestSuspensionsMap) obj).writeHandlerReference = (InterfaceC0894j) obj2;
                    }
                };
            } else if (i3 == 3) {
                interfaceC0330c = new r() {
                    @Override
                    public Object get(Object obj) {
                        return ((InterestSuspensionsMap) obj).acceptHandlerReference;
                    }

                    @Override
                    public void set(Object obj, Object obj2) {
                        ((InterestSuspensionsMap) obj).acceptHandlerReference = (InterfaceC0894j) obj2;
                    }
                };
            } else {
                if (i3 != 4) {
                    throw new b();
                }
                interfaceC0330c = new r() {
                    @Override
                    public Object get(Object obj) {
                        return ((InterestSuspensionsMap) obj).connectHandlerReference;
                    }

                    @Override
                    public void set(Object obj, Object obj2) {
                        ((InterestSuspensionsMap) obj).connectHandlerReference = (InterfaceC0894j) obj2;
                    }
                };
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater = AtomicReferenceFieldUpdater.newUpdater(InterestSuspensionsMap.class, InterfaceC0894j.class, interfaceC0330c.getName());
            m.c(atomicReferenceFieldUpdaterNewUpdater, "null cannot be cast to non-null type java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.ktor.network.selector.InterestSuspensionsMap, kotlinx.coroutines.CancellableContinuation<kotlin.Unit>?>");
            arrayList.add(atomicReferenceFieldUpdaterNewUpdater);
        }
        updaters = (AtomicReferenceFieldUpdater[]) arrayList.toArray(new AtomicReferenceFieldUpdater[0]);
    }

    public final void addSuspension(SelectInterest interest, InterfaceC0894j continuation) {
        m.e(interest, "interest");
        m.e(continuation, "continuation");
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterUpdater = INSTANCE.updater(interest);
        while (!atomicReferenceFieldUpdaterUpdater.compareAndSet(this, null, continuation)) {
            if (atomicReferenceFieldUpdaterUpdater.get(this) != null) {
                throw new IllegalStateException(("Handler for " + interest.name() + " is already registered").toString());
            }
        }
    }

    public final void invokeForEachPresent(int readyOps, j block) {
        InterfaceC0894j interfaceC0894jRemoveSuspension;
        m.e(block, "block");
        int[] flags = SelectInterest.INSTANCE.getFlags();
        int length = flags.length;
        for (int i3 = 0; i3 < length; i3++) {
            if ((flags[i3] & readyOps) != 0 && (interfaceC0894jRemoveSuspension = removeSuspension(i3)) != null) {
                block.invoke(interfaceC0894jRemoveSuspension);
            }
        }
    }

    public final InterfaceC0894j removeSuspension(SelectInterest interest) {
        m.e(interest, "interest");
        return (InterfaceC0894j) INSTANCE.updater(interest).getAndSet(this, null);
    }

    public String toString() {
        return "R " + this.readHandlerReference + " W " + this.writeHandlerReference + " C " + this.connectHandlerReference + " A " + this.acceptHandlerReference;
    }

    public final InterfaceC0894j removeSuspension(int interestOrdinal) {
        return updaters[interestOrdinal].getAndSet(this, null);
    }

    public final void invokeForEachPresent(p194x6.m block) {
        m.e(block, "block");
        for (SelectInterest selectInterest : SelectInterest.INSTANCE.getAllInterests()) {
            InterfaceC0894j interfaceC0894jRemoveSuspension = removeSuspension(selectInterest);
            if (interfaceC0894jRemoveSuspension != null) {
                block.invoke(interfaceC0894jRemoveSuspension, selectInterest);
            }
        }
    }
}
