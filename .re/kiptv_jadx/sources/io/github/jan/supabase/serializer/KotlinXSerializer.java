package io.github.jan.supabase.serializer;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\u000b\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000e\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/github/jan/supabase/serializer/KotlinXSerializer;", "Lio/github/jan/supabase/SupabaseSerializer;", "Ls8/d;", "json", "<init>", "(Ls8/d;)V", "", "T", "LE6/v;", "type", "value", "", "encode", "(LE6/v;Ljava/lang/Object;)Ljava/lang/String;", "decode", "(LE6/v;Ljava/lang/String;)Ljava/lang/Object;", "Ls8/d;", "supabase-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class KotlinXSerializer implements io.github.jan.supabase.SupabaseSerializer {
    private final p162s8.d json;

    /* JADX WARN: Multi-variable type inference failed */
    public KotlinXSerializer() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.github.jan.supabase.SupabaseSerializer
    public <T> T decode(E6.v type, java.lang.String value) {
        kotlin.jvm.internal.m.e(type, "type");
        kotlin.jvm.internal.m.e(value, "value");
        T t9 = (T) this.json.b(value, com.google.common.util.concurrent.D.J(v8.f.f29713a, type));
        kotlin.jvm.internal.m.c(t9, "null cannot be cast to non-null type T of io.github.jan.supabase.serializer.KotlinXSerializer.decode");
        return t9;
    }

    @Override // io.github.jan.supabase.SupabaseSerializer
    public <T> java.lang.String encode(E6.v type, T value) {
        kotlin.jvm.internal.m.e(type, "type");
        kotlin.jvm.internal.m.e(value, "value");
        return this.json.d(com.google.common.util.concurrent.D.J(v8.f.f29713a, type), value);
    }

    public KotlinXSerializer(p162s8.d json) {
        kotlin.jvm.internal.m.e(json, "json");
        this.json = json;
    }

    public /* synthetic */ KotlinXSerializer(p162s8.d dVar, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? p162s8.d.f27387d : dVar);
    }
}
