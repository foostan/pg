(1..100).each do |i|
  puts case "#{i%3},#{i%5}"
  when /\A0,0\z/ then "FizzBuzz"
  when /\A0,.*\z/ then "Fizz"
  when /\A.*,0\z/ then "Buzz"
  else i.to_s
  end
end
