# Enter your code here. Read input from STDIN. Print output to STDOUT
girlprob <- 1 / 2.09
answer <- pbinom(3, size = 6, prob = girlprob)
write(round(answer, 3), stdout())