import json
from pathlib import Path
from collections import Counter

d = json.loads(Path('graphify-out/.graphify_detect.json').read_text(encoding='utf-8'))
root = d['scan_root'].replace(chr(92), '/').rstrip('/')
files = []
cats = {}
for cat in ('code', 'document', 'paper', 'image', 'video'):
    for f in d['files'].get(cat, []):
        f = f.replace(chr(92), '/')
        if f.startswith(root + '/graphify-out/'):
            continue
        files.append(f)
        cats[f] = cat

for depth in (1, 2, 3, 4):
    c = Counter()
    for f in files:
        rel = f[len(root) + 1:] if f.startswith(root + '/') else f
        parts = rel.split('/')
        key = '/'.join(parts[:depth]) if len(parts) > depth else ('(root)' if len(parts) == 1 else '/'.join(parts[:-1]))
        c[key] += 1
    print(f'--- depth {depth} ---')
    for k, v in c.most_common(12):
        print('  ', v, k)
print('--- by category ---')
for k, v in Counter(cats.values()).most_common():
    print('  ', v, k)
