def qsort(ns)
  return [] if ns == []

  p = ns.pop
  l = qsort(ns.select { |n| n < p })
  r = qsort(ns.select { |n| n >= p })
  l + [p] + r
end

ns = 100000.times.map { rand(1000) }
qsort(ns)


