package io.github.jan.supabase.realtime;

import androidx.media3.container.NalUnitUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0086\b\u001a%\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0086\b¨\u0006\u0007"}, d2 = {"decodeJoinsAs", "", "T", "Lio/github/jan/supabase/realtime/PresenceAction;", "ignoreOtherTypes", "", "decodeLeavesAs", "realtime-kt_release"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PresenceActionKt {
    public static final <T> List<T> decodeJoinsAs(PresenceAction presenceAction, boolean z6) {
        m.e(presenceAction, "<this>");
        Collection<Presence> collectionValues = presenceAction.getJoins().values();
        ArrayList arrayList = new ArrayList();
        for (Presence presence : collectionValues) {
            PresenceActionImpl presenceActionImpl = (PresenceActionImpl) presenceAction;
            if (!z6) {
                presenceActionImpl.getSerializer();
                presence.getState().toString();
                m.j();
                throw null;
            }
            presenceActionImpl.getSerializer();
            try {
                presence.getState().toString();
                m.j();
                throw null;
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public static List decodeJoinsAs$default(PresenceAction presenceAction, boolean z6, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z6 = true;
        }
        m.e(presenceAction, "<this>");
        Collection<Presence> collectionValues = presenceAction.getJoins().values();
        ArrayList arrayList = new ArrayList();
        for (Presence presence : collectionValues) {
            PresenceActionImpl presenceActionImpl = (PresenceActionImpl) presenceAction;
            if (!z6) {
                presenceActionImpl.getSerializer();
                presence.getState().toString();
                m.j();
                throw null;
            }
            presenceActionImpl.getSerializer();
            try {
                presence.getState().toString();
                m.j();
                throw null;
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public static final <T> List<T> decodeLeavesAs(PresenceAction presenceAction, boolean z6) {
        m.e(presenceAction, "<this>");
        Collection<Presence> collectionValues = presenceAction.getLeaves().values();
        ArrayList arrayList = new ArrayList();
        for (Presence presence : collectionValues) {
            PresenceActionImpl presenceActionImpl = (PresenceActionImpl) presenceAction;
            if (!z6) {
                presenceActionImpl.getSerializer();
                presence.getState().toString();
                m.j();
                throw null;
            }
            presenceActionImpl.getSerializer();
            try {
                presence.getState().toString();
                m.j();
                throw null;
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public static List decodeLeavesAs$default(PresenceAction presenceAction, boolean z6, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z6 = true;
        }
        m.e(presenceAction, "<this>");
        Collection<Presence> collectionValues = presenceAction.getLeaves().values();
        ArrayList arrayList = new ArrayList();
        for (Presence presence : collectionValues) {
            PresenceActionImpl presenceActionImpl = (PresenceActionImpl) presenceAction;
            if (!z6) {
                presenceActionImpl.getSerializer();
                presence.getState().toString();
                m.j();
                throw null;
            }
            presenceActionImpl.getSerializer();
            try {
                presence.getState().toString();
                m.j();
                throw null;
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }
}
