#!/bin/bash
# Upload robusto dell'APK come asset della release, con retry.
cd "C:/Users/Gianmarco/Desktop/Progetti/Antigravity/WaveStream" || exit 1
TOKEN=$(printf "protocol=https\nhost=github.com\n" | git credential fill 2>/dev/null | grep '^password=' | cut -d= -f2)
REL_ID=$(cat .release_id.txt)
API="https://api.github.com/repos/gianmarcotaf02/WaveStream"
UP="https://uploads.github.com/repos/gianmarcotaf02/WaveStream/releases/$REL_ID/assets?name=WaveStream.apk"

echo "REL_ID=$REL_ID" > .upload_status.txt
for attempt in $(seq 1 8); do
  {
    echo "=== attempt $attempt / $(date -u +%H:%M:%S) ==="
    # rimuove eventuali asset omonimi (es. rimasti in stato 'starter')
    IDS=$(curl -s -H "Authorization: token $TOKEN" "$API/releases/$REL_ID/assets" \
      | python -c "import json,sys; d=json.load(sys.stdin); print(' '.join(str(a['id']) for a in d if a['name']=='WaveStream.apk'))")
    for id in $IDS; do
      curl -s -o /dev/null -X DELETE -H "Authorization: token $TOKEN" "$API/releases/assets/$id"
      echo "  rimosso asset $id"
    done
    sleep 3
    curl -s -X POST --http1.1 \
      -H "Authorization: token $TOKEN" \
      -H "Accept: application/vnd.github+json" \
      -H "Content-Type: application/vnd.android.package-archive" \
      -H "Expect:" \
      --data-binary "@release/WaveStream.apk" \
      -w "\n  HTTP=%{http_code} up=%{size_upload} time=%{time_total}s\n" \
      "$UP" | tail -2
    STATE=$(curl -s -H "Authorization: token $TOKEN" "$API/releases/$REL_ID/assets" \
      | python -c "import json,sys; d=json.load(sys.stdin); print(d[0]['state'] if d else 'none')")
    echo "  state=$STATE"
    if [ "$STATE" = "uploaded" ]; then
      echo "RISULTATO=UPLOADED attempt=$attempt"
      break
    fi
    sleep 8
  } >> .upload_status.txt 2>&1
done
grep -q "RISULTATO=UPLOADED" .upload_status.txt || echo "RISULTATO=FALLITO" >> .upload_status.txt
