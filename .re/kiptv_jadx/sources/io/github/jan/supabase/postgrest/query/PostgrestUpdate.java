package io.github.jan.supabase.postgrest.query;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J8\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\b\"\u0006\b\u0001\u0010\t\u0018\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00018\u0001H\u0086\f¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u000fH\u0086\u0004¢\u0006\u0004\b\r\u0010\u0010J0\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00110\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0011H\u0086\u0004¢\u0006\u0004\b\r\u0010\u0012J0\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0013H\u0086\u0004¢\u0006\u0004\b\r\u0010\u0014J0\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0015H\u0086\u0004¢\u0006\u0004\b\r\u0010\u0016J0\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0017H\u0086\u0004¢\u0006\u0004\b\r\u0010\u0018J0\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00190\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0019H\u0086\u0004¢\u0006\u0004\b\r\u0010\u001aJ\"\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u000fH\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0011H\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001eJ\"\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0013H\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001fJ\"\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0015H\u0086\u0002¢\u0006\u0004\b\u001c\u0010 J\"\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0017H\u0086\u0002¢\u0006\u0004\b\u001c\u0010!J\"\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0019H\u0086\u0002¢\u0006\u0004\b\u001c\u0010\"J\u0015\u0010#\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b#\u0010$J*\u0010\u001c\u001a\u00020\f\"\u0006\b\u0000\u0010\b\u0018\u00012\u0006\u0010\u001b\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u0086\n¢\u0006\u0004\b\u001c\u0010%J\u000f\u0010'\u001a\u00020&H\u0001¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R \u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b1\u0010-\u001a\u0004\b/\u00100R,\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u000203028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b8\u0010-\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lio/github/jan/supabase/postgrest/query/PostgrestUpdate;", "", "Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "propertyConversionMethod", "Lio/github/jan/supabase/SupabaseSerializer;", "serializer", "<init>", "(Lio/github/jan/supabase/postgrest/PropertyConversionMethod;Lio/github/jan/supabase/SupabaseSerializer;)V", "T", "V", "LE6/t;", "value", "Lh6/A;", "setTo", "(LE6/t;Ljava/lang/Object;)V", "", "(LE6/t;Ljava/lang/String;)V", "", "(LE6/t;Ljava/lang/Integer;)V", "", "(LE6/t;Ljava/lang/Long;)V", "", "(LE6/t;Ljava/lang/Float;)V", "", "(LE6/t;Ljava/lang/Double;)V", "", "(LE6/t;Ljava/lang/Boolean;)V", "column", "set", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/Integer;)V", "(Ljava/lang/String;Ljava/lang/Long;)V", "(Ljava/lang/String;Ljava/lang/Float;)V", "(Ljava/lang/String;Ljava/lang/Double;)V", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "setToNull", "(Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/Object;)V", "Lkotlinx/serialization/json/c;", "toJson", "()Lkotlinx/serialization/json/c;", "Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "getPropertyConversionMethod", "()Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "getPropertyConversionMethod$annotations", "()V", "Lio/github/jan/supabase/SupabaseSerializer;", "getSerializer", "()Lio/github/jan/supabase/SupabaseSerializer;", "getSerializer$annotations", "", "Lkotlinx/serialization/json/b;", "map", "Ljava/util/Map;", "getMap", "()Ljava/util/Map;", "getMap$annotations", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PostgrestUpdate {
    private final java.util.Map<java.lang.String, kotlinx.serialization.json.b> map;
    private final io.github.jan.supabase.postgrest.PropertyConversionMethod propertyConversionMethod;
    private final io.github.jan.supabase.SupabaseSerializer serializer;

    public PostgrestUpdate(io.github.jan.supabase.postgrest.PropertyConversionMethod propertyConversionMethod, io.github.jan.supabase.SupabaseSerializer serializer) {
        kotlin.jvm.internal.m.e(propertyConversionMethod, "propertyConversionMethod");
        kotlin.jvm.internal.m.e(serializer, "serializer");
        this.propertyConversionMethod = propertyConversionMethod;
        this.serializer = serializer;
        this.map = new java.util.LinkedHashMap();
    }

    public static /* synthetic */ void getMap$annotations() {
    }

    public static /* synthetic */ void getPropertyConversionMethod$annotations() {
    }

    public static /* synthetic */ void getSerializer$annotations() {
    }

    public final java.util.Map<java.lang.String, kotlinx.serialization.json.b> getMap() {
        return this.map;
    }

    public final io.github.jan.supabase.postgrest.PropertyConversionMethod getPropertyConversionMethod() {
        return this.propertyConversionMethod;
    }

    public final io.github.jan.supabase.SupabaseSerializer getSerializer() {
        return this.serializer;
    }

    public final void set(java.lang.String column, java.lang.String value) {
        kotlin.jvm.internal.m.e(column, "column");
        this.map.put(column, p162s8.l.c(value));
    }

    public final <T, V> void setTo(E6.t tVar, V v6) {
        kotlin.jvm.internal.m.e(tVar, "<this>");
        if (v6 == null) {
            setToNull(getPropertyConversionMethod().invoke(tVar));
            return;
        }
        getPropertyConversionMethod().invoke(tVar);
        getMap();
        getSerializer();
        p162s8.c cVar = p162s8.d.f27387d;
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public final void setToNull(java.lang.String column) {
        kotlin.jvm.internal.m.e(column, "column");
        this.map.put(column, kotlinx.serialization.json.JsonNull.INSTANCE);
    }

    public final kotlinx.serialization.json.c toJson() {
        return new kotlinx.serialization.json.c(this.map);
    }

    public final void set(java.lang.String column, java.lang.Integer value) {
        kotlin.jvm.internal.m.e(column, "column");
        this.map.put(column, p162s8.l.b(value));
    }

    public final void set(java.lang.String column, java.lang.Long value) {
        kotlin.jvm.internal.m.e(column, "column");
        this.map.put(column, p162s8.l.b(value));
    }

    public final void set(java.lang.String column, java.lang.Float value) {
        kotlin.jvm.internal.m.e(column, "column");
        this.map.put(column, p162s8.l.b(value));
    }

    public final void set(java.lang.String column, java.lang.Double value) {
        kotlin.jvm.internal.m.e(column, "column");
        this.map.put(column, p162s8.l.b(value));
    }

    public final void set(java.lang.String column, java.lang.Boolean value) {
        kotlin.jvm.internal.m.e(column, "column");
        this.map.put(column, p162s8.l.a(value));
    }

    public final <T> void setTo(E6.t tVar, java.lang.String str) {
        kotlin.jvm.internal.m.e(tVar, "<this>");
        set(this.propertyConversionMethod.invoke(tVar), str);
    }

    public final <T> void set(java.lang.String column, T value) {
        kotlin.jvm.internal.m.e(column, "column");
        if (value == null) {
            setToNull(column);
            return;
        }
        getMap();
        getSerializer();
        p162s8.c cVar = p162s8.d.f27387d;
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public final <T> void setTo(E6.t tVar, java.lang.Integer num) {
        kotlin.jvm.internal.m.e(tVar, "<this>");
        set(this.propertyConversionMethod.invoke(tVar), num);
    }

    public final <T> void setTo(E6.t tVar, java.lang.Long l2) {
        kotlin.jvm.internal.m.e(tVar, "<this>");
        set(this.propertyConversionMethod.invoke(tVar), l2);
    }

    public final <T> void setTo(E6.t tVar, java.lang.Float f9) {
        kotlin.jvm.internal.m.e(tVar, "<this>");
        set(this.propertyConversionMethod.invoke(tVar), f9);
    }

    public final <T> void setTo(E6.t tVar, java.lang.Double d4) {
        kotlin.jvm.internal.m.e(tVar, "<this>");
        set(this.propertyConversionMethod.invoke(tVar), d4);
    }

    public final <T> void setTo(E6.t tVar, java.lang.Boolean bool) {
        kotlin.jvm.internal.m.e(tVar, "<this>");
        set(this.propertyConversionMethod.invoke(tVar), bool);
    }
}
