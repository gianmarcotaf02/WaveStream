package io.ktor.events;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0000`\t¢\u0006\u0004\b\f\u0010\rJ?\u0010\u000e\u001a\u00020\b\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0000`\t¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\u00020\b\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lio/ktor/events/Events;", "", "<init>", "()V", "T", "Lio/ktor/events/EventDefinition;", "definition", "Lkotlin/Function1;", "Lh6/A;", "Lio/ktor/events/EventHandler;", "handler", "LS7/O;", "subscribe", "(Lio/ktor/events/EventDefinition;Lx6/j;)LS7/O;", "unsubscribe", "(Lio/ktor/events/EventDefinition;Lx6/j;)V", "value", "raise", "(Lio/ktor/events/EventDefinition;Ljava/lang/Object;)V", "Lio/ktor/util/collections/CopyOnWriteHashMap;", "Lio/ktor/util/internal/LockFreeLinkedListHead;", "handlers", "Lio/ktor/util/collections/CopyOnWriteHashMap;", "HandlerRegistration", "ktor-events"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Events {
    private final io.ktor.util.collections.CopyOnWriteHashMap<io.ktor.events.EventDefinition<?>, io.ktor.util.internal.LockFreeLinkedListHead> handlers = new io.ktor.util.collections.CopyOnWriteHashMap<>();

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00040\u0003j\u0006\u0012\u0002\b\u0003`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR)\u0010\u0006\u001a\u0014\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00040\u0003j\u0006\u0012\u0002\b\u0003`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/ktor/events/Events$HandlerRegistration;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "LS7/O;", "Lkotlin/Function1;", "Lh6/A;", "Lio/ktor/events/EventHandler;", "handler", "<init>", "(Lx6/j;)V", "dispose", "()V", "Lx6/j;", "getHandler", "()Lx6/j;", "ktor-events"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class HandlerRegistration extends io.ktor.util.internal.LockFreeLinkedListNode implements S7.O {
        private final p194x6.j handler;

        public HandlerRegistration(p194x6.j handler) {
            kotlin.jvm.internal.m.e(handler, "handler");
            this.handler = handler;
        }

        @Override // S7.O
        public void dispose() {
            remove();
        }

        public final p194x6.j getHandler() {
            return this.handler;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.util.internal.LockFreeLinkedListHead subscribe$lambda$0(io.ktor.events.EventDefinition it) {
        kotlin.jvm.internal.m.e(it, "it");
        return new io.ktor.util.internal.LockFreeLinkedListHead();
    }

    public final <T> void raise(io.ktor.events.EventDefinition<T> definition, T value) {
        kotlin.jvm.internal.m.e(definition, "definition");
        io.ktor.util.internal.LockFreeLinkedListHead lockFreeLinkedListHead = this.handlers.get(definition);
        java.lang.Throwable th = null;
        if (lockFreeLinkedListHead != null) {
            java.lang.Object next = lockFreeLinkedListHead.getNext();
            kotlin.jvm.internal.m.c(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            for (io.ktor.util.internal.LockFreeLinkedListNode nextNode = (io.ktor.util.internal.LockFreeLinkedListNode) next; !kotlin.jvm.internal.m.a(nextNode, lockFreeLinkedListHead); nextNode = nextNode.getNextNode()) {
                if (nextNode instanceof io.ktor.events.Events.HandlerRegistration) {
                    try {
                        p194x6.j handler = ((io.ktor.events.Events.HandlerRegistration) nextNode).getHandler();
                        kotlin.jvm.internal.m.c(handler, "null cannot be cast to non-null type kotlin.Function1<T of io.ktor.events.Events.raise, kotlin.Unit>");
                        kotlin.jvm.internal.E.c(1, handler);
                        handler.invoke(value);
                    } catch (java.lang.Throwable th2) {
                        if (th != null) {
                            com.google.common.util.concurrent.AbstractC1903s.j(th, th2);
                        } else {
                            th = th2;
                        }
                    }
                }
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public final <T> S7.O subscribe(io.ktor.events.EventDefinition<T> definition, p194x6.j handler) {
        kotlin.jvm.internal.m.e(definition, "definition");
        kotlin.jvm.internal.m.e(handler, "handler");
        io.ktor.events.Events.HandlerRegistration handlerRegistration = new io.ktor.events.Events.HandlerRegistration(handler);
        this.handlers.computeIfAbsent(definition, new io.ktor.client.plugins.sse.c(22)).addLast(handlerRegistration);
        return handlerRegistration;
    }

    public final <T> void unsubscribe(io.ktor.events.EventDefinition<T> definition, p194x6.j handler) {
        kotlin.jvm.internal.m.e(definition, "definition");
        kotlin.jvm.internal.m.e(handler, "handler");
        io.ktor.util.internal.LockFreeLinkedListHead lockFreeLinkedListHead = this.handlers.get(definition);
        if (lockFreeLinkedListHead != null) {
            java.lang.Object next = lockFreeLinkedListHead.getNext();
            kotlin.jvm.internal.m.c(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            for (io.ktor.util.internal.LockFreeLinkedListNode nextNode = (io.ktor.util.internal.LockFreeLinkedListNode) next; !kotlin.jvm.internal.m.a(nextNode, lockFreeLinkedListHead); nextNode = nextNode.getNextNode()) {
                if (nextNode instanceof io.ktor.events.Events.HandlerRegistration) {
                    io.ktor.events.Events.HandlerRegistration handlerRegistration = (io.ktor.events.Events.HandlerRegistration) nextNode;
                    if (kotlin.jvm.internal.m.a(handlerRegistration.getHandler(), handler)) {
                        handlerRegistration.remove();
                    }
                }
            }
        }
    }
}
