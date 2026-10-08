import json
import sys
from pathlib import Path

sys.stdout.reconfigure(encoding='utf-8', errors='replace')

a = json.loads(Path('graphify-out/.graphify_analysis.json').read_text(encoding='utf-8'))
ext = json.loads(Path('graphify-out/.graphify_extract.json').read_text(encoding='utf-8'))
labels = {n['id']: (n.get('label') or n['id']) for n in ext['nodes']}

comms = a['communities']
sizes = sorted(comms.items(), key=lambda kv: -len(kv[1]))
for cid, members in sizes[76:]:
    mem = sorted((labels.get(m, m) for m in members), key=lambda x: -len(x))
    print(f"C{cid} n={len(members)}: " + ' | '.join(mem[:7]))
print('TOTAL', len(sizes))
