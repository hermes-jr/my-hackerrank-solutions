phys <- c(15,  12,  8,   8,   7,   7,   7,   6,   5,   3)
hist <- c(10,  25,  17,  11,  13,  17,  20,  13,  9,   15)

#ph <- cor(phys, hist, use="complete.obs", method="pearson")
model = lm(formula = hist ~ phys, x=TRUE, y=TRUE)

answer <- model$coefficients[2:2]

write(round(answer, 3), stdout())