package androidx.media3.exoplayer.upstream.contentsteering;

/* JADX INFO: loaded from: classes.dex */
public final class SteeringManifestParser implements androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<androidx.media3.exoplayer.upstream.contentsteering.SteeringManifest> {
    private static final java.lang.String STEERING_MANIFEST_JSON_NAME_BASE_ID = "BASE-ID";
    private static final java.lang.String STEERING_MANIFEST_JSON_NAME_HOST = "HOST";
    private static final java.lang.String STEERING_MANIFEST_JSON_NAME_ID = "ID";
    private static final java.lang.String STEERING_MANIFEST_JSON_NAME_PARAMS = "PARAMS";
    private static final java.lang.String STEERING_MANIFEST_JSON_NAME_PATHWAY_CLONES = "PATHWAY-CLONES";
    private static final java.lang.String STEERING_MANIFEST_JSON_NAME_PATHWAY_PRIORITY = "PATHWAY-PRIORITY";
    private static final java.lang.String STEERING_MANIFEST_JSON_NAME_PER_RENDITION_URIS = "PER-RENDITION-URIS";
    private static final java.lang.String STEERING_MANIFEST_JSON_NAME_PER_VARIANT_URIS = "PER-VARIANT-URIS";
    private static final java.lang.String STEERING_MANIFEST_JSON_NAME_RELOAD_URI = "RELOAD-URI";
    private static final java.lang.String STEERING_MANIFEST_JSON_NAME_TTL = "TTL";
    private static final java.lang.String STEERING_MANIFEST_JSON_NAME_URI_REPLACEMENT = "URI-REPLACEMENT";
    private static final java.lang.String STEERING_MANIFEST_JSON_NAME_VERSION = "VERSION";

    public interface StringConverter<T> {
        T convert(java.lang.String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.String lambda$parseUriReplacement$0(java.lang.String str) {
        return str;
    }

    private static <T> void parseMap(android.util.JsonReader jsonReader, androidx.media3.exoplayer.upstream.contentsteering.SteeringManifestParser.StringConverter<T> stringConverter, java.util.Map<java.lang.String, T> map) throws java.io.IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            if (jsonReader.peek().equals(android.util.JsonToken.STRING)) {
                map.put(strNextName, stringConverter.convert(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    private static androidx.media3.exoplayer.upstream.contentsteering.SteeringManifest.PathwayClone parsePathwayClone(android.util.JsonReader jsonReader) throws java.io.IOException {
        jsonReader.beginObject();
        java.lang.String strNextString = null;
        java.lang.String strNextString2 = null;
        androidx.media3.exoplayer.upstream.contentsteering.SteeringManifest.UriReplacement uriReplacement = null;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            if (strNextName.equals(STEERING_MANIFEST_JSON_NAME_BASE_ID) && jsonReader.peek().equals(android.util.JsonToken.STRING)) {
                strNextString = jsonReader.nextString();
            } else if (strNextName.equals(STEERING_MANIFEST_JSON_NAME_ID) && jsonReader.peek().equals(android.util.JsonToken.STRING)) {
                strNextString2 = jsonReader.nextString();
            } else if (strNextName.equals(STEERING_MANIFEST_JSON_NAME_URI_REPLACEMENT) && jsonReader.peek().equals(android.util.JsonToken.BEGIN_OBJECT)) {
                uriReplacement = parseUriReplacement(jsonReader);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (strNextString == null) {
            throw androidx.media3.common.ParserException.createForMalformedSteeringManifest("BASE-ID field is missing in a PATHWAY-CLONE object", null);
        }
        if (strNextString2 == null) {
            throw androidx.media3.common.ParserException.createForMalformedSteeringManifest("ID field is missing in a PATHWAY-CLONE object", null);
        }
        if (uriReplacement != null) {
            return new androidx.media3.exoplayer.upstream.contentsteering.SteeringManifest.PathwayClone(strNextString, strNextString2, uriReplacement);
        }
        throw androidx.media3.common.ParserException.createForMalformedSteeringManifest("URI-REPLACEMENT field is missing in a PATHWAY-CLONE object", null);
    }

    private static void parsePathwayClonesArray(android.util.JsonReader jsonReader, p076i4.Y y) throws java.io.IOException {
        jsonReader.beginArray();
        boolean z6 = false;
        while (jsonReader.hasNext()) {
            if (jsonReader.peek().equals(android.util.JsonToken.BEGIN_OBJECT)) {
                y.c(parsePathwayClone(jsonReader));
                z6 = true;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endArray();
        if (!z6) {
            throw androidx.media3.common.ParserException.createForMalformedSteeringManifest("The PATHWAY-CLONES array is present but empty", null);
        }
    }

    private static void parsePathwayPriorityArray(android.util.JsonReader jsonReader, p076i4.Y y) throws java.io.IOException {
        java.util.HashSet hashSet = new java.util.HashSet();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            if (jsonReader.peek().equals(android.util.JsonToken.STRING)) {
                java.lang.String strNextString = jsonReader.nextString();
                if (!hashSet.add(strNextString)) {
                    throw androidx.media3.common.ParserException.createForMalformedSteeringManifest("The pathway ID (" + strNextString + ") appears more than once in the PATHWAY-PRIORITY array", null);
                }
                y.c(strNextString);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endArray();
        if (hashSet.isEmpty()) {
            throw androidx.media3.common.ParserException.createForMalformedSteeringManifest("The PATHWAY-PRIORITY array is present but empty", null);
        }
    }

    private static androidx.media3.exoplayer.upstream.contentsteering.SteeringManifest.UriReplacement parseUriReplacement(android.util.JsonReader jsonReader) throws java.io.IOException {
        jsonReader.beginObject();
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap map2 = new java.util.HashMap();
        java.util.HashMap map3 = new java.util.HashMap();
        java.lang.String strNextString = null;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            if (strNextName.equals(STEERING_MANIFEST_JSON_NAME_HOST) && jsonReader.peek().equals(android.util.JsonToken.STRING)) {
                strNextString = jsonReader.nextString();
                if (strNextString.isEmpty()) {
                    throw androidx.media3.common.ParserException.createForMalformedSteeringManifest("The HOST string is present but empty", null);
                }
            } else if (strNextName.equals(STEERING_MANIFEST_JSON_NAME_PARAMS) && jsonReader.peek().equals(android.util.JsonToken.BEGIN_OBJECT)) {
                final int i3 = 0;
                parseMap(jsonReader, new androidx.media3.exoplayer.upstream.contentsteering.SteeringManifestParser.StringConverter() { // from class: androidx.media3.exoplayer.upstream.contentsteering.a
                    @Override // androidx.media3.exoplayer.upstream.contentsteering.SteeringManifestParser.StringConverter
                    public final java.lang.Object convert(java.lang.String str) {
                        switch (i3) {
                            case 0:
                                return androidx.media3.exoplayer.upstream.contentsteering.SteeringManifestParser.lambda$parseUriReplacement$0(str);
                            default:
                                return android.net.Uri.parse(str);
                        }
                    }
                }, map);
            } else if (strNextName.equals(STEERING_MANIFEST_JSON_NAME_PER_VARIANT_URIS) && jsonReader.peek().equals(android.util.JsonToken.BEGIN_OBJECT)) {
                final int i9 = 1;
                parseMap(jsonReader, new androidx.media3.exoplayer.upstream.contentsteering.SteeringManifestParser.StringConverter() { // from class: androidx.media3.exoplayer.upstream.contentsteering.a
                    @Override // androidx.media3.exoplayer.upstream.contentsteering.SteeringManifestParser.StringConverter
                    public final java.lang.Object convert(java.lang.String str) {
                        switch (i9) {
                            case 0:
                                return androidx.media3.exoplayer.upstream.contentsteering.SteeringManifestParser.lambda$parseUriReplacement$0(str);
                            default:
                                return android.net.Uri.parse(str);
                        }
                    }
                }, map2);
            } else if (strNextName.equals(STEERING_MANIFEST_JSON_NAME_PER_RENDITION_URIS) && jsonReader.peek().equals(android.util.JsonToken.BEGIN_OBJECT)) {
                final int i10 = 1;
                parseMap(jsonReader, new androidx.media3.exoplayer.upstream.contentsteering.SteeringManifestParser.StringConverter() { // from class: androidx.media3.exoplayer.upstream.contentsteering.a
                    @Override // androidx.media3.exoplayer.upstream.contentsteering.SteeringManifestParser.StringConverter
                    public final java.lang.Object convert(java.lang.String str) {
                        switch (i10) {
                            case 0:
                                return androidx.media3.exoplayer.upstream.contentsteering.SteeringManifestParser.lambda$parseUriReplacement$0(str);
                            default:
                                return android.net.Uri.parse(str);
                        }
                    }
                }, map3);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new androidx.media3.exoplayer.upstream.contentsteering.SteeringManifest.UriReplacement(strNextString, map, map2, map3);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
    public androidx.media3.exoplayer.upstream.contentsteering.SteeringManifest parse(android.net.Uri uri, java.io.InputStream inputStream) throws java.io.IOException {
        long j;
        android.util.JsonReader jsonReader = new android.util.JsonReader(new java.io.InputStreamReader(inputStream));
        try {
            if (!jsonReader.peek().equals(android.util.JsonToken.BEGIN_OBJECT)) {
                throw androidx.media3.common.ParserException.createForMalformedSteeringManifest("Steering manifest JSON should be an object at root", null);
            }
            p076i4.Y y = new p076i4.Y(4);
            p076i4.Y y9 = new p076i4.Y(4);
            jsonReader.beginObject();
            long jNextInt = androidx.media3.common.C.TIME_UNSET;
            android.net.Uri uri2 = null;
            int iNextInt = 1;
            loop0: while (true) {
                j = jNextInt;
                while (true) {
                    if (!jsonReader.hasNext()) {
                        break loop0;
                    }
                    java.lang.String strNextName = jsonReader.nextName();
                    if (strNextName.equals(STEERING_MANIFEST_JSON_NAME_VERSION) && jsonReader.peek().equals(android.util.JsonToken.NUMBER)) {
                        iNextInt = jsonReader.nextInt();
                    } else if (!strNextName.equals(STEERING_MANIFEST_JSON_NAME_TTL) || !jsonReader.peek().equals(android.util.JsonToken.NUMBER)) {
                        if (strNextName.equals(STEERING_MANIFEST_JSON_NAME_RELOAD_URI) && jsonReader.peek().equals(android.util.JsonToken.STRING)) {
                            uri2 = android.net.Uri.parse(jsonReader.nextString());
                        } else if (strNextName.equals(STEERING_MANIFEST_JSON_NAME_PATHWAY_PRIORITY) && jsonReader.peek().equals(android.util.JsonToken.BEGIN_ARRAY)) {
                            parsePathwayPriorityArray(jsonReader, y);
                        } else if (strNextName.equals(STEERING_MANIFEST_JSON_NAME_PATHWAY_CLONES) && jsonReader.peek().equals(android.util.JsonToken.BEGIN_ARRAY)) {
                            parsePathwayClonesArray(jsonReader, y9);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                }
                jNextInt = ((long) jsonReader.nextInt()) * 1000;
            }
            jsonReader.endObject();
            p076i4.S0 s0F = y.f();
            if (s0F.isEmpty()) {
                throw androidx.media3.common.ParserException.createForMalformedSteeringManifest("PATHWAY-PRIORITY field is missing", null);
            }
            androidx.media3.exoplayer.upstream.contentsteering.SteeringManifest steeringManifest = new androidx.media3.exoplayer.upstream.contentsteering.SteeringManifest(iNextInt, j, uri2, s0F, y9.f());
            jsonReader.close();
            return steeringManifest;
        } catch (java.lang.Throwable th) {
            try {
                jsonReader.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
