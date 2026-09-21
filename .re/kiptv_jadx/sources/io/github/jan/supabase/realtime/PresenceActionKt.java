package io.github.jan.supabase.realtime;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0086\b\u001a%\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0086\b¨\u0006\u0007"}, d2 = {"decodeJoinsAs", "", "T", "Lio/github/jan/supabase/realtime/PresenceAction;", "ignoreOtherTypes", "", "decodeLeavesAs", "realtime-kt_release"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PresenceActionKt {
    public static final <T> java.util.List<T> decodeJoinsAs(io.github.jan.supabase.realtime.PresenceAction presenceAction, boolean z6) {
        kotlin.jvm.internal.m.e(presenceAction, "<this>");
        java.util.Collection<io.github.jan.supabase.realtime.Presence> collectionValues = presenceAction.getJoins().values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (io.github.jan.supabase.realtime.Presence presence : collectionValues) {
            io.github.jan.supabase.realtime.PresenceActionImpl presenceActionImpl = (io.github.jan.supabase.realtime.PresenceActionImpl) presenceAction;
            if (!z6) {
                presenceActionImpl.getSerializer();
                presence.getState().toString();
                kotlin.jvm.internal.m.j();
                throw null;
            }
            presenceActionImpl.getSerializer();
            try {
                presence.getState().toString();
                kotlin.jvm.internal.m.j();
                throw null;
            } catch (java.lang.Exception unused) {
            }
        }
        return arrayList;
    }

    public static java.util.List decodeJoinsAs$default(io.github.jan.supabase.realtime.PresenceAction presenceAction, boolean z6, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            z6 = true;
        }
        kotlin.jvm.internal.m.e(presenceAction, "<this>");
        java.util.Collection<io.github.jan.supabase.realtime.Presence> collectionValues = presenceAction.getJoins().values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (io.github.jan.supabase.realtime.Presence presence : collectionValues) {
            io.github.jan.supabase.realtime.PresenceActionImpl presenceActionImpl = (io.github.jan.supabase.realtime.PresenceActionImpl) presenceAction;
            if (!z6) {
                presenceActionImpl.getSerializer();
                presence.getState().toString();
                kotlin.jvm.internal.m.j();
                throw null;
            }
            presenceActionImpl.getSerializer();
            try {
                presence.getState().toString();
                kotlin.jvm.internal.m.j();
                throw null;
            } catch (java.lang.Exception unused) {
            }
        }
        return arrayList;
    }

    public static final <T> java.util.List<T> decodeLeavesAs(io.github.jan.supabase.realtime.PresenceAction presenceAction, boolean z6) {
        kotlin.jvm.internal.m.e(presenceAction, "<this>");
        java.util.Collection<io.github.jan.supabase.realtime.Presence> collectionValues = presenceAction.getLeaves().values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (io.github.jan.supabase.realtime.Presence presence : collectionValues) {
            io.github.jan.supabase.realtime.PresenceActionImpl presenceActionImpl = (io.github.jan.supabase.realtime.PresenceActionImpl) presenceAction;
            if (!z6) {
                presenceActionImpl.getSerializer();
                presence.getState().toString();
                kotlin.jvm.internal.m.j();
                throw null;
            }
            presenceActionImpl.getSerializer();
            try {
                presence.getState().toString();
                kotlin.jvm.internal.m.j();
                throw null;
            } catch (java.lang.Exception unused) {
            }
        }
        return arrayList;
    }

    public static java.util.List decodeLeavesAs$default(io.github.jan.supabase.realtime.PresenceAction presenceAction, boolean z6, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            z6 = true;
        }
        kotlin.jvm.internal.m.e(presenceAction, "<this>");
        java.util.Collection<io.github.jan.supabase.realtime.Presence> collectionValues = presenceAction.getLeaves().values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (io.github.jan.supabase.realtime.Presence presence : collectionValues) {
            io.github.jan.supabase.realtime.PresenceActionImpl presenceActionImpl = (io.github.jan.supabase.realtime.PresenceActionImpl) presenceAction;
            if (!z6) {
                presenceActionImpl.getSerializer();
                presence.getState().toString();
                kotlin.jvm.internal.m.j();
                throw null;
            }
            presenceActionImpl.getSerializer();
            try {
                presence.getState().toString();
                kotlin.jvm.internal.m.j();
                throw null;
            } catch (java.lang.Exception unused) {
            }
        }
        return arrayList;
    }
}
