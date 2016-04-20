# Enter your code here. Read input from STDIN. Print output to STDOUT
rej <- 0.12
answer1 <- pbinom(2, size = 10, prob = rej)
write(round(answer1, 3), stdout())
answer2 <- pbinom(8, size = 10, prob = 1 - rej)
write(round(answer2, 3), stdout())