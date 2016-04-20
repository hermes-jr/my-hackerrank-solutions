# Enter our code here. Read input from STDIN. Print output to STDOUT
hits <- pbinom(1, size = 4, prob = 0.2)
write(round(hits, 3), stdout())
misses <- pbinom(1, size = 4, prob = 0.8)
write(round(misses, 3), stdout())
