package io.ktor.network.selector;

import androidx.media3.container.NalUnitUtil;
import java.io.Closeable;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p100l6.h;
import p100l6.i;
import p194x6.j;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aS\u0010\r\u001a\u00028\u0001\"\f\b\u0000\u0010\u0007*\u00060\u0005j\u0002`\u0006\"\u0004\b\u0001\u0010\b*\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"Ll6/h;", "dispatcher", "Lio/ktor/network/selector/SelectorManager;", "SelectorManager", "(Ll6/h;)Lio/ktor/network/selector/SelectorManager;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "C", "R", "Lkotlin/Function1;", "Ljava/nio/channels/spi/SelectorProvider;", "create", "setup", "buildOrClose", "(Lio/ktor/network/selector/SelectorManager;Lx6/j;Lx6/j;)Ljava/lang/Object;", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SelectorManagerKt {
    public static final SelectorManager SelectorManager(h dispatcher) {
        m.e(dispatcher, "dispatcher");
        return new ActorSelectorManager(dispatcher);
    }

    public static SelectorManager SelectorManager$default(h hVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            hVar = i.f24820h;
        }
        return SelectorManager(hVar);
    }

    public static final <C extends Closeable, R> R buildOrClose(SelectorManager selectorManager, j create, j setup) throws IOException {
        m.e(selectorManager, "<this>");
        m.e(create, "create");
        m.e(setup, "setup");
        Closeable closeable = (Closeable) create.invoke(selectorManager.getProvider());
        try {
            return (R) setup.invoke(closeable);
        } catch (Throwable th) {
            closeable.close();
            throw th;
        }
    }
}
