package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.util.Pair;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.C;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p076i4.AbstractC2186b0;
import p076i4.AbstractC2230y;
import p076i4.V;

final class AssetListParser implements ParsingLoadable.Parser<Pair<HlsInterstitialsAdsLoader.AssetList, JSONObject>> {
    private static final String ASSET_LIST_JSON_NAME_ASSET_ARRAY = "ASSETS";
    private static final String ASSET_LIST_JSON_NAME_DURATION = "DURATION";
    private static final String ASSET_LIST_JSON_NAME_LABEL_ID = "LABEL-ID";
    private static final String ASSET_LIST_JSON_NAME_OFFSET = "OFFSET";
    private static final String ASSET_LIST_JSON_NAME_SKIP_CONTROL = "SKIP-CONTROL";
    private static final String ASSET_LIST_JSON_NAME_URI = "URI";

    private static HlsInterstitialsAdsLoader.AssetList getAssetListFromRawJson(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has(ASSET_LIST_JSON_NAME_ASSET_ARRAY)) {
            throw new JSONException("missing ASSETS attribute");
        }
        AbstractC2230y.d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        JSONArray jSONArray = jSONObject.getJSONArray(ASSET_LIST_JSON_NAME_ASSET_ARRAY);
        int i3 = 0;
        int i9 = 0;
        while (i3 < jSONArray.length()) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
            if (!jSONObject2.has(ASSET_LIST_JSON_NAME_URI)) {
                throw new JSONException("missing URI attribute");
            }
            if (!jSONObject2.has(ASSET_LIST_JSON_NAME_DURATION)) {
                throw new JSONException("missing DURATION attribute");
            }
            HlsInterstitialsAdsLoader.Asset asset = new HlsInterstitialsAdsLoader.Asset(Uri.parse(jSONObject2.getString(ASSET_LIST_JSON_NAME_URI)), (long) (jSONObject2.getDouble(ASSET_LIST_JSON_NAME_DURATION) * 1000000.0d));
            int i10 = i9 + 1;
            int iB = V.b(objArrCopyOf.length, i10);
            if (iB > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
            }
            objArrCopyOf[i9] = asset;
            i3++;
            i9 = i10;
        }
        AdPlaybackState.SkipInfo skipInfo = null;
        if (jSONObject.has(ASSET_LIST_JSON_NAME_SKIP_CONTROL)) {
            JSONObject jSONObject3 = jSONObject.getJSONObject(ASSET_LIST_JSON_NAME_SKIP_CONTROL);
            skipInfo = new AdPlaybackState.SkipInfo(jSONObject3.has(ASSET_LIST_JSON_NAME_OFFSET) ? (long) (jSONObject3.getDouble(ASSET_LIST_JSON_NAME_OFFSET) * 1000000.0d) : 0L, jSONObject3.has(ASSET_LIST_JSON_NAME_DURATION) ? (long) (jSONObject3.getDouble(ASSET_LIST_JSON_NAME_DURATION) * 1000000.0d) : C.TIME_UNSET, jSONObject3.has(ASSET_LIST_JSON_NAME_LABEL_ID) ? jSONObject3.getString(ASSET_LIST_JSON_NAME_LABEL_ID) : null);
        }
        return new HlsInterstitialsAdsLoader.AssetList(AbstractC2186b0.r(objArrCopyOf, i9), skipInfo);
    }

    @Override
    public Pair<HlsInterstitialsAdsLoader.AssetList, JSONObject> parse(Uri uri, InputStream inputStream) throws ParserException {
        try {
            JSONObject jSONObject = new JSONObject(new String(p084j4.g.b(inputStream), StandardCharsets.UTF_8));
            return new Pair<>(getAssetListFromRawJson(jSONObject), jSONObject);
        } catch (IOException | JSONException e6) {
            throw ParserException.createForMalformedManifest(e6.getMessage(), e6);
        }
    }
}
