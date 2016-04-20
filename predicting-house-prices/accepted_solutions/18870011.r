input<-file('stdin')
open(input)

layout_raw <- readLines(input, n=1)
layout <- as.vector(as.numeric(unlist(strsplit(layout_raw, "\\s+"))))
features <- layout[1]

rows <- layout[2]

data <- read.table(input, sep = "", nrows = rows, header = F)

#print(data)

price <- colnames(data)[ncol(data)]

f <- paste(names(data)[-ncol(data)], collapse=" + ") # all columns except the last one

fit <- lm(as.formula(paste(price, " ~ ", f)), data=data)

#summary(fit) # show results

testcases <- as.integer(readLines(input, n=1))
for(i in seq(1, testcases)) {
    testdata <- read.table(input, sep = "", nrows = 1, header = F)
    vanga <- predict(fit, testdata)

    # answer:
    write(round(vanga, 2), stdout())
}