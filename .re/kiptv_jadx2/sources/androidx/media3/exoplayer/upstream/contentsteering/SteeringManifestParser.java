package androidx.media3.exoplayer.upstream.contentsteering;

import android.net.Uri;
import android.util.JsonReader;
import android.util.JsonToken;
import androidx.media3.common.C;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p076i4.S0;
import p076i4.Y;

public final class SteeringManifestParser implements ParsingLoadable.Parser<SteeringManifest> {
    private static final String STEERING_MANIFEST_JSON_NAME_BASE_ID = "BASE-ID";
    private static final String STEERING_MANIFEST_JSON_NAME_HOST = "HOST";
    private static final String STEERING_MANIFEST_JSON_NAME_ID = "ID";
    private static final String STEERING_MANIFEST_JSON_NAME_PARAMS = "PARAMS";
    private static final String STEERING_MANIFEST_JSON_NAME_PATHWAY_CLONES = "PATHWAY-CLONES";
    private static final String STEERING_MANIFEST_JSON_NAME_PATHWAY_PRIORITY = "PATHWAY-PRIORITY";
    private static final String STEERING_MANIFEST_JSON_NAME_PER_RENDITION_URIS = "PER-RENDITION-URIS";
    private static final String STEERING_MANIFEST_JSON_NAME_PER_VARIANT_URIS = "PER-VARIANT-URIS";
    private static final String STEERING_MANIFEST_JSON_NAME_RELOAD_URI = "RELOAD-URI";
    private static final String STEERING_MANIFEST_JSON_NAME_TTL = "TTL";
    private static final String STEERING_MANIFEST_JSON_NAME_URI_REPLACEMENT = "URI-REPLACEMENT";
    private static final String STEERING_MANIFEST_JSON_NAME_VERSION = "VERSION";

    public interface StringConverter<T> {
        T convert(String str);
    }

    public static String lambda$parseUriReplacement$0(String str) {
        return str;
    }

    private static <T> void parseMap(JsonReader jsonReader, StringConverter<T> stringConverter, Map<String, T> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (jsonReader.peek().equals(JsonToken.STRING)) {
                map.put(strNextName, stringConverter.convert(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    private static SteeringManifest.PathwayClone parsePathwayClone(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        SteeringManifest.UriReplacement uriReplacement = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals(STEERING_MANIFEST_JSON_NAME_BASE_ID) && jsonReader.peek().equals(JsonToken.STRING)) {
                strNextString = jsonReader.nextString();
            } else if (strNextName.equals(STEERING_MANIFEST_JSON_NAME_ID) && jsonReader.peek().equals(JsonToken.STRING)) {
                strNextString2 = jsonReader.nextString();
            } else if (strNextName.equals(STEERING_MANIFEST_JSON_NAME_URI_REPLACEMENT) && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                uriReplacement = parseUriReplacement(jsonReader);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (strNextString == null) {
            throw ParserException.createForMalformedSteeringManifest("BASE-ID field is missing in a PATHWAY-CLONE object", null);
        }
        if (strNextString2 == null) {
            throw ParserException.createForMalformedSteeringManifest("ID field is missing in a PATHWAY-CLONE object", null);
        }
        if (uriReplacement != null) {
            return new SteeringManifest.PathwayClone(strNextString, strNextString2, uriReplacement);
        }
        throw ParserException.createForMalformedSteeringManifest("URI-REPLACEMENT field is missing in a PATHWAY-CLONE object", null);
    }

    private static void parsePathwayClonesArray(JsonReader jsonReader, Y y) throws IOException {
        jsonReader.beginArray();
        boolean z6 = false;
        while (jsonReader.hasNext()) {
            if (jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                y.c(parsePathwayClone(jsonReader));
                z6 = true;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endArray();
        if (!z6) {
            throw ParserException.createForMalformedSteeringManifest("The PATHWAY-CLONES array is present but empty", null);
        }
    }

    private static void parsePathwayPriorityArray(JsonReader jsonReader, Y y) throws IOException {
        HashSet hashSet = new HashSet();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            if (jsonReader.peek().equals(JsonToken.STRING)) {
                String strNextString = jsonReader.nextString();
                if (!hashSet.add(strNextString)) {
                    throw ParserException.createForMalformedSteeringManifest("The pathway ID (" + strNextString + ") appears more than once in the PATHWAY-PRIORITY array", null);
                }
                y.c(strNextString);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endArray();
        if (hashSet.isEmpty()) {
            throw ParserException.createForMalformedSteeringManifest("The PATHWAY-PRIORITY array is present but empty", null);
        }
    }

    private static SteeringManifest.UriReplacement parseUriReplacement(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        String strNextString = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals(STEERING_MANIFEST_JSON_NAME_HOST) && jsonReader.peek().equals(JsonToken.STRING)) {
                strNextString = jsonReader.nextString();
                if (strNextString.isEmpty()) {
                    throw ParserException.createForMalformedSteeringManifest("The HOST string is present but empty", null);
                }
            } else if (strNextName.equals(STEERING_MANIFEST_JSON_NAME_PARAMS) && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                final int i3 = 0;
                parseMap(jsonReader, new StringConverter() {
                    @Override
                    public final Object convert(String str) {
                        switch (i3) {
                            case 0:
                                return SteeringManifestParser.lambda$parseUriReplacement$0(str);
                            default:
                                return Uri.parse(str);
                        }
                    }
                }, map);
            } else if (strNextName.equals(STEERING_MANIFEST_JSON_NAME_PER_VARIANT_URIS) && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                final int i9 = 1;
                parseMap(jsonReader, new StringConverter() {
                    @Override
                    public final Object convert(String str) {
                        switch (i9) {
                            case 0:
                                return SteeringManifestParser.lambda$parseUriReplacement$0(str);
                            default:
                                return Uri.parse(str);
                        }
                    }
                }, map2);
            } else if (strNextName.equals(STEERING_MANIFEST_JSON_NAME_PER_RENDITION_URIS) && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                final int i10 = 1;
                parseMap(jsonReader, new StringConverter() {
                    @Override
                    public final Object convert(String str) {
                        switch (i10) {
                            case 0:
                                return SteeringManifestParser.lambda$parseUriReplacement$0(str);
                            default:
                                return Uri.parse(str);
                        }
                    }
                }, map3);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new SteeringManifest.UriReplacement(strNextString, map, map2, map3);
    }

    @Override
    public SteeringManifest parse(Uri uri, InputStream inputStream) throws IOException {
        long j;
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream));
        try {
            if (!jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                throw ParserException.createForMalformedSteeringManifest("Steering manifest JSON should be an object at root", null);
            }
            Y y = new Y(4);
            Y y9 = new Y(4);
            jsonReader.beginObject();
            long jNextInt = C.TIME_UNSET;
            Uri uri2 = null;
            int iNextInt = 1;
            loop0: while (true) {
                j = jNextInt;
                while (true) {
                    if (!jsonReader.hasNext()) {
                        break loop0;
                    }
                    String strNextName = jsonReader.nextName();
                    if (strNextName.equals(STEERING_MANIFEST_JSON_NAME_VERSION) && jsonReader.peek().equals(JsonToken.NUMBER)) {
                        iNextInt = jsonReader.nextInt();
                    } else if (!strNextName.equals(STEERING_MANIFEST_JSON_NAME_TTL) || !jsonReader.peek().equals(JsonToken.NUMBER)) {
                        if (strNextName.equals(STEERING_MANIFEST_JSON_NAME_RELOAD_URI) && jsonReader.peek().equals(JsonToken.STRING)) {
                            uri2 = Uri.parse(jsonReader.nextString());
                        } else if (strNextName.equals(STEERING_MANIFEST_JSON_NAME_PATHWAY_PRIORITY) && jsonReader.peek().equals(JsonToken.BEGIN_ARRAY)) {
                            parsePathwayPriorityArray(jsonReader, y);
                        } else if (strNextName.equals(STEERING_MANIFEST_JSON_NAME_PATHWAY_CLONES) && jsonReader.peek().equals(JsonToken.BEGIN_ARRAY)) {
                            parsePathwayClonesArray(jsonReader, y9);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                }
                jNextInt = ((long) jsonReader.nextInt()) * 1000;
            }
            jsonReader.endObject();
            S0 s0F = y.f();
            if (s0F.isEmpty()) {
                throw ParserException.createForMalformedSteeringManifest("PATHWAY-PRIORITY field is missing", null);
            }
            SteeringManifest steeringManifest = new SteeringManifest(iNextInt, j, uri2, s0F, y9.f());
            jsonReader.close();
            return steeringManifest;
        } catch (Throwable th) {
            try {
                jsonReader.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
