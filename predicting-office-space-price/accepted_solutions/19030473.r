input<-file('stdin')
open(input)

layout_raw <- readLines(input, n=1)
layout <- as.vector(as.numeric(unlist(strsplit(layout_raw, "\\s+"))))
features <- layout[1]

rows <- layout[2]

data <- read.table(input, sep = "", nrows = rows, header = F)

price <- colnames(data)[ncol(data)]

f <- paste(names(data)[-ncol(data)], collapse=",") # all columns except the last one
f <- paste("polym(", f, ", degree=3, raw = T)")

fit <- lm(as.formula(paste(price, " ~ ", f)), data=data)

testcases <- as.integer(readLines(input, n=1))
testdata <- read.table(input, sep = "", nrows = testcases, header = F)
vanga <- predict(fit,newdata = testdata)
for(z in vanga) {
    write(round(z, 2), stdout())
}