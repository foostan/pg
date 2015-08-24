N = 1000

def feb(a, b)
  a < N ? [b] + feb(a + b, a) : [b]
end

puts feb(1, 0)

