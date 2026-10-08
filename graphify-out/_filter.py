"""Drop image files from the detect sidecar so semantic vision extraction is skipped.

The user explicitly asked to exclude images from the WaveStream `app` graph (366
drawable-nodpi logos etc. add no structural value).
"""
import json
from pathlib import Path

from graphify.detect import count_words

p = Path('graphify-out/.graphify_detect.json')
d = json.loads(p.read_text(encoding='utf-8'))

dropped = list(d['files'].get('image', []))
d['files']['image'] = []

total_files = sum(len(v) for v in d['files'].values())
total_words = 0
for cat in ('code', 'document', 'paper', 'video'):
    for f in d['files'].get(cat, []):
        if cat != 'video':
            total_words += count_words(Path(f))

d['total_files'] = total_files
d['total_words'] = total_words
d['needs_graph'] = total_words >= 50_000
d['warning'] = (
    None
    if total_files < 500 and total_words < 2_000_000
    else f"Large corpus: {total_files} files ~{total_words} words."
)
# Consumed downstream by the graphify CLI/library paths; keep the sidecar coherent.
d['excluded_images'] = len(dropped)

p.write_text(json.dumps(d, ensure_ascii=False), encoding='utf-8')

print(f"Images excluded: {len(dropped)}")
print(f"Files kept: {total_files}  words: {total_words:,}")
print(f"warning: {d['warning']}")
for k in ('code', 'document', 'paper', 'image', 'video'):
    print('  ', k, len(d['files'][k]))
