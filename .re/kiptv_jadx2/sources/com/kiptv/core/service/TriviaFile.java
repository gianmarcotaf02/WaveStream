package com.kiptv.core.service;

import androidx.media3.container.NalUnitUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import p078i6.w;
import p119n8.i;
import p153r8.C2691d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/service/TriviaFile;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class TriviaFile {

    public static final Companion INSTANCE = new Companion();

    public static final KSerializer[] f20979b = {new C2691d(TriviaPill$$serializer.INSTANCE, 0)};

    public final List f20980a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/service/TriviaFile$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/service/TriviaFile;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TriviaFile$$serializer.INSTANCE;
        }
    }

    public TriviaFile(int i3, List list) {
        if ((i3 & 1) == 0) {
            this.f20980a = w.f23205h;
        } else {
            this.f20980a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TriviaFile) && m.a(this.f20980a, ((TriviaFile) obj).f20980a);
    }

    public final int hashCode() {
        return this.f20980a.hashCode();
    }

    public final String toString() {
        return "TriviaFile(items=" + this.f20980a + ")";
    }
}
