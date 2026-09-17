#!/bin/bash
# Upload dell'APK come asset della release. Pensato per girare in background.
cd "C:/Users/Gianmarco/Desktop/Progetti/Antigravity/WaveStream" || exit 1
TOKEN=$(printf "protocol=https\nhost=github.com\n" | git credential fill 2>/dev/null | grep '^password=' | cut -d= -f2)
REL_ID=$(cat .release_id.txt)
{
  echo "START=$(date -u +%H:%M:%S)"
  curl -s -X POST \
    -H "Authorization: token $TOKEN" \
    -H "Accept: application/vnd.github+json" \
    -H "Content-Type: application/vnd.android.package-archive" \
    -H "Expect:" \
    --data-binary "@release/WaveStream.apk" \
    -w "\nHTTP=%{http_code} time=%{time_total}s up=%{size_upload}\n" \
    "https://uploads.github.com/repos/gianmarcotaf02/WaveStream/releases/$REL_ID/assets?name=WaveStream.apk"
  echo "EXIT=$?"
  echo "END=$(date -u +%H:%M:%S)"
} > .upload_result.json 2>&1
