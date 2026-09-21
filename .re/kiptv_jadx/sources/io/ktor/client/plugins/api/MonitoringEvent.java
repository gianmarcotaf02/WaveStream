package io.ktor.client.plugins.api;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00060\u0005B\u000f\u0012\u0006\u0010\b\u001a\u00028\u0001¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/client/plugins/api/MonitoringEvent;", "", "Param", "Lio/ktor/events/EventDefinition;", "Event", "Lio/ktor/client/plugins/api/ClientHook;", "Lkotlin/Function1;", "Lh6/A;", "event", "<init>", "(Lio/ktor/events/EventDefinition;)V", "Lio/ktor/client/HttpClient;", "client", "handler", "install", "(Lio/ktor/client/HttpClient;Lx6/j;)V", "Lio/ktor/events/EventDefinition;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class MonitoringEvent<Param, Event extends io.ktor.events.EventDefinition<Param>> implements io.ktor.client.plugins.api.ClientHook<p194x6.j> {
    private final Event event;

    public MonitoringEvent(Event event) {
        kotlin.jvm.internal.m.e(event, "event");
        this.event = event;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A install$lambda$0(p194x6.j jVar, java.lang.Object it) {
        kotlin.jvm.internal.m.e(it, "it");
        jVar.invoke(it);
        return p070h6.A.f22523a;
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public void install(io.ktor.client.HttpClient client, p194x6.j handler) {
        kotlin.jvm.internal.m.e(client, "client");
        kotlin.jvm.internal.m.e(handler, "handler");
        client.getMonitor().subscribe(this.event, new H5.O(10, handler));
    }
}
