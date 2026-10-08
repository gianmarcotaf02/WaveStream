import json
from pathlib import Path
from collections import Counter

d = json.loads(Path('graphify-out/.graphify_detect.json').read_text(encoding='utf-8'))
root = d['scan_root'].replace(chr(92), '/').rstrip('/')
files = []
for cat in ('code', 'document', 'paper', 'image', 'video'):
    files += d['files'].get(cat, [])
files = [f.replace(chr(92), '/') for f in files]
files = [f for f in files if not f.startswith(root + '/graphify-out/')]
c = Counter()
for f in files:
    rel = f[len(root) + 1:] if f.startswith(root + '/') else f
    parts = rel.split('/')
    c[parts[0] if len(parts) > 1 else '(root)'] += 1
for k, v in c.most_common(10):
    print(v, k)
