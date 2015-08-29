$cache = []

def feb(n)
  $cache[n] ||= n < 2 ? n : feb(n-1) + feb(n-2)
end

puts feb(1000)

