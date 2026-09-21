package io.ktor.network.selector;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aS\u0010\r\u001a\u00028\u0001\"\f\b\u0000\u0010\u0007*\u00060\u0005j\u0002`\u0006\"\u0004\b\u0001\u0010\b*\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"Ll6/h;", "dispatcher", "Lio/ktor/network/selector/SelectorManager;", "SelectorManager", "(Ll6/h;)Lio/ktor/network/selector/SelectorManager;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "C", "R", "Lkotlin/Function1;", "Ljava/nio/channels/spi/SelectorProvider;", "create", "setup", "buildOrClose", "(Lio/ktor/network/selector/SelectorManager;Lx6/j;Lx6/j;)Ljava/lang/Object;", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SelectorManagerKt {
    public static final io.ktor.network.selector.SelectorManager SelectorManager(p100l6.h dispatcher) {
        kotlin.jvm.internal.m.e(dispatcher, "dispatcher");
        return new io.ktor.network.selector.ActorSelectorManager(dispatcher);
    }

    public static /* synthetic */ io.ktor.network.selector.SelectorManager SelectorManager$default(p100l6.h hVar, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            hVar = p100l6.i.f24820h;
        }
        return SelectorManager(hVar);
    }

    public static final <C extends java.io.Closeable, R> R buildOrClose(io.ktor.network.selector.SelectorManager selectorManager, p194x6.j create, p194x6.j setup) throws java.io.IOException {
        kotlin.jvm.internal.m.e(selectorManager, "<this>");
        kotlin.jvm.internal.m.e(create, "create");
        kotlin.jvm.internal.m.e(setup, "setup");
        java.io.Closeable closeable = (java.io.Closeable) create.invoke(selectorManager.getProvider());
        try {
            return (R) setup.invoke(closeable);
        } catch (java.lang.Throwable th) {
            closeable.close();
            throw th;
        }
    }
}
