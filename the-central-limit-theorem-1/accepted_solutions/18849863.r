# Enter your code here. Read input from STDIN. Print output to STDOUT
val <- pnorm(9800, 205 * 49, sqrt( 49 * (15 ^ 2) ))
write(round(val, 4), stdout())