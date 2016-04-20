#!/opt/local/bin/Rscript

input<-file('stdin')
open(input)

rows <- as.integer(readLines(input, n=1))

data <- read.table(input, sep = "", nrows = rows,
	header = F, col.names = c("math", "phys", "chem"))

#print(data)
#print(data[, c("math", "phys")])

mp <- cor(data[, c("math", "phys")], use="complete.obs", method="pearson")
pc <- cor(data[, c("phys", "chem")], use="complete.obs", method="pearson")
cm <- cor(data[, c("chem", "math")], use="complete.obs", method="pearson")

write(round(mp[2:2], 2), stdout())
write(round(pc[2:2], 2), stdout())
write(round(cm[2:2], 2), stdout())