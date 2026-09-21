package io.ktor.serialization.kotlinx.json;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JB\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0010\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096@¢\u0006\u0004\b\u0010\u0010\u0019J.\u0010\u001c\u001a\u0004\u0018\u00010\u00162\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR$\u0010!\u001a\u0012\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lio/ktor/serialization/kotlinx/json/KotlinxSerializationJsonExtensions;", "Lio/ktor/serialization/kotlinx/KotlinxSerializationExtension;", "Ls8/d;", "format", "<init>", "(Ls8/d;)V", "T", "LV7/g;", "Lkotlinx/serialization/KSerializer;", "serializer", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "Lh6/A;", "serialize", "(LV7/g;Lkotlinx/serialization/KSerializer;Ljava/nio/charset/Charset;Lio/ktor/utils/io/ByteWriteChannel;Ll6/c;)Ljava/lang/Object;", "Lio/ktor/http/ContentType;", "contentType", "Lio/ktor/util/reflect/TypeInfo;", "typeInfo", "", "value", "Lio/ktor/http/content/OutgoingContent;", "(Lio/ktor/http/ContentType;Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Ljava/lang/Object;Ll6/c;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteReadChannel;", "content", "deserialize", "(Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Lio/ktor/utils/io/ByteReadChannel;Ll6/c;)Ljava/lang/Object;", "Ls8/d;", "", "Lio/ktor/serialization/kotlinx/json/JsonArraySymbols;", "jsonArraySymbolsMap", "Ljava/util/Map;", "ktor-serialization-kotlinx-json"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class KotlinxSerializationJsonExtensions implements io.ktor.serialization.kotlinx.KotlinxSerializationExtension {
    private final p162s8.d format;
    private final java.util.Map<java.nio.charset.Charset, io.ktor.serialization.kotlinx.json.JsonArraySymbols> jsonArraySymbolsMap;

    /* JADX INFO: renamed from: io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$deserialize$1, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions", f = "KotlinxSerializationJsonExtensions.kt", l = {66}, m = "deserialize")
    public static final class AnonymousClass1 extends p117n6.c {
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass1(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions.this.deserialize(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$2, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/ByteWriteChannel;", "Lh6/A;", "<anonymous>", "(Lio/ktor/utils/io/ByteWriteChannel;)V"}, k = 3, mv = {2, 1, 0})
    @p117n6.e(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$2", f = "KotlinxSerializationJsonExtensions.kt", l = {51}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends p117n6.i implements p194x6.m {
        final /* synthetic */ java.nio.charset.Charset $charset;
        final /* synthetic */ kotlinx.serialization.KSerializer $serializer;
        final /* synthetic */ java.lang.Object $value;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(java.lang.Object obj, kotlinx.serialization.KSerializer kSerializer, java.nio.charset.Charset charset, p100l6.c cVar) {
            super(2, cVar);
            this.$value = obj;
            this.$serializer = kSerializer;
            this.$charset = charset;
        }

        @Override // p117n6.a
        public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
            io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions.AnonymousClass2 anonymousClass2 = io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions.this.new AnonymousClass2(this.$value, this.$serializer, this.$charset, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // p194x6.m
        public final java.lang.Object invoke(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, p100l6.c cVar) {
            return ((io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions.AnonymousClass2) create(byteWriteChannel, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            if (i3 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                io.ktor.utils.io.ByteWriteChannel byteWriteChannel = (io.ktor.utils.io.ByteWriteChannel) this.L$0;
                io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions kotlinxSerializationJsonExtensions = io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions.this;
                java.lang.Object obj2 = this.$value;
                kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<*>");
                kotlinx.serialization.KSerializer kSerializer = this.$serializer;
                kotlin.jvm.internal.m.c(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
                java.nio.charset.Charset charset = this.$charset;
                this.label = 1;
                if (kotlinxSerializationJsonExtensions.serialize((V7.InterfaceC0981g) obj2, kSerializer, charset, byteWriteChannel, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
            }
            return p070h6.A.f22523a;
        }
    }

    /* JADX INFO: renamed from: io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$3, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions", f = "KotlinxSerializationJsonExtensions.kt", l = {com.revenuecat.purchases.utils.EventsFileHelper.MAX_EVENT_PROPERTY_SIZE, 120, androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DVBSUBS}, m = "serialize")
    public static final class AnonymousClass3<T> extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass3(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions.this.serialize((V7.InterfaceC0981g) null, (kotlinx.serialization.KSerializer) null, (java.nio.charset.Charset) null, (io.ktor.utils.io.ByteWriteChannel) null, this);
        }
    }

    public KotlinxSerializationJsonExtensions(p162s8.d format) {
        kotlin.jvm.internal.m.e(format, "format");
        this.format = format;
        this.jsonArraySymbolsMap = new java.util.LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.ktor.serialization.kotlinx.KotlinxSerializationExtension
    public java.lang.Object deserialize(java.nio.charset.Charset charset, io.ktor.util.reflect.TypeInfo typeInfo, io.ktor.utils.io.ByteReadChannel byteReadChannel, p100l6.c cVar) throws io.ktor.serialization.JsonConvertException {
        io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions.AnonymousClass1 anonymousClass1;
        if (cVar instanceof io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions.AnonymousClass1) {
            anonymousClass1 = (io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions.AnonymousClass1) cVar;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions.AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions.AnonymousClass1(cVar);
        }
        java.lang.Object obj = anonymousClass1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = anonymousClass1.label;
        try {
            if (i9 != 0) {
                if (i9 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
                return obj;
            }
            com.google.common.util.concurrent.P.u0(obj);
            if (!kotlin.jvm.internal.m.a(charset, O7.a.f8024b) || !kotlin.jvm.internal.m.a(typeInfo.getType(), kotlin.jvm.internal.B.f24540a.b(N7.m.class))) {
                return null;
            }
            p162s8.d dVar = this.format;
            anonymousClass1.label = 1;
            java.lang.Object objDeserializeSequence = io.ktor.serialization.kotlinx.json.JsonExtensionsJvmKt.deserializeSequence(dVar, byteReadChannel, typeInfo, anonymousClass1);
            return objDeserializeSequence == aVar ? aVar : objDeserializeSequence;
        } catch (java.lang.Throwable th) {
            throw new io.ktor.serialization.JsonConvertException("Illegal input: " + th.getMessage(), th);
        }
    }

    @Override // io.ktor.serialization.kotlinx.KotlinxSerializationExtension
    public java.lang.Object serialize(io.ktor.http.ContentType contentType, java.nio.charset.Charset charset, io.ktor.util.reflect.TypeInfo typeInfo, java.lang.Object obj, p100l6.c cVar) {
        if (!kotlin.jvm.internal.m.a(charset, O7.a.f8024b) || !kotlin.jvm.internal.m.a(typeInfo.getType(), kotlin.jvm.internal.B.f24540a.b(V7.InterfaceC0981g.class))) {
            return null;
        }
        return new io.ktor.http.content.ChannelWriterContent(new io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions.AnonymousClass2(obj, io.ktor.serialization.kotlinx.SerializerLookupKt.serializerForTypeInfo(this.format.f27389b, io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensionsKt.argumentTypeInfo(typeInfo)), charset, null), io.ktor.http.ContentTypesKt.withCharsetIfNeeded(contentType, charset), null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e9, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(r4, r5, 0, 0, r8, 6, null) == r3) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> java.lang.Object serialize(V7.InterfaceC0981g interfaceC0981g, kotlinx.serialization.KSerializer kSerializer, java.nio.charset.Charset charset, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, p100l6.c cVar) {
        io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions.AnonymousClass3 anonymousClass3;
        V7.InterfaceC0981g interfaceC0981g2;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel2;
        io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions kotlinxSerializationJsonExtensions;
        java.nio.charset.Charset charset2;
        io.ktor.serialization.kotlinx.json.JsonArraySymbols jsonArraySymbols;
        kotlinx.serialization.KSerializer kSerializer2;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel3;
        io.ktor.serialization.kotlinx.json.JsonArraySymbols jsonArraySymbols2;
        if (cVar instanceof io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions.AnonymousClass3) {
            anonymousClass3 = (io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions.AnonymousClass3) cVar;
            int i3 = anonymousClass3.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass3.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass3 = new io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions.AnonymousClass3(cVar);
            }
        } else {
            anonymousClass3 = new io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions.AnonymousClass3(cVar);
        }
        io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions.AnonymousClass3 anonymousClass4 = anonymousClass3;
        java.lang.Object obj = anonymousClass4.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = anonymousClass4.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            java.util.Map<java.nio.charset.Charset, io.ktor.serialization.kotlinx.json.JsonArraySymbols> map = this.jsonArraySymbolsMap;
            io.ktor.serialization.kotlinx.json.JsonArraySymbols jsonArraySymbols3 = map.get(charset);
            if (jsonArraySymbols3 == null) {
                jsonArraySymbols3 = new io.ktor.serialization.kotlinx.json.JsonArraySymbols(charset);
                map.put(charset, jsonArraySymbols3);
            }
            io.ktor.serialization.kotlinx.json.JsonArraySymbols jsonArraySymbols4 = jsonArraySymbols3;
            byte[] beginArray = jsonArraySymbols4.getBeginArray();
            anonymousClass4.L$0 = this;
            interfaceC0981g2 = interfaceC0981g;
            anonymousClass4.L$1 = interfaceC0981g2;
            anonymousClass4.L$2 = kSerializer;
            anonymousClass4.L$3 = charset;
            anonymousClass4.L$4 = byteWriteChannel;
            anonymousClass4.L$5 = jsonArraySymbols4;
            anonymousClass4.label = 1;
            if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel, beginArray, 0, 0, anonymousClass4, 6, null) != aVar) {
                byteWriteChannel2 = byteWriteChannel;
                kotlinxSerializationJsonExtensions = this;
                charset2 = charset;
                jsonArraySymbols = jsonArraySymbols4;
                kSerializer2 = kSerializer;
            }
            return aVar;
        }
        if (i9 == 1) {
            io.ktor.serialization.kotlinx.json.JsonArraySymbols jsonArraySymbols5 = (io.ktor.serialization.kotlinx.json.JsonArraySymbols) anonymousClass4.L$5;
            io.ktor.utils.io.ByteWriteChannel byteWriteChannel4 = (io.ktor.utils.io.ByteWriteChannel) anonymousClass4.L$4;
            java.nio.charset.Charset charset3 = (java.nio.charset.Charset) anonymousClass4.L$3;
            kotlinx.serialization.KSerializer kSerializer3 = (kotlinx.serialization.KSerializer) anonymousClass4.L$2;
            V7.InterfaceC0981g interfaceC0981g3 = (V7.InterfaceC0981g) anonymousClass4.L$1;
            io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions kotlinxSerializationJsonExtensions2 = (io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions) anonymousClass4.L$0;
            com.google.common.util.concurrent.P.u0(obj);
            jsonArraySymbols = jsonArraySymbols5;
            byteWriteChannel2 = byteWriteChannel4;
            charset2 = charset3;
            kSerializer2 = kSerializer3;
            interfaceC0981g2 = interfaceC0981g3;
            kotlinxSerializationJsonExtensions = kotlinxSerializationJsonExtensions2;
        } else if (i9 == 2) {
            jsonArraySymbols2 = (io.ktor.serialization.kotlinx.json.JsonArraySymbols) anonymousClass4.L$1;
            byteWriteChannel3 = (io.ktor.utils.io.ByteWriteChannel) anonymousClass4.L$0;
            com.google.common.util.concurrent.P.u0(obj);
            byte[] endArray = jsonArraySymbols2.getEndArray();
            anonymousClass4.L$0 = null;
            anonymousClass4.L$1 = null;
            anonymousClass4.label = 3;
        } else {
            if (i9 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
        }
        return p070h6.A.f22523a;
        io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1 kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1 = new io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1(byteWriteChannel2, jsonArraySymbols, kotlinxSerializationJsonExtensions, kSerializer2, charset2);
        byteWriteChannel3 = byteWriteChannel2;
        jsonArraySymbols2 = jsonArraySymbols;
        anonymousClass4.L$0 = byteWriteChannel3;
        anonymousClass4.L$1 = jsonArraySymbols2;
        anonymousClass4.L$2 = null;
        anonymousClass4.L$3 = null;
        anonymousClass4.L$4 = null;
        anonymousClass4.L$5 = null;
        anonymousClass4.label = 2;
        if (interfaceC0981g2.collect(kotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1, anonymousClass4) != aVar) {
            byte[] endArray2 = jsonArraySymbols2.getEndArray();
            anonymousClass4.L$0 = null;
            anonymousClass4.L$1 = null;
            anonymousClass4.label = 3;
        }
        return aVar;
    }
}
