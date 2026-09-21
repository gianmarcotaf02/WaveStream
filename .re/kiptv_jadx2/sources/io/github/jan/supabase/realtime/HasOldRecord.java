package io.github.jan.supabase.realtime;

import androidx.media3.container.NalUnitUtil;
import io.github.jan.supabase.plugins.SerializableData;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lio/github/jan/supabase/realtime/HasOldRecord;", "Lio/github/jan/supabase/plugins/SerializableData;", "Lkotlinx/serialization/json/c;", "getOldRecord", "()Lkotlinx/serialization/json/c;", "oldRecord", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface HasOldRecord extends SerializableData {
    kotlinx.serialization.json.c getOldRecord();
}
