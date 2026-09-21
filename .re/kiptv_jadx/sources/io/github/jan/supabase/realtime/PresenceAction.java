package io.github.jan.supabase.realtime;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u001e\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007\u0082\u0001\u0001\n¨\u0006\u000b"}, d2 = {"Lio/github/jan/supabase/realtime/PresenceAction;", "", "joins", "", "", "Lio/github/jan/supabase/realtime/Presence;", "getJoins", "()Ljava/util/Map;", "leaves", "getLeaves", "Lio/github/jan/supabase/realtime/PresenceActionImpl;", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface PresenceAction {
    java.util.Map<java.lang.String, io.github.jan.supabase.realtime.Presence> getJoins();

    java.util.Map<java.lang.String, io.github.jan.supabase.realtime.Presence> getLeaves();
}
