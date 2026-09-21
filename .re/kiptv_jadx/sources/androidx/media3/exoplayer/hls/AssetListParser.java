package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
final class AssetListParser implements androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<android.util.Pair<androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetList, org.json.JSONObject>> {
    private static final java.lang.String ASSET_LIST_JSON_NAME_ASSET_ARRAY = "ASSETS";
    private static final java.lang.String ASSET_LIST_JSON_NAME_DURATION = "DURATION";
    private static final java.lang.String ASSET_LIST_JSON_NAME_LABEL_ID = "LABEL-ID";
    private static final java.lang.String ASSET_LIST_JSON_NAME_OFFSET = "OFFSET";
    private static final java.lang.String ASSET_LIST_JSON_NAME_SKIP_CONTROL = "SKIP-CONTROL";
    private static final java.lang.String ASSET_LIST_JSON_NAME_URI = "URI";

    private static androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetList getAssetListFromRawJson(org.json.JSONObject jSONObject) throws org.json.JSONException {
        if (!jSONObject.has(ASSET_LIST_JSON_NAME_ASSET_ARRAY)) {
            throw new org.json.JSONException("missing ASSETS attribute");
        }
        p076i4.AbstractC2230y.d(4, "initialCapacity");
        java.lang.Object[] objArrCopyOf = new java.lang.Object[4];
        org.json.JSONArray jSONArray = jSONObject.getJSONArray(ASSET_LIST_JSON_NAME_ASSET_ARRAY);
        int i3 = 0;
        int i9 = 0;
        while (i3 < jSONArray.length()) {
            org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
            if (!jSONObject2.has(ASSET_LIST_JSON_NAME_URI)) {
                throw new org.json.JSONException("missing URI attribute");
            }
            if (!jSONObject2.has(ASSET_LIST_JSON_NAME_DURATION)) {
                throw new org.json.JSONException("missing DURATION attribute");
            }
            androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Asset asset = new androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Asset(android.net.Uri.parse(jSONObject2.getString(ASSET_LIST_JSON_NAME_URI)), (long) (jSONObject2.getDouble(ASSET_LIST_JSON_NAME_DURATION) * 1000000.0d));
            int i10 = i9 + 1;
            int iB = p076i4.V.b(objArrCopyOf.length, i10);
            if (iB > objArrCopyOf.length) {
                objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, iB);
            }
            objArrCopyOf[i9] = asset;
            i3++;
            i9 = i10;
        }
        androidx.media3.common.AdPlaybackState.SkipInfo skipInfo = null;
        if (jSONObject.has(ASSET_LIST_JSON_NAME_SKIP_CONTROL)) {
            org.json.JSONObject jSONObject3 = jSONObject.getJSONObject(ASSET_LIST_JSON_NAME_SKIP_CONTROL);
            skipInfo = new androidx.media3.common.AdPlaybackState.SkipInfo(jSONObject3.has(ASSET_LIST_JSON_NAME_OFFSET) ? (long) (jSONObject3.getDouble(ASSET_LIST_JSON_NAME_OFFSET) * 1000000.0d) : 0L, jSONObject3.has(ASSET_LIST_JSON_NAME_DURATION) ? (long) (jSONObject3.getDouble(ASSET_LIST_JSON_NAME_DURATION) * 1000000.0d) : androidx.media3.common.C.TIME_UNSET, jSONObject3.has(ASSET_LIST_JSON_NAME_LABEL_ID) ? jSONObject3.getString(ASSET_LIST_JSON_NAME_LABEL_ID) : null);
        }
        return new androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetList(p076i4.AbstractC2186b0.r(objArrCopyOf, i9), skipInfo);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
    public android.util.Pair<androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetList, org.json.JSONObject> parse(android.net.Uri uri, java.io.InputStream inputStream) throws androidx.media3.common.ParserException {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(p084j4.g.b(inputStream), java.nio.charset.StandardCharsets.UTF_8));
            return new android.util.Pair<>(getAssetListFromRawJson(jSONObject), jSONObject);
        } catch (java.io.IOException | org.json.JSONException e6) {
            throw androidx.media3.common.ParserException.createForMalformedManifest(e6.getMessage(), e6);
        }
    }
}
